package by.mtereshchenko.Lesson9_OOP;

public class Error {
    boolean isActive;
    int statusCode;
    String message;

    public Error() {
    }

    public Error(boolean isActive, int statusCode, String message) {
        this.isActive = isActive;
        this.statusCode = statusCode;
        this.message = message;
    }

    void printInfo() {
        System.out.println("isActive: " + isActive);
        System.out.println("statusCode: " + statusCode);
        System.out.println("message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        System.out.println("============");
        Error start = new Error(true, 100, "Start");
        Error danger = new Error(false, 1215, "Danger");
        start.printInfo();
        System.out.println("============");
        danger.printInfo();
    }
}
