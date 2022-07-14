package by.mtereshchenko.Lesson10.Part3;

public class Parent {
    public String familyName;
    private int money; // доступен только внутри класса
}
class Chield extends Parent{

}
class Usage {
    public static void main(String[] args) {
        Parent ivan = new Parent();
        Chield marya = new Chield();
    }
}
