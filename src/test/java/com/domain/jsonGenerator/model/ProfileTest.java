package com.domain.jsonGenerator.model;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProfileTest {

    @Test
    public void profileIdGetTest() {
        Profile profile = new Profile("123|<first><><>");
        assertEquals("Profile is same", "123", profile.getId());
    }
}
