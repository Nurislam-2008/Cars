import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BmwM5 bmw;
        bmw = new BmwM5("bmw", "rfs",234,434);
        System.out.println(bmw);


    BmwM5cs bmwcs = new BmwM5cs("4", 210, 2000);
        System.out.println(bmwcs);

        BmwM5f90 bmwM5= new BmwM5f90("car","de",432,2023,"fa",534, "yes");
        System.out.println(bmwM5);
}

}