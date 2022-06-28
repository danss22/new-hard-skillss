package by.mtereshchenko.Lesson18;

@FunctionalInterface
public interface FunctionInterfaceExample {
    void sayHello(String name);
}

//class MyClass4 implements FunctionInterfaceExample {
//    @Override
//    public void sayHello() {
//        System.out.println("Hello");
//    }
//}
//
//class MyClass5 implements FunctionInterfaceExample {
//    @Override
//    public void sayHello() {
//        System.out.println("Good morning");
//    }
//}

class FunctionalInterfaceUsage {
    public static void main(String[] args) {
        // (arg names) -> {
        //      code
        // }
        FunctionInterfaceExample myClass4 = (String name) -> System.out.println("Hello " + name);
        FunctionInterfaceExample myClass5 = (String name) -> {
            System.out.println("Good morning " + name);
        };
        myClass4.sayHello("Oleg");
        myClass5.sayHello("Alisa");
    }
}