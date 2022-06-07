package by.mtereshchenko.Lesson10.Part3;

/*
Создать класс Человек, Танцор, Певец, Доктор. У класса Человек есть метод зарабатывать деньги, в нём выводить “работаю на обычной работе”.
Классы Танцор, Певец и Доктор наследуют класс Человек и переопределяют метод зарабатывать деньги, каждый переопределяет метод по своему,
написать свою реализацию, например для доктора вывод на экран “Лечу людей, помогаю быть здоровыми”.
В методе main создать массив с типом Человек, туда записать несколько объектов разных типов Человека. Пройтись по массиву че
рез цикл вызвать у каждого объекта метод зарабатывания денег.
 */
public class Main1 {
    public static void main(String[] args) {
        Person[] people1 = new Person[4];
        people1[0] = new Person();
        people1[1] = new Singer();
        people1[2] = new Doctor();
        people1[3] = new Dancer();
        for (Person people2 : people1) {
            people2.money();
        }
    }
}

class Person {
    void money() {
        System.out.println("работаю на обычной работе");
    }
}

class Dancer extends Person {
    @Override
    void money() {
        System.out.println("Зарабатываю деньги, танцуя для людей");
    }
}

class Singer extends Person {
    @Override
    void money() {
        System.out.println("Зарабатываю пением");
    }
}

class Doctor extends Person {
    @Override
    void money() {
        System.out.println("Лечу людей, помогаю быть здоровыми");
    }
}
