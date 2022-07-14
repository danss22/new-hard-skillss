package by.mtereshchenko.Lesson11.Part2;

public class InterfaceExample {
    public static void main(String[] args) {
    }
}

interface CanFly {
    void fly();
}

interface CanWalk {
    void walk();
}

interface CanSwim {
    void swim();
}
class GoldenFish implements CanSwim {

    @Override
    public void swim() {

    }
}
class Crocodile implements CanWalk, CanSwim {

    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }
}
class Duck implements CanSwim, CanWalk, CanFly {

    @Override
    public void fly() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }
}
class Penguin implements CanWalk, CanSwim {

    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }
}