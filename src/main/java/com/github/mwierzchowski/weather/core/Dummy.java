package com.github.mwierzchowski.weather.core;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class Dummy {
    @NotNull
    private String name;

    @Min(18)
    private Integer age;
}
