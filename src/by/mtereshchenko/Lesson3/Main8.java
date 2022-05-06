package by.mtereshchenko.Lesson3;

//создать новый класс
//создать переменную day, записать в неё любое значение от 0 до 10.
//использовать многократную конструкцию else if и вывести надписью день недели, например
// если day = 1 - пн, для 2 - вт и так далее, если 6 или 7, то вывести “выходной”.
// Если число не попало под диапазон от 1 до 7 вывести надпись “Какое-то другое число”.
//поменять значение day несколько раз, чтобы на экране был разный вывод.
public class Main8 {
    public static void main(String[] args) {
        int day = 8;
        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятница");
        } else if (day == 6) {
            System.out.println("Выходной");
        } else if (day == 7) {
            System.out.println("Выходной");
        } else {
            System.out.println("Какое-то другое число");
        }
    }
}
