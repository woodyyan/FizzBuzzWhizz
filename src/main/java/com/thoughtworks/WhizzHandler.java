package com.thoughtworks;

public class WhizzHandler extends BaseHandler {
    private final int whizzNumber = 7;

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        if (number % whizzNumber == 0) {
            result = "Whizz";
        }
        if (result != "Whizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
