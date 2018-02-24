package com.domain.jsonGenerator.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProfileName {

    private String first;

    private String middle;

    private String last;

    private final String namePattern = "<([\\w]*)>";

    private final Pattern pattern = Pattern.compile(namePattern);

    public ProfileName(String nameString) {
        Matcher matcher = pattern.matcher(nameString);
        int i = 0;
        while (matcher.find()) {
            switch (i) {
                case 0:
                    this.first = matcher.group(1);
                    break;
                case 1:
                    this.middle = matcher.group(1);
                    break;
                case 2:
                    this.last = matcher.group(1);
                    break;
            }
            i++;
        }
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
