package by.mtereshchenko.Lesson5.Part2;

public class ReturnExample3 {
    public static void main(String[] args) {
        System.out.println(findMax(4, 8));
        System.out.println(findMax(5, 2));
        System.out.println(findMax(1, 8));
    }
    static int findMax(int first, int second){
        int max;
        if(first > second){
            max = first;
        }else {
            max = second;
        }
        return max;
    }
}
