package by.mtereshchenko.Lesson10;

public class Person {
    public String name;
    private int salary;

//    public Person(String name, int salary) {
//        this.name = name;
//        this.salary = salary;
//    }

}
class  PersonUsage {
    public static void main(String[] args) {
        Person ivan = new Person();
        System.out.println(ivan.name);
    }
}
