public class Barbarian extends Player implements Changeable, IFight {
    private Weapon weapon;

    public Barbarian(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void change(Item item) {
        if (item instanceof Weapon) {
            Weapon weapon = (Weapon) item;
            setWeapon(weapon);
        }

    }

    @Override
    public void fight(Player opponent) {
       int damage = opponent.getHealth() - this.weapon.getValue();
       opponent.setHealth(damage);

    }
}
