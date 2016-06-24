package com.thoughtworks;

public class WhizzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        if (number % 7 == 0) {
            result = "Whizz";
        }
        if (result != "Whizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
