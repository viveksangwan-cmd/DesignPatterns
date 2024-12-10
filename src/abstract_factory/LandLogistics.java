package abstract_factory;

public class LandLogistics implements Logistics{
    @Override
    public FoodService getFoodService() {
        return new LandFoodService();
    }
}
