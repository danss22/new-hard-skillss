package by.mtereshchenko.Lesson12_Collections;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int a = scanner.nextInt();
        System.out.println("Введите количество символов: ");
        int b = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < b; j++) {
                if (j % 2 == 0){
                    System.out.print("w");
                }else {
                    System.out.print("b");
                }
            }
        }
    }
}
