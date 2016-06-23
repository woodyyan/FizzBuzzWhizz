package com.thoughtworks;

public class FizzBuzzWhizzHandler extends NumberHandler {
    public String getFizzBuzzWhizz(int number) {
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return "FizzBuzzWhizz";
        }
        return null;
    }

    @Override
    public String getNumber(int number) {
        String result = getFizzBuzzWhizz(number);
        if (result == null){
            return getNextHandler().getNumber(number);
        }
        return result;
    }
}
