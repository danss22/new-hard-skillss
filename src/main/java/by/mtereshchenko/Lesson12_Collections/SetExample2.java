package by.mtereshchenko.Lesson12_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        System.out.println("Initial : " + names);
        names.add("Таня");
        names.add("Михаил");
        names.add("Андрей");
        names.add("Андрей");
        names.add("Павел");
        names.add("Павел");
        names.add("Света");
        System.out.println("After adding : " + names);
    }
}
