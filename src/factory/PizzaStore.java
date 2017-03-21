package factory;

public class PizzaStore {

	SimplePizzaFactory mFactory;

	public PizzaStore(SimplePizzaFactory factory) {
		mFactory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = mFactory.createPizza(type);
		System.out.println(pizza.getDescription());
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
