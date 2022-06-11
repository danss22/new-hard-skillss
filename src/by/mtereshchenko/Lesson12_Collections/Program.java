package by.mtereshchenko.Lesson12_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Номер эллемента Фибоначчи: ");
        int n = scanner.nextInt();
        int i = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (i <= n) {
            arr.add(((n - 1) + (n - 2)));
            i++;
        }
        System.out.print(arr.get(arr.size() - 1));
    }
}
