package by.mtereshchenko.Lesson11.Part2;
/*
Создать интерфейсы «летать», «передвигаться» и «есть пищу». Создайте классы и добавьте интерфейсы к ним, классы: собака, утка, автомобиль и самолёт.
Руководствуйтесь фантазией и здравым смыслом.
 */
public class Main {
    public static void main(String[] args) {
    }
}
interface fly{
void flyy();
};
interface move{
void movee();
};
interface eatFood{
void eat();
};
class Dog implements move, eatFood {

    @Override
    public void movee() {
        System.out.println("Я передвигаюсь");
    }

    @Override
    public void eat() {
        System.out.println("Я кушаю");
    }
}
class duck implements move, eatFood, fly {

    @Override
    public void flyy() {
        System.out.println("Я летаю");
    }

    @Override
    public void movee() {
        System.out.println("Я хожу");
    }

    @Override
    public void eat() {
        System.out.println("Я кушаю");
    }
}
class Car implements move{

    @Override
    public void movee() {
        System.out.println("Я еду");
    }
}
class Airplane implements move, fly{

    @Override
    public void flyy() {
        System.out.println("Я летаю");
    }

    @Override
    public void movee() {
        System.out.println("Я передвигаюсь");
    }
}
