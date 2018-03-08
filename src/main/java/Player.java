import java.util.ArrayList;

public abstract class Player {
    private int health;
    private String name;
    private ArrayList<Treasure> collectedTreasure;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.collectedTreasure = new ArrayList<>();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Treasure> getCollectedTreasure() {
        return collectedTreasure;
    }

    public void pickUpTreasure(Treasure treasure){
        collectedTreasure.add(treasure);
    }



}
