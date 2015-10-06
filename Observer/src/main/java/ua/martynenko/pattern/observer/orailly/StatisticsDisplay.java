package ua.martynenko.pattern.observer.orailly;

import java.util.*;

/**
 * Created by cleri on 06.10.2015.
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private List<Float> temperatureList = new ArrayList<>();
    private List<Float> humidityList = new ArrayList<>();
    private List<Float> pressureList = new ArrayList<>();

    public StatisticsDisplay(Observable weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {

        Collections.sort(temperatureList);
        Collections.sort(humidityList);
        Collections.sort(pressureList);
        System.out.printf("Min temperature: %s, Min humidity: %s, Min pressure: %s\n", temperatureList.get(0), humidityList.get(0), pressureList.get(0));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            temperatureList.add(weatherData.getTemperature());
            humidityList.add(weatherData.getHumidity());
            pressureList.add(weatherData.getPressure());
            display();
        }
    }
}
