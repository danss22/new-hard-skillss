package by.mtereshchenko.Lesson6.Part3;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив размером 20, заполнить случайными числами. 
Написать 2 метода, которые принимают массив и 1 метод возвращает минимальное, 2 метод возвращает максимальное число этого массива.
 */
public class Main8 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(mas));
        max(mas);
        min(mas);
    }

    static int min(int[] mas) {
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println(min);
        return min;
    }

    static int max(int[] mas) {
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        System.out.println(max);
        return max;
    }
}
