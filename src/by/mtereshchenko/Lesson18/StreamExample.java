package by.mtereshchenko.Lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // -.stream();
        // filter(), map(), sorted(), limit();
        // forEach(), count(), collect, aneMatch / allMatch, findFirst()

        // поток данных -> промежуточные методы (0..n) -> 1 терминальный метод
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Oleg");
        names.add("Olga");

//        for (String name : names) {
//            System.out.println(name);
//        }
        names.stream()
                .forEach((e) -> System.out.println(e));

//        long count = names.stream()
//                .limit(2)
//                .count();
//        System.out.println(count);
//        System.out.println(names.size());

//        for (String name : names) {
//            System.out.println(name.toUpperCase());
//        }
//        names.stream()
//                .forEach(e -> System.out.println(e.toUpperCase()));
        List<String> newList = names.stream()
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(newList);


    }
}
