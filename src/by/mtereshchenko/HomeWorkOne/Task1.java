package by.mtereshchenko.HomeWorkOne;

/*Джекпот
-	создать программу, со строковой переменной “комбинация”, в строку записать от “000” до “777”.
 Если “комбинация” равняется строке “777”, вывести “Поздравляем, у вас джекпот!”.
 В конце программы должен быть вывод “Играем дальше”.
  */
public class Task1 {
    public static void main(String[] args) {
        String combination = "777";
        if (combination.equals("656")) {
            System.out.println("Поздравляем, у вас джекпот!");
        }
        System.out.println("Играем дальше.");

    }
}
