package by.mtereshchenko.Lesson4;

public class MainInterv {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean isDividedByThree = i % 3 == 0;
            boolean isDividedByFive = i % 5 == 0;
            if (isDividedByThree && isDividedByFive) {
                System.out.println("FizzBuzz");
            } else if (isDividedByThree) {
                System.out.println("Fizz");
            } else if (isDividedByFive) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
