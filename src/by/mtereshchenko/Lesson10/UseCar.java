package by.mtereshchenko.Lesson10;


    /*
    Создать класс автомобиль, в нём открытый метод “запуск” и закрытые методы: “взять ток с аккумулятора”, “передать ток на стартер”,
    “соединить шерстень и маховик”, “запустить двигатель”. В открытом методе должны быть вызваны закрытые методы,
    в закрытых методах должен быть вывод на экран информации о том, что делает этот метод. Создать класс “использование автомобиля”,
    в методе main создать объект автомобиля, попытаться вызвать закрытые методы, после этого вызвать открытый метод.
     */
    public class UseCar {
        public static void main(String[] args) {
            Car tayota = new Car();
            tayota.start();
        }
    }

    class Car {

        void start() {
            getBatteryCurrent();
            transferCurrentToTheStarter();
            connectWoolAndFlywheel();
            startEngine();
        }

        private void getBatteryCurrent() {
            System.out.println("Получаем ток с аккумулятора");
        }

        private void transferCurrentToTheStarter() {
            System.out.println("Передаю полученный ток на стартер");
        }

        private void connectWoolAndFlywheel() {
            System.out.println("Соединяемся с маховиком");
        }

        private void startEngine() {
            System.out.println("Запускаем двигатель");
        }

    }


