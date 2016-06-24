package com.thoughtworks;

public class FizzWhizzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        if (number % 3 == 0 && number % 7 == 0) {
            result = "FizzWhizz";
        }
        if (result != "FizzWhizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
