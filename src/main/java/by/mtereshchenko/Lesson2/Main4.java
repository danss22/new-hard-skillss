package by.mtereshchenko.Lesson2;
//В коде нужно объявить переменную size типа int и присвоить ей значение 10.
// Далее нужно назначить этой же переменной значение 100.
// Потом нужно отнять от переменной size число 5, и результат записать опять в переменную size.
// В вашем коде будет создана только одна переменная size.
public class Main4 {
    public static void main(String[] args) {
        int size = 10;
        System.out.println(size);
        size = 100;
        System.out.println(size);
        size = size - 5;
        System.out.println(size);
    }
}
