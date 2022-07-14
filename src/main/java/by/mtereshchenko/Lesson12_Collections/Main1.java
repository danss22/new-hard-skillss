package by.mtereshchenko.Lesson12_Collections;

import java.util.LinkedList;
import java.util.List;

/*
Для прошлой з-чи переделайте ArrayList на LinkedList и запустите, проверьте, что всё работает также. Визуально всё работает также только медленнее.
 */
public class Main1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("сделать зарядку");
        list.add("поесть");
        list.add("поработать");
        list.add("поесть");
        list.add("поработать");
        list.add("приехать домой");
        list.add("обнять жену");
        list.add("обнять детей");
        list.add("поесть");
        list.add("умыться");
        list.add("лечь спать");
        for (String list1 : list) {
            System.out.println(list1);
        }
        System.out.println();
        System.out.println(list);
    }
}
