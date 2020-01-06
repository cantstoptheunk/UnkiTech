package com.example.demo.category.player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract public class AbstractPlayerFactory {

    public static final String firstNameFilePath = "/Users/cantstoptheunk/downloads/demo/src/main/resources/firstname.txt";
    public static List<String> firstNames;

    static {
        try {
            firstNames = readFile(firstNameFilePath);
        } catch (IOException e) {
            System.err.println("Could not read file for first names: " + firstNameFilePath);
            e.printStackTrace();
        }
    }

    public static final String lastNameFilePath = "/Users/cantstoptheunk/downloads/demo/src/main/resources/lastname.txt";
    public static List<String> lastNames;

    static {
        try {
            lastNames = readFile(lastNameFilePath);
        } catch (IOException e) {
            System.err.println("Could not read file for last names: " + firstNameFilePath);
            e.printStackTrace();
        }
    }

    public static final String collegeFilePath = "/Users/cantstoptheunk/downloads/demo/src/main/resources/colleges.txt";
    public static List<String> colleges;

    static {
        try {
            colleges = readFile(collegeFilePath);
        } catch (IOException e) {
            System.err.println("Could not read file for colleges: " + collegeFilePath);
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();

        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String str;
        while ((str = reader.readLine()) != null) {
            lines.add(str);
        }
        reader.close();

        return lines;
    }

    public static String generateFirstName() {
        int index = (int) (firstNames.size() * Math.random());
        return firstNames.get(index);
    }

    public static String generateLastName() {
        int index = (int) (lastNames.size() * Math.random());
        return lastNames.get(index);
    }

    public static String generateCollege() {
        int index = (int) (colleges.size() * Math.random());
        return colleges.get(index);
    }

    public static int generateAge(Status status) {
        switch (status) {
            case Amateur:
                return randomAgeForAmateur();
            case Pro:
                return randomAgeForPro();
            default:
                return -1;
        }
    }

    private static int randomAgeForAmateur() {
        double num = Math.random();
        if (num < 0.10) {
            return 20;
        }
        if (num < 0.35) {
            return 21;
        }
        if (num < 0.70) {
            return 22;
        }
        if (num < 0.99) {
            return 23;
        }
        if (num <= 1) {
            return (int) (24 * (3 * Math.random()));
        }
        return -1;
    }

    private static int randomAgeForPro() {
        double num = Math.random();
        if (num < 0.05) {
            return 20;
        }
        if (num < 0.10) {
            return 21;
        }
        if (num < 0.15) {
            return 22;
        }
        if (num < 0.21) {
            return 23;
        }
        if (num < 0.28) {
            return 24;
        }
        if (num < 0.36) {
            return 25;
        }
        if (num < 0.44) {
            return 26;
        }
        if (num < 0.52) {
            return 27;
        }
        if (num < 0.60) {
            return 28;
        }
        if (num < 0.68) {
            return 29;
        }
        if (num < 0.75) {
            return 30;
        }
        if (num < 0.81) {
            return 31;
        }
        if (num < 0.86) {
            return 32;
        }
        if (num < 0.90) {
            return 33;
        }
        if (num < 0.94) {
            return 34;
        }
        if (num < 0.97) {
            return 35;
        }
        if (num < 0.98) {
            return 36;
        }
        if (num < 0.99) {
            return 37;
        }
        if (num < 0.995) {
            return 38;
        }
        if (num < 0.998) {
            return 39;
        }

        return -1;
    }
}