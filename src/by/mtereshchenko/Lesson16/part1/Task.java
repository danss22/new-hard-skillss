package by.mtereshchenko.Lesson16.part1;
/*
Создать переменную строкового типа, записать в качестве значения null ( обязательно без кавычек).
На следующей строке попробовать вывести в консоль длину этой строки с помощью метода строки length().
Убедится, что произошло исключение, написать в чат + и имя/тип исключения.
 */
public class Task {
    public static void main(String[] args) {
        String a = null;
        System.out.println(a.length());
        // NPE = NullPointerException
    }
}
