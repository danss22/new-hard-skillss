package by.mtereshchenko.HomeWorkOne;

/*
Завтрак
-	создать программу, в ней 2 логических переменных “есть сковородка“, “есть яйца”.
Если есть яйца и сковородка, то вывести “Готовим яичницу”.
В конце программы должен быть вывод “Идём на работу.”.
*/
public class Task3 {
    public static void main(String[] args) {
        boolean haveAFryingPan = true;
        boolean eatEggs = true;
        if (haveAFryingPan && eatEggs) {
            System.out.println("Готовим яичницу.");
        }
        System.out.println("Идём на работу.");
    }
}
