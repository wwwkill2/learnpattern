package factory;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("夏威夷风光".equals(type)) {
			pizza = new Pizza1();
		} else if ("美式烤肠".equals(type)) {
			pizza = new Pizza2();
		}
		return pizza;
	}

}
