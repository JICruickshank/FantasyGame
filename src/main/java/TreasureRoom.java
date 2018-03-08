public class TreasureRoom extends Room {

    private String treasure;

    public TreasureRoom(String name, String treasure) {
        super(name);
        this.treasure = treasure;
    }


    public String getTreasure() {
        return treasure;
    }
}
