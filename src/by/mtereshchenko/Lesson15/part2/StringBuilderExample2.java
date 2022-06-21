package by.mtereshchenko.Lesson15.part2;

public class StringBuilderExample2 {
    public static void main(String[] args) {
        String greeting = "Hello, my name is Alex";
        StringBuilder builder = new StringBuilder();
        builder.append(greeting);
        builder.reverse();
        String s = builder.toString();
        System.out.println(s);
    }
}
