package com.unilabs.sampleschedule.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unilabs.sampleschedule.exception.ServiceException;
import com.unilabs.sampleschedule.model.dto.AvaiabilityResponseDTO;
import com.unilabs.sampleschedule.model.dto.ScheduleDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class AvaiabilityControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Value("${spring.security.user.name}")
    private String user;

    @Value("${spring.security.user.password}")
    private String password;


    String baseUrl = "/v1/schedule";

    @Test
    void shouldScheduleAnExameForAClient() throws Exception {
        var body = ScheduleDTO.builder()
                .examName("Glicemia")
                .patientDocument("60626882344")
                .scheduleId(2L)
                .build();
        var bodyAsString = objectMapper.writeValueAsString(body);

        var response = mockMvc.perform(post(baseUrl)
                .with(SecurityMockMvcRequestPostProcessors.httpBasic(user, password))
                .contentType(MediaType.APPLICATION_JSON)
                .content(bodyAsString))
                .andReturn();

        var contentAsString = response.getResponse().getContentAsString();
        var avaiabilityResponse = objectMapper.readValue(contentAsString, AvaiabilityResponseDTO.class);

        Assertions.assertEquals(response.getResponse().getStatus(), HttpStatus.CREATED.value());
        Assertions.assertEquals(avaiabilityResponse.getData().get(0).getPatientName(), "Ruan Carlos");
        Assertions.assertEquals(avaiabilityResponse.getData().get(0).getRoomName(), "Sala-1");
    }

    @Test
    void shouldReturnABadRequestIfAScheduleDoesntExists() throws Exception {
        var body = ScheduleDTO.builder()
                .examName("Sangue")
                .patientDocument("60626882344")
                .scheduleId(5L)
                .build();
        var bodyAsString = objectMapper.writeValueAsString(body);

        mockMvc.perform(post(baseUrl)
                .with(SecurityMockMvcRequestPostProcessors.httpBasic(user, password))
                .contentType(MediaType.APPLICATION_JSON)
                .content(bodyAsString))
                .andExpect(status().isBadRequest())
                .andExpect(result -> Assertions.assertTrue(result.getResolvedException() instanceof ServiceException));
    }
}
