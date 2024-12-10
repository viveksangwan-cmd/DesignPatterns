package abstract_factory;

public class SeaLogistics implements Logistics{
    @Override
    public FoodService getFoodService() {
        return new SeaFoodService();
    }
}
