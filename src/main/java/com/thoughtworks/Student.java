package com.thoughtworks;

class Student {
    private BaseHandler handler;

    final void setHandler(final BaseHandler baseHandler) {
        this.handler = baseHandler;
    }

    final String answer(final int number) {
        if (handler != null) {
            return handler.getResult(number);
        }
        return String.valueOf(number);
    }
}
