package by.mtereshchenko.Lesson16.part3;

import java.io.FileNotFoundException;

public class CheckedExceptionExample {
    public static void main(String[] args) throws FileNotFoundException {
        someMethod();
        someMethod2();
    }
    public static void someMethod() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("Произошло исключение: " + e);
        }
    }
    public static void someMethod2() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
