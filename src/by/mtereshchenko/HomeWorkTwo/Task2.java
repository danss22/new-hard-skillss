package by.mtereshchenko.HomeWorkTwo;

/*
Написать программу, которая будет подсчитывать сумму чисел от start до finish.
Например, start = 0, finish = 5. Нужно сложить числа: 0, 1, 2, 3, 4, 5. Ответ будет
15. В конце программы сделать вывод суммы.
 */
public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int strart = 0, finish = 5; strart <= finish; strart++) {
            sum += strart;
        }
        System.out.println("Сумма = " + sum);
    }
}
