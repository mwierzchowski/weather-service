package com.github.mwierzchowski.weather.web;

import com.github.mwierzchowski.weather.core.Temperature;
import com.github.mwierzchowski.weather.core.TemperatureUnit;
import com.github.mwierzchowski.weather.core.Weather;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;

// todo package v1?
@Slf4j
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

    @PostMapping
    public void addDummy(@Valid @RequestBody DummyRequest dummy) {
        log.info("Received: {}", dummy);
    }
}
