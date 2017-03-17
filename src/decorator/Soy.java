package decorator;

public class Soy extends CondimentDecorator {

	private Beverage mBeverage;

	public Soy(Beverage beverage) {
		mBeverage = beverage;
	}

	@Override
	public String getDescription() {
		return mBeverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return mBeverage.cost() + 0.15d;
	}

}
