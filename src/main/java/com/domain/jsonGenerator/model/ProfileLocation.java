package com.domain.jsonGenerator.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProfileLocation {

    private String name;

    private LocationCoordinates coords;

    private final String locationPattern = "^<([a-zA-Z0-9 _-]*)><(.*)>$";

    private final Pattern pattern = Pattern.compile(locationPattern);

    public ProfileLocation(String locationString) {
        Matcher matcher = pattern.matcher(locationString);
        while (matcher.find()) {
            this.name = matcher.group(1);
            this.coords = new LocationCoordinates(matcher.group(2));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocationCoordinates getCoords() {
        return coords;
    }

    public void setCoords(LocationCoordinates coords) {
        this.coords = coords;
    }
}
