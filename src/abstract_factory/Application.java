package abstract_factory;


public class Application {
    FoodService foodService;
    Application(Logistics logistics){
        foodService = logistics.getFoodService();
    }

    void getFood(){
        foodService.serveFood();
    }
}
