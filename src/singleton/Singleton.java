package singleton;

/*
 * 单件模式，确保一个类只有一个实例，并提供一个全局访问点
 */
public class Singleton {

	private volatile static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		// double-check locking
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					// lazy instantiation
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
