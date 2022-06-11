package by.mtereshchenko.Lesson13.part1;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("яблоко", "круглый фрукт, который растёт на дереве.");
        dictionary.put("собака", "четвероногое животное, часто его заводят люди в качетсве питомца, гавкает.");
        dictionary.put("машина", "Четырёхколёсное редство передвижения, обычно ездит на бензине.");
        System.out.println(dictionary);
        System.out.println(dictionary.get("яблоко"));
    }
}
