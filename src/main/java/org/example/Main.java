package org.example;

import com.patterns.coffee.factory.CoffeeFactory;
import com.patterns.coffee.factory.CoffeeMachine;
import com.patterns.coffee.factory.CoffeeService;
import com.patterns.coffee.factory.CoffeeType;
import com.patterns.database.proxy.Database;
import com.patterns.database.proxy.DatabaseConnectionProxy;
import com.patterns.adapter.*;
import com.patterns.singleton.Singleton;
import com.patterns.singleton.TestClass;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.classLog(new TestClass(), "someInfo");

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeService service = new CoffeeService(coffeeMachine, coffeeFactory);

        service.start(CoffeeType.ESPRESSO);
        System.out.println();
        service.start(CoffeeType.AMERICANO);

        Database db = new DatabaseConnectionProxy("localhost", "mydatabase", 8800);
        db.connect();


        Computer computer = new Computer();
        MemoryCardReader memoryCard = new MemoryCard();

        Usb memoryCardAdapter = new MemoryCardAdapter(memoryCard);
        computer.connectUsb(memoryCardAdapter);
    }
}