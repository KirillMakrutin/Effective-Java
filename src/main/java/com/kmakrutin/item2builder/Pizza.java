package com.kmakrutin.item2builder;

import java.util.EnumSet;
import java.util.Set;

abstract class Pizza {
    Pizza(Builder builder) {
        this.toppings = builder.toppings.clone();
    }

    public Set<Topping> getToppings() {
        return toppings;
    }

    public enum Topping {
        KETCHUP, ONION, MUSHROOMS, CHEESE, BACON
    }

    private final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        private final EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        protected abstract T self();

        abstract Pizza build();
    }
}
