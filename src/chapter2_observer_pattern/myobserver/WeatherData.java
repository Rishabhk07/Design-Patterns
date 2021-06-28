package chapter2_observer_pattern.myobserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0 ){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer thisObserver : observers){
            thisObserver.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
