package by.mtereshchenko.Lesson18;

public interface Hi {
    default void sayHello() {
        System.out.println("Hi");
    }
}
interface Hi2 {
    default void sayHello() {
        System.out.println("Hi2");
    }
}

class MyClass3 implements Hi, Hi2 {

    @Override
    public void sayHello() {
        Hi.super.sayHello();
    }
}
class MyClass1 implements Hi {

}
class MyClass2 implements Hi {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
class DefaultMethodUsage {
    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        MyClass2 myClass2 = new MyClass2();
        MyClass3 myClass3 = new MyClass3();
        myClass1.sayHello();
        myClass2.sayHello();
        myClass3.sayHello();

    }
}
