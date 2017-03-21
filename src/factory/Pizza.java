package factory;

public abstract class Pizza {

	public void prepare() {
		System.out.println("准备");
	}

	public void bake() {
		System.out.println("烘烤");
	}

	public void cut() {
		System.out.println("切割");
	}

	public void box() {
		System.out.println("装盒");
	}

	public abstract String getDescription();

}
