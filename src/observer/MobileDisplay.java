package observer;

public class MobileDisplay implements Observer{
    @Override
    public void update(int temp) {
        System.out.println("MobileDisplay temp is "+temp);
    }
}
