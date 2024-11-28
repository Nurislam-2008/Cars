public class BmwM5cs extends BmwM5{
    private String door;
    private int Awd;
    private int weight;

    public BmwM5cs( String motor, String color, int year, int hp, String door, int awd, int weight) {
        super( motor, color, year, hp);
        this.door = door;
        Awd = awd;
        this.weight = weight;
    }

    public BmwM5cs(String door, int awd, int weight) {
        this.door = door;
        Awd = awd;
        this.weight = weight;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public int getAwd() {
        return Awd;
    }

    public void setAwd(int awd) {
        Awd = awd;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BmwM5cs{" +
                "door='" + door + '\'' +
                ", Awd=" + Awd +
                ", weight=" + weight +
                '}';
    }
}
