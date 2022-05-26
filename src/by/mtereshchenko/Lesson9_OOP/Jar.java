package by.mtereshchenko.Lesson9_OOP;

public class Jar {
    int amount;

    public Jar(int amount) {
        this.amount = amount;
    }

    void pour(Jar anotherJar) {
        amount = amount + anotherJar.amount;
        anotherJar.amount = 0;
    }

    public static void main(String[] args) {
        Jar firstJar = new Jar(10);
        Jar secondJar = new Jar(5);
        System.out.println("First: " + firstJar.amount + ", second: " + secondJar.amount);
        firstJar.pour(secondJar);
        System.out.println("First: " + firstJar.amount + ", second: " + secondJar.amount);
    }
}
