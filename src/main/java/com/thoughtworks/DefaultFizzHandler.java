package com.thoughtworks;

public class DefaultFizzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        if (number % 10 == 3) {
            result = "Fizz";
        } else if (number % 100 / 10 == 3) {
            result = "Fizz";
        }
        if (result != "Fizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
