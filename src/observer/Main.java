package observer;

public class Main {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(20, 20, 20);
		weatherData.setMeasurements(30, 30, 30);
		weatherData.setMeasurements(40, 40, 40);
	}

}
