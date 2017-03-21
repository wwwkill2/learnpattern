package factory;

public abstract class PizzaStore2 {

	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public abstract Pizza createPizza(String type);

}
