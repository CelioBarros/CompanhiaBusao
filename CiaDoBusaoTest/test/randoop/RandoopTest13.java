package randoop;

import junit.framework.*;

public class RandoopTest13 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test1");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var1);
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var7 = var1.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var1);
    java.lang.String var9 = var1.getName();
    junit.framework.Assert.assertNotNull((java.lang.Object)var1);
    var1.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
    java.lang.String var13 = var1.getName();
    var1.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>"+ "'", var13.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test2");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getName();
    var1.test();
    var1.setName("");
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    junit.framework.TestResult var12 = var10.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var10);
    var10.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    var10.setName("hi! expected:<100> but was:<10>");
    com.application.ciadobusao.test.EncontroTeste var18 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var19 = var18.toString();
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var21 = var20.run();
    var18.run(var21);
    com.application.ciadobusao.test.EncontroTeste var24 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var25 = var24.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var24);
    java.lang.String var27 = var24.toString();
    int var28 = var24.countTestCases();
    int var29 = var24.countTestCases();
    java.lang.String var30 = var24.getName();
    junit.framework.Assert.assertNotSame((java.lang.Object)var21, (java.lang.Object)var24);
    var10.run(var21);
    var1.run(var21);
    com.application.ciadobusao.test.EncontroTeste var36 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var37 = var36.toString();
    com.application.ciadobusao.test.EncontroTeste var38 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var39 = var38.run();
    var36.run(var39);
    com.application.ciadobusao.test.EncontroTeste var41 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var42 = var41.run();
    com.application.ciadobusao.test.EncontroTeste var43 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var44 = var43.run();
    var43.test();
    junit.framework.TestResult var46 = var43.run();
    var41.run(var46);
    var36.run(var46);
    java.lang.String var49 = var36.toString();
    int var50 = var36.countTestCases();
    var36.test();
    int var52 = var36.countTestCases();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var36);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var36);
    var36.setName(" expected:<10> but was:<10>");
    int var57 = var36.countTestCases();
    junit.framework.Assert.assertNotSame("hi! expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1, (java.lang.Object)var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var27.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var37.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var49.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test3");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    junit.framework.TestResult var6 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    var7.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var11 = var7.countTestCases();
    int var12 = var7.countTestCases();
    java.lang.String var13 = var7.getName();
    java.lang.String var14 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var6, (java.lang.Object)var7);
    junit.framework.TestResult var15 = var7.run();
    com.application.ciadobusao.test.EncontroTeste var18 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var19 = var18.run();
    var18.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var18, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var23 = var18.getName();
    junit.framework.TestResult var24 = var18.run();
    var18.test();
    junit.framework.TestResult var26 = var18.run();
    var18.setName("hi! expected:<100> but was:<10> expected:<hi! expected:<100> but was:<10>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
    com.application.ciadobusao.test.EncontroTeste var29 = new com.application.ciadobusao.test.EncontroTeste();
    int var30 = var29.countTestCases();
    java.lang.String var31 = var29.getName();
    junit.framework.TestResult var32 = var29.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var29);
    var29.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
    var29.test();
    int var37 = var29.countTestCases();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var18, (java.lang.Object)var37);
    int var39 = var18.countTestCases();
    int var40 = var18.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var42 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var43 = var42.toString();
    com.application.ciadobusao.test.EncontroTeste var44 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var45 = var44.run();
    var42.run(var45);
    com.application.ciadobusao.test.EncontroTeste var47 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var48 = var47.run();
    com.application.ciadobusao.test.EncontroTeste var49 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var50 = var49.run();
    var49.test();
    junit.framework.TestResult var52 = var49.run();
    var47.run(var52);
    var42.run(var52);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var42);
    var42.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var58 = var42.toString();
    java.lang.String var59 = var42.getName();
    com.application.ciadobusao.test.EncontroTeste var60 = new com.application.ciadobusao.test.EncontroTeste();
    int var61 = var60.countTestCases();
    java.lang.String var62 = var60.getName();
    int var63 = var60.countTestCases();
    java.lang.String var64 = var60.getName();
    junit.framework.Assert.assertNotSame((java.lang.Object)var60, (java.lang.Object)true);
    junit.framework.TestResult var67 = var60.run();
    junit.framework.TestResult var68 = var60.run();
    java.lang.Object var70 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var71 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var70, (java.lang.Object)var71);
    java.lang.String var73 = var71.toString();
    java.lang.String var74 = var71.toString();
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var71);
    junit.framework.TestResult var76 = var71.run();
    var60.run(var76);
    var42.run(var76);
    var18.run(var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var7, (java.lang.Object)var76);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var43.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var58.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var59.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var73.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var74.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test4");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>>> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>> but was:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)>", (-1.0f), 0.0f, 1.0f);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test5");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var2);
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var8 = var2.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    var11.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var11, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var16 = var11.getName();
    junit.framework.TestResult var17 = var11.run();
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var21 = var20.run();
    junit.framework.TestResult var22 = var20.run();
    junit.framework.TestResult var23 = var20.run();
    com.application.ciadobusao.test.EncontroTeste var25 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var26 = var25.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var25);
    java.lang.String var28 = var25.toString();
    java.lang.String var29 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var23, (java.lang.Object)var25);
    com.application.ciadobusao.test.EncontroTeste var30 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var31 = var30.run();
    junit.framework.TestResult var32 = var30.run();
    java.lang.String var33 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var23, (java.lang.Object)var32);
    java.lang.Object var34 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var35 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var34, (java.lang.Object)var35);
    junit.framework.TestResult var37 = var35.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var32, (java.lang.Object)var35);
    var11.run(var32);
    var2.run(var32);
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
    java.lang.String var43 = var2.toString();
    int var44 = var2.countTestCases();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var28.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var43.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:< expected:<10> but was:<10>> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test7");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var7 = var6.toString();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var6.run(var9);
    var2.run(var9);
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    var14.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
    var14.test();
    java.lang.String var19 = var14.getName();
    com.application.ciadobusao.test.EncontroTeste var21 = new com.application.ciadobusao.test.EncontroTeste();
    int var22 = var21.countTestCases();
    java.lang.String var23 = var21.getName();
    junit.framework.TestResult var24 = var21.run();
    int var25 = var21.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var26 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var27 = var26.toString();
    com.application.ciadobusao.test.EncontroTeste var28 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var29 = var28.run();
    var26.run(var29);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var21, (java.lang.Object)var29);
    int var32 = var21.countTestCases();
    java.lang.Object var33 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var34 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var33, (java.lang.Object)var34);
    java.lang.String var36 = var34.toString();
    junit.framework.TestResult var37 = var34.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var21, (java.lang.Object)var37);
    var21.test();
    junit.framework.Assert.assertNotNull((java.lang.Object)var21);
    junit.framework.Assert.assertNotSame((java.lang.Object)var14, (java.lang.Object)var21);
    com.application.ciadobusao.test.EncontroTeste var42 = new com.application.ciadobusao.test.EncontroTeste();
    int var43 = var42.countTestCases();
    java.lang.String var44 = var42.getName();
    junit.framework.TestResult var45 = var42.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var42);
    junit.framework.TestResult var47 = var42.run();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<1> but was:<10>", (java.lang.Object)var14, (java.lang.Object)var47);
    var14.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2, (java.lang.Object)var14);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var27.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var36.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test8");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>>", (-1.0d), 100.0d, (-1.0d));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test9");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var4 = var3.toString();
    var3.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var7 = var3.run();
    java.lang.String var8 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)(byte)10, (java.lang.Object)var3);
    java.lang.String var9 = var3.getName();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    junit.framework.TestResult var13 = var11.run();
    junit.framework.TestResult var14 = var11.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var11);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    junit.framework.TestResult var18 = var16.run();
    junit.framework.TestResult var19 = var16.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var11, (java.lang.Object)var16);
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var23 = var22.run();
    junit.framework.TestResult var24 = var22.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var22);
    com.application.ciadobusao.test.EncontroTeste var27 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var28 = var27.toString();
    com.application.ciadobusao.test.EncontroTeste var29 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var30 = var29.run();
    var27.run(var30);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var30);
    var22.run(var30);
    junit.framework.TestResult var34 = var22.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var34);
    var16.run(var34);
    var3.run(var34);
    int var38 = var3.countTestCases();
    junit.framework.TestResult var39 = var3.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<100> but was:<10>> but was:<1> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<1>", (java.lang.Object)var39);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + " expected:<10> but was:<10>"+ "'", var9.equals(" expected:<10> but was:<10>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var28.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test10");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var6 = var2.countTestCases();
    java.lang.String var8 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)true);
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    junit.framework.TestResult var11 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var13 = var12.toString();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    var12.run(var15);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test11");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    junit.framework.TestResult var6 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    junit.framework.TestResult var11 = var9.run();
    junit.framework.TestResult var12 = var9.run();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var14);
    java.lang.String var17 = var14.toString();
    java.lang.String var18 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var12, (java.lang.Object)var14);
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var20 = var19.run();
    junit.framework.TestResult var21 = var19.run();
    java.lang.String var22 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var12, (java.lang.Object)var21);
    var2.run(var12);
    java.lang.String var24 = var2.getName();
    com.application.ciadobusao.test.EncontroTeste var26 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var27 = var26.run();
    junit.framework.TestResult var28 = var26.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var26);
    var26.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var32 = var26.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var26);
    com.application.ciadobusao.test.EncontroTeste var35 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var36 = var35.run();
    var35.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var35, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var40 = var35.getName();
    junit.framework.TestResult var41 = var35.run();
    com.application.ciadobusao.test.EncontroTeste var44 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var45 = var44.run();
    junit.framework.TestResult var46 = var44.run();
    junit.framework.TestResult var47 = var44.run();
    com.application.ciadobusao.test.EncontroTeste var49 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var50 = var49.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var49);
    java.lang.String var52 = var49.toString();
    java.lang.String var53 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var47, (java.lang.Object)var49);
    com.application.ciadobusao.test.EncontroTeste var54 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var55 = var54.run();
    junit.framework.TestResult var56 = var54.run();
    java.lang.String var57 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var47, (java.lang.Object)var56);
    java.lang.Object var58 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var59 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var58, (java.lang.Object)var59);
    junit.framework.TestResult var61 = var59.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var56, (java.lang.Object)var59);
    var35.run(var56);
    var26.run(var56);
    junit.framework.Assert.assertNotNull((java.lang.Object)var26);
    junit.framework.Assert.assertNotSame("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var24, (java.lang.Object)var26);
    java.lang.String var67 = var26.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0> expected:<1> but was:<0>", (java.lang.Object)var67);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var17.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var24.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var52.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var67.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test12");


    junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", 1.0f, 1.0f, 100.0f);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test13");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    int var1 = var0.countTestCases();
    java.lang.String var2 = var0.getName();
    int var3 = var0.countTestCases();
    java.lang.String var4 = var0.getName();
    junit.framework.Assert.assertNotSame((java.lang.Object)var0, (java.lang.Object)true);
    junit.framework.TestResult var7 = var0.run();
    junit.framework.TestResult var8 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    java.lang.String var11 = var9.toString();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var13 = var12.toString();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    var12.run(var15);
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var18 = var17.run();
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var20 = var19.run();
    var19.test();
    junit.framework.TestResult var22 = var19.run();
    var17.run(var22);
    var12.run(var22);
    var9.run(var22);
    com.application.ciadobusao.test.EncontroTeste var28 = new com.application.ciadobusao.test.EncontroTeste();
    int var29 = var28.countTestCases();
    java.lang.String var30 = var28.getName();
    junit.framework.TestResult var31 = var28.run();
    int var32 = var28.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var33 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var34 = var33.toString();
    com.application.ciadobusao.test.EncontroTeste var35 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var36 = var35.run();
    var33.run(var36);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var28, (java.lang.Object)var36);
    int var39 = var28.countTestCases();
    java.lang.Object var40 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var41 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var40, (java.lang.Object)var41);
    java.lang.String var43 = var41.toString();
    junit.framework.TestResult var44 = var41.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var28, (java.lang.Object)var44);
    junit.framework.Assert.assertNotSame((java.lang.Object)(short)100, (java.lang.Object)var44);
    var9.run(var44);
    junit.framework.TestResult var48 = var9.run();
    var9.test();
    junit.framework.Assert.assertNotSame((java.lang.Object)var0, (java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var34.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var43.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test14");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var3);
    java.lang.String var6 = var3.toString();
    var3.test();
    junit.framework.TestResult var8 = var3.run();
    junit.framework.TestResult var9 = var3.run();
    var3.test();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    var12.test();
    junit.framework.TestResult var15 = var12.run();
    com.application.ciadobusao.test.EncontroTeste var18 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var19 = var18.run();
    junit.framework.TestResult var20 = var18.run();
    junit.framework.TestResult var21 = var18.run();
    com.application.ciadobusao.test.EncontroTeste var23 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var24 = var23.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var23);
    java.lang.String var26 = var23.toString();
    java.lang.String var27 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var21, (java.lang.Object)var23);
    com.application.ciadobusao.test.EncontroTeste var28 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var29 = var28.run();
    junit.framework.TestResult var30 = var28.run();
    java.lang.String var31 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var21, (java.lang.Object)var30);
    var12.run(var30);
    var12.test();
    java.lang.String var34 = var12.getName();
    com.application.ciadobusao.test.EncontroTeste var35 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var36 = var35.toString();
    com.application.ciadobusao.test.EncontroTeste var37 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var38 = var37.run();
    var35.run(var38);
    var35.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var12, (java.lang.Object)var35);
    var35.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
    junit.framework.TestResult var44 = var35.run();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var3, (java.lang.Object)var44);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var44);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var26.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var36.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test15");


    junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >>(com.application.ciadobusao.test.EncontroTeste)", 'a', 'a');

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test16");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var4 = var0.run();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var7 = var0.toString();
    int var8 = var0.countTestCases();
    var0.setName("hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >>");
    java.lang.String var11 = var0.toString();
    junit.framework.Assert.assertNotNull((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >>(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test17");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>> expected:<> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test18");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var6);
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var12 = var11.toString();
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    var11.run(var14);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var14);
    var6.run(var14);
    var6.test();
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var21 = var20.toString();
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var23 = var22.run();
    var20.run(var23);
    com.application.ciadobusao.test.EncontroTeste var25 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var26 = var25.run();
    com.application.ciadobusao.test.EncontroTeste var27 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var28 = var27.run();
    var27.test();
    junit.framework.TestResult var30 = var27.run();
    var25.run(var30);
    var20.run(var30);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var20);
    var20.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var36 = var20.toString();
    junit.framework.Assert.assertNotSame((java.lang.Object)var6, (java.lang.Object)var20);
    junit.framework.Assert.assertNotSame("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var1, (java.lang.Object)var6);
    java.lang.Object var39 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var40 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var39, (java.lang.Object)var40);
    java.lang.String var42 = var40.toString();
    java.lang.String var43 = var40.toString();
    var40.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
    junit.framework.Assert.assertNotSame((java.lang.Object)"hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var40);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var21.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var36.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var42.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var43.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test19");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", " expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test20");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    junit.framework.TestResult var5 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    junit.framework.TestResult var10 = var8.run();
    junit.framework.TestResult var11 = var8.run();
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var13);
    java.lang.String var16 = var13.toString();
    java.lang.String var17 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var11, (java.lang.Object)var13);
    com.application.ciadobusao.test.EncontroTeste var18 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var19 = var18.run();
    junit.framework.TestResult var20 = var18.run();
    java.lang.String var21 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var11, (java.lang.Object)var20);
    var1.run(var11);
    java.lang.String var23 = var1.getName();
    java.lang.String var24 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var25 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var26 = var25.run();
    var25.test();
    junit.framework.TestResult var28 = var25.run();
    com.application.ciadobusao.test.EncontroTeste var31 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var32 = var31.run();
    junit.framework.TestResult var33 = var31.run();
    junit.framework.TestResult var34 = var31.run();
    com.application.ciadobusao.test.EncontroTeste var36 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var37 = var36.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var36);
    java.lang.String var39 = var36.toString();
    java.lang.String var40 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var34, (java.lang.Object)var36);
    com.application.ciadobusao.test.EncontroTeste var41 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var42 = var41.run();
    junit.framework.TestResult var43 = var41.run();
    java.lang.String var44 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var34, (java.lang.Object)var43);
    var25.run(var43);
    var25.test();
    var25.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
    java.lang.String var49 = junit.framework.Assert.format("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var24, (java.lang.Object)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var24.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var39.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var49.equals("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)>"));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test21");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    int var3 = var2.countTestCases();
    java.lang.String var4 = var2.getName();
    junit.framework.TestResult var5 = var2.run();
    int var6 = var2.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var7.run(var10);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)var10);
    int var13 = var2.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotNull((java.lang.Object)var14);
    java.lang.String var16 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)var14);
    java.lang.String var17 = var2.getName();
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var20 = var19.toString();
    var19.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var23 = var19.run();
    var19.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var26 = var19.toString();
    int var27 = var19.countTestCases();
    java.lang.String var28 = var19.getName();
    var19.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
    junit.framework.TestResult var31 = var19.run();
    com.application.ciadobusao.test.EncontroTeste var32 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var33 = var32.toString();
    com.application.ciadobusao.test.EncontroTeste var34 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var35 = var34.run();
    var32.run(var35);
    com.application.ciadobusao.test.EncontroTeste var37 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var38 = var37.run();
    com.application.ciadobusao.test.EncontroTeste var39 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var40 = var39.run();
    var39.test();
    junit.framework.TestResult var42 = var39.run();
    var37.run(var42);
    var32.run(var42);
    java.lang.String var45 = var32.toString();
    java.lang.Object var46 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var47 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var46, (java.lang.Object)var47);
    java.lang.String var49 = var47.toString();
    junit.framework.TestResult var50 = var47.run();
    com.application.ciadobusao.test.EncontroTeste var52 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var53 = var52.run();
    var52.test();
    java.lang.String var55 = var52.toString();
    com.application.ciadobusao.test.EncontroTeste var56 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var57 = var56.run();
    junit.framework.TestResult var58 = var56.run();
    junit.framework.TestResult var59 = var56.run();
    var52.run(var59);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var52, (java.lang.Object)(byte)100);
    junit.framework.Assert.assertNotSame((java.lang.Object)var50, (java.lang.Object)(byte)100);
    junit.framework.Assert.assertNotSame((java.lang.Object)var50, (java.lang.Object)0.0f);
    var32.run(var50);
    com.application.ciadobusao.test.EncontroTeste var67 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var68 = var67.run();
    var67.test();
    junit.framework.TestResult var70 = var67.run();
    int var71 = var67.countTestCases();
    var67.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
    com.application.ciadobusao.test.EncontroTeste var75 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var76 = var75.run();
    junit.framework.TestResult var77 = var75.run();
    junit.framework.TestResult var78 = var75.run();
    java.lang.Object var81 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var82 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var81, (java.lang.Object)var82);
    java.lang.String var84 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var82);
    java.lang.String var85 = var82.getName();
    junit.framework.Assert.assertNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var78, (java.lang.Object)var82);
    var67.run(var78);
    junit.framework.Assert.assertNotSame((java.lang.Object)var50, (java.lang.Object)var67);
    junit.framework.Assert.assertNotNull((java.lang.Object)var67);
    java.lang.String var90 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)var19, (java.lang.Object)var67);
    java.lang.String var91 = var19.getName();
    junit.framework.Assert.assertNotSame((java.lang.Object)var2, (java.lang.Object)var91);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var20.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var26.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var28.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var33.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var45.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var49.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var55.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var76);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var84.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var90.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var91 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>"+ "'", var91.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>"));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test22");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    java.lang.String var3 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var5 = var4.toString();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    var4.run(var7);
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    var11.test();
    junit.framework.TestResult var14 = var11.run();
    var9.run(var14);
    var4.run(var14);
    var1.run(var14);
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    int var21 = var20.countTestCases();
    java.lang.String var22 = var20.getName();
    junit.framework.TestResult var23 = var20.run();
    int var24 = var20.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var25 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var26 = var25.toString();
    com.application.ciadobusao.test.EncontroTeste var27 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var28 = var27.run();
    var25.run(var28);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var20, (java.lang.Object)var28);
    int var31 = var20.countTestCases();
    java.lang.Object var32 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var33 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var32, (java.lang.Object)var33);
    java.lang.String var35 = var33.toString();
    junit.framework.TestResult var36 = var33.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var20, (java.lang.Object)var36);
    junit.framework.Assert.assertNotSame((java.lang.Object)(short)100, (java.lang.Object)var36);
    var1.run(var36);
    junit.framework.TestResult var40 = var1.run();
    int var41 = var1.countTestCases();
    var1.test();
    com.application.ciadobusao.test.EncontroTeste var46 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var47 = var46.toString();
    com.application.ciadobusao.test.EncontroTeste var48 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var49 = var48.run();
    var46.run(var49);
    com.application.ciadobusao.test.EncontroTeste var51 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var52 = var51.run();
    com.application.ciadobusao.test.EncontroTeste var53 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var54 = var53.run();
    var53.test();
    junit.framework.TestResult var56 = var53.run();
    var51.run(var56);
    var46.run(var56);
    java.lang.String var59 = var46.toString();
    int var60 = var46.countTestCases();
    var46.test();
    int var62 = var46.countTestCases();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var46);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var46);
    var46.setName(" expected:<10> but was:<10>");
    com.application.ciadobusao.test.EncontroTeste var67 = new com.application.ciadobusao.test.EncontroTeste();
    int var68 = var67.countTestCases();
    java.lang.String var69 = var67.getName();
    junit.framework.TestResult var70 = var67.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var67);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)" expected:<10> but was:<10>", (java.lang.Object)var67);
    java.lang.String var73 = var67.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>> but was:<100>", (java.lang.Object)var1, (java.lang.Object)var67);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var26.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var35.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var47.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var59.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var73.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test23");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)>", 0L, 0L);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test24");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var2.run(var5);
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var9.test();
    junit.framework.TestResult var12 = var9.run();
    var7.run(var12);
    var2.run(var12);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var2);
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var18 = var2.getName();
    int var19 = var2.countTestCases();
    junit.framework.TestResult var20 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var23 = var22.run();
    junit.framework.TestResult var24 = var22.run();
    junit.framework.TestResult var25 = var22.run();
    var22.test();
    junit.framework.Assert.assertNotNull("", (java.lang.Object)var22);
    java.lang.String var28 = var22.toString();
    junit.framework.TestResult var29 = var22.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<1> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<100> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>> expected:<10.0> but was:<1>> but was:<hi! expected:<100> but was:<10> expected:<hi! expected:<100> but was:<10>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>>", (java.lang.Object)var20, (java.lang.Object)var29);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var28.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test25");


    junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 1.0f, (-1.0f), 10.0f);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test26");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var3.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var3, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var8 = var3.getName();
    var3.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    int var13 = var12.countTestCases();
    java.lang.String var14 = var12.getName();
    junit.framework.TestResult var15 = var12.run();
    int var16 = var12.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var18 = var17.toString();
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var20 = var19.run();
    var17.run(var20);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var12, (java.lang.Object)var20);
    java.lang.String var23 = junit.framework.Assert.format("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var12);
    java.lang.Object var26 = new java.lang.Object();
    junit.framework.Assert.assertNotSame("hi! expected:<100> but was:<10>", (java.lang.Object)1.0d, var26);
    junit.framework.Assert.assertNotNull(var26);
    java.lang.String var29 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var12, var26);
    java.lang.Object var31 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var32 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var31, (java.lang.Object)var32);
    java.lang.String var34 = var32.toString();
    java.lang.String var35 = var32.toString();
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var32);
    junit.framework.TestResult var37 = var32.run();
    var12.run(var37);
    com.application.ciadobusao.test.EncontroTeste var40 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var41 = var40.run();
    junit.framework.TestResult var42 = var40.run();
    junit.framework.TestResult var43 = var40.run();
    java.lang.Object var46 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var47 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var46, (java.lang.Object)var47);
    java.lang.String var49 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var47);
    java.lang.String var50 = var47.getName();
    junit.framework.Assert.assertNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var43, (java.lang.Object)var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var12, (java.lang.Object)var47);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var23.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var34.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var35.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var49.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test27");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var4 = var3.toString();
    var3.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var7 = var3.countTestCases();
    java.lang.String var9 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var3, (java.lang.Object)true);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    junit.framework.TestResult var12 = var3.run();
    java.lang.String var13 = var3.getName();
    java.lang.Object var15 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var15, (java.lang.Object)var16);
    java.lang.String var18 = var16.getName();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var16, (java.lang.Object)1);
    int var21 = var16.countTestCases();
    java.lang.String var22 = var16.toString();
    java.lang.String var23 = junit.framework.Assert.format("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var3, (java.lang.Object)var16);
    java.lang.Object var24 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var25 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var24, (java.lang.Object)var25);
    java.lang.String var27 = var25.toString();
    junit.framework.TestResult var28 = var25.run();
    var3.run(var28);
    com.application.ciadobusao.test.EncontroTeste var31 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var32 = var31.run();
    com.application.ciadobusao.test.EncontroTeste var33 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var34 = var33.run();
    var33.test();
    junit.framework.TestResult var36 = var33.run();
    var31.run(var36);
    junit.framework.TestResult var38 = var31.run();
    java.lang.String var39 = var31.getName();
    java.lang.String var40 = var31.getName();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)var31);
    junit.framework.TestResult var42 = var31.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals(" expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<0.0> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>>", (java.lang.Object)var3, (java.lang.Object)var31);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var22.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var23.equals("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var27.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test28");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:< expected:<10> but was:<10>> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test29");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<1> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<100> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>>> but was:<1>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test30");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>>>", true, true);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test31");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    java.lang.String var3 = var0.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var5 = var4.toString();
    var4.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var8 = var4.countTestCases();
    int var9 = var4.countTestCases();
    junit.framework.Assert.assertNotSame((java.lang.Object)var0, (java.lang.Object)var9);
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    junit.framework.TestResult var13 = var11.run();
    junit.framework.TestResult var14 = var11.run();
    var11.test();
    var11.test();
    junit.framework.Assert.assertNotSame((java.lang.Object)var0, (java.lang.Object)var11);
    java.lang.String var18 = var11.getName();
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var21 = var20.run();
    var20.test();
    java.lang.String var23 = var20.toString();
    java.lang.String var24 = var20.getName();
    int var25 = var20.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var28 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var29 = var28.run();
    junit.framework.TestResult var30 = var28.run();
    junit.framework.TestResult var31 = var28.run();
    var28.test();
    junit.framework.Assert.assertNotNull("", (java.lang.Object)var28);
    int var34 = var28.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var35 = new com.application.ciadobusao.test.EncontroTeste();
    int var36 = var35.countTestCases();
    java.lang.String var37 = var35.getName();
    junit.framework.TestResult var38 = var35.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var35);
    var35.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
    junit.framework.Assert.assertNotSame("hi! expected:<100> but was:<10> expected:<hi! expected:<100> but was:<10>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var28, (java.lang.Object)var35);
    junit.framework.Assert.assertNotSame("hi!", (java.lang.Object)var20, (java.lang.Object)var35);
    com.application.ciadobusao.test.EncontroTeste var47 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var48 = var47.toString();
    var47.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var51 = var47.countTestCases();
    java.lang.String var53 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var47, (java.lang.Object)true);
    java.lang.String var54 = var47.toString();
    java.lang.String var55 = var47.toString();
    junit.framework.TestResult var56 = var47.run();
    com.application.ciadobusao.test.EncontroTeste var57 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var58 = var57.toString();
    com.application.ciadobusao.test.EncontroTeste var59 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var60 = var59.run();
    var57.run(var60);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var47, (java.lang.Object)var57);
    junit.framework.TestResult var63 = var47.run();
    com.application.ciadobusao.test.EncontroTeste var65 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var66 = var65.toString();
    com.application.ciadobusao.test.EncontroTeste var67 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var68 = var67.run();
    var65.run(var68);
    junit.framework.Assert.assertNotSame("", (java.lang.Object)var68, (java.lang.Object)100.0f);
    java.lang.String var72 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var63, (java.lang.Object)var68);
    var35.run(var63);
    var11.run(var63);
    java.lang.String var75 = var11.toString();
    var11.test();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var48.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var53.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var54.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var55.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var58.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var66.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var75.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test32");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var3.test();
    junit.framework.TestResult var6 = var3.run();
    var1.run(var6);
    junit.framework.TestResult var8 = var1.run();
    java.lang.String var9 = var1.getName();
    var1.setName("hi!");
    java.lang.String var12 = var1.toString();
    int var13 = var1.countTestCases();
    java.lang.String var14 = var1.getName();
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var16);
    junit.framework.TestResult var19 = var16.run();
    junit.framework.TestResult var20 = var16.run();
    var1.run(var20);
    com.application.ciadobusao.test.EncontroTeste var23 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var24 = var23.run();
    junit.framework.TestResult var25 = var23.run();
    junit.framework.TestResult var26 = var23.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var23);
    com.application.ciadobusao.test.EncontroTeste var28 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var29 = var28.run();
    junit.framework.TestResult var30 = var28.run();
    junit.framework.TestResult var31 = var28.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var23, (java.lang.Object)var28);
    com.application.ciadobusao.test.EncontroTeste var34 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var35 = var34.run();
    junit.framework.TestResult var36 = var34.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var34);
    com.application.ciadobusao.test.EncontroTeste var39 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var40 = var39.toString();
    com.application.ciadobusao.test.EncontroTeste var41 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var42 = var41.run();
    var39.run(var42);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var42);
    var34.run(var42);
    junit.framework.TestResult var46 = var34.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var46);
    var28.run(var46);
    com.application.ciadobusao.test.EncontroTeste var50 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var51 = var50.run();
    junit.framework.TestResult var52 = var50.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var50);
    var50.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var56 = var50.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var50);
    java.lang.String var58 = var50.getName();
    junit.framework.Assert.assertNotNull((java.lang.Object)var50);
    junit.framework.TestResult var60 = var50.run();
    var28.run(var60);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1, (java.lang.Object)var28);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("hi!(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var40.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var58.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test33");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<100> but was:<10>> but was:<1>", (-1.0d), 100.0d, 100.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test34");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    junit.framework.TestResult var9 = var7.run();
    junit.framework.TestResult var10 = var7.run();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var12);
    java.lang.String var15 = var12.toString();
    java.lang.String var16 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var10, (java.lang.Object)var12);
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var18 = var17.run();
    junit.framework.TestResult var19 = var17.run();
    java.lang.String var20 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var10, (java.lang.Object)var19);
    var1.run(var19);
    java.lang.String var22 = var1.getName();
    var1.test();
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste) expected:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>>>", (java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", '#', 'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test36");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var6 = var1.getName();
    junit.framework.TestResult var7 = var1.run();
    java.lang.String var8 = var1.getName();
    var1.test();
    java.lang.String var10 = var1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test37");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    int var6 = var2.countTestCases();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)0L, (java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var10 = var9.toString();
    var9.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var13 = var9.countTestCases();
    java.lang.String var15 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9, (java.lang.Object)true);
    java.lang.String var16 = var9.toString();
    java.lang.String var17 = var9.toString();
    junit.framework.TestResult var18 = var9.run();
    var2.run(var18);
    java.lang.String var20 = var2.getName();
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    java.lang.String var22 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var17.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test38");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    java.lang.String var5 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var3);
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getName();
    int var8 = var3.countTestCases();
    int var9 = var3.countTestCases();
    junit.framework.Assert.assertNotNull((java.lang.Object)var3);
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    var12.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var12, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var17 = var12.getName();
    junit.framework.TestResult var18 = var12.run();
    var12.test();
    junit.framework.TestResult var20 = var12.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var3, (java.lang.Object)var12);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var5.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test39");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0> expected:<1> but was:<1> expected:<-1.0> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (short)10, (short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test40");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0.0f, 1.0f, 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test41");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<1> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<1>>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test42");


    java.lang.Object var3 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var3, (java.lang.Object)var4);
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    var7.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var11 = var7.countTestCases();
    java.lang.String var13 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var7, (java.lang.Object)true);
    java.lang.String var14 = var7.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var4, (java.lang.Object)var14);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var17 = var16.toString();
    var16.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var20 = var16.countTestCases();
    int var21 = var16.countTestCases();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var14, (java.lang.Object)var16);
    junit.framework.TestResult var23 = var16.run();
    com.application.ciadobusao.test.EncontroTeste var26 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var27 = var26.toString();
    junit.framework.TestResult var28 = var26.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var28);
    com.application.ciadobusao.test.EncontroTeste var31 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var32 = var31.run();
    var31.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var31, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var36 = var31.getName();
    var31.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var39 = var31.run();
    junit.framework.TestResult var40 = var31.run();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var31);
    junit.framework.Assert.assertNotSame((java.lang.Object)var16, (java.lang.Object)var31);
    java.lang.String var43 = var16.getName();
    junit.framework.Assert.assertNotNull("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<100> but was:<10>> but was:<1>", (java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var17.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var27.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var43.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test43");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    junit.framework.TestResult var5 = var3.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var3);
    var3.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var9 = var3.run();
    var3.test();
    java.lang.String var11 = var3.toString();
    var3.test();
    junit.framework.Assert.assertNotNull(" expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var3);
    junit.framework.Assert.assertNotNull("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test44");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>>", (byte)0, (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test45");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 1L, 0L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test46");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.TestResult var5 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var7);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var5, (java.lang.Object)var7);
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    junit.framework.TestResult var14 = var12.run();
    java.lang.String var15 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var5, (java.lang.Object)var14);
    java.lang.Object var16 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var16, (java.lang.Object)var17);
    junit.framework.TestResult var19 = var17.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var14, (java.lang.Object)var17);
    com.application.ciadobusao.test.EncontroTeste var21 = new com.application.ciadobusao.test.EncontroTeste();
    int var22 = var21.countTestCases();
    java.lang.String var23 = var21.getName();
    junit.framework.TestResult var24 = var21.run();
    int var25 = var21.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var27 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var28 = var27.toString();
    var27.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var31 = var27.countTestCases();
    java.lang.String var33 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var27, (java.lang.Object)true);
    java.lang.String var34 = var27.toString();
    java.lang.String var35 = var27.toString();
    junit.framework.TestResult var36 = var27.run();
    var21.run(var36);
    var17.run(var36);
    com.application.ciadobusao.test.EncontroTeste var40 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var41 = var40.toString();
    com.application.ciadobusao.test.EncontroTeste var42 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var43 = var42.run();
    var40.run(var43);
    com.application.ciadobusao.test.EncontroTeste var45 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var46 = var45.run();
    com.application.ciadobusao.test.EncontroTeste var47 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var48 = var47.run();
    var47.test();
    junit.framework.TestResult var50 = var47.run();
    var45.run(var50);
    var40.run(var50);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var40);
    var40.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var56 = var40.toString();
    junit.framework.Assert.assertNotSame((java.lang.Object)var17, (java.lang.Object)var56);
    junit.framework.TestResult var58 = var17.run();
    java.lang.String var59 = var17.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var28.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var33.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var34.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var35.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var41.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var56.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var59);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test47");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test48");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var2);
    java.lang.String var7 = var2.getName();
    var2.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
    java.lang.String var10 = var2.getName();
    int var11 = var2.countTestCases();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var10.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test49");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test50");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<1> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<100> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>>> but was:<1>", 'a', ' ');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test51");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var2.run(var5);
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var9.test();
    junit.framework.TestResult var12 = var9.run();
    var7.run(var12);
    var2.run(var12);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var2);
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var18 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var21 = var20.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var20);
    java.lang.String var23 = var20.toString();
    var20.test();
    junit.framework.TestResult var25 = var20.run();
    junit.framework.TestResult var26 = var20.run();
    var20.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
    var20.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var18, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test52");


    java.lang.Object var3 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var3, (java.lang.Object)var4);
    java.lang.String var6 = var4.toString();
    java.lang.String var7 = var4.toString();
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var4);
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var9.test();
    junit.framework.TestResult var12 = var9.run();
    int var13 = var9.countTestCases();
    int var14 = var9.countTestCases();
    junit.framework.TestResult var15 = var9.run();
    java.lang.Object var16 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var16, (java.lang.Object)var17);
    junit.framework.TestResult var19 = var17.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var15, (java.lang.Object)var19);
    java.lang.String var21 = junit.framework.Assert.format("hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"hi!", (java.lang.Object)var15);
    com.application.ciadobusao.test.EncontroTeste var23 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var24 = var23.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var23);
    java.lang.String var26 = var23.toString();
    int var27 = var23.countTestCases();
    int var28 = var23.countTestCases();
    java.lang.String var29 = var23.getName();
    var23.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
    java.lang.String var32 = var23.getName();
    junit.framework.Assert.assertNotNull((java.lang.Object)var23);
    java.lang.String var34 = var23.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< > expected:<> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"hi! expected:<100> but was:<10> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var23);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var26.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var32.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var34.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test53");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
    java.lang.String var5 = var2.toString();
    var2.test();
    junit.framework.TestResult var7 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var9);
    java.lang.String var12 = var9.toString();
    var9.test();
    junit.framework.TestResult var14 = var9.run();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var16 = var15.run();
    var15.test();
    java.lang.String var18 = var15.getName();
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var20 = var19.run();
    var15.run(var20);
    junit.framework.TestResult var22 = var15.run();
    int var23 = var15.countTestCases();
    junit.framework.Assert.assertNotSame((java.lang.Object)var14, (java.lang.Object)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var7, (java.lang.Object)var14);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test54");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var4.test();
    junit.framework.TestResult var7 = var4.run();
    var2.run(var7);
    junit.framework.TestResult var9 = var2.run();
    java.lang.String var10 = var2.getName();
    java.lang.String var11 = var2.getName();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)var2);
    var2.test();
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    int var18 = var17.countTestCases();
    java.lang.String var19 = var17.getName();
    junit.framework.TestResult var20 = var17.run();
    int var21 = var17.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var23 = var22.toString();
    com.application.ciadobusao.test.EncontroTeste var24 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var25 = var24.run();
    var22.run(var25);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var17, (java.lang.Object)var25);
    int var28 = var17.countTestCases();
    java.lang.Object var29 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var30 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var29, (java.lang.Object)var30);
    java.lang.String var32 = var30.toString();
    junit.framework.TestResult var33 = var30.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var17, (java.lang.Object)var33);
    var17.test();
    junit.framework.TestResult var36 = var17.run();
    com.application.ciadobusao.test.EncontroTeste var37 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var38 = var37.run();
    com.application.ciadobusao.test.EncontroTeste var39 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var40 = var39.run();
    var39.test();
    junit.framework.TestResult var42 = var39.run();
    var37.run(var42);
    junit.framework.TestResult var44 = var37.run();
    java.lang.String var45 = var37.getName();
    var37.setName("hi!");
    java.lang.String var48 = var37.toString();
    java.lang.String var49 = var37.getName();
    junit.framework.TestResult var50 = var37.run();
    var17.run(var50);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<1> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<100> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>>", (java.lang.Object)var2, (java.lang.Object)var50);
    var2.setName("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var32.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!(com.application.ciadobusao.test.EncontroTeste)"+ "'", var48.equals("hi!(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "hi!"+ "'", var49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test55");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getName();
    var1.test();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    int var10 = var9.countTestCases();
    java.lang.String var11 = var9.getName();
    junit.framework.TestResult var12 = var9.run();
    int var13 = var9.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var15 = var14.toString();
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    var14.run(var17);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9, (java.lang.Object)var17);
    int var20 = var9.countTestCases();
    java.lang.Object var21 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var21, (java.lang.Object)var22);
    java.lang.String var24 = var22.toString();
    junit.framework.TestResult var25 = var22.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var9, (java.lang.Object)var25);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<1> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var25);
    var1.run(var25);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var24.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test56");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    java.lang.String var5 = var2.getName();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    var2.run(var7);
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    var12.test();
    junit.framework.TestResult var15 = var12.run();
    var10.run(var15);
    junit.framework.TestResult var17 = var10.run();
    java.lang.String var18 = var10.getName();
    var10.setName("hi!");
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var23 = var22.toString();
    var22.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var26 = var22.countTestCases();
    java.lang.String var28 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var22, (java.lang.Object)true);
    java.lang.String var29 = var22.toString();
    java.lang.String var30 = var22.toString();
    java.lang.String var31 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var10, (java.lang.Object)var22);
    com.application.ciadobusao.test.EncontroTeste var34 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var35 = var34.run();
    junit.framework.TestResult var36 = var34.run();
    junit.framework.TestResult var37 = var34.run();
    com.application.ciadobusao.test.EncontroTeste var39 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var40 = var39.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var39);
    java.lang.String var42 = var39.toString();
    java.lang.String var43 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var37, (java.lang.Object)var39);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var37);
    var10.run(var37);
    com.application.ciadobusao.test.EncontroTeste var47 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var48 = var47.toString();
    var47.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var51 = var47.countTestCases();
    java.lang.String var53 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var47, (java.lang.Object)true);
    java.lang.String var54 = var47.toString();
    java.lang.String var55 = var47.toString();
    junit.framework.TestResult var56 = var47.run();
    java.lang.Object var57 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var58 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var57, (java.lang.Object)var58);
    java.lang.String var60 = var58.toString();
    junit.framework.TestResult var61 = var58.run();
    var47.run(var61);
    junit.framework.Assert.assertNotSame((java.lang.Object)var10, (java.lang.Object)var61);
    var10.setName("");
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var2, (java.lang.Object)"");
    java.lang.String var67 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var68 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var69 = var68.run();
    com.application.ciadobusao.test.EncontroTeste var70 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var71 = var70.run();
    var70.test();
    junit.framework.TestResult var73 = var70.run();
    var68.run(var73);
    java.lang.String var75 = var68.getName();
    junit.framework.Assert.assertNotNull((java.lang.Object)var68);
    java.lang.String var77 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2, (java.lang.Object)var68);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var68.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var28.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var29.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var30.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var31.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var42.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var48.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var53.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var54.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var55.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var60.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var67.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var77.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test57");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var1);
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var7 = var1.getName();
    var1.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>(com.application.ciadobusao.test.EncontroTeste)>");
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var13);
    java.lang.String var16 = var13.toString();
    var13.test();
    junit.framework.TestResult var18 = var13.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test58");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<1> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<1>>", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test59");


    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    var5.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var5, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var10 = var5.getName();
    var5.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    int var15 = var14.countTestCases();
    java.lang.String var16 = var14.getName();
    junit.framework.TestResult var17 = var14.run();
    int var18 = var14.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var20 = var19.toString();
    com.application.ciadobusao.test.EncontroTeste var21 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var22 = var21.run();
    var19.run(var22);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var14, (java.lang.Object)var22);
    java.lang.String var25 = junit.framework.Assert.format("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var14);
    java.lang.Object var28 = new java.lang.Object();
    junit.framework.Assert.assertNotSame("hi! expected:<100> but was:<10>", (java.lang.Object)1.0d, var28);
    junit.framework.Assert.assertNotNull(var28);
    java.lang.String var31 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var14, var28);
    java.lang.Object var33 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var34 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var33, (java.lang.Object)var34);
    java.lang.String var36 = var34.toString();
    java.lang.String var37 = var34.toString();
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var34);
    junit.framework.TestResult var39 = var34.run();
    var14.run(var39);
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>>", (java.lang.Object)var14);
    java.lang.String var42 = var14.toString();
    int var43 = var14.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste) expected:<1> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var14);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var20.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var25.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var36.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var37.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var42.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test60");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 10, 100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test61");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", 10.0f, (-1.0f), 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test62");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var5 = var1.run();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var8 = var1.toString();
    int var9 = var1.countTestCases();
    java.lang.String var10 = var1.getName();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
    junit.framework.TestResult var13 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var15 = var14.toString();
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    var14.run(var17);
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var20 = var19.run();
    com.application.ciadobusao.test.EncontroTeste var21 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var22 = var21.run();
    var21.test();
    junit.framework.TestResult var24 = var21.run();
    var19.run(var24);
    var14.run(var24);
    java.lang.String var27 = var14.toString();
    java.lang.Object var28 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var29 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var28, (java.lang.Object)var29);
    java.lang.String var31 = var29.toString();
    junit.framework.TestResult var32 = var29.run();
    com.application.ciadobusao.test.EncontroTeste var34 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var35 = var34.run();
    var34.test();
    java.lang.String var37 = var34.toString();
    com.application.ciadobusao.test.EncontroTeste var38 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var39 = var38.run();
    junit.framework.TestResult var40 = var38.run();
    junit.framework.TestResult var41 = var38.run();
    var34.run(var41);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var34, (java.lang.Object)(byte)100);
    junit.framework.Assert.assertNotSame((java.lang.Object)var32, (java.lang.Object)(byte)100);
    junit.framework.Assert.assertNotSame((java.lang.Object)var32, (java.lang.Object)0.0f);
    var14.run(var32);
    com.application.ciadobusao.test.EncontroTeste var49 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var50 = var49.run();
    var49.test();
    junit.framework.TestResult var52 = var49.run();
    int var53 = var49.countTestCases();
    var49.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
    com.application.ciadobusao.test.EncontroTeste var57 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var58 = var57.run();
    junit.framework.TestResult var59 = var57.run();
    junit.framework.TestResult var60 = var57.run();
    java.lang.Object var63 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var64 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var63, (java.lang.Object)var64);
    java.lang.String var66 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var64);
    java.lang.String var67 = var64.getName();
    junit.framework.Assert.assertNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var60, (java.lang.Object)var64);
    var49.run(var60);
    junit.framework.Assert.assertNotSame((java.lang.Object)var32, (java.lang.Object)var49);
    junit.framework.Assert.assertNotNull((java.lang.Object)var49);
    java.lang.String var72 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)var1, (java.lang.Object)var49);
    java.lang.String var73 = var1.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var27.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var31.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var37.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var66.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var72.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>"+ "'", var73.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>"));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test63");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    junit.framework.TestResult var2 = var0.run();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>>");
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1> expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
    var0.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>> expected:<> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test64");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    var1.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var9 = var8.toString();
    junit.framework.TestResult var10 = var8.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var10);
    var1.run(var10);
    java.lang.String var13 = var1.getName();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var16 = var15.run();
    var15.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var15, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var20 = var15.getName();
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var23 = var22.run();
    junit.framework.TestResult var24 = var22.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var22);
    var22.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var28 = var22.run();
    var15.run(var28);
    com.application.ciadobusao.test.EncontroTeste var31 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var32 = var31.run();
    junit.framework.TestResult var33 = var31.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var31);
    var31.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var37 = var31.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var31);
    junit.framework.TestResult var39 = var31.run();
    junit.framework.TestResult var40 = var31.run();
    int var41 = var31.countTestCases();
    var31.setName("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<hi!(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>");
    junit.framework.TestResult var44 = var31.run();
    com.application.ciadobusao.test.EncontroTeste var48 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var49 = var48.run();
    var48.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var48, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var53 = var48.getName();
    var48.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var56 = var48.run();
    var48.test();
    junit.framework.Assert.assertNotNull(" expected:<10> but was:<10>", (java.lang.Object)var48);
    com.application.ciadobusao.test.EncontroTeste var60 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var61 = var60.run();
    var60.test();
    junit.framework.TestResult var63 = var60.run();
    int var64 = var60.countTestCases();
    java.lang.Object var67 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var68 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var67, (java.lang.Object)var68);
    java.lang.String var70 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var68);
    java.lang.String var71 = var68.toString();
    var68.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.Assert.assertNotSame("hi! expected:<100> but was:<10>", (java.lang.Object)var60, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.Object var75 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var76 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var75, (java.lang.Object)var76);
    junit.framework.TestResult var78 = var76.run();
    com.application.ciadobusao.test.EncontroTeste var79 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var80 = var79.run();
    var79.test();
    junit.framework.TestResult var82 = var79.run();
    int var83 = var79.countTestCases();
    junit.framework.TestResult var84 = var79.run();
    var76.run(var84);
    junit.framework.Assert.assertNotSame((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var84);
    var48.run(var84);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var84);
    var31.run(var84);
    var15.run(var84);
    var1.run(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>"+ "'", var13.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var70.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var71.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var80);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var84);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test65");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var4 = var0.run();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    var0.test();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test66");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var0.run(var3);
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    var7.test();
    junit.framework.TestResult var10 = var7.run();
    var5.run(var10);
    var0.run(var10);
    java.lang.String var13 = var0.toString();
    java.lang.Object var14 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var14, (java.lang.Object)var15);
    java.lang.String var17 = var15.toString();
    junit.framework.TestResult var18 = var15.run();
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var21 = var20.run();
    var20.test();
    java.lang.String var23 = var20.toString();
    com.application.ciadobusao.test.EncontroTeste var24 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var25 = var24.run();
    junit.framework.TestResult var26 = var24.run();
    junit.framework.TestResult var27 = var24.run();
    var20.run(var27);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var20, (java.lang.Object)(byte)100);
    junit.framework.Assert.assertNotSame((java.lang.Object)var18, (java.lang.Object)(byte)100);
    junit.framework.Assert.assertNotSame((java.lang.Object)var18, (java.lang.Object)0.0f);
    var0.run(var18);
    com.application.ciadobusao.test.EncontroTeste var35 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var36 = var35.run();
    var35.test();
    junit.framework.TestResult var38 = var35.run();
    int var39 = var35.countTestCases();
    var35.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
    com.application.ciadobusao.test.EncontroTeste var43 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var44 = var43.run();
    junit.framework.TestResult var45 = var43.run();
    junit.framework.TestResult var46 = var43.run();
    java.lang.Object var49 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var50 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var49, (java.lang.Object)var50);
    java.lang.String var52 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var50);
    java.lang.String var53 = var50.getName();
    junit.framework.Assert.assertNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var46, (java.lang.Object)var50);
    var35.run(var46);
    junit.framework.Assert.assertNotSame((java.lang.Object)var18, (java.lang.Object)var35);
    int var57 = var35.countTestCases();
    int var58 = var35.countTestCases();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var17.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var52.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest13.test67");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var4 = var3.toString();
    var3.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var7 = var3.countTestCases();
    java.lang.String var9 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var3, (java.lang.Object)true);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    junit.framework.TestResult var12 = var3.run();
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    int var14 = var13.countTestCases();
    java.lang.String var15 = var13.getName();
    int var16 = var13.countTestCases();
    java.lang.String var17 = var13.getName();
    junit.framework.Assert.assertNotSame((java.lang.Object)var13, (java.lang.Object)true);
    junit.framework.TestResult var20 = var13.run();
    java.lang.String var21 = junit.framework.Assert.format("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var12, (java.lang.Object)var13);
    com.application.ciadobusao.test.EncontroTeste var24 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var25 = var24.run();
    java.lang.String var26 = var24.toString();
    com.application.ciadobusao.test.EncontroTeste var27 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var28 = var27.toString();
    com.application.ciadobusao.test.EncontroTeste var29 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var30 = var29.run();
    var27.run(var30);
    com.application.ciadobusao.test.EncontroTeste var32 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var33 = var32.run();
    com.application.ciadobusao.test.EncontroTeste var34 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var35 = var34.run();
    var34.test();
    junit.framework.TestResult var37 = var34.run();
    var32.run(var37);
    var27.run(var37);
    var24.run(var37);
    com.application.ciadobusao.test.EncontroTeste var43 = new com.application.ciadobusao.test.EncontroTeste();
    int var44 = var43.countTestCases();
    java.lang.String var45 = var43.getName();
    junit.framework.TestResult var46 = var43.run();
    int var47 = var43.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var48 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var49 = var48.toString();
    com.application.ciadobusao.test.EncontroTeste var50 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var51 = var50.run();
    var48.run(var51);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var43, (java.lang.Object)var51);
    int var54 = var43.countTestCases();
    java.lang.Object var55 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var56 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var55, (java.lang.Object)var56);
    java.lang.String var58 = var56.toString();
    junit.framework.TestResult var59 = var56.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var43, (java.lang.Object)var59);
    junit.framework.Assert.assertNotSame((java.lang.Object)(short)100, (java.lang.Object)var59);
    var24.run(var59);
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var59);
    com.application.ciadobusao.test.EncontroTeste var64 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var65 = var64.run();
    var64.test();
    junit.framework.TestResult var67 = var64.run();
    int var68 = var64.countTestCases();
    junit.framework.TestResult var69 = var64.run();
    java.lang.String var70 = var64.toString();
    junit.framework.Assert.assertNotNull((java.lang.Object)var64);
    junit.framework.Assert.assertNotSame("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"hi!", (java.lang.Object)var64);
    java.lang.String var73 = var64.getName();
    java.lang.String var74 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var64);
    java.lang.String var75 = var64.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var26.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var28.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var49.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var58.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var70.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var73);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var74.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var75.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

}
