package ua.martynenko.pattern.observer.orailly;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cleri on 06.10.2015.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable ob) {
        ob.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %sF degrees and %s%% humidity\n", temperature, humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }
}
