package pack;

import java.util.Arrays;

import org.junit.Test;

@SecondAnnotation
public class SecondTest extends ExtTest {

  @Test
  public void test() {
    System.out.println("Annotations from " + this.getClass());
    Arrays.asList(this.getClass().getAnnotations()).forEach(System.out::println);
  }

}
