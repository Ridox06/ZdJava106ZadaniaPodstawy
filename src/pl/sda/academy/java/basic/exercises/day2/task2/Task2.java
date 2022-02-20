package pl.sda.academy.java.basic.exercises.day2.task2;

import javax.swing.*;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(isWordStartsWithPrefix("programowanie","pro"));
        System.out.println(isWordStartsWithPrefix(null,"pro"));
        System.out.println(isWordEndsWithPrefix("programowanie","nie"));

    }

    private static boolean isWordStartsWithPrefix(String input, String prefix){
        return input != null ? input.startsWith(prefix) : false;
//        if(input != null) {
//            return input.startsWith(prefix);
//        }
//        return false;
    }

    private static boolean isWordEndsWithPrefix(String input, String suffix) {
        return input != null ? input.endsWith(suffix) : false;
    }
}
