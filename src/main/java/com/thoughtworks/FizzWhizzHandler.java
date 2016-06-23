package com.thoughtworks;

public class FizzWhizzHandler {
    public String getFizzWhizz(int number) {
        if (number % 3 == 0 && number % 7 == 0) {
            return "FizzWhizz";
        }
        return null;
    }
}
