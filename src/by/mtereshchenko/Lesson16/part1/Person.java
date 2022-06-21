package by.mtereshchenko.Lesson16.part1;

/*
Создайте класс Человек с полем age, сделайте поле закрытым, создайте геттер и сеттер к полю, в сеттер добавьте проверку,
если переданный аргумент меньше нуля выкиньте исключение RuntimeException с сообщением “Возраст должен быть больше нуля”. Создайте метод main,
в нём объект класса Человек и вызовите сеттер дважды, 1й раз с корректным значением, 2й раз с некорректным.
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Возраст должен быть больше нуля");
        }
        this.age = age;
    }
}

class PeopleUsage {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(5);
        System.out.println(person.getAge());
        person.setAge(-2);
        System.out.println(person.getAge());
    }
}
