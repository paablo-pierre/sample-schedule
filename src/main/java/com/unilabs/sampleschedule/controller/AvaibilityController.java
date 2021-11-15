package com.unilabs.sampleschedule.controller;

import com.unilabs.sampleschedule.model.dto.AvaiabilityResponseDTO;
import com.unilabs.sampleschedule.model.dto.ScheduleDTO;
import com.unilabs.sampleschedule.service.AvaiabilityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/schedule")
@RequiredArgsConstructor
public class AvaibilityController {

    private final AvaiabilityService avaiabilityService;

    @PostMapping
    private ResponseEntity<AvaiabilityResponseDTO> createAvaiability(@RequestBody ScheduleDTO scheduleDTO) {
        var response = avaiabilityService.create(scheduleDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    private ResponseEntity<AvaiabilityResponseDTO> getAll() {
        var response = avaiabilityService.listAvaiability();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
