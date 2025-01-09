package oop;

class AbstractFactory {
    interface car {
        void assemble();
    }

    interface truck {
        void assemble();
    }

    class ElectricCar implements car {
        @Override
        public void assemble() {
            System.out.println("ElectricCar");
        }
    }

    class GasolineCar implements car {
        @Override
        public void assemble() {
            System.out.println("GasolineCar");
        }
    }

    class ElectricTruck implements truck {
        @Override
        public void assemble() {
            System.out.println("ElectricTruck");
        }
    }

    class GasolineTruck implements truck {
        @Override
        public void assemble() {
            System.out.println("GasolineTruck");
        }
    }

    interface VehicleFactory {
        car createCar();
        truck createTruck();
    }

    class ElectricFactory implements VehicleFactory {
        @Override
        public car createCar() {
            return new ElectricCar();
        }

        @Override
        public truck createTruck() {
            return new ElectricTruck();
        }
    }

    class GassolineFactory implements VehicleFactory {
        @Override
        public car createCar() {
            return new GasolineCar();
        }

        @Override
        public truck createTruck() {
            return new GasolineTruck();
        }
    }
}
