package by.mtereshchenko.Lesson12_Collections;

import by.mtereshchenko.Lesson11.Part2.InterfaceExample;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        // <> - generics, Дженерики, обобщенные типы
        // <E> Element, <T> Type

//        Integer x = new Integer(10);
//        Integer y = new Integer(20);
//        System.out.println(x + y);
//        System.out.println(x * y);

        // autoboxing / unboxing
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
    }
}
