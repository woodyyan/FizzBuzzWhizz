package com.thoughtworks;

import org.xml.sax.helpers.*;

public class Application {
    public static void main(String[] args) {

        DefaultFizzHandler defaultFizzHandler = new DefaultFizzHandler();
        FizzHandler fizzHandler = new FizzHandler();
        BuzzHandler buzzHandler = new BuzzHandler();
        WhizzHandler whizzHandler = new WhizzHandler();
        FizzBuzzHandler fizzBuzzHandler = new FizzBuzzHandler();
        BuzzWhizzHandler buzzWhizzHandler = new BuzzWhizzHandler();
        FizzWhizzHandler fizzWhizzHandler = new FizzWhizzHandler();
        FizzBuzzWhizzHandler fizzBuzzWhizzHandler = new FizzBuzzWhizzHandler();

        defaultFizzHandler.setNexthandler(fizzBuzzWhizzHandler);
        fizzBuzzWhizzHandler.setNexthandler(fizzBuzzHandler);
        fizzBuzzHandler.setNexthandler(fizzWhizzHandler);
        fizzWhizzHandler.setNexthandler(buzzWhizzHandler);
        buzzWhizzHandler.setNexthandler(buzzHandler);
        buzzHandler.setNexthandler(fizzHandler);
        fizzHandler.setNexthandler(whizzHandler);

        int number = 35;
        String result = defaultFizzHandler.getNumber(number);
        System.out.print(result);
    }
}
