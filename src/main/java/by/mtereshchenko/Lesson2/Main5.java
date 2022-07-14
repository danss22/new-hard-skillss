package by.mtereshchenko.Lesson2;
//Создайте новый класс. Создайте переменную с именем idea типа String
// и присвойте ей значение "I like Java!".
// Выведите на консоль эту переменную через команду System.out.println(idea).
// Присоедините к переменной idea строку "I begin to learn Java.".
// Создайте переменную year с типом int и присвойте ей текущий год.
// Присоедините к переменной idea переменную year. Выведите на консоль эту
// переменную через команду System.out.println(idea);
public class Main5 {
    public static void main(String[] args) {
        String idea = "I like Java";
        System.out.println(idea);
        String news = "I begin to learn Java";
        idea = idea + " " + news;
        int year = 2022;
        idea = idea + " " + year;
        System.out.println(idea);
    }
}
