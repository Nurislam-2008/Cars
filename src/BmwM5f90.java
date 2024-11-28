public class BmwM5f90 extends BmwM5{
    private String rwd;
    private int cheir;
    private String engine;

    public BmwM5f90(String engine, String color, int year, int cheir,String rwd, int hp, String motor) {
        super(motor, color, year, hp);
        this.rwd = rwd;
        this.cheir = hp;
        this.engine = motor;
    }

    public String getRwd() {
        return rwd;
    }

    public void setRwd(String rwd) {
        this.rwd = rwd;
    }

    public int getHp() {
        return cheir;
    }

    public void setHp(int hp) {
        this.cheir = hp;
    }

    public String getMotor() {
        return engine;
    }

    public void setMotor(String motor) {
        this.engine = motor;
    }

    @Override
    public String toString() {
        return "BmwM5f90{" +
                "rwd='" + rwd + '\'' +
                ", hp=" + cheir +
                ", motor='" + engine + '\'' +
                '}';
    }
}
