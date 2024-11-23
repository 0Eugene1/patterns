package com.patterns.database.proxy;

public class DatabaseConnectionProxy implements Database {
    private final String dbName;
    private final String host;
    private final int port;
    private DatabaseConnection realDatabase;

    public DatabaseConnectionProxy(String host, String dbName, int port) {
        this.host = host;
        this.dbName = dbName;
        this.port = port;
    }

    @Override
    public void connect() {
        if (realDatabase == null) {
            String fullUrl = host + ":" + port + "/" + dbName;
            realDatabase = new DatabaseConnection(fullUrl);
        }
        realDatabase.connect();
    }
}
