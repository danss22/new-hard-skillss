package by.mtereshchenko.Lesson8.Part2;

public class StringExample {
    public static void main(String[] args) {
        // indexOf - ищет индекс заданного символа (с начала)
        // lastIndexOf - ищет индекс заданного символа (с конца)
//        String name = "Ivan Ivanov";
//        System.out.println(name.indexOf('a', 3));
//        System.out.println(name.lastIndexOf('a'));

        // substring
//        String phrase = "Hello, my name is Alex";
//        System.out.println(phrase.substring(7, 10));

        // isEmpty - проверяет, пустая ли строка

//        String string = "";
//        System.out.println(string.isEmpty());

        // trim - обрезает лишние пробелы в строке в начале и конце

//        String string = "    a     ";
//        System.out.println(string);
//        System.out.println(string.trim());

        // replace - заменить что-то в строке

//        String string = "Hello, my name is Alex. Hello, Hello";
//        System.out.println(string);
//        System.out.println(string.replace("Hello", "Hillo"));


        // startWith / endWith - проверяет на что начинается слово и на что заканчивается

//        String string = "Котёнок";
//        System.out.println(string.startsWith("кот"));
//        System.out.println(string.startsWith("Кат"));
//        System.out.println(string.startsWith("Кот"));

        // contains - проверяет, содержится ли заданное в строке

        String string = "Котёнок";
        System.out.println(string.contains("Кат"));
        System.out.println(string.contains("тён"));
        System.out.println(string.contains("Кот"));
    }
}
