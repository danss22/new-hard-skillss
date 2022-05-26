package by.mtereshchenko.Lesson9_OOP;

public class Person {
    String name;
    int age;
    String city;
    String gender;

    public Person(String name, int age, String city, String gender) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    void print() {
        System.out.println("My name is: " + name);
        System.out.println("Me: " + age + " age ");
        System.out.println("I am from: " + city);
        System.out.println("gender: " + gender);
    }

    void eat() {
        System.out.println("Я ем");
    }

    void study() {
        System.out.println("Я учусь");
    }

    void sleep() {
        System.out.println("Я сплю");
    }

    void play() {
        System.out.println("Я играю");
    }

    public static void main(String[] args) {
        Person men = new Person("Misha", 27, "Minsk", "M");
        Person women = new Person("Lena", 33, "Minsk", "W");

        men.print();
        men.eat();
        men.study();
        men.sleep();
        men.play();

        System.out.println("==================");

        women.print();
        women.eat();
        women.study();
        women.sleep();
        women.play();
    }
}
