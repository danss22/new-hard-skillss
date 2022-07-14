package by.mtereshchenko.Lesson7;

import java.util.Arrays;

/*
Создать массив размером 15 с типом элементов String. Записать в массив слова “чётный”, “нечётный” в зависимости от индекса.
Например: если индекс чётный, то должны быть слова “чётный”. Вывести полученный результат на экран.
 */
public class Main1 {
    public static void main(String[] args) {
        String[] name = new String[15];
        for (int i = 0; i < name.length; i++) {
           name[i] = "Чётный";
           if (i % 2 == 0){
               name[i] = "Чётный";
           }else {
               name[i] = "Нечётный";
           }
        }
        System.out.println(Arrays.toString(name));
    }
}
