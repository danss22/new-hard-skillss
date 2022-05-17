package by.mtereshchenko.Lesson6.Part2;

/*
Внутри метода main объявите массив int на 5 элементов.
Через цикл for заполните его значениями функции numbers[index] = index * 2. Ниже, через второй цикл for выведите все элементы массива на консоль.
- Создать массив размером 10, заполнить числами от 1 до 10.
- Создать массив размером 10, заполнить числами от 10 до 1.
 */
public class Main4 {
    public static void main(String[] args) {
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = i * 2;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

    }
}
