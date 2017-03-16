package observer;

public class Main {

	public static void main(String[] args) {
		WeatherData2 weatherData = new WeatherData2();
		CurrentConditionDisplay2 display = new CurrentConditionDisplay2(
				weatherData);
		weatherData.setMeasurements(20, 20, 20);
		weatherData.setMeasurements(30, 30, 30);
		weatherData.setMeasurements(40, 40, 40);
	}

}
