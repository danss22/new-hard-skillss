package by.mtereshchenko.Lesson13.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
class CitizenUsage {
    public static void main(String[] args) {
        Map<String, Citizen> citizens = new HashMap<>();
        Citizen johny = new Citizen("Johny", "Depp", "abc777", 2);
        Citizen arnold = new Citizen("Arnold", "Schwarzenegger", "4z", 5);
        Citizen John = new Citizen("John", "Carry", ":)", 7);
        Citizen emma = new Citizen("Emma", "Watson", "123-zz-123", 3);

        citizens.put(johny.passportNumber, johny);
        citizens.put(arnold.passportNumber, arnold);
        citizens.put(John.passportNumber, John);
        citizens.put(emma.passportNumber, emma);
        System.out.println(citizens.get("4z"));
        System.out.println(citizens.get(":)"));
    }
}
public class Citizen {
    String name;
    String surname;
    String passportNumber;
    int childrenQuantity;

    public Citizen(String name, String surname, String passportNumber, int childrenQuantity) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
        this.childrenQuantity = childrenQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return childrenQuantity == citizen.childrenQuantity && Objects.equals(name, citizen.name) && Objects.equals(surname, citizen.surname) && Objects.equals(passportNumber, citizen.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, passportNumber, childrenQuantity);
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", childrenQuantity=" + childrenQuantity +
                '}';
    }
}
