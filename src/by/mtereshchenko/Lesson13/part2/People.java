package by.mtereshchenko.Lesson13.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class PeopleUsage {
    public static void main(String[] args) {
        Map<String, People> telSprav = new HashMap<>();
        People misha = new People("Misha", "Tereshchenko", "+37544-762-67-04", "Minsk", "25.01.1995");
        People lena = new People("Lena", "Tereshchenko", "+37544-563-09-66", "Minsk", "22.08.1988");
        People lesha = new People("Lesha", "Tereshchenko", "+37544-318-97-95", "Minsk", "12.11.2014");
        People zhenya = new People("Zhenya", "Tereshchenko", "+37544-762-67-04", "Minsk", "24.12.2020");
        telSprav.put("Misha Tereshchenko", misha);
        telSprav.put("Lena Tereshchenko", lena);
        telSprav.put("Lesha Tereshchenko", lesha);
        telSprav.put("Zhenya Tereshchenko", zhenya);
        for (Map.Entry<String, People> fo: telSprav.entrySet()){
            System.out.println(fo);
        }
        System.out.println();
        telSprav.remove("Misha Tereshchenko");
        for (Map.Entry<String, People> fo: telSprav.entrySet()){
            System.out.println(fo);
        }
    }
}

public class People {
    String name;
    String surname;
    String number;
    String data;
    String happyBirthday;

    public People(String name, String surname, String number, String data, String happyBirthday) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.data = data;
        this.happyBirthday = happyBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name) && Objects.equals(surname, people.surname) && Objects.equals(number, people.number) && Objects.equals(data, people.data) && Objects.equals(happyBirthday, people.happyBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, number, data, happyBirthday);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number='" + number + '\'' +
                ", data='" + data + '\'' +
                ", happyBirthday='" + happyBirthday + '\'' +
                '}';
    }
}
