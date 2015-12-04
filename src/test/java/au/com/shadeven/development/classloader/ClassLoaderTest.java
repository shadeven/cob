package au.com.shadeven.development.classloader;

import org.junit.Test;

public class ClassLoaderTest {

  @Test
  public final void testClassLoading() throws ClassNotFoundException {
    // Arrange
    final String className = "au.com.shadeven.development.classloader.SimpleClassLoader";

    // Act
    final Class<SimpleClassLoader> aClass = SimpleClassLoader.class;
    final Class<? extends ClassLoader> aClass1 = aClass.getClassLoader().getClass();

//    final Class<?> clazz = Class.forName(className);
//    final Class<?> loadClass = ClassLoader.getSystemClassLoader().getParent().loadClass(className);

    // Assert
//    assertEquals(clazz, loadClass);
  }
}
