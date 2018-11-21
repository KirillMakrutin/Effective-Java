package com.kmakrutin.item3Singleton;


public class SimpleSingleton implements SayHello {
    public static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {
    }

    @Override
    public void hello() {
        System.out.println("I'm " + this.getClass().getSimpleName());
    }
}
