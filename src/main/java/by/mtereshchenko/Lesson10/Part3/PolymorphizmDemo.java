package by.mtereshchenko.Lesson10.Part3;

public class PolymorphizmDemo {
    public static void main(String[] args) {
//        Dorctor therapist = new Dorctor();
//        Dorctor surgeon1 = new Surgeon();
//        Dorctor surgeon2 = new Surgeon();
//        Dorctor dentist1 = new Dentist();
//        Dorctor dentist2 = new Dentist();

        Dorctor[] doc = new Dorctor[5];
        doc[0] = new Dorctor();
        doc[1] = new Surgeon();
        doc[2] = new Surgeon();
        doc[3] = new Dentist();
        doc[4] = new Dentist();
        for (Dorctor dorctor : doc) {
           dorctor.treat();
        }
    }
}
class Dorctor {
    void treat() {
        System.out.println("Измеряю температуру и отправляю к другому доктору");
    }
}
class Surgeon extends Dorctor {
    @Override
    void treat() {
        System.out.println("Режет и зашивает");
    }
}
class Dentist extends Dorctor {
    @Override
    void treat() {
        System.out.println("Убираю кариес и ставлю пломбы");
    }
}
