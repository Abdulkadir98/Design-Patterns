import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {
	
	private double temperature;
	private double humidity;
	private double pressure;
	Observable observable;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	
	public void display() {
		System.out.println("Temperature: "+ temperature + " Humidity: "+ humidity + " Pressure: "+ pressure);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			temperature = weatherData.getTemperature();
			humidity = weatherData.getHumidity();
			pressure = weatherData.getPressure();
		}
		display();
	}
}

