package by.mtereshchenko.Lesson15.part2;

/*
Создайте enum Возраст, добавьте константы: молодой, взрослый, пожилой, долгожитель.
В методе main создайте переменную “мой возраст” и присвойте одну из констант из enum Возраст, далее выведите переменную на экран.
 */
public enum Age {
    молодой, взрослый, пожилой, долгожитель;
}

class AgeUsage {
    public static void main(String[] args) {
        Age myAge = Age.молодой;
        System.out.println(myAge);
        }
}
