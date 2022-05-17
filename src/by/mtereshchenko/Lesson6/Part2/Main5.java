package by.mtereshchenko.Lesson6.Part2;

import java.util.Arrays;

/*
- Создать массив размером 10, заполнить числами от 1 до 10.
 */
public class Main5 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
        }
        System.out.println(Arrays.toString(mas));
    }
}
