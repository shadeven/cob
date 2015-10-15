package au.com.shadeven.development.factory;

/**
 * Created by Steven on 12/08/2015.
 */
public class Timber {
  private static Timber ourInstance = new Timber();

  public static Timber getInstance() {
    return ourInstance;
  }

  private Timber() {
  }

  public interface Tree {
     void run(String name);
  }
}
