package by.mtereshchenko.Lesson5;

//Создать класс с 2 методами: “проснуться” и “идтиСпать”. В методе “проснуться” вывести на экран несколько строк:
// “Открыть глаза”, “Умыться”, “Одеться”, “Сделать зарядку”. В методе “идтиСпать” - “Чистить зубы”, “Раздеться”, “Лечь”, “Видеть сны”.
//Создать метод main, в нём вызвать оба своих метода.
public class Main1 {
    public static void main(String[] args) {
        wakeUp();
        System.out.println();
        goToBed();
    }

    static void wakeUp() {
        System.out.println("Открыть глаза");
        System.out.println("Умыться");
        System.out.println("Одеться");
        System.out.println("Сделать зарядку");
    }

    static void goToBed() {
        System.out.println("Чистить зубы");
        System.out.println("Раздеться");
        System.out.println("Лечь");
        System.out.println("Видеть сны");
    }
}
