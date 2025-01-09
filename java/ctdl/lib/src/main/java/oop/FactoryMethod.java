package oop;

public class FactoryMethod {
    abstract class Vehicle {
        abstract void create();
    }

    class Car extends Vehicle {
        @Override
        void create() {
            System.out.println("Car was created");
        }
    }

    class Truck extends Vehicle {
        @Override
        void create() {
            System.out.println("Truck was created");
        }
    }

    abstract class VehicleFactory{
        abstract Vehicle createVehicle();
    }

    class CarFactory extends VehicleFactory {
        @Override
        Vehicle createVehicle() {
            return new Car();
        }
    }

    class TruckFactory extends VehicleFactory {
        @Override
        Vehicle createVehicle() {
            return new Truck();
        }
    }
}
