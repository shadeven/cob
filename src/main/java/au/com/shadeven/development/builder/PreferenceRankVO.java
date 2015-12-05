package au.com.shadeven.development.builder;

import java.util.Date;

public class PreferenceRankVO {

  private String id;
  private String name;
  private String status;
  private String whoCreated;
  private String whoChanged;
  private Date whenCreated;
  private Date whenChanged;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getWhoCreated() {
    return whoCreated;
  }

  public void setWhoCreated(String whoCreated) {
    this.whoCreated = whoCreated;
  }

  public String getWhoChanged() {
    return whoChanged;
  }

  public void setWhoChanged(String whoChanged) {
    this.whoChanged = whoChanged;
  }

  public Date getWhenCreated() {
    return whenCreated;
  }

  public void setWhenCreated(Date whenCreated) {
    this.whenCreated = whenCreated;
  }

  public Date getWhenChanged() {
    return whenChanged;
  }

  public void setWhenChanged(Date whenChanged) {
    this.whenChanged = whenChanged;
  }
}
