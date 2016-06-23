package com.thoughtworks;

public class WhizzHandler {
    public String getWhizz(int number) {
        if (number % 7 == 0) {
            return "Whizz";
        }
        return null;
    }
}
