package com.thoughtworks;

public class WhizzHandler extends NumberHandler {
    public String getWhizz(int number) {
        if (number % 7 == 0) {
            return "Whizz";
        }
        return null;
    }

    @Override
    public String getNumber(int number) {
        String result = getWhizz(number);
        if (result == null){
            return getNextHandler().getNumber(number);
        }
        return result;
    }
}
