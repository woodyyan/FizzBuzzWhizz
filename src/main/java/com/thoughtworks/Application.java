package com.thoughtworks;

public class Application {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        BaseHandler handler = teacher.sayRule();

        for (int number = 1; number <= 105; number++) {
            Student student = new Student();
            student.setHandler(handler);
            String result = student.answer(number);
            System.out.println(result);
        }
    }
}
