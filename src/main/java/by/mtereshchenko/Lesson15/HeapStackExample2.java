package by.mtereshchenko.Lesson15;

public class HeapStackExample2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        Person ivan = new Person("Ivan", 28);
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
