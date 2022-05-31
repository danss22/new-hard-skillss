package by.mtereshchenko.Lesson10;

public class InheritanceExample {
    // class = fields + methods + constructor
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", 25);
        System.out.println(ivan.name);
        System.out.println(ivan.age);
        ivan.study();

        Aspirant vasiliy = new Aspirant("Vasiliy", 27, "Raketa");
        vasiliy.study();

        ScienceCanditate tanya = new ScienceCanditate("Tanya", 33, "Poezd");
        tanya.study();

    }
}

class Student {
    String name;
    int age;

    void study() {
        System.out.println("Хожу на пары, иногда прогуливаю пары");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
}

class Aspirant extends Student {
    String scientTopic;


    public Aspirant(String name, int age, String scientTopic) {
        super(name, age);
        this.scientTopic = scientTopic;
    }
}

class ScienceCanditate extends Aspirant {

    public ScienceCanditate(String name, int age, String scientTopic) {
        super(name, age, scientTopic);

    }
}
