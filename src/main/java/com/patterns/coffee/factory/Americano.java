package com.patterns.coffee.factory;

public class Americano implements Coffee {
    @Override
    public void brew() {
        System.out.println("Готовим Американо");
    }
}
