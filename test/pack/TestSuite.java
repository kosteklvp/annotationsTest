package pack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pack.TestSuiteAnnotation;

@RunWith(Suite.class)
@SuiteClasses({
    FirstTest.class,
    SecondTest.class
})
@TestSuiteAnnotation
public class TestSuite {

}
