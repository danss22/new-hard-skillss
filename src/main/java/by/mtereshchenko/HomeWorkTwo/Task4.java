package by.mtereshchenko.HomeWorkTwo;

//Вычислять сумму четныx чисел в диапазоне от start до finish;
public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int strart = 0, finish = 5; strart <= finish; strart++) {
            if (strart % 2 == 0) {
                sum += strart;
            }
        }
        System.out.println("Сумма чётных чисел = " + sum);
    }
}
