import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers = null;
	private double temperature = 0.0;
	private double humidity = 0.0;
	private double pressure = 0.0;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i<observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(this.temperature, this.humidity, this.pressure);
		}
		
	}
	
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
