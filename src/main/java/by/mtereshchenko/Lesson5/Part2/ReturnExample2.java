package by.mtereshchenko.Lesson5.Part2;

public class ReturnExample2 {
    public static void main(String[] args) {
        System.out.println(getFullName("Михаил", "Терещенко"));
        System.out.println(getFullName("Елена", "Терещенко"));
    }
    static String getFullName(String name, String surname){
        return "** " + name + " " + surname + " **";
    }
}
