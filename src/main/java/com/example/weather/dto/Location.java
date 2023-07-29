package com.example.weather.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public record Location(
        String name,
        String country,
        String region,
        Double lat,
        Double lon,
        @JsonProperty("timezone_id")
        String timeZoneId,
        String localtime,
        @JsonProperty("localtime_epoch")
        String localTimeEpoch,
        @JsonProperty("utc offset")
        String utcOffset
) {
}
