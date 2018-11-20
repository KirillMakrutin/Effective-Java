package com.kmakrutin.item2builder;

public class CalzonePizza extends Pizza {
    private final boolean sauceInside;

    public CalzonePizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    public boolean isSauceInside() {
        return sauceInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            this.sauceInside = true;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        CalzonePizza build() {
            return new CalzonePizza(this);
        }
    }
}
