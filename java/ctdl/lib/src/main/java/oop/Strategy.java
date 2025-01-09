package oop;

class Strategy {
    interface PaymentStrategy {
        void pay(double amount);
    }
    
    class CreditCardPayment implements PaymentStrategy {
        public void pay(double amount) {
            System.out.println("pay");
        }
    }
}
