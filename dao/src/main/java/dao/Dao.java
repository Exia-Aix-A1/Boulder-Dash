package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Data Access Object Class
 * Use singleTon pattern
 * @version 1.0
 * */
public class Dao {
    /**
     * connection url
     * */
    private final static String url = "jdbc:mysql://localhost:32769/boulderdash?autoReconnect=true&useSSL=false";
    /**
     * username
     * */
    private final static String user = "root";
    /**
     * password
     * */
    private final static String passwd = "admin";
    /**
     * Connection attribut
     * */
    private static Connection connection = null;
    private static Dao dao = null;


    /**
     * Dao.Dao Constructor. He create Connection
     * */
    private Dao(){
        try {
            connection = DriverManager.getConnection(url, user, passwd);
        } catch (SQLException e) {
            System.out.println("PLEASE VERIFY THE PARAMETERS CONNECTION !");
            e.printStackTrace();
        }
    }//FINISH

    /**
     * Allow to access DAO instance to take connection.
     * @return Dao instance
     * */
    public static Dao getInstance(){
        if(dao == null){
            synchronized(Dao.class){
                if(dao == null)
                    dao = new Dao();
            }
        }
        return dao;
    }//FINISH

    /**
     * Allow to access instance Instance
     * @return Connection instance
     * */
    public Connection getConnection(){
        return connection;
    }//FINISH
}
