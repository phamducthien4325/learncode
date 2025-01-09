package oop;

class prototype {
    interface Prototype {
        Prototype clone();
    }

    class ConcretePrototype implements Prototype {
        private String name;

        public ConcretePrototype(String name) {
            this.name = name;
        }

        @Override
        public Prototype clone() {
            return new ConcretePrototype(this.name);
        }
    }
}
