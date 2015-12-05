package au.com.shadeven.development.builder;

public final class PreferenceRankVOWrapper {

	private PreferenceRankVO rank;

  public static class Builder {
    private String id;
    private String name;
    private String status;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder status(String status) {
      this.status = status;
      return this;
    }

    public PreferenceRankVO build() {
      final PreferenceRankVO rankVO = new PreferenceRankVO();
      rankVO.setId(id);
      rankVO.setName(name);
      rankVO.setStatus(status);
      return rankVO;
    }
  }
}
