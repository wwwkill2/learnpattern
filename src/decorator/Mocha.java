package decorator;

public class Mocha extends CondimentDecorator {

	private Beverage mBeverage;

	public Mocha(Beverage beverage) {
		mBeverage = beverage;
	}

	@Override
	public String getDescription() {
		return mBeverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return mBeverage.cost() + 0.2d;
	}

}
