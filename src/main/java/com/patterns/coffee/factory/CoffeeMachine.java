package com.patterns.coffee.factory;

public class CoffeeMachine {

    public void brewCoffee(Coffee coffee) {
        System.out.println("Начало варки кофе");
        coffee.brew();
    }
}
