package by.mtereshchenko.Lesson4;

/*
показать все числа от 1 до 100, которые делятся без остатка на 3 и на 5.
В выводе должны быть числа: 15, 30, 45, 60, 75, 90.
 */
public class Main3 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
