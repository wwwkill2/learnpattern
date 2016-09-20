package strategy;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("火箭助力飞行");
	}

}
