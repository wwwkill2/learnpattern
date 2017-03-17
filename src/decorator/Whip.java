package decorator;

public class Whip extends CondimentDecorator {

	private Beverage mBeverage;

	public Whip(Beverage beverage) {
		mBeverage = beverage;
	}

	@Override
	public String getDescription() {
		return mBeverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return mBeverage.cost() + 0.1d;
	}

}
