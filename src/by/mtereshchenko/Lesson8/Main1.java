package by.mtereshchenko.Lesson8;

import java.util.Arrays;

/*
Написать метод, который принимает строку и индекс.
Метод печатает на экран текст вида: “Символ на позиции 0 это П”, либо “Символ на позиции 3 это В”.
Пример выше для слова “Привет” и переданными индексами 0 и 3 соответственно.

 */
public class Main1 {
    public static void main(String[] args) {
        Str("Привет", 3);
    }

    static void Str(String sек, int index) {
        System.out.println("Символ на позиции " + index + " это " + sек.toUpperCase().charAt(index));
    }
}
