package com.spring.parking;

import com.spring.parking.entity.CarParkingInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParkingApplicationTests {
	@Mock
	CarParkingInfo carParkingInfo;

	@Test
	void contextLoads() {
		Assertions.assertNotNull(carParkingInfo);
	}

}
