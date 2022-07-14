package by.mtereshchenko.Lesson5.Part2;

//Создать класс, в нём свой метод “сложение” с двумя int аргументами, метод должен выводить в консоль сумму двух аргументов.
// В методе main вызвать свой метод с аргументами: 100 и 500, 4 и 2, 3 и 5.
public class Main3 {
    public static void main(String[] args) {
        sum(100, 500);
        sum(4, 2);
        sum(3, 5);
    }

    static void sum(int a, int b) {
        System.out.println(a + b);
    }
}
