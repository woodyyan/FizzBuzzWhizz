package com.thoughtworks;

public class FizzHandler extends BaseHandler {
    private final int fizzNumber = 3;

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        if (number % fizzNumber == 0) {
            result = "Fizz";
        }
        if (result != "Fizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
