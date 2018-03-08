import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {
    private EnemyRoom enemyRoom;
    private Enemy enemy;

    @Before
    public void setUp() throws Exception {
        enemy = new Enemy("Troll", 60);
        enemyRoom = new EnemyRoom("Room B", enemy);
    }

    @Test
    public void checkEnemy() {
        assertEquals("Troll", enemyRoom.getEnemy().getName());
    }
}
