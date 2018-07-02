
public class CurrentConditionsDisplay implements Observer {
	
	private double temperature;
	private double humidity;
	private double pressure;
	
	Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
		
	}
	
	public void display() {
		System.out.println("Temperature: "+ temperature + " Humidity: "+ humidity + " Pressure: "+ pressure);
	}

}
