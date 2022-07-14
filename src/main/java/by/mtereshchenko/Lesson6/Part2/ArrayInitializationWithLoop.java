package by.mtereshchenko.Lesson6.Part2;

import java.util.Arrays;

public class ArrayInitializationWithLoop {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 9; i < numbers.length; i++) {
            numbers[i] = 10 - i;
        }
        Arrays.toString(numbers);
    }
}
