package by.mtereshchenko.Lesson13.part1;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        Map<String, String> mail = new HashMap<>();
        mail.put("danss22@yandex.by", "Терещенко Михаил Олегович");
        mail.put("dnassdf@tut.by", "Иванов Иван Иванович");
        mail.put("fdl@mail.ru", "Синько Иван Сергеевич");
        for (Map.Entry<String, String> nums: mail.entrySet()){
            String key = nums.getKey();
            String value = nums.getValue();
            System.out.println(key + " = " + value);
//            System.out.println(nums);
        }
    }
}
