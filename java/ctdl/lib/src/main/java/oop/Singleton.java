package oop;

public final class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {

    }

    public Singleton getInstance() {
        return singleton;
    }
}
