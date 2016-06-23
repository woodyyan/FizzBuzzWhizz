package com.thoughtworks;

public class FizzHandler extends NumberHandler {
    public String getFizz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }


    @Override
    public String getNumber(int number) {
        String result = getFizz(number);
        if (result != "Fizz" && getNextHandler() != null) {
            return getNextHandler().getNumber(number);
        }
        return result;
    }
}
