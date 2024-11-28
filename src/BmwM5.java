public class BmwM5 {
   private String motor;
   private String color;
   private  int year;
   private int hp;

    public BmwM5 ( String motor, String color, int year, int hp) {
        this.motor = motor;
        this.color = color;
        this.year = year;
        this.hp = hp;
    }

    public BmwM5() {

    }

    public BmwM5(String Name) {
    }



    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "BmwM5{" +
                ", motor='" + motor + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", hp=" + hp +
                '}';
    }
}



