public class Dwarf extends Player implements Changeable {


    private Weapon weapon;

    public Dwarf(String name, int health, Weapon weapon) {
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


}

