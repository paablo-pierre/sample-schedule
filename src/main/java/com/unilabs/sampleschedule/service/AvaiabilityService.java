package com.unilabs.sampleschedule.service;

import com.unilabs.sampleschedule.exception.ServiceException;
import com.unilabs.sampleschedule.model.dto.AvaiabilityResponseDTO;
import com.unilabs.sampleschedule.model.dto.ScheduleDTO;

public interface AvaiabilityService {
    AvaiabilityResponseDTO create(ScheduleDTO scheduleDTO) throws ServiceException;
    AvaiabilityResponseDTO listAvaiability();
}
