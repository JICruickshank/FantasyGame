import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    private Enemy enemy;

    @Before
    public void setUp() throws Exception {
        enemy = new Enemy ("Org");
    }

    @Test
    public void testName() {
        assertEquals("Org", enemy.getName());
    }
}
