public class EnemyRoom extends Room{

    private Enemy enemy;


    public EnemyRoom(String name, Enemy enemy) {
        super(name);
        this.enemy = enemy;

    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }
}
