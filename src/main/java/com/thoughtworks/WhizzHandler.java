package com.thoughtworks;

public class WhizzHandler extends NumberHandler {
    public String getWhizz(int number) {
        if (number % 7 == 0) {
            return "Whizz";
        }
        return String.valueOf(number);
    }

    @Override
    public String getNumber(int number) {
        String result = getWhizz(number);
        if (result != "Whizz" && getNextHandler() != null) {
            return getNextHandler().getNumber(number);
        }
        return result;
    }
}
