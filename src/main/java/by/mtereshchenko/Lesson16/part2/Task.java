package by.mtereshchenko.Lesson16.part2;

/*
Сделать вывод на экран “Начало main”. Создать массив на 3 элемента.
В блоке try вывести на экран “Начало try”, далее присвоить 1 эл-ту массива любое значение, вывести “Конец try”.
Добавить catch, в нём можете ловить как исключение типа “Exception”, так и “ArrayIndexOutOfBoundsException”, в блоке catch вывести “Произошла ошибка”.
Добавить блок finally, в нём вывести “Этот код выполнится всегда”. После блока finally вывести “Конец main”.
Запустить, посмотреть вывод консоли, понять почему вывод в консоли, понять почему вывод в консоли именно такой.
Изменить присвоение 1го эл-та в блоке try на 10 эл-т, таким образом возникнет исключение. Ещё раз посмотреть вывод,
понять почему сейчас вывод другой и именно такой. Написать + в чат.
 */
public class Task {
    public static void main(String[] args) {
        System.out.println("Начало main");
        int[] mas = new int[3];
        try {
            System.out.println("Начало try");
            mas[0] = 1;
            System.out.println("Конец try");
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Произошла ошибка: " + e);
        } finally {
            System.out.println("Этот код выполнится всегда");
        }
        System.out.println("Конец main");
    }
}
