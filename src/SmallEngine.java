/**
 * Created by Roman on 27.11.2017.
 */
public class SmallEngine implements Engine {

    private int horcePower;

    public SmallEngine(int horcePower){
        this.horcePower = horcePower;
    }

    @Override
    public void startEngine(){
        System.out.println("started small " + horcePower + "-hp engine");
    }
}
