package by.mtereshchenko.Lesson16.part1;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers.get(10));
    }
}
