package com.thoughtworks;

public class FizzBuzzWhizzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
            return "FizzBuzzWhizz";
        }
        if (result != "FizzBuzzWhizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
