package com.patterns.database.proxy;

public class DatabaseConnection implements Database {
    private final String connectionUrl;

    public DatabaseConnection(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    @Override
    public void connect() {
        System.out.println("Подключено к базе данных: " + connectionUrl);
    }
}
