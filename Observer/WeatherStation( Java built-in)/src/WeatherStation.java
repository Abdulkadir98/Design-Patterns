
public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 78, 32);
		weatherData.setMeasurements(95, 66, 32);
		weatherData.setMeasurements(67, 43, 35);

	}

}
