package com.thoughtworks;

public class BuzzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        if (number % 5 == 0) {
            result = "Buzz";
        }

        if (result != "Buzz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
