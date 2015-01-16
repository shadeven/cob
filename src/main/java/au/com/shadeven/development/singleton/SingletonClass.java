package au.com.shadeven.development.singleton;

/**
 * The class returns a singleton instance. However, it might not work in a
 * multi-thread environment.
 * 
 * @author Steven
 *
 */
public class SingletonClass {

	/**
	 * 
	 */
	private static final SingletonClass INSTANCE = new SingletonClass();

	/**
	 * The private constructor that prevents instantiation from outside.
	 */
	private SingletonClass() {
	}

	/**
	 * The static method returns the static instance.
	 * 
	 * @return
	 */
	public static SingletonClass getInstance() {
		return INSTANCE;
	}
}
