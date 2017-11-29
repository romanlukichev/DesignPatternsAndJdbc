/**
 * Created by Roman on 27.11.2017.
 */
public class Vehicle {

    Engine myEngine;
    Tire tire;
    WndSheld shield;
    Roof roof;

    public Vehicle(Engine anEngine){
        myEngine = anEngine;
    }

    public void crankIgnition(){
        myEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}
