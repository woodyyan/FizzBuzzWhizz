package com.thoughtworks;

public class FizzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        if (number % 3 == 0) {
            result = "Fizz";
        }
        if (result != "Fizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
