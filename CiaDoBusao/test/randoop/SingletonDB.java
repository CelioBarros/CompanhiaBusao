package randoop;
import junit.framework.*;
import junit.textui.*;

public class SingletonDB extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public SingletonDB(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(SingletonDB0.class));
    result.addTest(new TestSuite(SingletonDB1.class));
    result.addTest(new TestSuite(SingletonDB2.class));
    result.addTest(new TestSuite(SingletonDB3.class));
    result.addTest(new TestSuite(SingletonDB4.class));
    result.addTest(new TestSuite(SingletonDB5.class));
    result.addTest(new TestSuite(SingletonDB6.class));
    return result;
  }

}
