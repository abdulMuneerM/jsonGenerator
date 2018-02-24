package com.domain.jsonGenerator.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProfileNameTest {

    @Test
    public void firstNameGetTest() {
        ProfileName name = new ProfileName("<first><><>");
        assertEquals("Profile first name is equals", "first", name.getFirst());
    }
}
