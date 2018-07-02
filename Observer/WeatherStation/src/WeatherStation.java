
public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 32);
		weatherData.setMeasurements(78, 59, 35);
		weatherData.setMeasurements(90, 79, 40);


	}

}
