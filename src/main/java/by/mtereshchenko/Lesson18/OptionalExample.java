package by.mtereshchenko.Lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // -.stream();
        // filter(), map(), sorted(), limit();
        // forEach(), count(), collect, aneMatch / allMatch, findFirst()

        // поток данных -> промежуточные методы (0..n) -> 1 терминальный метод

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Optional<Integer> firstOptional = numbers.stream()
                .filter(e -> e > 50)
                .findFirst();
        System.out.println(firstOptional);
//        Integer number = firstOptional.get();
//        System.out.println(number);

        if (firstOptional.isPresent()){
            Integer number = firstOptional.get();
            System.out.println(number);
        }
    }
}
