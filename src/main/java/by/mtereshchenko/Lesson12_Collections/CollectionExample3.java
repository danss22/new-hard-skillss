package by.mtereshchenko.Lesson12_Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample3 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        System.out.println(number);
        System.out.println();
        for (Integer integer : number) {
            System.out.println(integer);
        }
        Integer x = number.get(0);
        Integer y = number.get(1);
        System.out.println(x);
        System.out.println(y);
    }
}
