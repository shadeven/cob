package au.com.shadeven.development.builder;

import au.com.shadeven.development.model.Applicant;
import au.com.shadeven.development.model.SantasEvent;

import java.util.HashMap;

/**
 * Created by Steven on 15/10/2015.
 */
public class STATPaymentEventBuilder extends AbstractEventBuilder implements EventBuilder<Applicant> {

  @Override
  public SantasEvent build(Applicant data, String name) {
    SantasEvent event = buildEvent(name);

    HashMap<String, String> map = new HashMap<>();
    map.put("APPLICANT_ID", data.getId());
    event.setEventData(map);
    return event;
  }

}
