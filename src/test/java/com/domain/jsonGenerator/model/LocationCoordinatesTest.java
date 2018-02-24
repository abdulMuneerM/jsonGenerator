package com.domain.jsonGenerator.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocationCoordinatesTest {

    @Test
    public void LatGetTest() {
        LocationCoordinates coordinates = new LocationCoordinates("<bangalore><<72.1234><12.1234>>");
        assertEquals("Latitude is same", "12.1234", coordinates.getLat());
    }
}
