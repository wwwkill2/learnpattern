package observer;

public class CurrentConditionDisplay implements DisplayElement, MyObserver {

	private MySubject mSubject;
	private float temperature;
	private float humidity;

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
		System.out.println("CurrentCondition: " + temperature + "F degrees, "
				+ humidity + "% humidity");
	}

}
