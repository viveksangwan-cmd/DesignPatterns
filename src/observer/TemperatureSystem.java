package observer;

public class TemperatureSystem {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        MonitorDisplay monitorDisplay = new MonitorDisplay();
        MobileDisplay mobileDisplay = new MobileDisplay();

        weatherStation.addObserver(monitorDisplay);
        weatherStation.addObserver(mobileDisplay);

        weatherStation.changeTemperature(20);

        weatherStation.removeObserver(monitorDisplay);
        weatherStation.changeTemperature(40);

    }
}
