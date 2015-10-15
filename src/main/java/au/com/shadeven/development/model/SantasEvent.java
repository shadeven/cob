package au.com.shadeven.development.model;

import java.util.Map;

/**
 * Created by Steven on 15/10/2015.
 */
public class SantasEvent {

  private String name;
  private Applicant applicant;
  private Map<String, String> eventData;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Applicant getApplicant() {
    return applicant;
  }

  public void setApplicant(Applicant applicant) {
    this.applicant = applicant;
  }

  public Map<String, String> getEventData() {
    return eventData;
  }

  public void setEventData(Map<String, String> eventData) {
    this.eventData = eventData;
  }
}
