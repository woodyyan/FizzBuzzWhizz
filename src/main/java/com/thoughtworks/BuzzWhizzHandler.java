package com.thoughtworks;

public class BuzzWhizzHandler extends NumberHandler {
    public String getBuzzWhizz(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "BuzzWhizz";
        }
        return String.valueOf(number);
    }

    @Override
    public String getNumber(int number) {
        String result = getBuzzWhizz(number);
        if (result != "BuzzWhizz" && getNextHandler() != null) {
            return getNextHandler().getNumber(number);
        }
        return result;
    }
}
