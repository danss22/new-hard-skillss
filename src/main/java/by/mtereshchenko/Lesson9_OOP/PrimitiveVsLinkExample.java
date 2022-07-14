package by.mtereshchenko.Lesson9_OOP;

public class PrimitiveVsLinkExample {
    public static void main(String[] args) {
//        int x = 1;
//        int y = x;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println("=============");
//        x = 10;
//        System.out.println(x);
//        System.out.println(y);
        Box box1 = new Box(1);
        Box box2 = box1;
        System.out.println(box1.x);
        System.out.println(box2.x);
        System.out.println("==========");
        box1.x = 10;
        System.out.println(box1.x);
        System.out.println(box2.x);

    }
}
class Box {
    int x;

    public Box(int x) {
        this.x = x;
    }

}