package abstract_factory;

public class LandFoodService implements FoodService{
    @Override
    public void serveFood() {
        System.out.println("Served Normal Food");
    }
}
