package randoop;
import junit.framework.*;
import junit.textui.*;

public class Encontro extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public Encontro(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(Encontro0.class));
    result.addTest(new TestSuite(Encontro1.class));
    result.addTest(new TestSuite(Encontro2.class));
    result.addTest(new TestSuite(Encontro3.class));
    result.addTest(new TestSuite(Encontro4.class));
    result.addTest(new TestSuite(Encontro5.class));
    result.addTest(new TestSuite(Encontro6.class));
    result.addTest(new TestSuite(Encontro7.class));
    result.addTest(new TestSuite(Encontro8.class));
    result.addTest(new TestSuite(Encontro9.class));
    result.addTest(new TestSuite(Encontro10.class));
    result.addTest(new TestSuite(Encontro11.class));
    result.addTest(new TestSuite(Encontro12.class));
    result.addTest(new TestSuite(Encontro13.class));
    result.addTest(new TestSuite(Encontro14.class));
    result.addTest(new TestSuite(Encontro15.class));
    result.addTest(new TestSuite(Encontro16.class));
    result.addTest(new TestSuite(Encontro17.class));
    result.addTest(new TestSuite(Encontro18.class));
    result.addTest(new TestSuite(Encontro19.class));
    result.addTest(new TestSuite(Encontro20.class));
    result.addTest(new TestSuite(Encontro21.class));
    result.addTest(new TestSuite(Encontro22.class));
    result.addTest(new TestSuite(Encontro23.class));
    result.addTest(new TestSuite(Encontro24.class));
    result.addTest(new TestSuite(Encontro25.class));
    result.addTest(new TestSuite(Encontro26.class));
    result.addTest(new TestSuite(Encontro27.class));
    result.addTest(new TestSuite(Encontro28.class));
    result.addTest(new TestSuite(Encontro29.class));
    result.addTest(new TestSuite(Encontro30.class));
    result.addTest(new TestSuite(Encontro31.class));
    result.addTest(new TestSuite(Encontro32.class));
    result.addTest(new TestSuite(Encontro33.class));
    result.addTest(new TestSuite(Encontro34.class));
    result.addTest(new TestSuite(Encontro35.class));
    result.addTest(new TestSuite(Encontro36.class));
    result.addTest(new TestSuite(Encontro37.class));
    result.addTest(new TestSuite(Encontro38.class));
    return result;
  }

}
