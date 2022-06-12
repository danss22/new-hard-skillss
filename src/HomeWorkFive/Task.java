package HomeWorkFive;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
Банковская система. Создайте класс Пользователь, поля у него: имя, фамилия,
работа, количество денег, номер паспорта. В методе main создайте HashMap,
ключи будут номера паспортов, значения объекты класса Пользователь.
Создайте несколько пользователей, положите их в map, выведите все значения
на экран, затем удалите 1 пару из map и снова выведите.
 */
public class Task {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        User sasha = new User("Sasha", "Borikov", "Salesman", 25000, "YH569965");
        User pasha = new User("Pavel", "Yakunov", "Driver", 20000, "KK188956");
        User igor = new User("Igor", "Yakimovich", "Engineer", 30000, "ZP65682123");
        User artem = new User("Artem", "Petrov", "Cook", 18000, "DP1651321321");
        User dima = new User("Dmitri", "Ivanov", "Cleaner", 17000, "FF16519851");
        User elena = new User("Elena", "Pavlova", "Salesman", 1000, "HH25589655");
        User vlad = new User("Vlad", "Apen'ko", "Driver", 1000000, "YD322651651");
        users.put(sasha.getNumberOfPassport(), sasha);
        users.put(pasha.getNumberOfPassport(), pasha);
        users.put(igor.getNumberOfPassport(), igor);
        users.put(artem.getNumberOfPassport(), artem);
        users.put(dima.getNumberOfPassport(), dima);
        users.put(elena.getNumberOfPassport(), elena);
        users.put(vlad.getNumberOfPassport(), vlad);
        for (Map.Entry<String, User> userEntry : users.entrySet()) {
            System.out.println(userEntry);
        }
        System.out.println();
        System.out.println("Удалили пользователя: " + users.remove(sasha.getNumberOfPassport()));
        System.out.println("Удалили пользователя: " + users.remove(pasha.getNumberOfPassport()));
        System.out.println();
        for (Map.Entry<String, User> stringUserEntry : users.entrySet()) {
            System.out.println(stringUserEntry);
        }
    }
}

class User {
    private final String name;
    private final String surname;
    private final String work;
    private final int money;
    private final String numberOfPassport;

    public User(String name, String surname, String work, int money, String numberOfPassport) {
        this.name = name;
        this.surname = surname;
        this.work = work;
        this.money = money;
        this.numberOfPassport = numberOfPassport;
    }

    public String getNumberOfPassport() {
        return numberOfPassport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return money == user.money && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(work, user.work) && Objects.equals(numberOfPassport, user.numberOfPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, work, money, numberOfPassport);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", work='" + work + '\'' +
                ", money=" + money +
                ", numberOfPassport='" + numberOfPassport + '\'' +
                '}';
    }
}
