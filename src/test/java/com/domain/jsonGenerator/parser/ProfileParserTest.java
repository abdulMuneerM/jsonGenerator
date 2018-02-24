package com.domain.jsonGenerator.parser;

import com.domain.jsonGenerator.model.Profile;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProfileParserTest {

    @Test
    public void parseTest() {
        ProfileParser parser = new ProfileParser();
        Profile profile = parser.parse("profile|123|<first><><last>|<><<><>>|<>**followers|");
        assertEquals("Profile id is same", "123", profile.getId());
        assertEquals("Profile last name is same", "last", profile.getName().getLast());
    }
}
