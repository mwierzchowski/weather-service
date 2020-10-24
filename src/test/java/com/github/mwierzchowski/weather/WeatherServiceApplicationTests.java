package com.github.mwierzchowski.weather;

import com.github.mwierzchowski.weather.controller.WeatherController;
import com.github.mwierzchowski.weather.core.SpeedUnit;
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

	@Test
	void controllerGivesWeather() {
		assertNotNull(controller.getCurrentWeather());
	}

	@Test
	void speedUnit() {
		SpeedUnit unit = SpeedUnit.ofSymbol("mph");
		assertNotNull(unit);
	}
}
