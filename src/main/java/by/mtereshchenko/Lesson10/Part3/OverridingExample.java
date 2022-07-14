package by.mtereshchenko.Lesson10.Part3;

public class OverridingExample {
    public static void main(String[] args) {
        Person1 ivan = new Person1();
        ivan.earnMoney();
        Child1 marya = new Child1();
        marya.earnMoney();
    }
}
class Person1 {
    void earnMoney() {
        System.out.println("Работаю на тяжёлой работе.");
    }
}
class Child1 extends Person1 {
    @Override
    void earnMoney() {
        System.out.println("Просить деньги у родителей.");
    }
}
