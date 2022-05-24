package by.mtereshchenko.HomeWorkFour;

import java.util.Arrays;

/*
Необходимо создать программу, которая будет заполнять массив числами, возведенными в квадрат.
В методе передаётся параметр bound. Он определяет, до какого  числа нужно записывать числа.
Например, если задается bound = 3, нужно возвести в квадрат числа 0, 1 и 2 и записать в массив числа 0, 1, 4.
 */
public class Task2_2 {
    public static void main(String[] args) {
        bound(4);
    }

    static void bound(int bound) {
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[bound];
        for (int i = 0; i < arr2.length; i++) {
            if (bound > 0) {
                arr2[i] = arr[i] * arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}

