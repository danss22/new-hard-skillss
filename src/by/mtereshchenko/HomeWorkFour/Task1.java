package by.mtereshchenko.HomeWorkFour;

import java.util.Arrays;
import java.util.Random;

//Создать массив чисел размером 25, создать метод, который принимает массив и возвращает массив из четных элементов первого массива.
public class Task1 {
    public static void main(String[] args) {
        int[] arrays = new int[25];
        invert(arrays);
    }

    static int[] invert(int[] arr) {
        int[] mas = new int[25];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
            if (mas[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("Чётных элементов: " + count);

        int[] mas1 = new int[count];
        int index = 0;
        for (int ma : mas) {
            if (ma % 2 == 0) {
                mas1[index] = ma;
                index++;
            }
        }
        System.out.println(Arrays.toString(mas1));
        return arr;
    }
}



