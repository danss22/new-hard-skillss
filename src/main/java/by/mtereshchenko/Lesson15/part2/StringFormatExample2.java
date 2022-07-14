package by.mtereshchenko.Lesson15.part2;

public class StringFormatExample2 {
    //souf("pattern, args")
    public static void main(String[] args) {
        String name = "Bender";
        String friend = "Fry";
        int age = 12;
        int weight = 200;

        // name: Bender, friend: Fry, age: 12, weight: 200
        System.out.println("name: " + name + ", friend: " + friend + ", age: " + age + ", weight: " + weight);
        System.out.printf("name: %s, friend: %s, age: %d, weinght: %d", name, friend, age, weight);

        // d = digital
        // s = string
    }
}
