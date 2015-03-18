package randoop;
import junit.framework.*;
import junit.textui.*;

public class DataDoEncontro extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public DataDoEncontro(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(DataDoEncontro0.class));
    result.addTest(new TestSuite(DataDoEncontro1.class));
    result.addTest(new TestSuite(DataDoEncontro2.class));
    result.addTest(new TestSuite(DataDoEncontro3.class));
    result.addTest(new TestSuite(DataDoEncontro4.class));
    result.addTest(new TestSuite(DataDoEncontro5.class));
    result.addTest(new TestSuite(DataDoEncontro6.class));
    result.addTest(new TestSuite(DataDoEncontro7.class));
    result.addTest(new TestSuite(DataDoEncontro8.class));
    result.addTest(new TestSuite(DataDoEncontro9.class));
    result.addTest(new TestSuite(DataDoEncontro10.class));
    result.addTest(new TestSuite(DataDoEncontro11.class));
    result.addTest(new TestSuite(DataDoEncontro12.class));
    result.addTest(new TestSuite(DataDoEncontro13.class));
    result.addTest(new TestSuite(DataDoEncontro14.class));
    result.addTest(new TestSuite(DataDoEncontro15.class));
    result.addTest(new TestSuite(DataDoEncontro16.class));
    result.addTest(new TestSuite(DataDoEncontro17.class));
    result.addTest(new TestSuite(DataDoEncontro18.class));
    result.addTest(new TestSuite(DataDoEncontro19.class));
    result.addTest(new TestSuite(DataDoEncontro20.class));
    result.addTest(new TestSuite(DataDoEncontro21.class));
    result.addTest(new TestSuite(DataDoEncontro22.class));
    result.addTest(new TestSuite(DataDoEncontro23.class));
    result.addTest(new TestSuite(DataDoEncontro24.class));
    result.addTest(new TestSuite(DataDoEncontro25.class));
    result.addTest(new TestSuite(DataDoEncontro26.class));
    result.addTest(new TestSuite(DataDoEncontro27.class));
    result.addTest(new TestSuite(DataDoEncontro28.class));
    result.addTest(new TestSuite(DataDoEncontro29.class));
    result.addTest(new TestSuite(DataDoEncontro30.class));
    result.addTest(new TestSuite(DataDoEncontro31.class));
    result.addTest(new TestSuite(DataDoEncontro32.class));
    result.addTest(new TestSuite(DataDoEncontro33.class));
    result.addTest(new TestSuite(DataDoEncontro34.class));
    result.addTest(new TestSuite(DataDoEncontro35.class));
    result.addTest(new TestSuite(DataDoEncontro36.class));
    result.addTest(new TestSuite(DataDoEncontro37.class));
    result.addTest(new TestSuite(DataDoEncontro38.class));
    result.addTest(new TestSuite(DataDoEncontro39.class));
    result.addTest(new TestSuite(DataDoEncontro40.class));
    result.addTest(new TestSuite(DataDoEncontro41.class));
    result.addTest(new TestSuite(DataDoEncontro42.class));
    result.addTest(new TestSuite(DataDoEncontro43.class));
    result.addTest(new TestSuite(DataDoEncontro44.class));
    result.addTest(new TestSuite(DataDoEncontro45.class));
    result.addTest(new TestSuite(DataDoEncontro46.class));
    result.addTest(new TestSuite(DataDoEncontro47.class));
    result.addTest(new TestSuite(DataDoEncontro48.class));
    result.addTest(new TestSuite(DataDoEncontro49.class));
    result.addTest(new TestSuite(DataDoEncontro50.class));
    result.addTest(new TestSuite(DataDoEncontro51.class));
    result.addTest(new TestSuite(DataDoEncontro52.class));
    result.addTest(new TestSuite(DataDoEncontro53.class));
    result.addTest(new TestSuite(DataDoEncontro54.class));
    result.addTest(new TestSuite(DataDoEncontro55.class));
    result.addTest(new TestSuite(DataDoEncontro56.class));
    result.addTest(new TestSuite(DataDoEncontro57.class));
    result.addTest(new TestSuite(DataDoEncontro58.class));
    result.addTest(new TestSuite(DataDoEncontro59.class));
    result.addTest(new TestSuite(DataDoEncontro60.class));
    result.addTest(new TestSuite(DataDoEncontro61.class));
    result.addTest(new TestSuite(DataDoEncontro62.class));
    result.addTest(new TestSuite(DataDoEncontro63.class));
    result.addTest(new TestSuite(DataDoEncontro64.class));
    result.addTest(new TestSuite(DataDoEncontro65.class));
    result.addTest(new TestSuite(DataDoEncontro66.class));
    return result;
  }

}
