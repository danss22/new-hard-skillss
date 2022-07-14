package by.mtereshchenko.Lesson5.Part2;

//?:
public class TernaryOperator {
    public static void main(String[] args) {

    }

    static int findMax(int first, int second) {
        int max;
        if (first > second) {
            max = first;
        } else {
            max = second;
        }
        // max = first > second ? first : second;
        return max;
    }
}
