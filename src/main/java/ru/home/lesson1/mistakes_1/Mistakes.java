package ru.home.lesson1.mistakes_1;

public class Mistakes {
    /* исправление ошибок:
    1) был создан класс Engine с enum "Тип двигателя" - его не было
    2) вынес метод start() класса Car в интерфейс Startable, так как такое поведение может быть не только
        у класса Car, но и других
    3) указал, что абстрактный класс Car имплементит интерфейсы Startable, Stopable, Moveable, а не классы наследники,
        так как все автомобили должны начинать движение, двигаться и останавливаться и
           соответственно добавил методы в классах наследниках
    4) "abstract void open();" убрал в интефейс, так как не у всех машин есть двери
     */

    interface Moveable {
        void move();
    }

    interface Startable {
        void start();
    }
    interface Stopable {
        void stop();
    }
    interface Openable {
        void open();
    }

    abstract class Car implements Startable, Stopable, Moveable{
        public Engine engine;
        private String color;
        private String name;

        @Override
        public void start() {
            System.out.println("Car starting");
        }

        public Engine getEngine() {
            return engine;
        }

        public void setEngine(Engine engine) {
            this.engine = engine;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class LightWeightCar extends Car implements Openable{

        @Override
        public void open() {
            System.out.println("Car is open");
        }

        @Override
        public void move() {
            System.out.println("Car is moving");
        }

        @Override
        public void stop() {
            System.out.println("Car is stop");
        }
    }

    class Lorry extends Car implements Openable{

        public void move(){
            System.out.println("Car is moving");
        }

        public void stop(){
            System.out.println("Car is stop");
        }

        @Override
        public void open() {
            System.out.println("Car is open");
        }
    }


    class Engine{
        private Type type;

        public Engine(Type type) {
            this.type = type;
        }
    }

    enum Type{DIESEL, PETROL}
}
