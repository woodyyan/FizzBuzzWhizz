package com.thoughtworks;

public class FizzHandler extends NumberHandler{
    public String getFizz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return null;
    }


    @Override
    public String getNumber(int number) {
        String result = getFizz(number);
        if (result == null){
            return getNextHandler().getNumber(number);
        }
        return result;
    }
}
