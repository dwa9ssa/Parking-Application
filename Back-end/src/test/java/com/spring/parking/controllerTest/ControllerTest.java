package com.spring.parking.controllerTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.spring.parking.ParkingApplication;
import com.spring.parking.controller.CarParkingInfoController;
import com.spring.parking.controller.ParkingLotsController;
import com.spring.parking.dao.CarParkingInfoDao;
import com.spring.parking.dto.CarParkingInfoDto;
import com.spring.parking.service.CarParkingInfoService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = ParkingApplication.class)
@AutoConfigureMockMvc
public class ControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    CarParkingInfoDao carParkingInfoDao;

    @MockBean
    private CarParkingInfoService carParkingInfoService;

    private CarParkingInfoDto carParkingInfoDto;


    @Autowired
    private ParkingLotsController controller;

    @Test
    public void listParkingLots() throws Exception {
        Assertions.assertNotNull(controller);


        objectMapper.registerModule(new JavaTimeModule());
        String requestJson = objectMapper.writeValueAsString(carParkingInfoDto);


        mockMvc.perform(get("/api/v1/parking/parkingLots"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void shouldCreateNewCar() throws Exception {
        Assertions.assertNotNull(controller);


        carParkingInfoDto = CarParkingInfoDto.builder()
                .vehicleRegistration(1)
                .brand("Mercedes")
                .model("AMG")
                .color("Black")
                .type("Class A")
                .entryTime(LocalDateTime.now())
                .totalPrice(10.0)
                .build();

        objectMapper.registerModule(new JavaTimeModule());
        String requestJson = objectMapper.writeValueAsString(carParkingInfoDto);


        mockMvc.perform(post("/api/v1/parking/parkCar/2")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(requestJson))
                .andExpect(status().isCreated())
                .andDo(print());
    }

}
