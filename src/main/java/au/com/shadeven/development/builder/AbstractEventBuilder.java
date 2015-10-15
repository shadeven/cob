package au.com.shadeven.development.builder;

import au.com.shadeven.development.model.SantasEvent;

/**
 * Created by Steven on 15/10/2015.
 */
public abstract class AbstractEventBuilder {

  protected SantasEvent buildEvent(String name) {
    SantasEvent event = new SantasEvent();
    event.setName(name);
    return event;
  }
}
