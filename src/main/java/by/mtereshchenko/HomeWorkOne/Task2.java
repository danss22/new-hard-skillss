package by.mtereshchenko.HomeWorkOne;

/*
Кинотеатр для взрослых.
-	создать программу, с переменной “возраст” и значением от 0 до 100.
Сделать проверку age, если возраст от 18, то вывести на экран
“Приятного просмотра”, иначе вывести “Извини, не пропустим”.
*/
public class Task2 {
    public static void main(String[] args) {
        byte age = 18;
        if (age >= 18) {
            System.out.println("Приятного просмотра.");
        } else {
            System.out.println("Извини, не пропустим.");
        }
    }
}
