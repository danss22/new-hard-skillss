package by.mtereshchenko.Lesson15.part2;

public class StringFormat {
    //sout
    //souf
    //f = format
    //souf("pattern, args")
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        //a = 1, b = 2, c = 3
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}

