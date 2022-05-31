package by.mtereshchenko.Lesson10.Part3;

/*
Создайте класс калькулятор, в нём метод “суммировать”, этот метод должен быть перегружен,
т.е. чтобы можно было передать 2 аргумента, 3 аргумента и 5 аргументов. В методе main продемонстрируйте работу перегруженного метода.
 */
public class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
}

class calcUs {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 3));
        System.out.println(calculator.sum(2, 2, 2, 2, 2));
    }
}
