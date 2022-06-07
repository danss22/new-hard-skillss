package by.mtereshchenko.Lesson12_Collections;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> people = new HashSet<>();
        people.add("Misha");
        people.add("Pasha");
        System.out.println(people);
        for (String person : people) {
            System.out.println(person);
        }
    }
}

class Person1 {
    int age;
    String name;

    public Person1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person = (Person1) o;
        return age == person.age && Objects.equals(name, person.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(age, name);

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
