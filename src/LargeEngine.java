/**
 * Created by Roman on 27.11.2017.
 */
public class LargeEngine implements Engine {

    private int horcePower;

    public LargeEngine(int horcePower){
        this.horcePower = horcePower;
    }

    @Override
    public void startEngine(){
        System.out.println("started large " + horcePower + "-hp engine");
    }
}
