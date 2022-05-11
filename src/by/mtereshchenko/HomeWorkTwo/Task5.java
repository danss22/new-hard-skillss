package by.mtereshchenko.HomeWorkTwo;

//Создать программу, вычисляющую факториал числа.
public class Task5 {
    public static void main(String[] args) {
        int result = 1;
        int fact = 6;
        for (int i = 1; i <= fact; i++) {
            result *= i;
        }
        System.out.println(result);

    }
}
