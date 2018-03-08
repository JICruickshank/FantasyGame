import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    private Weapon weapon;

    @Before
    public void setUp() throws Exception {
        weapon = new Weapon("Sword", 20);
    }

    @Test
    public void checkName(){
        assertEquals("Sword", weapon.getName());
    }

    @Test
    public void checkAttackValue(){
        assertEquals(20, weapon.getAttackValue());
    }
}
