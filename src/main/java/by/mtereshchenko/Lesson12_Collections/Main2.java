package by.mtereshchenko.Lesson12_Collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
В методе main создайте объект HashSet с именем “список дел” с типом String.
Добавьте в него ваши дела на день, например: “сделать зарядку”, “поесть”, “поехать в офис”, “поработать”, “поесть”, “поработать”,
“приехать домой”, “обнять мужа/жену/детей”, “поесть”, “умыться”, “лечь спать”. В списке дел должно быть как минимум 2 раза “поесть”.
Далее выведите все элементы на консоль, вначале через цикл for-each, затем просто передайте множество в System.out.println().
 */
public class Main2 {
    public static void main(String[] args) {
        Set<String> ToDoList = new TreeSet<>();
        ToDoList.add("сделать зарядку");
        ToDoList.add("поесть");
        ToDoList.add("поехать в офис");
        ToDoList.add("поработать");
        ToDoList.add("поесть");
        ToDoList.add("поработать");
        ToDoList.add("приехать домой");
        ToDoList.add("обнять жену");
        ToDoList.add("обнять детей");
        ToDoList.add("поесть");
        ToDoList.add("умыться");
        ToDoList.add("лечь спать");
        for (String s : ToDoList) {
            System.out.println(s);
        }
        System.out.println(ToDoList);
    }
}
