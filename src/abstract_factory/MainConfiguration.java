package abstract_factory;

public class MainConfiguration {
    public static Logistics getLogistics(LogisticsMode logisticsMode){
        return switch (logisticsMode) {
            case LogisticsMode.LAND -> new LandLogistics();
            case LogisticsMode.SEA -> new SeaLogistics();
            default -> {
                System.out.println(logisticsMode + " service is not available");
                yield null;
            }
        };
    }

    public static void main(String[] args) {
        LogisticsMode currentConfiguration = LogisticsMode.SEA;
        Logistics logistics = getLogistics(currentConfiguration);
        if (logistics!=null){
            Application application = new Application(logistics);
            application.getFood();
        }
    }
}
