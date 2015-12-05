package au.com.shadeven.development.builder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class PreferenceRankVOTest {

  @Test
  public final void shouldReturnPreferenceRank() {
    // Act
    PreferenceRank rank = new PreferenceRank.Builder()
            .id("2337447329")
            .name("Steven")
            .status("Active")
            .build();

    // Assert
    assertThat(rank, is(notNullValue()));
    assertThat(rank.getName(), is("Steven"));
    assertThat(rank.getStatus(), is("Active"));
    assertThat(rank.getId(), is("2337447329"));
  }
}
