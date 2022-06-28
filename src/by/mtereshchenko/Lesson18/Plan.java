package by.mtereshchenko.Lesson18;

public class Plan {
    // Functional methods in interfaces: "default"
    // Functional interfaces = 1 abstract method
    // Lambda = анонимная реализация фукнционального интрфейса
    // Stream / Стрим / Поток данных / Последовательность объектов
      // -.stream();
      // filter(), map(), sorted(), limit();
      // forEach(), count(), collect, aneMatch / allMatch, findFirst()

      // поток данных -> промежуточные методы (0..n) -> 1 терминальный метод
    // Optional

    public static void main(String[] args) {
        int age = 32;
//        age = age + 1;
        age++;
        System.out.println(age);
    }
}
