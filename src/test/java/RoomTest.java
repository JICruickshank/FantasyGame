import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;



    @Before
    public void setUp() throws Exception {
        room = new Room("Room A");
    }

        @Test
        public void TestGetName(){
            assertEquals("Room A", room.getName());
        }


}
