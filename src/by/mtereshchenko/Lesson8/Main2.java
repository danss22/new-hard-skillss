package by.mtereshchenko.Lesson8;

import java.util.Locale;

/*
Написать метод, принимающий в качестве параметров имя, фамилию и отчество и возвращающую инициалы в формате "Ф.И.О".
Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
 */
public class Main2 {
    public static void main(String[] args) {
        name("Михаил", "Терещенко", "Олегович");

    }
    static String name(String name, String firstName, String thirdName){
        String FIO = "";
        System.out.println(firstName.charAt(0) + "." + name.charAt(0) + "." + thirdName.charAt(0));
        return FIO.toUpperCase();
    }
}
