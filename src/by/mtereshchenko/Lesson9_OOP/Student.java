package by.mtereshchenko.Lesson9_OOP;

public class Student {
    void playMusik(){
        System.out.println("Tra-tra-tra");
    }
}

class StudentUsage{
    public static void main(String[] args) {
        Student petya = new Student();
        petya.playMusik();
    }
}
