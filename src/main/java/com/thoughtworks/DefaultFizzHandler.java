package com.thoughtworks;

public class DefaultFizzHandler extends NumberHandler {
    public String getFizz(int number) {
        if (number % 10 == 3) {
            return "Fizz";
        } else if (number % 100 / 10 == 3) {
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
