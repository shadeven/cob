package au.com.shadeven.development.singleton;

public class SingletonClass {

	private static final SingletonClass INSTANCE = new SingletonClass();
	
	private SingletonClass() {}
	
	public SingletonClass getInstance() {
		return INSTANCE;
	}
}
