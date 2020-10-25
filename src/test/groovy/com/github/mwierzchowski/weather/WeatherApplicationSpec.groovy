package com.github.mwierzchowski.weather

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification
import spock.lang.Subject

@SpringBootTest
class WeatherApplicationSpec extends Specification {
    @Subject
    @Autowired
    WeatherApplication application

    def "Application should start"() {
        expect:
        application != null
    }
}
