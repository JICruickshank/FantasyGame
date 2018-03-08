public class Warlock extends Player implements Changeable, IFight {

    private Spell spell;
    private Creature creature;

    public Warlock(String name, int health, Spell spell, Creature creature) {
        super(name, health);
        this.spell = spell;
        this.creature = creature;
    }


    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }


    @Override
    public void change(Item item) {
        if (item instanceof Spell) {
            Spell spell = (Spell) item;
            setSpell(spell);
        }

    }

    public void changeCreature(Item item) {
        if (item instanceof Creature) {
            Creature creature = (Creature) item;
            setCreature(creature);
        }

    }


    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public Creature getCreature() {
        return creature;

    }

    // use creature to stop fight

    @Override
    public void fight(Player opponent) {
        int damage = opponent.getHealth() - this.spell.getValue();
        opponent.setHealth(damage);

    }


}


