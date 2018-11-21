package com.kmakrutin.item3Singleton;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class SingletonTest {

    private static final String SERIALIZED_FILE = "/serialized.ser";

    @Test
    public void testSimpleSingleton() throws Exception {
        assertEquals(SimpleSingleton.INSTANCE, SimpleSingleton.INSTANCE);
        assertNotEquals(SimpleSingleton.INSTANCE, serializeDeserialize(SimpleSingleton.INSTANCE));
    }

    @Test
    public void testMethodSingleton() throws Exception {
        assertEquals(MethodSingleton.getInstance(), MethodSingleton.getInstance());
        assertNotEquals(MethodSingleton.getInstance(), serializeDeserialize(MethodSingleton.getInstance()));
        assertNotSame(MethodSingleton.getInstance().getClass(), MethodSingleton.class);
    }

    @Test
    public void testEnumSingleton() throws Exception {
        assertEquals(EnumSingleton.INSTANCE, EnumSingleton.INSTANCE);
        assertEquals(EnumSingleton.INSTANCE, serializeDeserialize(EnumSingleton.INSTANCE));
    }

    @Test
    public void testSerializedSingleton() throws Exception {
        assertEquals(SerializedSingleton.INSTANCE, SerializedSingleton.INSTANCE);
        assertEquals(SerializedSingleton.INSTANCE, serializeDeserialize(SerializedSingleton.INSTANCE));
    }

    @SuppressWarnings("unchecked")
    private static <T> T serializeDeserialize(T object) throws Exception {
        try (FileOutputStream fileOut = new FileOutputStream(SERIALIZED_FILE);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(object);
        }

        try (FileInputStream fileIn = new FileInputStream(SERIALIZED_FILE);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            return (T) in.readObject();
        }
    }

}