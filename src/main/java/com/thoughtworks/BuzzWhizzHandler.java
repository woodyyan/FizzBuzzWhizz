package com.thoughtworks;

public class BuzzWhizzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        if (number % 5 == 0 && number % 7 == 0) {
            result = "BuzzWhizz";
        }
        if (result != "BuzzWhizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
