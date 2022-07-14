package by.mtereshchenko.Lesson13.part1;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // put - добавить или обновить данные
        // get - получить значение по ключу
        // remove - удалить значение по ключу

        Map<String, String> contacts = new HashMap<>();
        System.out.println(contacts);

        // put
        contacts.put("Alexander " , " + 375-25-333-33-33");
        contacts.put("Victoria " , " + 375-25-444-44-44");
        contacts.put("Pavel " , " + 375-25-555-55-55");
        contacts.put("Elena " , " + 375-25-666-66-66");
        System.out.println(contacts);
        System.out.println(contacts.size());

        // get
        System.out.println(contacts.get("Victoria "));

        // remove

        contacts.remove("Victoria ");
        System.out.println(contacts);

        // put - update

        contacts.put("Alexander ", " + 7-904-66-55255");
        System.out.println(contacts);
        System.out.println();
        // for - each
        for (Map.Entry<String, String> pair: contacts.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
