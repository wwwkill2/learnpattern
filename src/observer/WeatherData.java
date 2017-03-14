package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements MySubject {

	private List<MyObserver> mObservers;

	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		mObservers = new ArrayList<MyObserver>();
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	@Override
	public void registerObserver(MyObserver observer) {
		mObservers.add(observer);
	}

	@Override
	public void removeObserver(MyObserver observer) {
		mObservers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (MyObserver observer : mObservers) {
			observer.update(getTemperature(), getHumidity(), getPressure());
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
