package ch06.ex8.access.local;

/**
 * Created by V1 on 07-Feb-17.
 */

public class ConnectionManager {
    private Connection[] connection;
    private int size;
    private int current;


    private ConnectionManager(int size) {  // не работает
        if (connection == null && size > 0) {
            connection = new Connection[size];
            for (int i = 0; i < connection.length; i++) {
                connection[i] = new Connection(i);
            }
            this.size = size;
            current = 0;
        }
    }

    private ConnectionManager() {  // не работает
    }

    public static ConnectionManager makeConnections(int size) {
        return (new ConnectionManager(size));
    }

    public Connection getConnection() {
        if (current >= size) {
            return null;
        }
        return connection[current++];
    }


}
