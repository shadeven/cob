package au.com.shadeven.development.builder;

public final class PreferenceRank {

  private final String id;
  private final String name;
  private final String status;

  private PreferenceRank(String id, String name, String status) {
    this.id = id;
    this.name = name;
    this.status = status;
  }

  public String getName() {
    return name;
  }

  public String getStatus() {
    return status;
  }

  public String getId() {
    return id;
  }

  public static class Builder {
    private String id;
    private String name;
    private String status;

    public Builder id(String id) {
      this.id = id;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder status(String status) {
      this.status = status;
      return this;
    }

    public PreferenceRank build() {
      return new PreferenceRank(id, name, status);
    }
  }
}