package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float mTemp;
	private float mHumidity;

	private Subject mWeatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		mWeatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + mTemp + "F degrees and "
				+ mHumidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		mTemp = temp;
		mHumidity = humidity;
		display();
	}

}
