package com.thoughtworks;

public class FizzBuzzHandler extends NumberHandler {
    public String getFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        return String.valueOf(number);
    }

    @Override
    public String getNumber(int number) {
        String result = getFizzBuzz(number);
        if (result != "FizzBuzz" && getNextHandler() != null) {
            return getNextHandler().getNumber(number);
        }
        return result;
    }
}
