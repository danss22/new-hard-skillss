package by.mtereshchenko.Lesson5;

//Создать класс, в нём создать три своих метода: “идти налево”, “идти направо”, “идти прямо”,
// каждый должен выводить на экран соответствующую информацию.
// Что выводить на экран берём из сказки Змей Горыныча: Налево пойдёшь - богатым будешь, направо - женатым,
// а кто прямо пойдёт, тот к камню вернётся.
//В main, вызвать методы “идтиПрямо” 2 раза и 1 раз вызвать любой другой свой метод.
public class Main2 {
    public static void main(String[] args) {
        goStraight();
        goStraight();
        goRight();
    }

    static void goLeft() {
        System.out.println("Налево пойдёшь - богатым будешь");
    }

    static void goRight() {
        System.out.println("направо - женатым");
    }

    static void goStraight() {
        System.out.println("а кто прямо пойдёт, тот к камню вернётся.");
    }
}
