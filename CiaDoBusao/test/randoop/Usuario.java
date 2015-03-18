package randoop;
import junit.framework.*;
import junit.textui.*;

public class Usuario extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public Usuario(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(Usuario0.class));
    result.addTest(new TestSuite(Usuario1.class));
    result.addTest(new TestSuite(Usuario2.class));
    result.addTest(new TestSuite(Usuario3.class));
    result.addTest(new TestSuite(Usuario4.class));
    result.addTest(new TestSuite(Usuario5.class));
    result.addTest(new TestSuite(Usuario6.class));
    result.addTest(new TestSuite(Usuario7.class));
    result.addTest(new TestSuite(Usuario8.class));
    result.addTest(new TestSuite(Usuario9.class));
    result.addTest(new TestSuite(Usuario10.class));
    result.addTest(new TestSuite(Usuario11.class));
    result.addTest(new TestSuite(Usuario12.class));
    result.addTest(new TestSuite(Usuario13.class));
    result.addTest(new TestSuite(Usuario14.class));
    result.addTest(new TestSuite(Usuario15.class));
    result.addTest(new TestSuite(Usuario16.class));
    result.addTest(new TestSuite(Usuario17.class));
    result.addTest(new TestSuite(Usuario18.class));
    result.addTest(new TestSuite(Usuario19.class));
    result.addTest(new TestSuite(Usuario20.class));
    result.addTest(new TestSuite(Usuario21.class));
    result.addTest(new TestSuite(Usuario22.class));
    result.addTest(new TestSuite(Usuario23.class));
    result.addTest(new TestSuite(Usuario24.class));
    result.addTest(new TestSuite(Usuario25.class));
    result.addTest(new TestSuite(Usuario26.class));
    result.addTest(new TestSuite(Usuario27.class));
    result.addTest(new TestSuite(Usuario28.class));
    result.addTest(new TestSuite(Usuario29.class));
    result.addTest(new TestSuite(Usuario30.class));
    result.addTest(new TestSuite(Usuario31.class));
    result.addTest(new TestSuite(Usuario32.class));
    result.addTest(new TestSuite(Usuario33.class));
    result.addTest(new TestSuite(Usuario34.class));
    result.addTest(new TestSuite(Usuario35.class));
    result.addTest(new TestSuite(Usuario36.class));
    result.addTest(new TestSuite(Usuario37.class));
    result.addTest(new TestSuite(Usuario38.class));
    result.addTest(new TestSuite(Usuario39.class));
    result.addTest(new TestSuite(Usuario40.class));
    return result;
  }

}
