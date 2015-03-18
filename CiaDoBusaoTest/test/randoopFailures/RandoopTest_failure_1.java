package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_1.test1");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.test();

  }

}
