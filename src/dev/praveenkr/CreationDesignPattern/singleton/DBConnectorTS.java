package dev.praveenkr.CreationDesignPattern.singleton;

public class DBConnectorTS {
    private static volatile DBConnectorTS INSTANCE = null;

    //constructor
    private DBConnectorTS(){}

    //Thread Safe getInstance Function
    public static DBConnectorTS getInstance(){
        if(INSTANCE == null) {
            synchronized (DBConnectorTS.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DBConnectorTS();
                }
            }
        }
        return INSTANCE;
    }
}