package by.mtereshchenko.Lesson6.Part3;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив размером 15, заполнить его случайными числами. Затем вывести массив на экран.
Запустить несколько раз и увидеть, что каждый раз массив заполнен разными значениями.
 */
public class Main7 {
    public static void main(String[] args) {
        int[] mas = new int[15];
        for (int i = 0; i < mas.length; i++) {
            Random random = new Random();
            mas[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(mas));
    }
}
