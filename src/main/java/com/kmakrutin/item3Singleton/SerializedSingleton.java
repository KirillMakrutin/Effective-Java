package com.kmakrutin.item3Singleton;

public class SerializedSingleton implements SayHello {
    public static final SerializedSingleton INSTANCE = new SerializedSingleton();

    private SerializedSingleton() {
    }

    @Override
    public void hello() {
        System.out.println("I'm " + this.getClass().getSimpleName());
    }

    // to preserve singleton property
    private Object readResolve()
    {
        return INSTANCE;
    }
}
