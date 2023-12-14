package com.spring.parking;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.spring.parking.controller.CarParkingInfoController;
import com.spring.parking.dao.CarParkingInfoDao;
import com.spring.parking.entity.CarParkingInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@WebMvcTest(CarParkingInfoController.class)
public class ControllerTest {

    @MockBean
    CarParkingInfoDao carParkingInfoDao;
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();


    @Test
    public void shouldCreateNewCar() throws Exception {
        CarParkingInfo carParkingInfo = new CarParkingInfo(1L,"audi","Class A","Black","AMG", LocalDateTime.now(),10.0);


        objectMapper.registerModule(new JavaTimeModule());
        String requestJson = objectMapper.writeValueAsString(carParkingInfo);


        mockMvc.perform(post("/api/v1/parking/parkCar")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson))
                .andExpect(status().isCreated())
                .andDo(print());
    }

}
