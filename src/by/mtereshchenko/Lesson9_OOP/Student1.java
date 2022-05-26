package by.mtereshchenko.Lesson9_OOP;

/*
Создайте класс Student, создайте метод “петь песню”.
Этот метод должен выводить на консоль слова "I believe I can fly".
Также у вас должен быть метод playMusic, который выводит на экран “tra-tra-tra”.
 В методе main создайте объект и попросите его три раза сыграть музыку и три раза спеть.
 */
public class Student1 {
    void singSong() {
        System.out.println("I believe I can fly");
    }

    void playMusic() {
        System.out.println("tra-tra-tra");
    }
}

class StudentUsage1 {
    public static void main(String[] args) {
        Student1 misha = new Student1();
        misha.playMusic();
        misha.playMusic();
        misha.playMusic();
        misha.singSong();
        misha.singSong();
        misha.singSong();
    }
}
