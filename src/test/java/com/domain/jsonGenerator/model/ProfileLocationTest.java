package com.domain.jsonGenerator.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProfileLocationTest {

    @Test
    public void locationNameGetTest() {
        ProfileLocation location = new ProfileLocation("<bangalore><<><>>");
        assertEquals("Location name is same", "bangalore", location.getName());
    }
}
