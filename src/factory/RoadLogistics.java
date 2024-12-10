package factory;

public class RoadLogistics implements Logistics{
    @Override
    public void transport() {
        System.out.println("Transporting via Road");
    }
}
