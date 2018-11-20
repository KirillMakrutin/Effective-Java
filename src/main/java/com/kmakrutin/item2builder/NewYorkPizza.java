package com.kmakrutin.item2builder;

import java.util.Objects;

public class NewYorkPizza extends Pizza {
    private final Size size;

    public NewYorkPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public enum Size {
        SMALL, MEDIUM, BIG
    }

    public Size getSize() {
        return size;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        NewYorkPizza build() {
            return new NewYorkPizza(this);
        }
    }
}
