import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    private Spell spell;
    private Creature creature;
    private Warlock warlock;


    @Before
    public void setUp() throws Exception {
        spell = new Spell("lightning", 30);
        creature = new Creature("Dragon", 50);
        warlock = new Warlock("Zeus", 100, spell, creature);
    }

    @Test
    public void testChangeCreature(){
        creature = new Creature("Ogre", 50);
        warlock.changeCreature(creature);
        assertEquals("Ogre", warlock.getCreature().getType());
    }

}
