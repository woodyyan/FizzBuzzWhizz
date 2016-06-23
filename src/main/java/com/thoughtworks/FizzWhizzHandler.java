package com.thoughtworks;

public class FizzWhizzHandler extends NumberHandler {
    public String getFizzWhizz(int number) {
        if (number % 3 == 0 && number % 7 == 0) {
            return "FizzWhizz";
        }
        return String.valueOf(number);
    }

    @Override
    public String getNumber(int number) {
        String result = getFizzWhizz(number);
        if (result != "FizzWhizz" && getNextHandler() != null) {
            return getNextHandler().getNumber(number);
        }
        return result;
    }
}
