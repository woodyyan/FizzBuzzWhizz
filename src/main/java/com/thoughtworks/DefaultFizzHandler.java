package com.thoughtworks;

class DefaultFizzHandler extends BaseHandler {

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        int ten = 10;
        int fizzNumber = 3;
        int hundreds = 100;
        if (number % ten == fizzNumber) {
            result = "Fizz";
        } else if (number % hundreds / ten == fizzNumber) {
            result = "Fizz";
        }
        if (!result.equals("Fizz") && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
