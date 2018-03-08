public class Knight extends Player {
    private Weapon weapon;

    public Knight(String name, int health, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
