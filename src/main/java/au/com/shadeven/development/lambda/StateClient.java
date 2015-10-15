package au.com.shadeven.development.lambda;

/**
 * Created by Steven on 9/08/2015.
 */
public class StateClient {

  public void init() {
    StateOwner owner = new StateOwner();
    owner.addStatusChangeListener(state -> System.out.println("Lamdba is awesome!"));

  }

}
