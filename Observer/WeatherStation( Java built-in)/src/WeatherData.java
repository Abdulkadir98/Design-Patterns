import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
	
	private double temperature = 0.0;
	private double humidity = 0.0;
	private double pressure = 0.0;
	
	public WeatherData() {
	}
	
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public double getHumidity() {
		return humidity;
	}
	
	public double getPressure() {
		return pressure;
	}

}
