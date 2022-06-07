package by.mtereshchenko.Lesson12_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayList_VS_LinkedList {
    public static void main(String[] args) {
        Random random = new Random(100);
        long start = System.currentTimeMillis();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            numbers.add(random.nextInt());
        }
        System.out.println(numbers);
        for (int i = 0; i < 10_000; i++) {
            int currentElement = numbers.get(i);
        }
         long finish = System.currentTimeMillis();
        System.out.println("ArrayList time is : " + (finish + start) + "ms");
    }
}
