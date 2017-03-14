package observer;

public class CurrentConditionDisplay implements DisplayElement, MyObserver {

	private float temperature;
	private float humidity;
	private MySubject mSubject;

	public CurrentConditionDisplay(MySubject subject) {
		mSubject = subject;
		mSubject.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}

}
