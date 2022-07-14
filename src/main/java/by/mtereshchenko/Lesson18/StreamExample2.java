package by.mtereshchenko.Lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {

        // -.stream();
        // filter(), map(), sorted(), limit();
        // forEach(), count(), collect, aneMatch / allMatch, findFirst()

        // поток данных -> промежуточные методы (0..n) -> 1 терминальный метод

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
        }
        System.out.println(numbers);
//        for (Integer number : numbers) {
//            if (number % 2  == 0){
//                System.out.println(number);
//            }
//        }
//        numbers.stream()
//                .filter((e) -> e > 50)
//                .forEach((e) -> System.out.println(e));

//        numbers.stream()
//                .filter((e) -> e % 2 == 0)
//                .forEach(System.out::println);

//        long count = numbers.stream()
//                .filter((e) -> e > 30)
//                .count();
//        System.out.println(count);

        List<Integer> newList = new ArrayList<>();
        for (Integer number : numbers) {
            newList.add(number * 10);
        }
//        System.out.println(newList);
//        numbers.stream()
//                .map(e -> e * 10)
//                .collect(Collectors.toList());
//        System.out.println(newList);


//       List<Integer> newList1 = numbers.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(newList1);


//        boolean flag = false;
//        for (Integer number : numbers) {
//            if (number > 90){
//                flag = true;
//                break;
//            }
//        }
//        System.out.println(flag);


//        final boolean flag = numbers.stream()
//                .anyMatch(e -> e > 90);
//        System.out.println(flag);



//        boolean flag = true;
//        for (Integer number : numbers) {
//            if (number <= 10){
//                flag = false;
//                break;
//            }
//        }
//        System.out.println(flag);


//        boolean flag = numbers.stream()
//                .anyMatch(e -> e > 10);
//        System.out.println(flag);




    }
}
