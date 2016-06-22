package com.thoughtworks;

public class FizzHandler {
    public static String getResult(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return null;
    }
}
