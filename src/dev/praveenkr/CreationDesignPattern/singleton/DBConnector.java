package dev.praveenkr.CreationDesignPattern.singleton;

public class DBConnector {
    private static volatile DBConnector INSTANCE = null;

    //constructor
    private DBConnector(){}

    //getInstance Function
    public static DBConnector getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new DBConnector();
        }
        return INSTANCE;
    }

    public boolean insert(){
        System.out.println("hello");
        return true;
    }
}


