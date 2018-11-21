package com.kmakrutin.item3Singleton;

public enum EnumSingleton implements SayHello {
    INSTANCE;

    @Override
    public void hello() {
        System.out.println("I'm " + this.getClass().getName());
    }
}
