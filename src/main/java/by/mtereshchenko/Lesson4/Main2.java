package by.mtereshchenko.Lesson4;
/*
Создать цикл от 10 до 1_000, но с условиями, если число меньше 100, то продолжить цикл не выполняя оставшуюся часть тела цикла,
если число больше 150, то выйти(прервать) из цикла, в конце тела цикла выводить текущий счётчик.
В этой з-че использовать ключевые слова break и continue.
 */
public class Main2 {
    public static void main(String[] args) {
        for (int i = 10; i <= 1000; i++) {
            if (i < 100) {
                continue;
            }
            if (i > 150) {
                break;
            }
            System.out.println(i);
        }
    }
}
