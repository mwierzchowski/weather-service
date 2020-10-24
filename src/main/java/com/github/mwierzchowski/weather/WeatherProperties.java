package com.github.mwierzchowski.weather;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Weather properties.
 * @author Marcin Wierzchowski
 */
@Data
@ConfigurationProperties("weather")
public class WeatherProperties {

    /**
     * Geographical latitude
     */
    private Double latitude;

    /**
     * Geographical longitude
     */
    private Double longitude;

    /**
     * Interval in ms for checking weather conditions.
     */
    private Long checkInterval = 60000L; // 1 min

    /**
     * Delay for checking weather after application starts.
     */
    private Long checkDelayAfterStartup = 0L;

    /**
     * Deadline in ms for weather observation to be available. After that time, warning will be issued.
     */
    private Long observationDeadline = 15L * 60000; // 15 mins
}
