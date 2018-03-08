import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;


public class TreasureRoomTest {

    private TreasureRoom treasureRoom;
    private Treasure treasure;

    @Before
    public void setUp() throws Exception {
        treasure = new Treasure("Gold");
        treasureRoom = new TreasureRoom("Room A", treasure);

    }

    @Test
    public void name() {
        assertEquals("Room A", treasureRoom.getName());
    }

    @Test
    public void checkTreasure(){
        assertEquals("Gold", treasureRoom.getTreasure().getType());
    }

    @Test
    public void restRemoveTreasure(){
        treasureRoom.removeTreasure();
        assertNull(treasureRoom.getTreasure());
    }
}
