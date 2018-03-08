public class Cleric extends Player implements Changeable, IFight {

    private HealingTool healingTool;

    public Cleric (String name, int health, HealingTool healingTool) {
        super(name, health);
        this.healingTool = healingTool;
    }


    @Override
    public void change(Item item) {
        if (item instanceof HealingTool) {
            HealingTool healingTool = (HealingTool) item;
            setHealingTool(healingTool);
        }

    }

    public HealingTool getHealingTool() {
        return healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    @Override
    public void fight(Player opponent) {
        int repair = opponent.getHealth() + this.healingTool.getValue();
        opponent.setHealth(repair);

    }
}
