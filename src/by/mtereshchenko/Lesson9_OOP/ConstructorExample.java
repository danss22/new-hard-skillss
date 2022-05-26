package by.mtereshchenko.Lesson9_OOP;

public class ConstructorExample {
    public static void main(String[] args) {
        Cat1 cleopatra = new Cat1();
        Cat1 phenix = new Cat1();
    }
}

class Cat1 {
    Cat1() {
        System.out.println("Hi from Cat constructor");
    }
}
