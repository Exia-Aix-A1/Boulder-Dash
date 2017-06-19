package worldloader;

import dao.*;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.fail;

/**
 * Created by Mandel on 20/06/2017.
 */
public class WorldLoaderTest {

    private static IMap mapDao;


    @BeforeClass
    public static void initWorldLoader(){
         mapDao = new MapDAO();
    }

    @Test
    public void getMapTest(){
        System.out.println("WorldLoader Test : getMap()");
        RawMap map = new RawMap("test", 10, 10, 150, 1500);
        map.addElement(new RawElement(ObjectType.WALL, 10, 10));
        map.addElement(new RawElement(ObjectType.WALL, 5, 5));
        map.addElement(new RawElement(ObjectType.DIRT, 1, 1));
        mapDao.addMap(map);
        if(!WorldLoader.getMap("test", mapDao).isPresent()){
            fail("Fail WorldLoader : getMap()");
        }else{
            mapDao.removeMap("test");
        }
    }
}