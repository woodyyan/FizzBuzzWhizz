package com.thoughtworks;

public class FizzHandler {
    public String getFizzIfTimesOfThree(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return null;
    }

    public String getFizzIfContainsThree(int number) {
        if (number % 10 == 3) {
            return "Fizz";
        } else if (number % 100 / 10 == 3) {
            return "Fizz";
        }
        return null;
    }
}
