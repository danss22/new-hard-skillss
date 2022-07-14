package by.mtereshchenko.Lesson7;

import java.util.Arrays;

public class Main5_2 {
    public static void main(String[] args) {
        int[] arra1 = {1, 2, 3};
        int[] arra2 = {10, 11, 12, 13, 14};
        int[] combineArray = combine(arra1, arra2);
        System.out.println(Arrays.toString(combineArray));
    }

    static int[] combine(int[] array1, int[] array2) {
        int[] combineArray = new int[array1.length + array2.length];
        int indexOfCombineArray = 0;
        for (int i = 0; i < array1.length; i++) {
            combineArray[indexOfCombineArray] = array1[i];
            indexOfCombineArray++;
        }
        for (int i = 0; i < array2.length; i++) {
            combineArray[indexOfCombineArray] = array2[i];
            indexOfCombineArray++;
        }
        return combineArray;
    }
}
