package by.mtereshchenko.Lesson11.Part2;
class UsageInterfaces {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
    }
}
public interface Interfaces {
    void eat();
}
class Cow implements Interfaces {

    @Override
    public void eat() {
        System.out.println("Жую траву/сено");
    }
}
class Wolf implements Interfaces {

    @Override
    public void eat() {
        System.out.println("Охочусь и убиваю жертву раз в неделю");
    }
}
class Human implements Interfaces {

    @Override
    public void eat() {
        System.out.println("Ем готовую еду");
    }
}
