package by.mtereshchenko.Lesson16.part2;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        someMethod();
    }
    public static void someMethod() {
//        int x = 10;
//        int y = 0;
//        System.out.println(x / y);
        throw new ArithmeticException();
    }
}
