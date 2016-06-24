package com.thoughtworks;

public class BuzzWhizzHandler extends BaseHandler {
    private final int buzzNumber = 5;
    private final int whizzNumber = 7;

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        if (number % buzzNumber == 0 && number % whizzNumber == 0) {
            result = "BuzzWhizz";
        }
        if (result != "BuzzWhizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
