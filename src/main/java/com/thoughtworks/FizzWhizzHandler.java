package com.thoughtworks;

class FizzWhizzHandler extends BaseHandler {

    @Override
    public final String getResult(final int number) {
        String result = String.valueOf(number);
        int fizzNumber = 3;
        int whizzNumber = 7;
        if (number % fizzNumber == 0 && number % whizzNumber == 0) {
            result = "FizzWhizz";
        }
        if (!result.equals("FizzWhizz") && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
