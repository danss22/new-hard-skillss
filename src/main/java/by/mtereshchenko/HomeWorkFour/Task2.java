package by.mtereshchenko.HomeWorkFour;

import java.awt.geom.RectangularShape;
import java.util.Arrays;
import java.util.Random;

/*
Необходимо создать программу, которая будет заполнять массив числами, возведенными в квадрат.
В методе передаётся параметр bound. Он определяет, до какого  числа нужно записывать числа.
Например, если задается bound = 3, нужно возвести в квадрат числа 0, 1 и 2 и записать в массив числа 0, 1, 4.
 */
public class Task2 {
    public static void main(String[] args) {
        bound(5);
    }

    static void bound(int bound) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[bound];
        for (int i = 0; i < arr.length; i++) {
            if (bound == 1) {
                arr2[0] = arr[0] * arr[0];
            } else if (bound == 2) {
                arr2[1] = arr[1] * arr[1];
            } else if (bound == 3) {
                arr2[1] = arr[1] * arr[1];
                arr2[2] = arr[2] * arr[2];
            } else if (bound == 4) {
                arr2[1] = arr[1] * arr[1];
                arr2[2] = arr[2] * arr[2];
                arr2[3] = arr[3] * arr[3];
            }else if (bound == 5) {
                arr2[1] = arr[1] * arr[1];
                arr2[2] = arr[2] * arr[2];
                arr2[3] = arr[3] * arr[3];
                arr2[4] = arr[4] * arr[4];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}

