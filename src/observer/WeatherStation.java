package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private int temp;
    private final List<Observer> observers;
    public WeatherStation(){
        observers = new ArrayList<>();
    }

    public void changeTemperature(int temp){
        this.temp = temp;
        updateObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void updateObservers() {
        for(Observer observer:observers){
            observer.update(this.temp);
        }
    }
}
