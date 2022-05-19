package by.mtereshchenko.Lesson7;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив размером 15, написать метод, который принимает массив и возвращает сумму всех чисел этого массива.
 */
public class Main3 {
    public static void main(String[] args) {
        int[] mas = new int[15];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(sumNumberArray(mas));
    }

    static int sumNumberArray(int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        return sum;
    }
}
