package by.mtereshchenko.Lesson5.Part2;
//Изменить прошлую з-чу, теперь метод “сложение” должен возвращать результат, а не выводить его в консоль.
// В методе main, записать результаты выводов в отдельные переменные и эти переменные вывести в консоль.
public class Main5 {
    public static void main(String[] args) {
        int a = sum(100, 500);
        int b = sum(4, 2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(sum(3, 5));
    }
    static int sum (int a, int b){
        int sum = a + b;
        return sum;
    }
}
