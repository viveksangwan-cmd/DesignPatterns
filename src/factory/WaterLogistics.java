package factory;

public class WaterLogistics implements Logistics{
    @Override
    public void transport() {
        System.out.println("Transporting via Water");
    }
}
