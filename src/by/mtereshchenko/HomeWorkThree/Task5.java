package by.mtereshchenko.HomeWorkThree;

/*
* Площадь треугольника по формуле Герона. В этой з-че нужно будет
использовать метод класса Math. В качестве аргументов стороны a, b, c. По
формуле Герона(погуглить) вначале вычислить полупериметр, затем площадь.
 */
public class Task5 {
    public static void main(String[] args) {
        areaSearch(1,5,5);
    }
    static void areaSearch (double a, double b, double c){
        double p = (a + b + c) / 2;
        double semi = p * (p - a) * (p - b) * (p - c);
        System.out.println("Площадь треугольника по формуле Герона = " + Math.sqrt(semi));
    }

}
