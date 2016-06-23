package com.thoughtworks;

public class FizzBuzzWhizzHandler {
    public String getFizzBuzzWhizz(int number) {
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return "FizzBuzzWhizz";
        }
        return null;
    }
}
