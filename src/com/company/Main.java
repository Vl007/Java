package com.company;

public class Main {

    public static void main(String[] args) {
        String result = getInformationTheAuthor();
        System.out.println(result);

    }

    private static String getInformationTheAuthor() {
        StringBuilder stringInformation = new StringBuilder();
        stringInformation.append("Hello");
        stringInformation.append(", ");
        stringInformation.append("world!");
        return stringInformation.toString();
    }

}
