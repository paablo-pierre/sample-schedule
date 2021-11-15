package com.unilabs.sampleschedule.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDTO implements Serializable {
    private static final long serialVersionUID = 3792618672563721591L;

    private String examName;
    private String patientDocument;
    private Long scheduleId;
}
