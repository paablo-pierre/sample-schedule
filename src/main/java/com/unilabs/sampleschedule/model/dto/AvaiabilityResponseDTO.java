package com.unilabs.sampleschedule.model.dto;

import com.unilabs.sampleschedule.model.entity.Avaiability;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AvaiabilityResponseDTO implements Serializable {
    private static final long serialVersionUID = 7305658938933783445L;

    List<AvaiabilityDTO> data;
}
