package randoop;

import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test1");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", '#', '#');

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test2");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var4 = var0.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test3");


    java.lang.Object var3 = new java.lang.Object();
    junit.framework.Assert.assertNotSame("hi! expected:<100> but was:<10>", (java.lang.Object)1.0d, var3);
    junit.framework.Assert.assertNotNull(var3);
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    var7.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var11 = var7.countTestCases();
    java.lang.String var13 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var7, (java.lang.Object)true);
    java.lang.String var14 = var7.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi! expected:<100> but was:<10>", var3, (java.lang.Object)var14);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test4");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals('4', 'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test5");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    int var2 = var1.countTestCases();
    java.lang.String var3 = var1.getName();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var7 = var6.toString();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var6.run(var9);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)var9);
    int var12 = var1.countTestCases();
    java.lang.Object var13 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var13, (java.lang.Object)var14);
    java.lang.String var16 = var14.toString();
    junit.framework.TestResult var17 = var14.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var1, (java.lang.Object)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test6");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 1L, 1L);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test7");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test8");


    junit.framework.Assert.assertEquals(0.0f, 100.0f, 100.0f);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test9");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", "");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test10");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (byte)10, (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test11");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    var5.test();
    java.lang.String var8 = var5.getName();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var5.run(var10);
    var2.run(var10);
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var16 = var15.run();
    var15.test();
    junit.framework.TestResult var18 = var15.run();
    var13.run(var18);
    var2.run(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var18);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test12");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    var0.run(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test13");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull(var0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test14");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var6 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var9 = var8.toString();
    var8.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var12 = var8.countTestCases();
    java.lang.String var14 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var8, (java.lang.Object)true);
    java.lang.String var15 = var8.toString();
    java.lang.String var16 = var8.toString();
    junit.framework.TestResult var17 = var8.run();
    int var18 = var8.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var6, (java.lang.Object)var8);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test15");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", true, false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test16");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var2.run(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)(-1), (java.lang.Object)var5);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test17");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", 0L, 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test18");


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
    junit.framework.TestResult var12 = var2.run();
    junit.framework.Assert.assertNotNull("", (java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("", (java.lang.Object)var2, (java.lang.Object)"hi!(com.application.ciadobusao.test.EncontroTeste)");
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
    assertNotNull(var12);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test19");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.getName();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var2, (java.lang.Object)1);
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    junit.framework.TestResult var10 = var8.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var8);
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var14 = var13.toString();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var16 = var15.run();
    var13.run(var16);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var16);
    var8.run(var16);
    var8.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)1, (java.lang.Object)var8);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test20");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.toString();
    junit.framework.TestResult var5 = var2.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2, (java.lang.Object)(byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test21");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", 1, 100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test22");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", (short)(-1), (short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test23");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)100, (short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test24");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (byte)(-1), (byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test25");


    junit.framework.Assert.assertEquals("", 10.0f, 0.0f, 100.0f);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", "", "hi!");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test27");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", "hi!", "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test28");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", 1L, 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test29");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var5 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    java.lang.String var8 = var6.toString();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)var5, (java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test30");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test31");


    junit.framework.Assert.assertEquals("", 0.0f, 0.0f, (-1.0f));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test32");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test33");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var7 = var2.getName();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var10 = var2.toString();
    java.lang.String var12 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var10, (java.lang.Object)" expected:<10> but was:<10>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>"));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test34");


    junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", false, false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", "null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test36");


    junit.framework.Assert.assertEquals(1.0d, 0.0d, 100.0d);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test37");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", 0, 1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test38");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test39");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test40");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("", (java.lang.Object)var14);
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

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test41");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", "");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test42");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    var0.test();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var6 = var5.toString();
    var5.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var9 = var5.countTestCases();
    java.lang.String var11 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var5, (java.lang.Object)true);
    java.lang.String var12 = var5.toString();
    java.lang.String var13 = var5.toString();
    junit.framework.TestResult var14 = var5.run();
    int var15 = var5.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)var15);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test43");


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
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test44");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    junit.framework.TestResult var5 = var3.run();
    junit.framework.TestResult var6 = var3.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var8);
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var6, (java.lang.Object)var8);
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    junit.framework.TestResult var15 = var13.run();
    java.lang.String var16 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var6, (java.lang.Object)var15);
    junit.framework.Assert.assertNotSame((java.lang.Object)"", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test45");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)(-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test46");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)10, (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test47");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)(-1), (byte)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test48");


    junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", 10, 10);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test49");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    int var1 = var0.countTestCases();
    java.lang.String var2 = var0.getName();
    junit.framework.TestResult var3 = var0.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var3, (java.lang.Object)0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test50");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", 0, 10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test51");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", (-1), 100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test52");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    junit.framework.TestResult var4 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var7 = var6.toString();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var6.run(var9);
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    var13.test();
    junit.framework.TestResult var16 = var13.run();
    var11.run(var16);
    var6.run(var16);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)var6);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test53");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", 1.0f, 1.0f, 10.0f);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test54");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var2);
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var8 = var2.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi!", (java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test55");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    java.lang.String var5 = var3.getName();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var3, (java.lang.Object)1);
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    junit.framework.TestResult var11 = var9.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9);
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var15 = var14.toString();
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    var14.run(var17);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var17);
    var9.run(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var3, (java.lang.Object)var9);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test56");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    junit.framework.TestResult var3 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var5 = var4.toString();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    var4.run(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var3, (java.lang.Object)var7);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test57");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var2.run(var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)10.0f, (java.lang.Object)var5);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test58");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var4.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var4, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var2, (java.lang.Object)" expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test59");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", (byte)1, (byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test60");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10.0d, (-1.0d), (-1.0d));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test61");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)(short)100, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test62");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    junit.framework.TestResult var9 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var11);
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9, (java.lang.Object)var11);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    junit.framework.TestResult var18 = var16.run();
    java.lang.String var19 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var9, (java.lang.Object)var18);
    var0.run(var18);
    var0.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test63");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    var0.run(var5);
    java.lang.String var7 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)10.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test64");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals('#', ' ');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test65");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test66");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", "hi!");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test67");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", 0.0f, 0.0f, (-1.0f));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test68");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", "null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", "hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test69");


    junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", 'a', 'a');

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test70");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var7 = var6.toString();
    var6.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var10 = var6.countTestCases();
    java.lang.String var12 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var6, (java.lang.Object)true);
    java.lang.String var13 = var6.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var3, (java.lang.Object)var13);
    var3.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test71");


    junit.framework.Assert.assertEquals(10.0f, 10.0f, 1.0f);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test72");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", (byte)100, (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test73");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", true, false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test74");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 10.0d, 0.0d, 0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test75");


    junit.framework.Assert.assertEquals((-1L), (-1L));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test76");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    junit.framework.TestResult var4 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    var7.test();
    junit.framework.TestResult var10 = var7.run();
    var5.run(var10);
    java.lang.String var12 = var5.getName();
    java.lang.String var13 = var5.toString();
    java.lang.String var14 = var5.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var4, (java.lang.Object)var5);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test77");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", '#', ' ');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test78");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test79");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (-1L), (-1L));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test80");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", 100, 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test81");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (short)100, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test82");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", '#', 'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test83");


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
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var20 = var19.run();
    junit.framework.TestResult var21 = var19.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var19);
    var19.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var25 = var19.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var19);
    junit.framework.TestResult var27 = var19.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)var14, (java.lang.Object)var19);
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test84");


    junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test85");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test86");


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
    java.lang.Object var14 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var14, (java.lang.Object)var15);
    java.lang.String var17 = var15.toString();
    junit.framework.TestResult var18 = var15.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var2, (java.lang.Object)var18);
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var21 = var20.run();
    var20.test();
    junit.framework.TestResult var23 = var20.run();
    java.lang.String var24 = var20.toString();
    java.lang.String var25 = var20.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var18, (java.lang.Object)var25);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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
    assertTrue("'" + var17 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var17.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var24.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var25.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test87");


    junit.framework.Assert.assertEquals(100L, 100L);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test88");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", "hi!(com.application.ciadobusao.test.EncontroTeste)", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test89");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    junit.framework.TestResult var2 = var0.run();
    junit.framework.TestResult var3 = var0.run();
    java.lang.String var4 = var0.toString();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)var5);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test90");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    java.lang.String var3 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var4.test();
    junit.framework.TestResult var7 = var4.run();
    java.lang.String var8 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var3, (java.lang.Object)var7);
    junit.framework.Assert.assertNotNull((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test91");


    junit.framework.Assert.assertNotNull((java.lang.Object)(byte)100);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test92");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    junit.framework.TestResult var5 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test93");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    junit.framework.TestResult var5 = var3.run();
    junit.framework.TestResult var6 = var3.run();
    var3.test();
    junit.framework.Assert.assertNotSame((java.lang.Object)var2, (java.lang.Object)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test94");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var7.run(var10);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var10);
    var2.run(var10);
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var15 = var14.toString();
    var14.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var18 = var14.getName();
    java.lang.String var19 = var14.toString();
    var14.setName("hi!(com.application.ciadobusao.test.EncontroTeste)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)var14);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test95");


    junit.framework.Assert.assertFalse("hi! expected:<100> but was:<10>", false);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test96");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var4.test();
    junit.framework.TestResult var7 = var4.run();
    var2.run(var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)'#', (java.lang.Object)var7);
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

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test97");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", "");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test98");


    junit.framework.Assert.assertEquals((byte)10, (byte)10);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test99");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (byte)100, (byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test100");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (short)1, (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test101");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100.0f, 1.0f, 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test102");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test103");


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
    com.application.ciadobusao.test.EncontroTeste var40 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var41 = var40.toString();
    com.application.ciadobusao.test.EncontroTeste var42 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var43 = var42.run();
    var40.run(var43);
    com.application.ciadobusao.test.EncontroTeste var46 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var47 = var46.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var46);
    java.lang.String var49 = var46.toString();
    int var50 = var46.countTestCases();
    int var51 = var46.countTestCases();
    java.lang.String var52 = var46.getName();
    junit.framework.Assert.assertNotSame((java.lang.Object)var43, (java.lang.Object)var46);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)var36, (java.lang.Object)var43);
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
    assertTrue("'" + var41 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var41.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var49.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var52);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test104");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    java.lang.String var3 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test105");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", "hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test106");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var1.run(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test107");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", 10L, 0L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test108");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test109");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", 1L, 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test110");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 100L, 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test111");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", 100L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test112");


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
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var18 = var17.run();
    var17.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var17, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var22 = var17.run();
    com.application.ciadobusao.test.EncontroTeste var24 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var25 = var24.toString();
    com.application.ciadobusao.test.EncontroTeste var26 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var27 = var26.run();
    var24.run(var27);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var27);
    junit.framework.Assert.assertNotSame((java.lang.Object)var22, (java.lang.Object)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var2, (java.lang.Object)var27);
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var25.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test113");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (short)100, (short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test114");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10, (-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test115");


    junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", 0.0f, 0.0f, 100.0f);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test116");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 0, 1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test117");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", 10.0f, 1.0f, 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test118");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", (byte)100, (byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test119");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    java.lang.String var5 = var3.getName();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var3, (java.lang.Object)1);
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var9.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var9, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)var3, (java.lang.Object)" expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test120");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    var1.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("", (java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test121");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var6 = var1.getName();
    junit.framework.TestResult var7 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    java.lang.String var10 = var8.toString();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var12 = var11.toString();
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    var11.run(var14);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    com.application.ciadobusao.test.EncontroTeste var18 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var19 = var18.run();
    var18.test();
    junit.framework.TestResult var21 = var18.run();
    var16.run(var21);
    var11.run(var21);
    var8.run(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var7, (java.lang.Object)var8);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test122");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", "null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test123");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", 1L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test124");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test125");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test126");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var1.run(var4);
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    junit.framework.TestResult var11 = var8.run();
    var6.run(var11);
    var1.run(var11);
    java.lang.String var14 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test127");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<100> but was:<10>", (java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test128");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var0.run(var3);
    var0.test();
    java.lang.Object var7 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var7, (java.lang.Object)var8);
    java.lang.String var10 = var8.toString();
    java.lang.String var11 = var8.toString();
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)var8);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test129");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    java.lang.String var5 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var7 = var6.toString();
    var6.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var10 = var6.countTestCases();
    int var11 = var6.countTestCases();
    junit.framework.Assert.assertNotSame((java.lang.Object)var2, (java.lang.Object)var11);
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    junit.framework.TestResult var15 = var13.run();
    junit.framework.TestResult var16 = var13.run();
    var13.test();
    var13.test();
    junit.framework.Assert.assertNotSame((java.lang.Object)var2, (java.lang.Object)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)(short)1, (java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test130");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100.0f, 0.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test131");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals('a', ' ');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test132");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotNull((java.lang.Object)var1);
    java.lang.Object var6 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var6, (java.lang.Object)var7);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)(short)(-1), var6);
    java.lang.Object var12 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var12, (java.lang.Object)var13);
    java.lang.String var15 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var13);
    java.lang.String var16 = var13.toString();
    java.lang.String var17 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", var6, (java.lang.Object)var16);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1, (java.lang.Object)var17);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var15.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test133");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", 1.0d, 10.0d, 10.0d);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test134");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    var0.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test135");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", 0, (-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test136");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (byte)10, (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test137");


    junit.framework.Assert.assertFalse("", false);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test138");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", "null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test139");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var4 = var0.countTestCases();
    int var5 = var0.countTestCases();
    java.lang.String var6 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test140");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1.0d), 100.0d, 10.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test141");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1);
    java.lang.String var4 = var1.toString();
    int var5 = var1.countTestCases();
    junit.framework.Assert.assertNotNull((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test142");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var7 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var10 = var9.toString();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    var9.run(var12);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var12);
    junit.framework.Assert.assertNotSame((java.lang.Object)var7, (java.lang.Object)var12);
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var12, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
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

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test143");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test144");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (-1L), (-1L));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test145");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (short)100, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test146");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test147");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", 1.0f, 100.0f, 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test148");


    junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", 1.0d, 1.0d, (-1.0d));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test149");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (byte)100, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test150");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (byte)100, (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test151");


    java.lang.Object var4 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var4, (java.lang.Object)var5);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)(short)(-1), var4);
    java.lang.Object var10 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var10, (java.lang.Object)var11);
    java.lang.String var13 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var11);
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", var4, (java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("hi!(com.application.ciadobusao.test.EncontroTeste)", var4, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var13.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test152");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var2);
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    junit.framework.TestResult var10 = var8.run();
    junit.framework.TestResult var11 = var8.run();
    var8.test();
    var8.setName(" expected:<10> but was:<10>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)" expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test153");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test154");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (short)10, (short)10);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test155");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 100, 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test156");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", 1L, 100L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test157");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    junit.framework.TestResult var2 = var0.run();
    junit.framework.TestResult var3 = var0.run();
    var0.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test158");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    var6.test();
    java.lang.String var9 = var6.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var5, (java.lang.Object)var6);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test159");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", ' ', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test160");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", '4', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test161");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    int var4 = var0.countTestCases();
    int var5 = var0.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test162");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test163");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", ' ', 'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test164");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", " expected:<10> but was:<10>", "null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test165");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test166");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    junit.framework.TestResult var2 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var3.test();
    java.lang.String var6 = var3.getName();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    var3.run(var8);
    var0.run(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test167");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0L, 100L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test168");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100.0f, (-1.0f), 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test169");


    junit.framework.Assert.assertEquals(1L, 1L);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test170");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(' ', 'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test171");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test172");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (short)100, (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test173");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 10L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test174");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)1, (short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test175");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.TestResult var4 = var1.run();
    java.lang.String var5 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    var7.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var7, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var12 = var7.getName();
    var7.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test176");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100.0f, 0.0f, 10.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test177");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var4 = var0.countTestCases();
    int var5 = var0.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    var6.test();
    junit.framework.Assert.assertNotNull((java.lang.Object)var6);
    junit.framework.Assert.assertNotSame((java.lang.Object)var5, (java.lang.Object)var6);
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var6, (java.lang.Object)var11);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test178");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1);
    junit.framework.TestResult var4 = var1.run();
    var1.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test179");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", false, true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test180");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var4 = var0.countTestCases();
    java.lang.String var5 = var0.toString();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var7 = var6.toString();
    var6.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var10 = var6.countTestCases();
    int var11 = var6.countTestCases();
    java.lang.String var12 = var6.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)var12);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test181");


    junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test182");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var4.test();
    java.lang.String var7 = var4.getName();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var4.run(var9);
    var1.run(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1, (java.lang.Object)(short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test183");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 10, 1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test184");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (byte)0, (byte)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test185");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", "null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test186");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    int var6 = var1.countTestCases();
    junit.framework.Assert.assertNotNull("", (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test187");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)1, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test188");


    junit.framework.Assert.assertEquals((-1), (-1));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test189");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test190");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (short)10, (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test191");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    java.lang.String var7 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)true);
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
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test192");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var7 = var6.toString();
    var6.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var10 = var6.countTestCases();
    java.lang.String var12 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var6, (java.lang.Object)true);
    java.lang.String var13 = var6.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var3, (java.lang.Object)var13);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    int var17 = var16.countTestCases();
    java.lang.String var18 = var16.getName();
    junit.framework.TestResult var19 = var16.run();
    int var20 = var16.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var21 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var22 = var21.toString();
    com.application.ciadobusao.test.EncontroTeste var23 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var24 = var23.run();
    var21.run(var24);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var16, (java.lang.Object)var24);
    int var27 = var16.countTestCases();
    java.lang.Object var28 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var29 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var28, (java.lang.Object)var29);
    java.lang.String var31 = var29.toString();
    junit.framework.TestResult var32 = var29.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var16, (java.lang.Object)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var13, (java.lang.Object)var32);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var22.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var31.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test193");


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
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var15 = var14.toString();
    var14.setName(" expected:<10> but was:<10>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var13, (java.lang.Object)" expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test194");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var3.test();
    junit.framework.TestResult var6 = var3.run();
    var1.run(var6);
    junit.framework.TestResult var8 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)");
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

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test195");


    junit.framework.Assert.assertEquals(1.0d, 1.0d, 1.0d);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test196");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var2.run(var5);
    var2.test();
    java.lang.String var8 = junit.framework.Assert.format("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", var1, (java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull(var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test197");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test198");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (short)1, (short)1);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test199");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test200");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    var1.test();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    var5.test();
    junit.framework.TestResult var8 = var5.run();
    java.lang.String var9 = var5.toString();
    java.lang.String var10 = var5.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1, (java.lang.Object)var10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test201");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test202");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", '4', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test203");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", "hi!(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test204");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", ' ', ' ');

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test205");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10.0d, 0.0d, 0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test206");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var3.test();
    junit.framework.TestResult var6 = var3.run();
    var1.run(var6);
    junit.framework.TestResult var8 = var1.run();
    java.lang.String var9 = var1.getName();
    java.lang.Object var10 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var10, (java.lang.Object)var11);
    java.lang.String var13 = var11.toString();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    int var15 = var14.countTestCases();
    java.lang.String var16 = var14.getName();
    junit.framework.TestResult var17 = var14.run();
    var11.run(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var1, (java.lang.Object)var17);
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
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test207");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", false, true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test208");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (byte)(-1), (byte)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test209");


    junit.framework.Assert.assertEquals('#', '#');

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test210");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", 1, 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test211");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0.0f, 10.0f, 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test212");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var2);
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test213");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", "", "");

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test214");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", "hi! expected:<100> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test215");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
    java.lang.String var5 = var2.toString();
    int var6 = var2.countTestCases();
    int var7 = var2.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test216");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test217");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", false, true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test218");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (-1.0f), 0.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test219");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.TestResult var5 = var2.run();
    var2.test();
    junit.framework.Assert.assertNotSame((java.lang.Object)var1, (java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var2, (java.lang.Object)var8);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test220");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", 0.0d, 10.0d, (-1.0d));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test221");


    junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", true);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test222");


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
    java.lang.String var16 = var4.toString();
    junit.framework.TestResult var17 = var4.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var17);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test223");


    java.lang.Object var4 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var4, (java.lang.Object)var5);
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var9 = var8.toString();
    var8.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var12 = var8.countTestCases();
    java.lang.String var14 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var8, (java.lang.Object)true);
    java.lang.String var15 = var8.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var5, (java.lang.Object)var15);
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var18 = var17.toString();
    var17.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var21 = var17.countTestCases();
    int var22 = var17.countTestCases();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var15, (java.lang.Object)var17);
    com.application.ciadobusao.test.EncontroTeste var26 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var27 = var26.run();
    junit.framework.TestResult var28 = var26.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var26);
    com.application.ciadobusao.test.EncontroTeste var31 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var32 = var31.toString();
    com.application.ciadobusao.test.EncontroTeste var33 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var34 = var33.run();
    var31.run(var34);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var34);
    var26.run(var34);
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var34);
    java.lang.String var39 = junit.framework.Assert.format(" expected:<10> but was:<10>", (java.lang.Object)var17, (java.lang.Object)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var17, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var32.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test224");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", 0.0f, (-1.0f), 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test225");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var7 = var2.getName();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var10 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    junit.framework.TestResult var14 = var12.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var12);
    var12.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    var12.setName("hi! expected:<100> but was:<10>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var10, (java.lang.Object)var12);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test226");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var4);
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    int var8 = var7.countTestCases();
    java.lang.String var9 = var7.getName();
    junit.framework.TestResult var10 = var7.run();
    int var11 = var7.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var13 = var12.toString();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    var12.run(var15);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var7, (java.lang.Object)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var4, (java.lang.Object)var15);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test227");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test228");


    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    junit.framework.TestResult var6 = var4.run();
    junit.framework.TestResult var7 = var4.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var9);
    java.lang.String var12 = var9.toString();
    java.lang.String var13 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var7, (java.lang.Object)var9);
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    junit.framework.TestResult var16 = var14.run();
    java.lang.String var17 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var7, (java.lang.Object)var16);
    java.lang.Object var18 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var18, (java.lang.Object)var19);
    junit.framework.TestResult var21 = var19.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var16, (java.lang.Object)var19);
    junit.framework.Assert.assertNotNull("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var16);
    com.application.ciadobusao.test.EncontroTeste var24 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var25 = var24.run();
    var24.test();
    junit.framework.Assert.assertNotNull((java.lang.Object)var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var16, (java.lang.Object)var24);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test229");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (short)1, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test230");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    junit.framework.TestResult var5 = var3.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var3);
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var9 = var8.toString();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    var8.run(var11);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var11);
    var3.run(var11);
    java.lang.String var15 = var3.getName();
    var3.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi!", (java.lang.Object)(byte)1, (java.lang.Object)var3);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test231");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var3.test();
    junit.framework.TestResult var6 = var3.run();
    var1.run(var6);
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var9 = var8.toString();
    var8.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var12 = var8.getName();
    java.lang.String var13 = var8.toString();
    var8.setName("hi!(com.application.ciadobusao.test.EncontroTeste)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var6, (java.lang.Object)"hi!(com.application.ciadobusao.test.EncontroTeste)");
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
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test232");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1L, 100L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test233");


    junit.framework.Assert.assertEquals("hi!", 10.0f, 0.0f, 100.0f);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test234");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 100.0d, 0.0d, 0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test235");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", 0.0d, (-1.0d), 10.0d);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test236");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0.0d, 100.0d, (-1.0d));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test237");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (byte)1, (byte)1);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test238");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test239");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 1.0d, 100.0d, 10.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test240");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.TestResult var5 = var2.run();
    java.lang.String var6 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var8, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var13 = var8.getName();
    var8.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.Object var19 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var19, (java.lang.Object)var20);
    com.application.ciadobusao.test.EncontroTeste var23 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var24 = var23.toString();
    var23.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var27 = var23.countTestCases();
    java.lang.String var29 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var23, (java.lang.Object)true);
    java.lang.String var30 = var23.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var20, (java.lang.Object)var30);
    com.application.ciadobusao.test.EncontroTeste var32 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var33 = var32.toString();
    var32.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var36 = var32.countTestCases();
    int var37 = var32.countTestCases();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var30, (java.lang.Object)var32);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var30);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var24.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var29.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var30.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var33.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test241");


    junit.framework.Assert.assertEquals(100, 100);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test242");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    java.lang.String var3 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    int var5 = var4.countTestCases();
    java.lang.String var6 = var4.getName();
    junit.framework.TestResult var7 = var4.run();
    var1.run(var7);
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    junit.framework.TestResult var11 = var9.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var7, (java.lang.Object)var11);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test243");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var3.test();
    junit.framework.TestResult var6 = var3.run();
    var1.run(var6);
    java.lang.String var8 = var1.getName();
    junit.framework.Assert.assertNotNull((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("", (java.lang.Object)var1, (java.lang.Object)(-1.0d));
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
    assertNull(var8);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test244");


    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var4.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var4, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var9 = var4.run();
    java.lang.String var10 = junit.framework.Assert.format("hi! expected:<100> but was:<10>", (java.lang.Object)100, (java.lang.Object)var9);
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)"hi! expected:<100> but was:<10>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test245");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.TestResult var4 = var1.run();
    var1.test();
    var1.test();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var8, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var13 = var8.getName();
    var8.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var16 = var8.run();
    junit.framework.TestResult var17 = var8.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", (java.lang.Object)var1, (java.lang.Object)var8);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test246");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)(-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test247");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    java.lang.String var5 = var1.toString();
    java.lang.String var6 = var1.toString();
    java.lang.Object var9 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var9, (java.lang.Object)var10);
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var14 = var13.toString();
    var13.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var17 = var13.countTestCases();
    java.lang.String var19 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var13, (java.lang.Object)true);
    java.lang.String var20 = var13.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var10, (java.lang.Object)var20);
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var23 = var22.toString();
    var22.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var26 = var22.countTestCases();
    int var27 = var22.countTestCases();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var20, (java.lang.Object)var22);
    junit.framework.TestResult var29 = var22.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var6, (java.lang.Object)var29);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var20.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test248");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (-1.0f), 1.0f, 10.0f);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test249");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test250");


    junit.framework.Assert.assertEquals((-1.0f), 0.0f, 1.0f);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test251");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", 10, 1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test252");


    junit.framework.Assert.assertEquals(0.0f, 10.0f, 10.0f);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test253");


    junit.framework.Assert.assertEquals((-1.0d), (-1.0d), 0.0d);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test254");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    java.lang.String var3 = var0.toString();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    junit.framework.TestResult var9 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var11);
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9, (java.lang.Object)var11);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    junit.framework.TestResult var18 = var16.run();
    java.lang.String var19 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var9, (java.lang.Object)var18);
    java.lang.Object var20 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var21 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var20, (java.lang.Object)var21);
    junit.framework.TestResult var23 = var21.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var18, (java.lang.Object)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)var18);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test255");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var1);
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var7 = var1.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var1);
    junit.framework.TestResult var9 = var1.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var1);
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
    assertNotNull(var9);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test256");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", "hi!(com.application.ciadobusao.test.EncontroTeste)", "hi!");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test257");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test258");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getName();
    var0.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test259");


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
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    var12.test();
    junit.framework.TestResult var15 = var12.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi!", (java.lang.Object)"hi!", (java.lang.Object)var12);
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
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test260");


    junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", 1.0d, 1.0d, 0.0d);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test261");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test262");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1), 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test263");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.TestResult var4 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var6);
    java.lang.String var9 = var6.toString();
    java.lang.String var10 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var4, (java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var4);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test264");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var4 = var3.toString();
    var3.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var7 = var3.countTestCases();
    java.lang.String var9 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var3, (java.lang.Object)true);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)(short)1, (java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test265");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test266");


    junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", true);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test267");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var0.run(var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test268");


    junit.framework.Assert.assertEquals("hi!", (-1), (-1));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test269");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    java.lang.String var5 = var3.getName();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var3, (java.lang.Object)1);
    int var8 = var3.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    junit.framework.TestResult var11 = var9.run();
    junit.framework.TestResult var12 = var9.run();
    var9.test();
    var9.setName(" expected:<10> but was:<10>");
    junit.framework.Assert.assertNotNull((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var8, (java.lang.Object)var9);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test270");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var1);
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var7 = var1.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var1);
    junit.framework.TestResult var9 = var1.run();
    junit.framework.TestResult var10 = var1.run();
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
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test271");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 10.0d, (-1.0d), 100.0d);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test272");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (short)10, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test273");


    junit.framework.Assert.assertEquals(10.0f, 1.0f, 100.0f);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test274");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", 'a', '4');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test275");


    junit.framework.Assert.assertEquals("", 10.0d, 1.0d, 10.0d);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test276");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)(-1), (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test277");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var2);
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var8 = var2.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    junit.framework.TestResult var10 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    junit.framework.TestResult var14 = var12.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var12);
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var18 = var17.toString();
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var20 = var19.run();
    var17.run(var20);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var20);
    var12.run(var20);
    java.lang.String var24 = var12.getName();
    var12.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", (java.lang.Object)var2, (java.lang.Object)var12);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test278");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    int var4 = var3.countTestCases();
    java.lang.String var5 = var3.getName();
    junit.framework.TestResult var6 = var3.run();
    int var7 = var3.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var9 = var8.toString();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    var8.run(var11);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var3, (java.lang.Object)var11);
    int var14 = var3.countTestCases();
    java.lang.Object var15 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var15, (java.lang.Object)var16);
    java.lang.String var18 = var16.toString();
    junit.framework.TestResult var19 = var16.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var3, (java.lang.Object)var19);
    junit.framework.Assert.assertNotSame((java.lang.Object)(short)100, (java.lang.Object)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var19, (java.lang.Object)false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test279");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test280");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    int var2 = var1.countTestCases();
    java.lang.String var3 = var1.getName();
    int var4 = var1.countTestCases();
    int var5 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    junit.framework.TestResult var11 = var8.run();
    var6.run(var11);
    junit.framework.TestResult var13 = var6.run();
    var6.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var1, (java.lang.Object)var6);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test281");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", 10L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test282");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0.0d, (-1.0d), 0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test283");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var1.run(var4);
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    junit.framework.TestResult var11 = var8.run();
    var6.run(var11);
    var1.run(var11);
    java.lang.Object var16 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var16, (java.lang.Object)var17);
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var21 = var20.toString();
    var20.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var24 = var20.countTestCases();
    java.lang.String var26 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var20, (java.lang.Object)true);
    java.lang.String var27 = var20.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var17, (java.lang.Object)var27);
    com.application.ciadobusao.test.EncontroTeste var29 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var30 = var29.toString();
    var29.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var33 = var29.countTestCases();
    int var34 = var29.countTestCases();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var27, (java.lang.Object)var29);
    junit.framework.TestResult var36 = var29.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)var36);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var21.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var26.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var27.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var30.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test284");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var7 = var2.getName();
    junit.framework.TestResult var8 = var2.run();
    var2.test();
    java.lang.Object var10 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var10, (java.lang.Object)var11);
    junit.framework.TestResult var13 = var11.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2, (java.lang.Object)var11);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test285");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var4.test();
    junit.framework.TestResult var7 = var4.run();
    var2.run(var7);
    junit.framework.TestResult var9 = var2.run();
    java.lang.String var10 = var2.getName();
    var2.setName("hi!");
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var15 = var14.toString();
    var14.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var18 = var14.countTestCases();
    java.lang.String var20 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var14, (java.lang.Object)true);
    java.lang.String var21 = var14.toString();
    java.lang.String var22 = var14.toString();
    java.lang.String var23 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var2, (java.lang.Object)var14);
    java.lang.String var24 = var14.toString();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var24);
    
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
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var20.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var21.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var22.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var24.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test286");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var16);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test287");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", " expected:<10> but was:<10>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test288");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (-1.0d), 0.0d, 10.0d);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test289");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (byte)10, (byte)10);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test290");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0, 10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test291");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", true, true);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test292");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", 10, 10);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test293");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", "");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test294");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", false, true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test295");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var6 = var1.getName();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
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
    assertNull(var6);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test296");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    junit.framework.TestResult var2 = var0.run();
    junit.framework.TestResult var3 = var0.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test297");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test298");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test299");


    junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", true);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test300");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (short)0, (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test301");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", false, false);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test302");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    junit.framework.Assert.assertNotNull((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test303");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (byte)1, (byte)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test304");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1, 10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test305");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 'a', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test306");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var7.run(var10);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var10);
    var2.run(var10);
    java.lang.Object var14 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var14, (java.lang.Object)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var10, var14);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test307");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", 10L, 100L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test308");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    int var6 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var7.run(var10);
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    var14.test();
    junit.framework.TestResult var17 = var14.run();
    var12.run(var17);
    var7.run(var17);
    var1.run(var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var17);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test309");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    junit.framework.TestResult var9 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var11);
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9, (java.lang.Object)var11);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    junit.framework.TestResult var18 = var16.run();
    java.lang.String var19 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var9, (java.lang.Object)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)var18);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test310");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0, (-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test311");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    var5.test();
    junit.framework.TestResult var8 = var5.run();
    var3.run(var8);
    junit.framework.TestResult var10 = var3.run();
    java.lang.String var11 = var3.getName();
    var3.setName("hi!");
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var16 = var15.toString();
    var15.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var19 = var15.countTestCases();
    java.lang.String var21 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var15, (java.lang.Object)true);
    java.lang.String var22 = var15.toString();
    java.lang.String var23 = var15.toString();
    java.lang.String var24 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var3, (java.lang.Object)var15);
    com.application.ciadobusao.test.EncontroTeste var27 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var28 = var27.run();
    junit.framework.TestResult var29 = var27.run();
    junit.framework.TestResult var30 = var27.run();
    com.application.ciadobusao.test.EncontroTeste var32 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var33 = var32.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var32);
    java.lang.String var35 = var32.toString();
    java.lang.String var36 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var30, (java.lang.Object)var32);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var30);
    var3.run(var30);
    com.application.ciadobusao.test.EncontroTeste var40 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var41 = var40.toString();
    var40.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var44 = var40.countTestCases();
    java.lang.String var46 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var40, (java.lang.Object)true);
    java.lang.String var47 = var40.toString();
    java.lang.String var48 = var40.toString();
    junit.framework.TestResult var49 = var40.run();
    java.lang.Object var50 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var51 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var50, (java.lang.Object)var51);
    java.lang.String var53 = var51.toString();
    junit.framework.TestResult var54 = var51.run();
    var40.run(var54);
    junit.framework.Assert.assertNotSame((java.lang.Object)var3, (java.lang.Object)var54);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)1.0f, (java.lang.Object)var54);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var21.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var22.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var24.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var35.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var41.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var46.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var47.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var48.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var53.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test312");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10L, 1L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test313");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    int var2 = var1.countTestCases();
    java.lang.String var3 = var1.getName();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    var7.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var11 = var7.countTestCases();
    java.lang.String var13 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var7, (java.lang.Object)true);
    java.lang.String var14 = var7.toString();
    java.lang.String var15 = var7.toString();
    junit.framework.TestResult var16 = var7.run();
    var1.run(var16);
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var20 = var19.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var19);
    junit.framework.TestResult var22 = var19.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", (java.lang.Object)var16, (java.lang.Object)var19);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test314");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (short)100, (short)100);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test315");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    java.lang.String var5 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    junit.framework.TestResult var9 = var6.run();
    var2.run(var9);
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test316");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    junit.framework.TestResult var3 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var4.test();
    junit.framework.TestResult var7 = var4.run();
    int var8 = var4.countTestCases();
    junit.framework.TestResult var9 = var4.run();
    var1.run(var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var9, (java.lang.Object)(short)10);
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
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test317");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (short)(-1), (short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test318");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", "hi!");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test319");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.TestResult var5 = var2.run();
    java.lang.String var6 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var8, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var13 = var8.getName();
    var8.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    var2.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var21 = var20.toString();
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var23 = var22.run();
    var20.run(var23);
    junit.framework.Assert.assertNotSame("", (java.lang.Object)var23, (java.lang.Object)100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)100.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var21.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test320");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (byte)0, (byte)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test321");


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
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var1);
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

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test322");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var6 = var1.getName();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var9 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var9);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test323");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)100, (short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test324");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var4 = var3.toString();
    var3.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var7 = var3.countTestCases();
    java.lang.String var9 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var3, (java.lang.Object)true);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    junit.framework.TestResult var12 = var3.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var12);
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    junit.framework.TestResult var16 = var14.run();
    junit.framework.TestResult var17 = var14.run();
    var14.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var14);
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
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test325");


    junit.framework.Assert.assertFalse("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", false);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test326");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", 10.0d, (-1.0d), 1.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test327");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var1.run(var4);
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var7);
    java.lang.String var10 = var7.toString();
    int var11 = var7.countTestCases();
    int var12 = var7.countTestCases();
    java.lang.String var13 = var7.getName();
    junit.framework.Assert.assertNotSame((java.lang.Object)var4, (java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var7);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test328");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.getName();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var2, (java.lang.Object)1);
    int var7 = var2.countTestCases();
    junit.framework.Assert.assertNotNull((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test329");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    int var6 = var2.countTestCases();
    junit.framework.Assert.assertNotSame("hi!", (java.lang.Object)var2, (java.lang.Object)0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)"hi!");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test330");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", '4', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test331");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var4 = var3.toString();
    var3.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var7 = var3.run();
    java.lang.String var8 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)(byte)10, (java.lang.Object)var3);
    java.lang.String var9 = var3.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9);
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

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test332");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (byte)10, (byte)10);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test333");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", 1, 10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test334");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)1, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test335");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", 1.0f, 10.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test336");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (short)10, (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test337");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var2.run(var5);
    var2.test();
    java.lang.String var8 = junit.framework.Assert.format("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", var1, (java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    var10.test();
    java.lang.String var13 = var10.getName();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    var10.run(var15);
    junit.framework.Assert.assertNotSame("hi!", (java.lang.Object)var10, (java.lang.Object)"hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var8, (java.lang.Object)"hi!");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test338");


    junit.framework.Assert.assertEquals((short)1, (short)1);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test339");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    java.lang.String var4 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    junit.framework.TestResult var11 = var8.run();
    int var12 = var8.countTestCases();
    java.lang.Object var15 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var15, (java.lang.Object)var16);
    java.lang.String var18 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var16);
    java.lang.String var19 = var16.toString();
    var16.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.Assert.assertNotSame("hi! expected:<100> but was:<10>", (java.lang.Object)var8, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    com.application.ciadobusao.test.EncontroTeste var23 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var24 = var23.toString();
    var23.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var27 = var23.run();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"hi! expected:<100> but was:<10>", (java.lang.Object)var27);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var4, (java.lang.Object)var27);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var18.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var24.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test340");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getName();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    int var6 = var5.countTestCases();
    java.lang.String var7 = var5.getName();
    junit.framework.TestResult var8 = var5.run();
    int var9 = var5.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var12 = var11.toString();
    var11.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var15 = var11.countTestCases();
    java.lang.String var17 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var11, (java.lang.Object)true);
    java.lang.String var18 = var11.toString();
    java.lang.String var19 = var11.toString();
    junit.framework.TestResult var20 = var11.run();
    var5.run(var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)var20);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var17.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test341");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var6 = var1.getName();
    junit.framework.TestResult var7 = var1.run();
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test342");


    junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test343");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    java.lang.String var7 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)true);
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    java.lang.String var11 = var8.toString();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var13 = var12.toString();
    var12.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var16 = var12.countTestCases();
    int var17 = var12.countTestCases();
    junit.framework.Assert.assertNotSame((java.lang.Object)var8, (java.lang.Object)var17);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var17);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test344");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (byte)1, (byte)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test345");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (java.lang.Object)var2, (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test346");


    junit.framework.Assert.assertEquals(0.0d, 10.0d, 100.0d);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test347");


    junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", 1.0f, (-1.0f), 100.0f);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test348");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    junit.framework.TestResult var9 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var11);
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9, (java.lang.Object)var11);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    junit.framework.TestResult var18 = var16.run();
    java.lang.String var19 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var9, (java.lang.Object)var18);
    var0.run(var18);
    var0.test();
    java.lang.String var22 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test349");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", "hi!");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test350");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var2);
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var8 = var2.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    java.lang.String var10 = var2.getName();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    int var12 = var11.countTestCases();
    java.lang.String var13 = var11.getName();
    int var14 = var11.countTestCases();
    java.lang.String var15 = var11.getName();
    junit.framework.Assert.assertNotSame((java.lang.Object)var11, (java.lang.Object)true);
    junit.framework.TestResult var18 = var11.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<100> but was:<10>", (java.lang.Object)var2, (java.lang.Object)var11);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test351");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (byte)0, (byte)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test352");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", 100.0f, (-1.0f), 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test353");


    junit.framework.Assert.assertEquals(100.0f, 100.0f, 10.0f);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test354");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    junit.framework.TestResult var2 = var0.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test355");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    java.lang.String var5 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var1, (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test356");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", 0L, 0L);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test357");


    junit.framework.Assert.assertEquals("", (-1L), (-1L));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test358");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)(-1), (byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test359");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var5 = var1.toString();
    junit.framework.Assert.assertNotSame((java.lang.Object)(short)(-1), (java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test360");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100, 10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test361");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.TestResult var4 = var1.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var1);
    java.lang.String var6 = var1.getName();
    int var7 = var1.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test362");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.TestResult var4 = var1.run();
    var1.test();
    var1.setName(" expected:<10> but was:<10>");
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    junit.framework.TestResult var11 = var9.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)" expected:<10> but was:<10>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test363");


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
    java.lang.Object var14 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var14, (java.lang.Object)var15);
    java.lang.String var17 = var15.toString();
    junit.framework.TestResult var18 = var15.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var2, (java.lang.Object)var18);
    var2.test();
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var23 = var22.toString();
    var22.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var26 = var22.countTestCases();
    java.lang.String var28 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var22, (java.lang.Object)true);
    java.lang.String var29 = var22.toString();
    java.lang.String var30 = var22.toString();
    junit.framework.TestResult var31 = var22.run();
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
    var32.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    junit.framework.Assert.assertNotSame((java.lang.Object)var31, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)var31);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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
    assertTrue("'" + var17 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var17.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
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

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test364");


    junit.framework.Assert.assertNotNull((java.lang.Object)"hi!");

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test365");


    junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", 0.0f, 100.0f, 100.0f);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test366");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var4.test();
    junit.framework.TestResult var7 = var4.run();
    var2.run(var7);
    junit.framework.TestResult var9 = var2.run();
    java.lang.String var10 = var2.getName();
    var2.setName("hi!");
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var15 = var14.toString();
    var14.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var18 = var14.countTestCases();
    java.lang.String var20 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var14, (java.lang.Object)true);
    java.lang.String var21 = var14.toString();
    java.lang.String var22 = var14.toString();
    java.lang.String var23 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var2, (java.lang.Object)var14);
    com.application.ciadobusao.test.EncontroTeste var26 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var27 = var26.run();
    junit.framework.TestResult var28 = var26.run();
    junit.framework.TestResult var29 = var26.run();
    com.application.ciadobusao.test.EncontroTeste var31 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var32 = var31.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var31);
    java.lang.String var34 = var31.toString();
    java.lang.String var35 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var29, (java.lang.Object)var31);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var29);
    var2.run(var29);
    com.application.ciadobusao.test.EncontroTeste var39 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var40 = var39.toString();
    var39.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var43 = var39.countTestCases();
    java.lang.String var45 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var39, (java.lang.Object)true);
    java.lang.String var46 = var39.toString();
    java.lang.String var47 = var39.toString();
    junit.framework.TestResult var48 = var39.run();
    java.lang.Object var49 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var50 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var49, (java.lang.Object)var50);
    java.lang.String var52 = var50.toString();
    junit.framework.TestResult var53 = var50.run();
    var39.run(var53);
    junit.framework.Assert.assertNotSame((java.lang.Object)var2, (java.lang.Object)var53);
    com.application.ciadobusao.test.EncontroTeste var56 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var57 = var56.run();
    var56.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    junit.framework.TestResult var60 = var56.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var2, (java.lang.Object)var56);
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
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var20.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var21.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var22.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var34.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var40.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var45.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var46.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var47.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var52.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test367");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test368");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", (byte)10, (byte)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test369");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test370");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    var0.run(var5);
    junit.framework.TestResult var7 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var9);
    junit.framework.TestResult var12 = var9.run();
    var9.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)var9);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test371");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    java.lang.String var7 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)true);
    java.lang.String var8 = var1.toString();
    int var9 = var1.countTestCases();
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
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test372");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (byte)100, (byte)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test373");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1);
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var4.test();
    java.lang.String var7 = var4.getName();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var4.run(var9);
    var1.run(var9);
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    var14.test();
    junit.framework.TestResult var17 = var14.run();
    var12.run(var17);
    var1.run(var17);
    java.lang.Object var20 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var21 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var20, (java.lang.Object)var21);
    junit.framework.TestResult var23 = var21.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var17, (java.lang.Object)var23);
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var17, (java.lang.Object)var43);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
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

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test374");


    junit.framework.Assert.assertEquals((short)100, (short)100);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test375");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    int var6 = var2.countTestCases();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)0L, (java.lang.Object)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test376");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test377");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", (short)100, (short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test378");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test379");


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
    int var14 = var0.countTestCases();
    var0.test();
    java.lang.Object var16 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var16, (java.lang.Object)var17);
    junit.framework.TestResult var19 = var17.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)var17);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test380");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var6 = var1.getName();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var9 = var1.run();
    junit.framework.TestResult var10 = var1.run();
    java.lang.String var11 = var1.toString();
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
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test381");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (byte)1, (byte)1);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test382");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var3.test();
    junit.framework.TestResult var6 = var3.run();
    var1.run(var6);
    junit.framework.TestResult var8 = var1.run();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var1);
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

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test383");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var7 = var6.toString();
    var6.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var10 = var6.countTestCases();
    java.lang.String var12 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var6, (java.lang.Object)true);
    java.lang.String var13 = var6.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var3, (java.lang.Object)var13);
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var16 = var15.toString();
    var15.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var19 = var15.countTestCases();
    int var20 = var15.countTestCases();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var13, (java.lang.Object)var15);
    junit.framework.TestResult var22 = var15.run();
    java.lang.String var23 = var15.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test384");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (-1L), (-1L));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test385");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", 0.0d, 100.0d, 10.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test386");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0, 100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test387");


    junit.framework.Assert.assertEquals(0.0f, 0.0f, 10.0f);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test388");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", 100L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test389");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test390");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (byte)1, (byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test391");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotNull((java.lang.Object)var1);
    junit.framework.TestResult var3 = var1.run();
    java.lang.String var4 = var1.getName();
    int var5 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    var6.test();
    junit.framework.TestResult var9 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    junit.framework.TestResult var14 = var12.run();
    junit.framework.TestResult var15 = var12.run();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var18 = var17.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var17);
    java.lang.String var20 = var17.toString();
    java.lang.String var21 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var15, (java.lang.Object)var17);
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var23 = var22.run();
    junit.framework.TestResult var24 = var22.run();
    java.lang.String var25 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var15, (java.lang.Object)var24);
    var6.run(var24);
    var6.test();
    java.lang.String var28 = var6.getName();
    int var29 = var6.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var5, (java.lang.Object)var6);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var20.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test392");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var6 = var1.getName();
    junit.framework.TestResult var7 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    junit.framework.TestResult var12 = var10.run();
    junit.framework.TestResult var13 = var10.run();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var16 = var15.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var15);
    java.lang.String var18 = var15.toString();
    java.lang.String var19 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var13, (java.lang.Object)var15);
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var21 = var20.run();
    junit.framework.TestResult var22 = var20.run();
    java.lang.String var23 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var13, (java.lang.Object)var22);
    java.lang.Object var24 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var25 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var24, (java.lang.Object)var25);
    junit.framework.TestResult var27 = var25.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var22, (java.lang.Object)var25);
    var1.run(var22);
    java.lang.Object var30 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var31 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var30, (java.lang.Object)var31);
    junit.framework.TestResult var33 = var31.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var22, (java.lang.Object)var31);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test393");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test394");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test395");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    junit.framework.TestResult var5 = var3.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var3);
    var3.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var9 = var3.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var3);
    java.lang.String var11 = var3.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi!", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var11);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test396");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var3);
    junit.framework.TestResult var6 = var3.run();
    var3.test();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var3);
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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var3, (java.lang.Object)var9);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test397");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    junit.framework.TestResult var9 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var11);
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9, (java.lang.Object)var11);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    junit.framework.TestResult var18 = var16.run();
    java.lang.String var19 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var9, (java.lang.Object)var18);
    var0.run(var18);
    var0.test();
    java.lang.Object var24 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var25 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var24, (java.lang.Object)var25);
    java.lang.String var27 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var25);
    java.lang.String var28 = var25.toString();
    java.lang.String var29 = var25.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)var25);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var27.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var28.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var29.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test398");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var14);
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

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test399");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("hi! expected:<100> but was:<10>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test400");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 100L, 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test401");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (-1.0d), 10.0d, 100.0d);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test402");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", 10, (-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test403");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test404");


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
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var14 = var13.toString();
    var13.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var17 = var13.countTestCases();
    java.lang.String var19 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var13, (java.lang.Object)true);
    java.lang.String var20 = var13.toString();
    java.lang.String var21 = var13.toString();
    java.lang.String var22 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var1, (java.lang.Object)var13);
    com.application.ciadobusao.test.EncontroTeste var25 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var26 = var25.run();
    junit.framework.TestResult var27 = var25.run();
    junit.framework.TestResult var28 = var25.run();
    com.application.ciadobusao.test.EncontroTeste var30 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var31 = var30.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var30);
    java.lang.String var33 = var30.toString();
    java.lang.String var34 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var28, (java.lang.Object)var30);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var28);
    var1.run(var28);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var28);
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
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var20.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var21.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var22.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var33.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test405");


    junit.framework.Assert.assertEquals(1, 1);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test406");


    junit.framework.Assert.assertEquals((short)10, (short)10);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test407");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", 10.0f, 1.0f, 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test408");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", " expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test409");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)100L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test410");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 1, 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test411");


    junit.framework.Assert.assertEquals((-1.0d), 10.0d, 100.0d);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test412");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (byte)0, (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test413");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", true, false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test414");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", (short)1, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test415");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    int var2 = var1.countTestCases();
    java.lang.String var3 = var1.getName();
    junit.framework.TestResult var4 = var1.run();
    var1.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test416");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test417");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test418");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test419");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var1.run(var4);
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    junit.framework.TestResult var11 = var8.run();
    var6.run(var11);
    var1.run(var11);
    java.lang.String var14 = var1.toString();
    int var15 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var18 = var17.toString();
    var17.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var21 = var17.countTestCases();
    java.lang.String var23 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var17, (java.lang.Object)true);
    java.lang.String var24 = var17.toString();
    java.lang.String var25 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)var15, (java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var23.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var24.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<1> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var25.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<1> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test420");


    junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", true, true);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test421");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    int var2 = var1.countTestCases();
    java.lang.String var3 = var1.getName();
    java.lang.String var4 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    junit.framework.TestResult var9 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var11);
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9, (java.lang.Object)var11);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    var16.test();
    junit.framework.TestResult var19 = var16.run();
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var23 = var22.run();
    junit.framework.TestResult var24 = var22.run();
    junit.framework.TestResult var25 = var22.run();
    com.application.ciadobusao.test.EncontroTeste var27 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var28 = var27.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var27);
    java.lang.String var30 = var27.toString();
    java.lang.String var31 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var25, (java.lang.Object)var27);
    com.application.ciadobusao.test.EncontroTeste var32 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var33 = var32.run();
    junit.framework.TestResult var34 = var32.run();
    java.lang.String var35 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var25, (java.lang.Object)var34);
    var16.run(var34);
    var11.run(var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1, (java.lang.Object)var11);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var30.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test422");


    junit.framework.Assert.assertEquals(100.0f, 100.0f, 1.0f);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test423");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<1> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test424");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", ' ', '4');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test425");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test426");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var1.run(var4);
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    junit.framework.TestResult var11 = var8.run();
    var6.run(var11);
    var1.run(var11);
    java.lang.String var14 = var1.toString();
    int var15 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var18 = var17.run();
    var17.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var17, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var22 = var17.getName();
    var17.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var25 = var17.run();
    var17.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame(" expected:<10> but was:<10>", (java.lang.Object)var15, (java.lang.Object)var17);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test427");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", ' ', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test428");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test429");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (short)0, (short)0);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test430");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1.0f, 10.0f, 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test431");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)"hi!", (java.lang.Object)0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test432");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", true, true);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test433");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test434");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", 10.0f, 100.0f, 10.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test435");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var7 = var2.getName();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var10 = var2.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    var13.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var13, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var18 = var13.getName();
    junit.framework.TestResult var19 = var13.run();
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var23 = var22.run();
    junit.framework.TestResult var24 = var22.run();
    junit.framework.TestResult var25 = var22.run();
    com.application.ciadobusao.test.EncontroTeste var27 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var28 = var27.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var27);
    java.lang.String var30 = var27.toString();
    java.lang.String var31 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var25, (java.lang.Object)var27);
    com.application.ciadobusao.test.EncontroTeste var32 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var33 = var32.run();
    junit.framework.TestResult var34 = var32.run();
    java.lang.String var35 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var25, (java.lang.Object)var34);
    java.lang.Object var36 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var37 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var36, (java.lang.Object)var37);
    junit.framework.TestResult var39 = var37.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var34, (java.lang.Object)var37);
    var13.run(var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<1> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2, (java.lang.Object)var34);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var30.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test436");


    java.lang.Object var4 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var4, (java.lang.Object)var5);
    java.lang.String var7 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var5);
    java.lang.String var8 = var5.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)(byte)(-1), (java.lang.Object)var8);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var7.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test437");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", true, false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test438");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>", "hi! expected:<100> but was:<10>", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test439");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    junit.framework.TestResult var6 = var4.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var4);
    var4.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var10 = var4.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var4);
    junit.framework.TestResult var12 = var4.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)var12);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test440");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<1> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", 100, 100);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test441");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test442");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    junit.framework.TestResult var5 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var7 = var6.toString();
    var6.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var10 = var6.countTestCases();
    int var11 = var6.countTestCases();
    java.lang.String var12 = var6.getName();
    java.lang.String var13 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var5, (java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test443");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test444");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (-1.0f), 10.0f, 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test445");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    java.lang.String var7 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)true);
    junit.framework.Assert.assertNotNull((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test446");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var7 = var2.getName();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    var10.test();
    java.lang.String var13 = var10.getName();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    var10.run(var15);
    junit.framework.TestResult var17 = var10.run();
    var2.run(var17);
    java.lang.Object var19 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var19, (java.lang.Object)var20);
    java.lang.String var22 = var20.toString();
    com.application.ciadobusao.test.EncontroTeste var23 = new com.application.ciadobusao.test.EncontroTeste();
    int var24 = var23.countTestCases();
    java.lang.String var25 = var23.getName();
    junit.framework.TestResult var26 = var23.run();
    var20.run(var26);
    int var28 = var20.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var17, (java.lang.Object)var20);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var22.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test447");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<1> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test448");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)(short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test449");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    java.lang.String var3 = var0.getName();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var0.run(var5);
    java.lang.String var7 = var0.toString();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test450");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", '#', ' ');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test451");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    junit.framework.TestResult var9 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var11);
    java.lang.String var14 = var11.toString();
    java.lang.String var15 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9, (java.lang.Object)var11);
    com.application.ciadobusao.test.EncontroTeste var16 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var17 = var16.run();
    junit.framework.TestResult var18 = var16.run();
    java.lang.String var19 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var9, (java.lang.Object)var18);
    var0.run(var18);
    var0.test();
    java.lang.String var22 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test452");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>", (short)1, (short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test453");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", 'a', 'a');

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test454");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test455");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (short)1, (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test456");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10, 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test457");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (short)100, (short)100);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test458");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
    java.lang.String var5 = var2.toString();
    int var6 = var2.countTestCases();
    int var7 = var2.countTestCases();
    java.lang.String var8 = var2.getName();
    var2.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    java.lang.String var13 = var11.toString();
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
    var11.run(var24);
    var2.run(var24);
    com.application.ciadobusao.test.EncontroTeste var29 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var30 = var29.toString();
    com.application.ciadobusao.test.EncontroTeste var31 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var32 = var31.run();
    var29.run(var32);
    com.application.ciadobusao.test.EncontroTeste var34 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var35 = var34.run();
    com.application.ciadobusao.test.EncontroTeste var36 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var37 = var36.run();
    var36.test();
    junit.framework.TestResult var39 = var36.run();
    var34.run(var39);
    var29.run(var39);
    java.lang.String var42 = var29.toString();
    java.lang.Object var43 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var44 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var43, (java.lang.Object)var44);
    java.lang.String var46 = var44.toString();
    junit.framework.TestResult var47 = var44.run();
    com.application.ciadobusao.test.EncontroTeste var49 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var50 = var49.run();
    var49.test();
    java.lang.String var52 = var49.toString();
    com.application.ciadobusao.test.EncontroTeste var53 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var54 = var53.run();
    junit.framework.TestResult var55 = var53.run();
    junit.framework.TestResult var56 = var53.run();
    var49.run(var56);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var49, (java.lang.Object)(byte)100);
    junit.framework.Assert.assertNotSame((java.lang.Object)var47, (java.lang.Object)(byte)100);
    junit.framework.Assert.assertNotSame((java.lang.Object)var47, (java.lang.Object)0.0f);
    var29.run(var47);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2, (java.lang.Object)var29);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
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
    assertTrue("'" + var30 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var30.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var42.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var46.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var52.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test459");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    int var2 = var1.countTestCases();
    java.lang.String var3 = var1.getName();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var7 = var6.toString();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var6.run(var9);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)var9);
    int var12 = var1.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test460");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (byte)10, (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test461");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    java.lang.String var5 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var3);
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.runBare();
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

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test462");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<10> but was:< expected:<10> but was:<10>(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test463");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", false, false);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test464");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10.0d, 1.0d, 1.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test465");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1L), 100L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test466");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    junit.framework.Assert.assertNotNull((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var4);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test467");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (short)(-1), (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test468");


    junit.framework.Assert.assertEquals((-1.0d), 0.0d, 100.0d);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test469");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    int var6 = var1.countTestCases();
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test470");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test471");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (-1), 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test472");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var7.run(var10);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var10);
    var2.run(var10);
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var10);
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var16 = var15.run();
    var15.test();
    junit.framework.TestResult var18 = var15.run();
    int var19 = var15.countTestCases();
    junit.framework.Assert.assertNotSame((java.lang.Object)"hi!", (java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test473");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var6 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    int var8 = var7.countTestCases();
    java.lang.String var9 = var7.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var1, (java.lang.Object)var7);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test474");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    java.lang.String var3 = var0.getName();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var0.run(var5);
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var9 = var8.toString();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    var8.run(var11);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var11);
    junit.framework.Assert.assertNotNull((java.lang.Object)var11);
    junit.framework.Assert.assertNotSame((java.lang.Object)var11, (java.lang.Object)true);
    junit.framework.Assert.assertNotSame((java.lang.Object)var0, (java.lang.Object)var11);
    com.application.ciadobusao.test.EncontroTeste var18 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var19 = var18.toString();
    var18.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var22 = var18.getName();
    var18.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var22.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test475");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("hi!(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test476");


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
    junit.framework.TestResult var12 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)'a');
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
    assertNotNull(var12);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test477");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("hi!(com.application.ciadobusao.test.EncontroTeste)", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test478");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var2.run(var5);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var5);
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    java.lang.String var11 = var8.toString();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var13 = var12.toString();
    var12.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var16 = var12.countTestCases();
    int var17 = var12.countTestCases();
    junit.framework.Assert.assertNotSame((java.lang.Object)var8, (java.lang.Object)var17);
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var20 = var19.run();
    junit.framework.TestResult var21 = var19.run();
    junit.framework.TestResult var22 = var19.run();
    var19.test();
    var19.test();
    junit.framework.Assert.assertNotSame((java.lang.Object)var8, (java.lang.Object)var19);
    var8.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
    int var28 = var8.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"hi! expected:<100> but was:<10>", (java.lang.Object)var28);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test479");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    java.lang.String var4 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var6 = var5.toString();
    var5.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var9 = var5.countTestCases();
    int var10 = var5.countTestCases();
    junit.framework.Assert.assertNotSame((java.lang.Object)var1, (java.lang.Object)var10);
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    junit.framework.TestResult var14 = var12.run();
    junit.framework.TestResult var15 = var12.run();
    var12.test();
    var12.test();
    junit.framework.Assert.assertNotSame((java.lang.Object)var1, (java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var12);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test480");


    java.lang.Object var2 = new java.lang.Object();
    junit.framework.Assert.assertNotSame("hi! expected:<100> but was:<10>", (java.lang.Object)1.0d, var2);
    junit.framework.Assert.assertNotNull(var2);
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    java.lang.String var7 = var5.toString();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var9 = var8.toString();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    var8.run(var11);
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var16 = var15.run();
    var15.test();
    junit.framework.TestResult var18 = var15.run();
    var13.run(var18);
    var8.run(var18);
    var5.run(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(var2, (java.lang.Object)var18);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test481");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1);
    java.lang.String var4 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var9 = var8.toString();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    var8.run(var11);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var11);
    junit.framework.Assert.assertNotSame((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"hi! expected:<100> but was:<10>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test482");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test483");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    var6.test();
    junit.framework.TestResult var9 = var6.run();
    var4.run(var9);
    junit.framework.TestResult var11 = var4.run();
    java.lang.String var12 = var4.getName();
    java.lang.String var13 = var4.getName();
    junit.framework.TestResult var14 = var4.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var3, (java.lang.Object)var14);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test484");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 0.0f, 0.0f, 100.0f);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test485");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
    java.lang.String var5 = var2.toString();
    int var6 = var2.countTestCases();
    int var7 = var2.countTestCases();
    java.lang.String var8 = var2.getName();
    var2.setName("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var2, (java.lang.Object)0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test486");


    junit.framework.Assert.assertEquals(0.0d, 0.0d, 0.0d);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test487");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (short)1, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test488");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (byte)10, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test489");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", 'a', ' ');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test490");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>> expected:<hi!(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)10.0d, (java.lang.Object)(short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test491");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test492");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test493");


    java.lang.Object var4 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var4, (java.lang.Object)var5);
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var9 = var8.toString();
    var8.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var12 = var8.countTestCases();
    java.lang.String var14 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var8, (java.lang.Object)true);
    java.lang.String var15 = var8.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var5, (java.lang.Object)var15);
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var18 = var17.toString();
    var17.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var21 = var17.countTestCases();
    int var22 = var17.countTestCases();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var15, (java.lang.Object)var17);
    junit.framework.TestResult var24 = var17.run();
    java.lang.String var25 = var17.getName();
    java.lang.String var26 = junit.framework.Assert.format("hi!", (java.lang.Object)"hi!", (java.lang.Object)var17);
    var17.test();
    com.application.ciadobusao.test.EncontroTeste var28 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotNull((java.lang.Object)var28);
    junit.framework.TestResult var30 = var28.run();
    java.lang.String var31 = var28.getName();
    int var32 = var28.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var17, (java.lang.Object)var28);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var25.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var26.equals("hi! expected:<hi!> but was:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test494");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)> but was:< expected:<10> but was:<10>>", (-1.0d), 1.0d, (-1.0d));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test495");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", 'a', '4');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test496");


    junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (short)100, (short)100);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test497");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var3.test();
    java.lang.String var6 = var3.toString();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    junit.framework.TestResult var9 = var7.run();
    junit.framework.TestResult var10 = var7.run();
    var3.run(var10);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var3, (java.lang.Object)(byte)100);
    java.lang.String var14 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)(-1L), (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>>"+ "'", var14.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true> expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>>"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test498");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10.0d, (-1.0d), 0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test499");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame(" expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest1.test500");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0L, 1L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

}
