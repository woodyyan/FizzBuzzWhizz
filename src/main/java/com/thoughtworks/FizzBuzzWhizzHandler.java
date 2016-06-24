package com.thoughtworks;

public class FizzBuzzWhizzHandler extends BaseHandler {
    private final int fizzNumber = 3;
    private final int buzzNumber = 5;
    private final int whizzNumber = 7;

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        if (number % fizzNumber == 0
                && number % buzzNumber == 0
                && number % whizzNumber == 0) {
            return "FizzBuzzWhizz";
        }
        if (result != "FizzBuzzWhizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
