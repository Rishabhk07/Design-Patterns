package chapter2.javaobserver;

import chapter2.myobserver.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentDisplay(Observable o){
        this.observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Temperature : " + this.temperature);
        System.out.println("Humidity : " + this.humidity);
    }
}
