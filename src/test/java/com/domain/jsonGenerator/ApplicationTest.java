package com.domain.jsonGenerator;

import com.domain.jsonGenerator.model.Profile;
import com.domain.jsonGenerator.parser.ProfileParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    @Test
    public void profileParserTest() {
        ProfileParser parser = new ProfileParser();
        Profile profile = parser.parse("profile|73241232|<Aamir><Hussain><Khan>|<Mumbai><<72.872075><19.075606>>|73241232.jpg**followers|54543342|<Anil><><Kapoor>|<Delhi><<23.23><12.07>>|54543342.jpg@@|12311334|<Amit><><Bansal>|<Bangalore><<><>>|12311334.jpg");
        assertEquals("Profile id is same", "73241232", profile.getId());
        assertEquals("Profile first name is same", "Aamir", profile.getName().getFirst());
        assertEquals("Profile followers list size is same", 2, profile.getFollowers().size());
    }
}
