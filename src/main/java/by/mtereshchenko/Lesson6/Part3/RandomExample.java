package by.mtereshchenko.Lesson6.Part3;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random generator = new Random();
//        System.out.println(generator.nextBoolean());
        System.out.println(generator.nextInt(20));
        System.out.println(generator.nextInt(10));
        System.out.println(generator.nextInt(100));
        System.out.println(generator.nextInt(50));
    }
}
