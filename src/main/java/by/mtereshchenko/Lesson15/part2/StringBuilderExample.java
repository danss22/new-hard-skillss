package by.mtereshchenko.Lesson15.part2;

public class StringBuilderExample {
    public static void main(String[] args) {
        String fullName = "Vasiliy" + " " + "Kuznetsov";
        System.out.println(fullName);
        // 1. Vasiliy
        // 2. " "
        // 3. Kuznetsov
        // 4. "Vasiliy "
        // 5. "Vasiliy Kuznetsov"

        // StringBuilder, StringBuffer - потокобезопасный
        System.out.println("==================");
        StringBuilder builder = new StringBuilder();
        builder.append("Vasiliy");
        builder.append(" ");
        builder.append("Kuznetsov");
        String fullName2 = builder.toString();
        System.out.println(fullName2);
    }
}
