package by.mtereshchenko.Lesson11;

/*
создайте абстрактный класс Product, от него наследуйте 3 любых любимых вида реальных продуктов, например: Яблоки, Томатный суп, Торт и т.д.
По желанию попробуйте придумать что-нибудь своё, если не получится берите уже готовые из задачи варианты.
В абстрактный класс добавьте общие для всех продуктов поля “цена”, “единица измерения”(может быть: “кг”, “литр”)
и поле “тип”(может быть например: “десерт”, “1ое блюдо”, “2ое блюдо”, “гарнир”, “напиток” и т.д.). В абстр. классе должны быть 2 метода: “пок
азать информацию” и “готовить”, 1й метод реализован в абстрактном классе и выводит значения всех полей в консоль,
2й метод абстрактный и реализуется в подклассах, например выводом в консоль для Яблока “помыть”, для Томатного супа - “разогреть в кастрюле”,
для Торта - “порезать на равные кусочки чтобы досталось каждому”. Создайте метод main, в массив добавьте несколько продуктов и
через цикл вызовите оба метода на каждом продукте.
 */
public class Main {
    public static void main(String[] args) {
    Product[] products = new Product[3];
    products[0] = new Apple(12, 100, "Десерт");
    products[1] = new TomatoSoup(15, 200, "Второе блюдо");
    products[2] = new Cake(40, 1000, "Десерт");
        for (Product product : products) {
            product.printInfo();
            product.prepare();
        }
    }
}

abstract class Product {
    int price;
    int unit;
    String type;

    public Product(int price, int unit, String type) {
        this.price = price;
        this.unit = unit;
        this.type = type;
    }

    void printInfo() {
        System.out.println("Цена: " + price);
        System.out.println("Еденица измерения: " + unit);
        System.out.println("Тип: " + type);
    }

    abstract void prepare();
}
class Apple extends Product {

    public Apple(int price, int unit, String type) {
        super(price, unit, type);
    }

    @Override
    void prepare() {
        System.out.println("Помыть яблоко перед употреблением");
    }
}
class TomatoSoup extends Product {

    public TomatoSoup(int price, int unit, String type) {
        super(price, unit, type);
    }

    @Override
    void prepare() {
        System.out.println("Разогреть в кастрюле перед употреблением");
    }
}
class Cake extends Product {

    public Cake(int price, int unit, String type) {
        super(price, unit, type);
    }

    @Override
    void prepare() {
        System.out.println("Порезать на равные кусочки чтобы досталось каждому");
    }
}

