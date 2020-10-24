package com.github.mwierzchowski.weather.core;

import java.util.Optional;

/**
 * Interface for weather observers.
 * @author Marcin Wierzchowski
 */
@FunctionalInterface
public interface WeatherObserver {
    /**
     * Provide current weather conditions.
     * @return current weather conditions
     */
    Optional<Weather> currentWeather();
}
