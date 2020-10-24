package com.github.mwierzchowski.weather;

import com.github.mwierzchowski.weather.controller.WeatherController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class WeatherServiceApplicationTests {
	@Autowired
	WeatherController controller;

	@Test
	void contextLoads() {
		assertNotNull(controller);
	}

}
