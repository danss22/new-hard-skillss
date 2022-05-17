package by.mtereshchenko.Lesson6.Part2;

import java.util.Arrays;

/*
Создайте внутри метода main массив с типом String на 4 ячейки с именем переменной созданного массива - names.
Заполните массив произвольными именами. После этого выведите каждую ячейку на консоль.
 */
public class Main3 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Misha";
        names[1] = "Pasha";
        names[2] = "Lesha";
        names[3] = "Oleg";
//        for (String name : names) {
//            System.out.println(name);
//        }
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println();
        System.out.println(Arrays.toString(names));
    }
}
