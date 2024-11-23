package com.patterns.coffee.factory;

public class Espresso implements Coffee {
    @Override
    public void brew() {
        System.out.println("Готовим Эспрессо");
    }
}
