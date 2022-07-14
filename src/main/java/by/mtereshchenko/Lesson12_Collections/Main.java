package by.mtereshchenko.Lesson12_Collections;

import java.util.ArrayList;
import java.util.List;

/*
В методе main создайте объект ArrayList с именем “список дел” с типом String. Добавьте в него ваши дела на день,
например строки: “сделать зарядку”, “поесть”, “поехать в офис”, “поработать”, “поесть”, “поработать”, “приехать домой”, “обнять мужа/жену/детей”,
“поесть”, “умыться”, “лечь спать”. В списке дел должно быть как минимум 2 раза “поесть”. Далее выведите все элементы на консоль,
вначале через цикл for-each, затем просто передайте список в System.out.println().
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
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
