package com.thoughtworks;

public class FizzWhizzHandler extends BaseHandler {
    private final int fizzNumber = 3;
    private final int whizzNumber = 7;

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        if (number % fizzNumber == 0 && number % whizzNumber == 0) {
            result = "FizzWhizz";
        }
        if (result != "FizzWhizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
