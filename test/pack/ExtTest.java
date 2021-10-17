package pack;

import java.util.Arrays;

import org.junit.Before;

public class ExtTest {

  @Before
  public void beforeMethod() {
    System.out.println("Annotations from " + this.getClass());
    Arrays.asList(this.getClass().getAnnotations()).forEach(System.out::println);
  }

}
