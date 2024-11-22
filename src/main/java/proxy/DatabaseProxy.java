package proxy;

public class DatabaseProxy implements Database {
    private final String dbName;
    private final String host;
    private final int port;
    private DatabaseConnection realDatabase;

    public DatabaseProxy(String host, String dbName, int port) {
        this.host = host;
        this.dbName = dbName;
        this.port = port;
    }

    @Override
    public void connect() {
        if (realDatabase == null) {
            String fulUrl = host + ":" + port + "/" + dbName;
            realDatabase = new DatabaseConnection(fulUrl);
        }
        realDatabase.connect();
    }
}
