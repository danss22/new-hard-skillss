package by.mtereshchenko.Lesson3;

//Написать программу, в которой 2 boolean переменных hasFriends, isGoodWeather,
// использовать “if” и “||”, если одна из переменных true, то вывести “Иду гулять”.
//В любом случае в конце программы должен быть вывод “Иду спать”.
public class Main7 {
    public static void main(String[] args) {
        boolean hasFriends = true;
        boolean isGoodWeather = false;
        if (hasFriends || isGoodWeather) {
            System.out.println("Иду гулять");
        }
        System.out.println("Иду спать");
    }
}
