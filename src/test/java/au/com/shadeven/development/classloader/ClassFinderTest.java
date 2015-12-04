package au.com.shadeven.development.classloader;

import org.junit.Test;

public class ClassFinderTest {

  @Test
  public void testFind() throws Exception {
    // Arrange

    // Act
    for (Class<?> clazz : ClassFinder.find("au.com.shadeven.development.model")) {
      System.out.println(clazz.getName());
    }

    // Assert
  }
}