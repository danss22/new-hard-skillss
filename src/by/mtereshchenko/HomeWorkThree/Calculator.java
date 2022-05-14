package by.mtereshchenko.HomeWorkThree;

import java.util.Scanner;

/*
Создать класс Калькулятор, в нём 4 метода для арифметических операций:
сложение, вычитание, умножение и деление. Каждый метод должен принимать
2 параметра типа double и возвращать значение типа double
 */
public class Calculator {
    public static void main(String[] args) {
        sum(10,30);
        sub(40,10);
        mul(5,5);
        div(25,5);
    }

    static double sum(double a, double b) {
        double result = a + b;
        System.out.println(result);
        return result;
    }

    static double sub(double a, double b) {
        double result = a - b;
        System.out.println(result);
        return result;
    }

    static double mul(double a, double b) {
        double result = a * b;
        System.out.println(result);
        return result;
    }

    static double div(double a, double b) {
        double result = a / b;
        System.out.println(result);
        return result;
    }
}
