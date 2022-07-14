package by.mtereshchenko.Lesson16.part2;

import java.io.IOError;
import java.io.IOException;

public class TryCatchFinallyExample {
    // code
    // try {
    // попробуй выполнить код который в этом блоке
    // } catch (Exception e) {
    // code
    // } [finally {
    // code
    // }]
    public static void main(String[] args) {
        System.out.println("Начало");

        try {
            int x = 10;
            int y = 0;
            System.out.println(x / y);
            System.out.println("Середина");
        } catch (ArithmeticException e) {
            System.out.println("Произошло исключение # 2: " + e);
        } finally {
            System.out.println("Привет из блока finally");
        }
        System.out.println("Конец");
    }
}

