package by.mtereshchenko.Lesson10.Part3;

import by.mtereshchenko.Lesson10.Person;

public class PolymorphismExample {
    // polymorphism:
    // - overloading / перегрузка
    // - overriding / переопределение
    public static void main(String[] args) {
        Peron ivan = new Peron();
        ivan.hello("Petr");
        ivan.hello();
    }
}

class Peron {
    void hello() {
        System.out.println("Hello: ");
    }

    void hello(String name) {
        System.out.println("Hello: " + name);
    }

    void hello(String name, String surname) {
        System.out.println("Hello: " + surname + " " + name);
    }

    void hello(String name, int age) {
        System.out.println("Hello: " + name + " " + age);
    }
}
