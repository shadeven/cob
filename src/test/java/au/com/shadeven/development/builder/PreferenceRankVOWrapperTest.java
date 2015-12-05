package au.com.shadeven.development.builder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class PreferenceRankVOWrapperTest {

  @Test
  public final void test() {
    // Act
    PreferenceRankVO rank = new PreferenceRankVOWrapper.Builder()
            .name("Steven")
            .status("Active")
            .build();

    // Assert
    assertThat(rank, is(notNullValue()));
  }
}