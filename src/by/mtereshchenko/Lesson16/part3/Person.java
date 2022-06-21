package by.mtereshchenko.Lesson16.part3;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new WrongAgeException();
        }
        this.age = age;
    }
}
