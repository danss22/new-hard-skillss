package by.mtereshchenko.Lesson10;

public class Person2 {
    private int age;

    public Person2(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else {
            System.out.println("Попытка установить неправильный возраст: " + age);
        }

    }
}
class Peson2Usage {
    public static void main(String[] args) {
        Person2 sasha = new Person2(15);
        System.out.println(sasha.getAge());
        sasha.setAge(-22);
        System.out.println(sasha.getAge());

    }
}
