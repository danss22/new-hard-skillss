package by.mtereshchenko.Lesson3;

public class Main9 {
    public static void main(String[] args) {
        String day = "Понедельник";
        if (day.equals("Понедельник")) {
            System.out.println(1);
        } else if (day.equals("Вторник")) {
            System.out.println(2);
        } else if (day.equals("Среда")) {
            System.out.println(3);
        } else if (day.equals("Четверг")) {
            System.out.println(4);
        } else if (day.equals("Пятница")) {
            System.out.println(5);
        } else if (day.equals("Суббота")) {
            System.out.println(6);
        } else if (day.equals("Воскресенье")) {
            System.out.println(7);
        } else {
            System.out.println("Не понятная строка");
        }

    }
}
