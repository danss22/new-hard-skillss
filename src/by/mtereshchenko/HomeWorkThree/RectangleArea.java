package by.mtereshchenko.HomeWorkThree;

/*
Площадь прямоугольника. Создать класс с методом расчёта площади
прямоугольника, в качестве аргументов приходит высота и ширина, возвращать
площадь.
 */
public class RectangleArea {
    public static void main(String[] args) {
        rec(5.7, 77);
    }

    static double rec(double height, double width) {
        double square = height * width;
        System.out.println("Площадь прямоугольника = " + square);
        return square;
    }
}
