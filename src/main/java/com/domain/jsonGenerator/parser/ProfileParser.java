package com.domain.jsonGenerator.parser;

import com.domain.jsonGenerator.model.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProfileParser {

    private final String profilePattern = "^profile\\|(.*)\\*\\*followers\\|(.*)";
    private final Pattern pattern = Pattern.compile(profilePattern);

    public Profile parse(String input) {
        if (input == null || input.length() == 0)
            return null;

        if (!input.startsWith("profile"))
            return null;


        String profileString = null;
        String followersString = null;

        Matcher profileMatcher = pattern.matcher(input);
        while (profileMatcher.find()) {
            profileString = profileMatcher.group(1);
            followersString = profileMatcher.group(2);
        }

        Profile profile = new Profile(profileString);

        String[] followersProfileStrings = new String[0];
        if (followersString != null) {
            followersProfileStrings = followersString.split("@@");
        }

        List<Profile> followers = new ArrayList<Profile>();
        for (String followersProfileString : followersProfileStrings) {

            String string = followersProfileString;
            if (followersProfileString.startsWith("|"))
                string = followersProfileString.replaceFirst("\\|", "");
            followers.add(new Profile(string));
        }
        profile.setFollowers(followers);

        return profile;
    }
}
