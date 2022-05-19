package by.mtereshchenko.Lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*
Создать 2 массива размером 3 и 5, заполнить случайным значениями.
Создать метод, который на вход принимает оба массива, а возвращает новый массив, который объединяет 1 и 2 массив.
В методе main проверить работу метода.
 */
public class Main5 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5);
        }
        System.out.println("Первый массив :" + Arrays.toString(arr));
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(5);
        }
        System.out.println("Второй массив :" + Arrays.toString(arr2));

        System.out.println(Arrays.toString(getArray(arr, arr2)));
    }

    static int[] getArray(int[] arr, int[] arr2) {
        int[] arr3 = new int[arr.length + arr2.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
            count++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[count++] = arr2[j];
        }
        return arr3;
    }
}
