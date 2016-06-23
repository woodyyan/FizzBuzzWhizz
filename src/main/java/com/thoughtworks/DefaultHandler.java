package com.thoughtworks;

public class DefaultHandler {
    public String getDefaultValue(int number) {
        FizzHandler fizzHandler = new FizzHandler();
        String result = fizzHandler.getFizzIfContainsThree(number);
        if (result != null) {
            return result;
        }

        FizzBuzzWhizzHandler fizzBuzzWhizzHandler = new FizzBuzzWhizzHandler();
        result = fizzBuzzWhizzHandler.getFizzBuzzWhizz(number);
        if (result != null) {
            return result;
        }

        FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
        result = fizzBuzzHandler.getFizzBuzz(number);
        if (result != null) {
            return result;
        }

        FizzWhizzHandler fizzWhizzHandler = new FizzWhizzHandler();
        result = fizzWhizzHandler.getFizzWhizz(number);
        if (result != null) {
            return result;
        }

        BuzzWhizzHandler buzzWhizzHandler = new BuzzWhizzHandler();
        result = buzzWhizzHandler.getBuzzWhizz(number);
        if (result != null) {
            return result;
        }

        result = fizzHandler.getFizzIfTimesOfThree(number);
        if (result != null) {
            return result;
        }

        BuzzHandler buzzHandler = new BuzzHandler();
        result = buzzHandler.getBuzz(number);
        if (result != null) {
            return result;
        }

        WhizzHandler whizzHandler = new WhizzHandler();
        result = whizzHandler.getWhizz(number);
        if (result != null) {
            return result;
        }

        return String.valueOf(number);
    }
}
