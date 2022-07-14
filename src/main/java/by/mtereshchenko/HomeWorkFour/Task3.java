package by.mtereshchenko.HomeWorkFour;

import java.util.Arrays;

/*
Создать метод, который принимает 2 массива символов. Этот метод проверяет, что слово начинается c определенной последовательности.
Например:
char[] word = {‘П’,’р’,’и’,’в’,’е’,’т’};
char[] firstPrefix = {‘П’,’р’,’и’};
char[] secondPrefix = {‘П’,’р’,’е’};
Для вызова метода (word, firstPrefix) должно вернуться true, для вызова метода(word, secondPrefix) - false.
 */
public class Task3 {
    public static void main(String[] args) {
        char[] word = {'П', 'р', 'и', 'в', 'е', 'т'};
        char[] word1 = {'П', 'р', 'е', 'в', 'е', 'т'};
        equals(word, word1);
    }

    static boolean equals(char[] a, char[] a2) {
        char[] word = {'П', 'р', 'и', 'в', 'е', 'т'};
        char[] firstPrefix = {'П', 'р', 'и'};
        char[] secondPrefix = {'П', 'р', 'е'};
        boolean b;
        if (Arrays.equals(a, a2)) {
            System.out.println(a = word);
            System.out.println(a = secondPrefix);
            b = false;
        } else {
            b = true;
            System.out.println(a = word);
            System.out.println(a = firstPrefix);
        }
        return b;
    }
}
