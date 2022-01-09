package fr.lernejo.prediction;

import java.util.List;

public record TemperaturesPays(String country, List<Temperature> temperatures){
}
