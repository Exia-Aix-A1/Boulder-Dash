import DAO.Dao;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Class Test DaoClass
 * Test instanciate
 * Test Connection
 * Test Close Connection
 * */
public class DAOTest {

    private static Dao dao = null;
    private static Connection connection = null;

    /**
     * Instanciate Dao
     * Test Instanciate
     * */
    @BeforeClass
    public static void initDaoTest(){

        dao = Dao.getInstance();
        if(dao == null){
            fail("Fail : instanciate dao");
        }
    }

    /**
     * Test Connection
     * */
    @Test
    public void TestGetConnection(){
        connection = dao.getConnection();
        if(connection == null){
            fail("Fail : getConnection");
        }
    }
    /**
     * Test Close Connection
     * */
    @AfterClass
    public static void CloseConnection(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                fail("Fail : Close DataBase Connection !");
            }
        }

    }
}