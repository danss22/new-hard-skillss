package by.mtereshchenko.Lesson10;

public class Encapsulation {
    public static void main(String[] args) {
        // public, protected .../package/ default, private
        Cat cleopatra = new Cat();
        cleopatra.feed();
    }

    void findMin() {

    }
}

class Cat {
    public void feed() {
        activateBrain();
        feelEnjoyment();
        // запускается чувство удовольствия
        createSaliva();
        // создать слюну
        chewFood();
        // пережёвывает еду
        swallow();
        // проглотить
        createAcids();
        // создать нужные кислоты
        runStomach();
        // запустить желудок
        digest();
        // переварить
        takeOutTheWaste();
        // вывести отходы из организма
    }

    private void activateBrain() {
        System.out.println("Активируется мозг");
    }
    private void feelEnjoyment() {
        System.out.println("");
    }
    private void enjoy () {
        System.out.println("Получить удовольствие");
    }
    private void createSaliva () {
        System.out.println("Создать слюну");
    }
    private void chewFood () {
        System.out.println("пережёвывать еду");
    }
    private void swallow () {
        System.out.println("проглотить");
    }
    private void createAcids () {
        System.out.println("создать нужные кислоты");
    }
    private void runStomach () {
        System.out.println("запустить желудок");
    }
    private void digest () {
        System.out.println("переварить");
    }
    private void takeOutTheWaste () {
        System.out.println("вывести отходы из организма");
    }

}

