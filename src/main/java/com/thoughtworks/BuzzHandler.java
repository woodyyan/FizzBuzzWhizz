package com.thoughtworks;

public class BuzzHandler extends NumberHandler {
    public String getBuzz(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        }

        return null;
    }

    @Override
    public String getNumber(int number) {
        String result = getBuzz(number);
        if (result == null){
            return getNextHandler().getNumber(number);
        }
        return result;
    }
}
