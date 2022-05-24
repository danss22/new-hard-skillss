package by.mtereshchenko.Lesson8;

/*
Написать 3 метода, которые подсчитывают количество всех точек, запятых и восклицательных знаков в строке.
 */
public class Main4 {
    public static void main(String[] args) {
        String text = "Отличительной чертой многих языков программирования является работа с файлами и потоками.,,, " +
                "В Java основной функционал работы с потоками сосредоточен в классах из пакета java.io.!!!";
        System.out.println("Точек = " + getDot(text));
        System.out.println("Запятых = " + getComma(text));
        System.out.println("Восклецательных знаков = " + getExclamationPoint(text));
    }

    static int getDot(String s) {
        int dot = 0;
        for (char c : s.toCharArray()) {
            if (c == '.') {
                dot++;
            }
        }
        return dot;
    }

    static int getComma(String s) {
        int comma = 0;
        for (char c : s.toCharArray()) {
            if (c == ',') {
                comma++;
            }
        }
        return comma;
    }

    static int getExclamationPoint(String s) {
        int point = 0;
        for (char c : s.toCharArray()) {
            if (c == '!'){
                point++;
            }
        }
        return point;
    }
}
