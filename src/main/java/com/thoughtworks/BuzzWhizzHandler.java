package com.thoughtworks;

public class BuzzWhizzHandler {
    public String getBuzzWhizz(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "BuzzWhizz";
        }
        return null;
    }
}
