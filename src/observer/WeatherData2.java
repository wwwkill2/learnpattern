package observer;

import java.util.Observable;

public class WeatherData2 extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;

	public void measurementChanged() {
		notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		setChanged();
		measurementChanged();
	}

}
