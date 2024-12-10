package abstract_factory;

public class SeaFoodService implements FoodService{
    @Override
    public void serveFood() {
        System.out.println("Served Sea Food");
    }
}
