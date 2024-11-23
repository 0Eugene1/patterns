package com.patterns.coffee.factory;

public class CoffeeFactory {

    public Coffee createCoffee(CoffeeType coffeeType) {
        switch (coffeeType) {
            case ESPRESSO :
                return new Espresso();
            case AMERICANO:
                return new Americano();
            default: throw new IllegalArgumentException("Такого кофе нет");
        }
    }
}
