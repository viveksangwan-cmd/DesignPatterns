package observer;

public class MonitorDisplay implements Observer{

    @Override
    public void update(int temp) {
        System.out.println("MonitorDisplay temp is "+temp);
    }
}
