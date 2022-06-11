package by.mtereshchenko.Lesson12_Collections;
/*
Есть класс с именем Circle. Этот класс имеет одно поле radiusтипа double.

Создайте два метода экземпляра для этого класса:

getLengthкоторый возвращает doubleдлину окружности этого круга;
getAreaкоторый возвращает doubleпредставление площади этого круга.
В своих расчетах вы можете использовать специальную константу Math.PI.

 */
class Circle {
    double radius;
    double getLength; //длина круга = 2 * p * radius;
    double getArea; //площадь круга = p × r 2
    final double p = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    double getGetArea() {
        return 2 * p  * radius;
    }
    double getGetLength() {
        return p * Math.pow(radius, 2);
    }
}
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getGetArea());
        System.out.println(circle.getGetLength());
    }
}

