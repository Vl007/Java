package com.company;

import java.lang.Math;
import java.util.Random;
import java.util.stream.*;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

// Задание №1 к уроку 1
//    public static void main(String[] args) {
//        String result = getInformationTheAuthor();
//        System.out.println(result);
//
//    }
//
//    private static String getInformationTheAuthor() {
//        StringBuilder stringInformation = new StringBuilder();
//        stringInformation.append(ANSI_BLUE + "Привет меня зовут Владимир. Мне 31 год, я из Ростова-на-Дону." + ANSI_RESET);
//        stringInformation.append(ANSI_RED + System.lineSeparator() + "Хобби: баскетбол, фитнес, сборка ПК, гонки." + ANSI_RESET);
//        stringInformation.append(ANSI_GREEN + System.lineSeparator() + "В прошлом я строитель, с начала 2019 года ушел в IT сферу. Начал обучения со школы Нетология, сначала смотрел бесплатные уроки." + ANSI_RESET);
//        stringInformation.append(ANSI_YELLOW + System.lineSeparator() + "Потом пошел на платное обучение и освоил профессию fullstack-дизайнер, параллельно работая верстальщиком и изучая фрейворк Angular." + ANSI_RESET);
//        stringInformation.append(ANSI_PURPLE + System.lineSeparator() + "Понял под конец, что не со всем моё направление, начал изучать frontend-разработку. Так же не много удалось поработать backend-разработчиком на php." + ANSI_RESET);
//        stringInformation.append(ANSI_CYAN + System.lineSeparator() + "Пока все еще в поиске себя и получения новых знаний. Спасибо за внимание!");
//        return stringInformation.toString();
//    }

//  Задание №2 к уроку 3
    public static void main(String[] args) {

//        1 способ
//        int[] integerArray = new int[20];
//
//        for (int i = 0; i <= integerArray.length; i++) {
//            integerArray[i] = (int) (Math.random() *10000);
//        }
//
//        System.out.println(ANSI_RED + "Заполнение массива с помощтю цикла псевдослучайными значениями!" + ANSI_RESET);
//
//        for (int i = 0; i <= integerArray.length; i++) {
//            System.out.println(integerArray[i] + ",");
//        }

        // 2 способ

        int[] integerArray = new int[20];
        Random random = new Random();

        for (int i = 0; i <= integerArray.length; i++) {
            integerArray[i] = random.nextInt(10000);
        }

        System.out.println(ANSI_RED + "Заполнение массива с помощтю цикла псевдослучайными значениями!" + ANSI_RESET);

        for (int i = 0; i <= integerArray.length; i++) {
            System.out.println(integerArray[i] + ",");
        }

        long sum = IntStream.of(integerArray).sum();
        System.out.println("The sum is " + sum);

    }
}
