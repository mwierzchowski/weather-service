package com.github.mwierzchowski.weather.web;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class DummyRequest {
    @NotNull
    private String name;

    @Min(18)
    private Integer age;
}
