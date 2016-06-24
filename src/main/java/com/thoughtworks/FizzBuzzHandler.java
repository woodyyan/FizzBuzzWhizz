package com.thoughtworks;

public class FizzBuzzHandler extends BaseHandler {
    private final int fizzNumber = 3;
    private final int buzzNumber = 5;

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        if (number % fizzNumber == 0 && number % buzzNumber == 0) {
            result = "FizzBuzz";
        }
        if (result != "FizzBuzz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
