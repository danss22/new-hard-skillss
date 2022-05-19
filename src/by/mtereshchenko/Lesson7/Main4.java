package by.mtereshchenko.Lesson7;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив, размером 30 со случайными значениями чисел. Заменить каждый элемент массива с нечетным индексом на ноль.
 */
public class Main4 {
    public static void main(String[] args) {
        int[] mas = new int[30];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(30);
            if (i % 2 != 0) {
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
