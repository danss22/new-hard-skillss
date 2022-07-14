package by.mtereshchenko.Lesson8;

import java.util.Arrays;

/*
Дана строка “1, 25, 32, 100, 15, 7”. Написать 2 метода, которые принимают в качестве аргумента строку.
1й метод возвращает минимальное число из этой строки, а 2й метод возвращает сумму чисел в этой строке.
 */
public class Main3 {
    public static void main(String[] args) {
        String a = "1, 25, 32, 100, 15, 7";
        System.out.println(min(a));
        System.out.println(sum(a));
    }

    static int min(String s) {
        String[] numbers = s.split(", ");
        int minNum = Integer.parseInt(numbers[0]);
        for (String number : numbers) {
           int i = Integer.parseInt(number);
           if (i < minNum){
               minNum = i;
           }
        }
        return minNum;
    }
    static int sum (String string){
        int sum = 0;
        String[] split = string.split(", ");
        final int i = Integer.parseInt(string);
        for (int i1 = 0; i1 < i; i1++) {
            sum += i1;
        }
        return sum;
    }

}
