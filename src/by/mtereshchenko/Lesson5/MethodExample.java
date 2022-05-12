package by.mtereshchenko.Lesson5;

public class MethodExample {
    //group operations in 1 action
    // DRY
//    [] - не обязательно
//  [modifiers]  type  name([args]){}
    public static void main(String[] args) {
        sayHello();
        System.out.println("=========");
        sayHello();
        System.out.println("=========");
        sayHello10Times();
    }


    static void sayHello() {
        System.out.println("Hello.");
        System.out.println("I'm a Java developer.");
    }

    static void sayHello10Times() {
        for (int i = 0; i < 10; i++) {
            sayHello();
        }
    }
}
