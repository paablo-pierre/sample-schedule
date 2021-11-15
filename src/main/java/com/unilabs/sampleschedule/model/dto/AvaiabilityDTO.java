package com.unilabs.sampleschedule.model.dto;

import com.unilabs.sampleschedule.model.entity.Avaiability;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Time;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AvaiabilityDTO implements Serializable {
    private static final long serialVersionUID = 4102849520270075148L;

    String roomName;
    Time fromHour;
    Time toHour;
    String patientName;
    String examName;

    public static AvaiabilityDTO mapperAvaiabilityToResponse(Avaiability avaiability) {
        return AvaiabilityDTO.builder()
                .examName(avaiability.getExam().getName())
                .patientName(avaiability.getPatient().getName())
                .roomName(avaiability.getSchedule().getRoom().getName())
                .fromHour(avaiability.getSchedule().getFromHour())
                .toHour(avaiability.getSchedule().getToHour())
                .build();
    }
}
