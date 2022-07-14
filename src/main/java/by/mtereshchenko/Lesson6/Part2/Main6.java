package by.mtereshchenko.Lesson6.Part2;

import java.util.Arrays;

/*
- Создать массив размером 10, заполнить числами от 10 до 1.
 */
public class Main6 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = 10 - i;
        }
        System.out.println(Arrays.toString(mas));
    }
}
