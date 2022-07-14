package by.mtereshchenko.HomeWorkThree;

/*
Курс валют. Создать класс с 2 методами: перевода рублей в доллары и
долларов в рубли.
 */
public class Currency {
    public static void main(String[] args) {
        rubInUsd(7000, 35);
        usdInRub(200, 35);
    }

    static double rubInUsd(double rub, double usd) {
        double result = rub / usd;
        System.out.println(result);
        return result;
    }

    static double usdInRub(double usd, double rub) {
        double result = usd * rub;
        System.out.println(result);
        return result;
    }
}
