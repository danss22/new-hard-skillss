package by.mtereshchenko.HomeWorkThree;

/*
Идеальный вес. Создать класс с методом расчета идеального веса по формуле:
вес равен росту минус коэффициент. При росте до 165 см коэффициент
равен 100, до 175 см — 105, выше 175 см — 110.
 */
public class WeightCalculation {
    public static void main(String[] args) {
        weight(155,155);
    }

    static int weight(int weight, int growth) {
        int cof = 0;
        int a = 0;
        if (weight == growth) {
            System.out.print("");
        } else {
            System.out.println("Вес не совпадает с ростом");
        }
        if (growth <= 165) {
            cof = 100;

        } else if (growth <= 175) {
            cof = 105;
        } else {
            cof = 110;
        }
        a = growth - cof;
        System.out.println("Расчет идеального веса = " + a);
        return a;
    }
}
