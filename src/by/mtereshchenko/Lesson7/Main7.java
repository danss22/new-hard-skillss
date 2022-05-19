package by.mtereshchenko.Lesson7;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив чисел размером 20, написать метод, который принимает массив и возвращает среднее арифметическое элементов массива.
 */
public class Main7 {
    public static void main(String[] args) {
        int[] arr = new int[5];
    Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(3);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum(arr));
    }
static double sum (int[] arr){
        int sum = 0;
        int arif = 0;
        int count = 0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
        count++;
    }arif = sum / arr.length;
        return arif;
}
}
