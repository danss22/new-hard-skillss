package by.mtereshchenko.HomeWorkTwo;

//Вывести шахматную доску, с переменными ширина и высота. Например с шириной 7 и высотой 5
public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print('X');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
