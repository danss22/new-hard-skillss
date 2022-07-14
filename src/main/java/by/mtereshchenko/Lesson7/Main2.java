package by.mtereshchenko.Lesson7;

import java.util.Arrays;
import java.util.Random;

/*
Создать массив размером 10, заполнить его случайными числами в диапазоне от 0 до 20.
Затем в зависимости от чётности/нечётности индекса поменять значение у числа, если индекс четный, то число поменять значение на отрицательное.
 */
public class Main2 {
    public static void main(String[] args) {
//        int[] mas = new int[10];
//        for (int i = 0; i < mas.length; i++) {
//            Random random = new Random();
//            mas[i] = random.nextInt(20);
//            mas[i] = i % 2 == 0 ? mas[i] * -1 : mas[i];
//        }
//        System.out.println(Arrays.toString(mas));

        int[] numbers = new int[10];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                numbers[i] *= -1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
