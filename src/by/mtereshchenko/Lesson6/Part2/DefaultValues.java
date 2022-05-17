package by.mtereshchenko.Lesson6.Part2;

import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 7;
        numbers[1] = 11;
        numbers[2] = 6;
        numbers[3] = 55;
        numbers[4] = 98;

        System.out.println(Arrays.toString(numbers));
        numbers[0] = 70;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[3]);
        int forthElement = numbers[3];
        System.out.println(forthElement);
    }
}
