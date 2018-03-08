import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TreasureRoomTest {

    private TreasureRoom treasureRoom;

    @Before
    public void setUp() throws Exception {
        treasureRoom = new TreasureRoom("Room A", "Gold");
    }

    @Test
    public void name() {
        assertEquals("Room A", treasureRoom.getName());
    }

    @Test
    public void checkTreasure(){
        assertEquals("Gold", treasureRoom.getTreasure());
    }
}
