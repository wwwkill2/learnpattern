package observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay2 implements DisplayElement, Observer {

	private Observable mObservable;
	private float temperature;
	private float humidity;

	public CurrentConditionDisplay2(Observable observable) {
		mObservable = observable;
		mObservable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData2) {
			WeatherData2 data = (WeatherData2) o;
			temperature = data.getTemperature();
			humidity = data.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("CurrentCondition: " + temperature + "F degrees, "
				+ humidity + "% humidity");
	}

}
