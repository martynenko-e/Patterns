package ua.martynenko.pattern.observer.orailly;

import java.util.Observable;

/**
 * Created by cleri on 06.10.2015.
 */
public class WeatherData extends Observable {


    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData (){
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float hum, float pres){
        temperature = temp;
        humidity = hum;
        pressure = pres;
        measurementsChanged();
    }
}
