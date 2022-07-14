package by.mtereshchenko.Lesson8;

import java.util.Arrays;
import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
//        String day = "Day";
//        String and = new String("and");
//        String night = "night";

//
//        //concatenation
//        //конкатенация


//        String dayAndNight = day + " " + and + " " + night;
//        System.out.println(dayAndNight);


        // объекты сравниваем через equals
        // целочисленные через ==


        // equals
        // equalsIgnoreCase
//        String name = "Marina";
//        String name2 = "Marina";
//        String name3 = "maRinA";
//        System.out.println(name.equals(name3));
//        System.out.println(name.equalsIgnoreCase(name3)); // игнорируем регистр букв


        // valueOf - перевод числа в строку


//        int age = 18;
//        String strAge = " " + age;
//        String strAge2 = String.valueOf(age);


        //Integer.parseInt(..); - перевод строки в число


//        String x = "10";
//        String y = "20";
//
//        System.out.println(x + y);
//
//        int xFromString = Integer.parseInt(x);
//        int yFromString = Integer.parseInt(y);
//        System.out.println(xFromString + yFromString);


        //length()
        // charAt(index) - строка состоит из символов(вытянуть символ из строки)


//        String name = "Marina";
//        System.out.println(name.length());
//        System.out.println(name.charAt(3));
//        System.out.println();
//        for (int i = 0; i < name.length(); i++) {
//            // array[i]
//            System.out.println(name.charAt(i));
//        }


            // toCharArray()   Переводит строку в массив
//        System.out.println(Arrays.toString(name.toCharArray()));


        // toUpperCase() - большой регистр
        // toLowerCase() - маленький регистр


//        String name = "Marina";
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());


        // split - разделение строки по чему-либо


//        String name = "10-20-3-7-14-17";
//        System.out.println(Arrays.toString(name.split("-")));
    }
}
