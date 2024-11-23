package com.patterns.coffee.factory;

public class CoffeeService {
    private final CoffeeMachine coffeeMachine;
    private final CoffeeFactory coffeeFactory;

    public CoffeeService(CoffeeMachine coffeeMachine, CoffeeFactory coffeeFactory) {
        this.coffeeMachine = coffeeMachine;
        this.coffeeFactory = coffeeFactory;
    }

    public void start(CoffeeType coffeeType) {
        Coffee coffee = coffeeFactory.createCoffee(coffeeType);

        coffeeMachine.brewCoffee(coffee);
        System.out.println("Процесс завершен. Ваше " + coffeeType + " готово!" );
        }
    }

