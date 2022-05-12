package by.mtereshchenko.Lesson5.Part2;

//Написать метод min, который возвращает минимальное из 2 аргументов.
// В этой з-че использовать вначале if else конструкцию, затем её закомментировать и использовать конструкцию “тернарного оператора”.
public class Main7 {
    public static void main(String[] args) {
        System.out.println(min(10, 9));
    }

    static int min(int a, int b) {
//        int min;
//        if (a < b) {
//            min = a;
//        } else {
//            min = b;
//        }
//        return min;
        return a < b ? a : b;
    }
}
