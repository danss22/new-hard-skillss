package by.mtereshchenko.Lesson16.part1;

public class ExceptionExample2 {
    public static void main(String[] args) {
        System.out.println("Начало");
        int x = 10;
        int y = 0;
        div(x, y);
        System.out.println("Конец");
    }
    static void div(int x, int y) {
        if (y == 0){
            throw new RuntimeException("y равен 0, попробуйте другое число");
        }
        System.out.println(x / y);
    }
}
