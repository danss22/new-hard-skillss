package by.mtereshchenko.Lesson9_OOP;

/*
Создайте класс Jukebox. Добавьте в него метод void music(int position). Внутри метода сделайте if else.
Если position равно 1, то в консоль должны выводиться слова песни "Пусть бегут неуклюже".
Если равно 2, то в консоль должны выводиться слова песни "Спокойной ночи".
Во всех остальных случаях должно появится "Песня не найдена". Напишите метод main с демонстрацией работы этого метода и объекта этого класса.
 */
public class Jukebox {
    public static void main(String[] args) {
        Jukebox myMusic = new Jukebox();
        myMusic.music(1);
    }

    void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
