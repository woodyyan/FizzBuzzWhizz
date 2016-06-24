package com.thoughtworks;

public class FizzBuzzHandler extends BaseHandler {

    @Override
    public String getResult(int number) {
        String result = String.valueOf(number);
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        }
        if (result != "FizzBuzz" && getNextHandler() != null) {
            return getNextHandler().getResult(number);
        }
        return result;
    }
}
