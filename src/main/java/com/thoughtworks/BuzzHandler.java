package com.thoughtworks;

public class BuzzHandler {
    public String getBuzz(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        }

        return null;
    }
}
