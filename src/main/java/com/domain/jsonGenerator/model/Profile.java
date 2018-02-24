package com.domain.jsonGenerator.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Profile {

    private String id;

    private ProfileName name;

    private ProfileLocation location;

    private String imageId;

    private List<Profile> followers;

    public Profile(String profileString) {
        String[] words = profileString.split("\\|");
        for (int i = 0; i < words.length; i++) {
            switch (i) {
                case 0:
                    this.id = words[0];
                    break;
                case 1:
                    this.name = new ProfileName(words[1]);
                    break;
                case 2:
                    this.location = new ProfileLocation(words[2]);
                    break;
                case 3:
                    this.imageId = words[3];
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProfileName getName() {
        return name;
    }

    public void setName(ProfileName name) {
        this.name = name;
    }

    public ProfileLocation getLocation() {
        return location;
    }

    public void setLocation(ProfileLocation location) {
        this.location = location;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public List<Profile> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Profile> followers) {
        this.followers = followers;
    }
}
