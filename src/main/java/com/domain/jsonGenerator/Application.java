package com.domain.jsonGenerator;

import com.domain.jsonGenerator.model.Profile;
import com.domain.jsonGenerator.parser.ProfileParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jsonStringForm = scanner.nextLine();
        ProfileParser profileParser = new ProfileParser();
        Profile profile = profileParser.parse(jsonStringForm);

        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writeValueAsString(profile));
        } catch (JsonProcessingException e) {
            System.out.println(e);
        }
    }
}
