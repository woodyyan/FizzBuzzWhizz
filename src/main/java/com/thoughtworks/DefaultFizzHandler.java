package com.thoughtworks;

public class DefaultFizzHandler extends BaseHandler {
    private final int fizzNumber = 3;
    private final int ten = 10;
    private final int hundreds = 100;

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        if (number % ten == fizzNumber) {
            result = "Fizz";
        } else if (number % hundreds / ten == fizzNumber) {
            result = "Fizz";
        }
        if (result != "Fizz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
