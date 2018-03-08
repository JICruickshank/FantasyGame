import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    private Weapon weapon;
    private Weapon weapon2;
    private Dwarf dwarf;
    private Treasure treasure;
    private Spell spell;


    @Before
    public void setUp() throws Exception {
        weapon = new Weapon("Axe", 30);
        dwarf = new Dwarf("Doc", 100, weapon);
        treasure = new Treasure("Gold");
    }

    @Test
    public void canGetname() {
        assertEquals("Doc", dwarf.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canGetWeapon() {
        assertEquals("Axe", dwarf.getWeapon().getType());
    }

    @Test
    public void canSetWeapon() {
        weapon2 = new Weapon("Sword", 30);
        dwarf.setWeapon(weapon2);
        assertEquals("Sword", dwarf.getWeapon().getType());
    }

    @Test
    public void checkTreasure(){
        dwarf.pickUpTreasure(treasure);
        assertEquals(1, dwarf.getCollectedTreasure().size());

    }

    @Test
    public void checkInterface(){
        weapon2 = new Weapon("Sword", 30);
        dwarf.change(weapon2);
        assertEquals("Sword", dwarf.getWeapon().getType());
    }

    @Test
    public void checkCantAddSPell(){
        spell = new Spell("Curse", 40);
        dwarf.change(spell);
        assertEquals("Axe", dwarf.getWeapon().getType());
    }
}
