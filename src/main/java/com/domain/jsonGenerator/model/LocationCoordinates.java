package com.domain.jsonGenerator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LocationCoordinates {

    @JsonProperty("long")
    private String longitude;

    private String lat;

    private final String coordinatesPattern = "<([-+]?[0-9]*\\.?[0-9]+)>";
    private final Pattern pattern = Pattern.compile(coordinatesPattern);

    public LocationCoordinates(String coordinatesString) {
        Matcher matcher = pattern.matcher(coordinatesString);
        int i = 0;
        while (matcher.find()) {
            switch (i) {
                case 0:
                    this.longitude = matcher.group(1);
                    break;
                case 1:
                    this.lat = matcher.group(1);
                    break;
            }
            i++;
        }
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}
