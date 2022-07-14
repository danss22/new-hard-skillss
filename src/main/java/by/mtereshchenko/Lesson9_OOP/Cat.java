package by.mtereshchenko.Lesson9_OOP;

public class Cat {
    String name;
    int age;
    boolean isHungry;
}

class ObjectUsage {
    public static void main(String[] args) {
        // type name = new type();
        Cat murzik = new Cat();
        murzik.name = "Murzik";
        murzik.age = 3;
        murzik.isHungry = true;

        System.out.println(murzik.name);
        System.out.println(murzik.age);
        System.out.println(murzik.isHungry);


        System.out.println("===============");

        Cat dimka = new Cat();
        dimka.name = "Dimka";
        dimka.age = 1;
        dimka.isHungry = false;

        System.out.println(dimka.name);
        System.out.println(dimka.age);
        System.out.println(dimka.isHungry);


        Cat simba = new Cat();
        Cat pushistik = new Cat();
    }
}
