package factory;

public class Application{
    Logistics logistics;
    public Application(LogisticsMode transportMode){
        switch (transportMode){
            case LogisticsMode.LAND:
                logistics = new RoadLogistics();
                break;
            case LogisticsMode.WATER:
                logistics = new WaterLogistics();
                break;
            default:
                System.out.println(transportMode+" service is not available");
        }
    }

    public void transferGoods(){
        logistics.transport();
    }
}
