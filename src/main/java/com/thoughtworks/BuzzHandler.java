package com.thoughtworks;

public class BuzzHandler extends BaseHandler {
    private final int buzzNumber = 5;

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        if (number % buzzNumber == 0) {
            result = "Buzz";
        }

        if (result != "Buzz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
