package com.kmakrutin.item2builder;

import org.junit.Test;

import java.util.EnumSet;

import static com.kmakrutin.item2builder.NewYorkPizza.Size.MEDIUM;
import static com.kmakrutin.item2builder.Pizza.Topping.*;
import static org.junit.Assert.*;

public class PizzaTest {

    @Test
    public void createNYPizza() {
        NewYorkPizza pizza = new NewYorkPizza.Builder(MEDIUM)
                .addTopping(ONION)
                .addTopping(BACON)
                .build();

        assertNotNull(pizza);
        assertEquals(MEDIUM, pizza.getSize());
        assertEquals(EnumSet.of(ONION, BACON), pizza.getToppings());
    }

    @Test
    public void createCalzonePizza() {
        CalzonePizza pizza = new CalzonePizza.Builder()
                .sauceInside()
                .addTopping(KETCHUP)
                .addTopping(CHEESE)
                .build();

        assertNotNull(pizza);
        assertTrue(pizza.isSauceInside());
        assertEquals(EnumSet.of(KETCHUP, CHEESE), pizza.getToppings());
    }
}