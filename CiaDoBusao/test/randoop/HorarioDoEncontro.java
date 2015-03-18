package randoop;
import junit.framework.*;
import junit.textui.*;

public class HorarioDoEncontro extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public HorarioDoEncontro(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(HorarioDoEncontro0.class));
    result.addTest(new TestSuite(HorarioDoEncontro1.class));
    result.addTest(new TestSuite(HorarioDoEncontro2.class));
    result.addTest(new TestSuite(HorarioDoEncontro3.class));
    result.addTest(new TestSuite(HorarioDoEncontro4.class));
    result.addTest(new TestSuite(HorarioDoEncontro5.class));
    result.addTest(new TestSuite(HorarioDoEncontro6.class));
    result.addTest(new TestSuite(HorarioDoEncontro7.class));
    result.addTest(new TestSuite(HorarioDoEncontro8.class));
    result.addTest(new TestSuite(HorarioDoEncontro9.class));
    result.addTest(new TestSuite(HorarioDoEncontro10.class));
    result.addTest(new TestSuite(HorarioDoEncontro11.class));
    result.addTest(new TestSuite(HorarioDoEncontro12.class));
    result.addTest(new TestSuite(HorarioDoEncontro13.class));
    result.addTest(new TestSuite(HorarioDoEncontro14.class));
    result.addTest(new TestSuite(HorarioDoEncontro15.class));
    result.addTest(new TestSuite(HorarioDoEncontro16.class));
    result.addTest(new TestSuite(HorarioDoEncontro17.class));
    result.addTest(new TestSuite(HorarioDoEncontro18.class));
    result.addTest(new TestSuite(HorarioDoEncontro19.class));
    result.addTest(new TestSuite(HorarioDoEncontro20.class));
    result.addTest(new TestSuite(HorarioDoEncontro21.class));
    result.addTest(new TestSuite(HorarioDoEncontro22.class));
    result.addTest(new TestSuite(HorarioDoEncontro23.class));
    result.addTest(new TestSuite(HorarioDoEncontro24.class));
    result.addTest(new TestSuite(HorarioDoEncontro25.class));
    result.addTest(new TestSuite(HorarioDoEncontro26.class));
    result.addTest(new TestSuite(HorarioDoEncontro27.class));
    result.addTest(new TestSuite(HorarioDoEncontro28.class));
    result.addTest(new TestSuite(HorarioDoEncontro29.class));
    result.addTest(new TestSuite(HorarioDoEncontro30.class));
    result.addTest(new TestSuite(HorarioDoEncontro31.class));
    result.addTest(new TestSuite(HorarioDoEncontro32.class));
    result.addTest(new TestSuite(HorarioDoEncontro33.class));
    result.addTest(new TestSuite(HorarioDoEncontro34.class));
    result.addTest(new TestSuite(HorarioDoEncontro35.class));
    result.addTest(new TestSuite(HorarioDoEncontro36.class));
    result.addTest(new TestSuite(HorarioDoEncontro37.class));
    result.addTest(new TestSuite(HorarioDoEncontro38.class));
    result.addTest(new TestSuite(HorarioDoEncontro39.class));
    result.addTest(new TestSuite(HorarioDoEncontro40.class));
    result.addTest(new TestSuite(HorarioDoEncontro41.class));
    result.addTest(new TestSuite(HorarioDoEncontro42.class));
    result.addTest(new TestSuite(HorarioDoEncontro43.class));
    result.addTest(new TestSuite(HorarioDoEncontro44.class));
    result.addTest(new TestSuite(HorarioDoEncontro45.class));
    return result;
  }

}
