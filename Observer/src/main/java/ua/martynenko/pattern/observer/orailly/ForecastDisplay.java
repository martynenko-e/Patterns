package ua.martynenko.pattern.observer.orailly;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by cleri on 06.10.2015.
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable obs) {
       obs.addObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Forecast: changes %s\n", (lastPressure - currentPressure));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
