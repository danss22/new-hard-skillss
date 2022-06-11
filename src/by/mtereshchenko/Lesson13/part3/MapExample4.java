package by.mtereshchenko.Lesson13.part3;

import java.util.HashMap;
import java.util.Map;

public class MapExample4 {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(0, "Ivan");
        names.put(10, "Ekaterina");
        System.out.println(names);
    }
}
