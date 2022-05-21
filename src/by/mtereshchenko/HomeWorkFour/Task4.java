package by.mtereshchenko.HomeWorkFour;

import java.util.Arrays;

/*
Написать метод, который принимает массив и два числа.
Два числа это два индекса этого массива, метод должен поменять местами эл-ты по переданным индексам.
В методе main проверить работу своего метода.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4};
        arr(mas, 0, 0);
    }

    static void arr(int[] arr, int a, int b) {
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            c = arr[a];
            arr[a] = arr[b];
            arr[b] = c;
        }
        System.out.println(Arrays.toString(arr));
    }
}
