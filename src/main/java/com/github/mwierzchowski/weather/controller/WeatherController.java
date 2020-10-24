package com.github.mwierzchowski.weather.controller;

import com.github.mwierzchowski.weather.core.Temperature;
import com.github.mwierzchowski.weather.core.TemperatureUnit;
import com.github.mwierzchowski.weather.core.Weather;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/weather")
@AllArgsConstructor
public class WeatherController {

    @GetMapping
    public Weather getCurrentWeather() {
        var weather = new Weather();
        weather.setSource("test");
        weather.setTemperature(new Temperature(new BigDecimal(100), TemperatureUnit.CELSIUS));
        return weather;
    }
}
