package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	private List<Observer> mObservers;
	
	private float mTemp;
	private float mHumidity;
	private float mPressure;
	
	public WeatherData() {
		mObservers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		mObservers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		mObservers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : mObservers) {
			o.update(mTemp, mHumidity, mPressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		mTemp = temp;
		mHumidity = humidity;
		mPressure = pressure;
		measurementsChanged();
	}

}
