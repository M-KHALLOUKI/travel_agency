package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class TemperatureController {

    @GetMapping("/api/temperature")
    public TemperaturesPays getTemperature(@RequestParam String country){

        final TemperatureService temperatureService = new TemperatureService();
        double firstTempe = temperatureService.getTemperature(country);
        double secondTempe = temperatureService.getTemperature(country);
        Temperature t1 = new Temperature(LocalDate.now().toString(),firstTempe);
        Temperature t2 = new Temperature(LocalDate.now().minusDays(1).toString(),secondTempe);
        return new TemperaturesPays(country, List.of(t1,t2));
    }
}
