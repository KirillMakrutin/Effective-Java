package com.kmakrutin.item3Singleton;

public class MethodSingleton implements SayHello {
    private static final MethodSingleton INSTANCE = new ChildMethodSingleton();

    private MethodSingleton() {
    }

    public static MethodSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    public void hello() {
        System.out.println("I'm " + this.getClass().getName());
    }

    private static class ChildMethodSingleton extends MethodSingleton {
    }
}
