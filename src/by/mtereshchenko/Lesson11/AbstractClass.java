package by.mtereshchenko.Lesson11;

public class AbstractClass {
    // abstract classes vs classes:
    // нельзя создать объеты абстр класса
    // абстрактные классы могут содержать абстрактные методы
    public static void main(String[] args) {
        Transport bus = new Bus(12, 10, true);
        Transport airplane = new Airplane(200, 1500, true);
        Transport car = new Car(15, 5, false);
        Transport train = new Train(1000, 10, true);

        Transport[] transports = new Transport[4];
        transports[0] = bus;
        transports[1] = airplane;
        transports[2] = car;
        transports[3] = train;

        for (Transport transport : transports) {
            transport.printInfo();
            transport.move();
        }
//        bus.move();
//        airplane.move();
//        airplane.move();
//        car.move();
//        train.move();

    }
}
abstract class Transport {
    int passengersQuantity;
    int ticketCost;
    boolean isSafe;

    public Transport(int passengersQuantity, int ticketCost, boolean isSafe) {
        this.passengersQuantity = passengersQuantity;
        this.ticketCost = ticketCost;
        this.isSafe = isSafe;
    }


    abstract void move();
    void printInfo() {
        System.out.println("Кол-во мест: " + passengersQuantity );
        System.out.println("Стоимость проезда: " + ticketCost);
        System.out.println("Безопасно ли пользоваться: " + isSafe);
    }
}
class Airplane extends Transport {
    public Airplane(int passengersQuantity, int ticketCost, boolean isSafe) {
        super(passengersQuantity, ticketCost, isSafe);
    }

    @Override
    void move() {
        System.out.println("Лечу со скростью 1000 км");
    }
}
class Car extends Transport {
    public Car(int passengersQuantity, int ticketCost, boolean isSafe) {
        super(passengersQuantity, ticketCost, isSafe);
    }

    @Override
    void move() {
        System.out.println("Еду по асфальту со скростью 60 км");
    }
}
class Train extends Transport {
    public Train(int passengersQuantity, int ticketCost, boolean isSafe) {
        super(passengersQuantity, ticketCost, isSafe);
    }

    @Override
    void move() {
        System.out.println("Еду по рельсам со скростью 300 км");
    }
}
class Bus extends Transport {

    public Bus(int passengersQuantity, int ticketCost, boolean isSafe) {
        super(passengersQuantity, ticketCost, isSafe);
    }

    @Override
    void move() {
        System.out.println("Еду по асфальту со скоростью 40 км и останавливаюсь на оставноках");
    }
}

