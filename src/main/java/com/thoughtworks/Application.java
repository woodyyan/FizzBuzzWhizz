package com.thoughtworks;

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

        defaultFizzHandler.setNextHandler(fizzBuzzWhizzHandler);
        fizzBuzzWhizzHandler.setNextHandler(fizzBuzzHandler);
        fizzBuzzHandler.setNextHandler(fizzWhizzHandler);
        fizzWhizzHandler.setNextHandler(buzzWhizzHandler);
        buzzWhizzHandler.setNextHandler(buzzHandler);
        buzzHandler.setNextHandler(fizzHandler);
        fizzHandler.setNextHandler(whizzHandler);

        for (int number = 1; number <= 105; number++) {
            String result = defaultFizzHandler.getResult(number);
            System.out.println(result);
        }
    }
}
