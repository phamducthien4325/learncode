package oop;

class adapter {
    interface target{
        void request();
    }

    class Adaptee {
        void specifiRequest() {
            System.out.println("specifiRequest");;
        }
    }

    class Adapter implements target {
        private Adaptee adatee;

        public Adapter(Adaptee a) {
            this.adatee = a;
        }

        @Override
        public void request() {
            this.adatee.specifiRequest();
        }
    }
}
