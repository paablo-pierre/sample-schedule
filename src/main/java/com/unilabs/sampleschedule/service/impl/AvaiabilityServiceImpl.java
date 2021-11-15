package com.unilabs.sampleschedule.service.impl;

import com.unilabs.sampleschedule.exception.ServiceException;
import com.unilabs.sampleschedule.model.dto.AvaiabilityDTO;
import com.unilabs.sampleschedule.model.dto.AvaiabilityResponseDTO;
import com.unilabs.sampleschedule.model.dto.ScheduleDTO;
import com.unilabs.sampleschedule.model.entity.Avaiability;
import com.unilabs.sampleschedule.model.entity.Exam;
import com.unilabs.sampleschedule.model.entity.Patient;
import com.unilabs.sampleschedule.model.entity.Schedule;
import com.unilabs.sampleschedule.repository.AvaiabilityRepository;
import com.unilabs.sampleschedule.repository.ExamRepository;
import com.unilabs.sampleschedule.repository.PatientRepository;
import com.unilabs.sampleschedule.repository.ScheduleRepository;
import com.unilabs.sampleschedule.service.AvaiabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AvaiabilityServiceImpl implements AvaiabilityService {

    private final ScheduleRepository scheduleRepository;
    private final PatientRepository patientRepository;
    private final ExamRepository examRepository;
    private final AvaiabilityRepository avaiabilityRepository;

    @Override
    @Transactional
    public AvaiabilityResponseDTO create(ScheduleDTO scheduleDTO) throws ServiceException {
        var schedule = scheduleRepository.findByIdAndIsActiveTrue(scheduleDTO.getScheduleId());

        var patient = getPatient(scheduleDTO.getPatientDocument());

        var exam = examRepository.findExamByName(scheduleDTO.getExamName());

        if (patient.isEmpty() || exam.isEmpty() || schedule.isEmpty()) {
            throw new ServiceException(String.valueOf(HttpStatus.BAD_REQUEST.value()), "Não foi possível registrar um agendamento");
        }

        var avaiability = avaiabilityRepository.save(generateAvaiability(schedule.get(), patient.get(), exam.get()));

        invalidateSelectedSchedule(schedule.get());

        var dataResponse = AvaiabilityDTO.mapperAvaiabilityToResponse(avaiability);

        return AvaiabilityResponseDTO.builder().data(Collections.singletonList(dataResponse)).build();
    }

    @Override
    public AvaiabilityResponseDTO listAvaiability() {
        var response = avaiabilityRepository.findAll();
        List<AvaiabilityDTO> avaiabilityResponse = new ArrayList<>();
        for (Avaiability avaiability : response) {
            var responseAvaiability = AvaiabilityDTO.mapperAvaiabilityToResponse(avaiability);
            avaiabilityResponse.add(responseAvaiability);
        }

        return AvaiabilityResponseDTO.builder().data(avaiabilityResponse).build();
    }

    private void invalidateSelectedSchedule(Schedule schedule) {
        schedule.setActive(false);
        scheduleRepository.save(schedule);
    }

    private Avaiability generateAvaiability(Schedule schedule, Patient patient, Exam exam) {
        return Avaiability.builder()
                .exam(exam)
                .patient(patient)
                .schedule(schedule)
                .build();
    }

    private Optional<Patient> getPatient(String document) {
        return patientRepository.findByDocument(document);
    }
}
