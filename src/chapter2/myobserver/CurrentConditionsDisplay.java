package chapter2.myobserver;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    // here again we are not referencing to the weather data object directly, we are coding to the interface.
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        // here we use the passed wheather data object to register this as an observer of the weather data object
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current weather conditions are : ");
        System.out.println("Temperature : " + temperature + " F degrees");
        System.out.println("humidity : "+ humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
