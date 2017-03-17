package decorator;

public class Main {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		beverage = new Whip(new Mocha(new Mocha(new HouseBlend())));
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}
