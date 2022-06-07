package by.mtereshchenko.Lesson12_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CollectionExample2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(30, "Valentin"));
        people.add(new Person(40, "Marina"));
        System.out.println(people);
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
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
