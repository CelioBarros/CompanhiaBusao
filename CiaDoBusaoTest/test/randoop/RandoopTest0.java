package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    junit.framework.Assert.assertNotNull("", (java.lang.Object)100.0d);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)(short)(-1), (java.lang.Object)(byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(true, false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    java.lang.String var3 = junit.framework.Assert.format("", (java.lang.Object)10L, (java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + " expected:<10> but was:<10>"+ "'", var3.equals(" expected:<10> but was:<10>"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)" expected:<10> but was:<10>", (java.lang.Object)(byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue(" expected:<10> but was:<10>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue(false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    junit.framework.Assert.assertEquals(false, false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)'4', (java.lang.Object)100.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi!", (java.lang.Object)' ', (java.lang.Object)0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi!", (java.lang.Object)(short)(-1), (java.lang.Object)1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    java.lang.String var3 = junit.framework.Assert.format("hi!", (java.lang.Object)(short)100, (java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "hi! expected:<100> but was:<10>"+ "'", var3.equals("hi! expected:<100> but was:<10>"));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", (short)1, (short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("hi!", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", " expected:<10> but was:<10>");

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", (byte)0, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", " expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1.0d), 10.0d, 1.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)(short)10, (java.lang.Object)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("hi! expected:<100> but was:<10>", (java.lang.Object)"hi!", (java.lang.Object)(byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<100> but was:<10>", (java.lang.Object)(-1), (java.lang.Object)0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (-1.0f), 10.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    junit.framework.Assert.assertTrue(true);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", '#', '#');

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    junit.framework.Assert.assertEquals((-1.0f), (-1.0f), 10.0f);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", (-1L), 0L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)10, (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    junit.framework.Assert.assertEquals(0.0f, 0.0f, 0.0f);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", 100, (-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    junit.framework.Assert.assertEquals("hi!", " expected:<10> but was:<10>", " expected:<10> but was:<10>");

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", "hi!", "");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)100L, (java.lang.Object)'4');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    junit.framework.Assert.assertNotSame((java.lang.Object)1.0d, (java.lang.Object)(byte)100);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", (java.lang.Object)0, (java.lang.Object)(byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)1, (byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    junit.framework.Assert.assertFalse(false);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    junit.framework.Assert.assertNotNull((java.lang.Object)0);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (-1.0f), 100.0f, 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    junit.framework.Assert.assertEquals((-1.0d), 0.0d, 10.0d);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10.0d, 0.0d, 1.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)false, (java.lang.Object)true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    junit.framework.Assert.assertNotNull((java.lang.Object)1);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    junit.framework.Assert.assertNotSame("", (java.lang.Object)(short)10, (java.lang.Object)'a');

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 10.0d, 1.0d, (-1.0d));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 0.0f, (-1.0f), 1.0f);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)10, (byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi!", (java.lang.Object)'#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("", (java.lang.Object)0, (java.lang.Object)"hi!");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    junit.framework.Assert.assertFalse(" expected:<10> but was:<10>", false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame(" expected:<10> but was:<10>", (java.lang.Object)(byte)10, (java.lang.Object)true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)100, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", 1, 10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals('4', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi!", (java.lang.Object)'a', (java.lang.Object)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (short)10, (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("hi!", (java.lang.Object)10, (java.lang.Object)(short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1L, 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    junit.framework.Assert.assertEquals("hi!", 0.0f, 10.0f, 10.0f);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse(true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    junit.framework.Assert.assertEquals(true, true);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    junit.framework.Assert.assertEquals("hi!", 0L, 0L);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", (short)10, (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1.0d), 0.0d, (-1.0d));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals('a', '4');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 10.0f, (-1.0f), (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    junit.framework.Assert.assertEquals((byte)1, (byte)1);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1.0f, (-1.0f), 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    junit.framework.Assert.assertEquals("", 0.0d, 0.0d, 1.0d);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", "hi! expected:<100> but was:<10>", " expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", (-1.0f), 100.0f, 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", ' ', ' ');

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", true, true);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    junit.framework.Assert.assertEquals(10.0f, 10.0f, 100.0f);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    junit.framework.Assert.assertTrue("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", true);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    java.lang.String var3 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)(byte)100, (java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>"));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)1.0f, (java.lang.Object)"hi! expected:<100> but was:<10>");

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", 1.0d, 1.0d, (-1.0d));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 0.0f, 100.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    java.lang.String var3 = var1.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    junit.framework.Assert.assertEquals("hi!", 100.0d, 0.0d, 100.0d);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)true, (java.lang.Object)1.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(' ', '4');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", 10.0f, 100.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", " expected:<10> but was:<10>", "hi!");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)10, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)1, (byte)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", "hi!");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)'a', (java.lang.Object)100.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", 1, 10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)(short)(-1), var2);
    junit.framework.Assert.assertNotNull((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", "", " expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
    java.lang.String var6 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", " expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", 10.0d, 1.0d, 100.0d);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    junit.framework.Assert.assertEquals((byte)0, (byte)0);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10.0f, 0.0f, 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("hi!", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    junit.framework.Assert.assertEquals("hi!", 10.0f, 10.0f, 1.0f);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var5);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", 10.0f, (-1.0f), 10.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals('4', ' ');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", 100L, 1L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", 0.0f, (-1.0f), (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    junit.framework.Assert.assertNotNull((java.lang.Object)100L);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName(" expected:<10> but was:<10>");
    java.lang.Object var6 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var6, (java.lang.Object)var7);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)(short)(-1), var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)" expected:<10> but was:<10>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals('#', 'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)10, (byte)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10.0f, 1.0f, 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    junit.framework.Assert.assertNotSame((java.lang.Object)(byte)(-1), (java.lang.Object)10L);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (short)100, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    junit.framework.Assert.assertTrue(" expected:<10> but was:<10>", true);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    java.lang.String var4 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var6 = var5.toString();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    var5.run(var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", (java.lang.Object)var4, (java.lang.Object)var8);
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
    assertNotNull(var8);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1, 100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.TestResult var4 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var1);
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

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)'4');

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)(-1.0f), (java.lang.Object)(short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    int var2 = var1.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("", (java.lang.Object)var2, (java.lang.Object)(byte)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0.0f, 10.0f, 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    int var1 = var0.countTestCases();
    java.lang.String var2 = var0.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)100L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)100.0d, (java.lang.Object)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)100.0d, (java.lang.Object)1L);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (short)1, (short)1);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", 10.0f, 1.0f, 0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", "hi!");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", 1L, 0L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("hi! expected:<100> but was:<10>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)100, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", true);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    junit.framework.Assert.assertEquals("", (byte)100, (byte)100);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", true);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    junit.framework.TestResult var4 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var4, (java.lang.Object)(byte)100);
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

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100, 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", 100L, 0L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)0, (byte)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)'4', (java.lang.Object)" expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 0.0f, (-1.0f), (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    junit.framework.Assert.assertEquals("", '4', '4');

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


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
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)1);
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

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (short)1, (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", '4', '4');

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)' ', (java.lang.Object)0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)0, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (short)10, (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", 0.0f, 1.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName(" expected:<10> but was:<10>");
    junit.framework.Assert.assertNotNull((java.lang.Object)" expected:<10> but was:<10>");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1, 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste)", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var4 = var0.getName();
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
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (short)(-1), (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (byte)(-1), (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 10.0d, 1.0d, 100.0d);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", 0, 100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (byte)0, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", 0, 0);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    junit.framework.Assert.assertNotSame((java.lang.Object)0.0f, (java.lang.Object)(short)(-1));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    junit.framework.Assert.assertFalse("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    java.lang.String var3 = var0.toString();
    java.lang.String var4 = var0.getName();
    java.lang.Object var7 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var7, (java.lang.Object)var8);
    java.lang.String var10 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var0, (java.lang.Object)"hi!");
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
    assertTrue("'" + var10 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var10.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (byte)0, (byte)0);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", '#', ' ');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var3, (java.lang.Object)1.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    java.lang.String var3 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)1.0f, (java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<100> but was:<10>", (java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)1.0f, (java.lang.Object)(short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", 100.0f, 10.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    junit.framework.Assert.assertEquals(0.0d, 0.0d, 100.0d);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    java.lang.String var6 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)(byte)100, (java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    junit.framework.Assert.assertEquals('a', 'a');

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", 10, 100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", (short)0, (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)10, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    junit.framework.Assert.assertEquals(100.0f, 100.0f, (-1.0f));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", (-1L), 1L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1L, 0L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    var1.run(var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", "hi! expected:<100> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(false, true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", "null(com.application.ciadobusao.test.EncontroTeste)", "null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var7);
    junit.framework.TestResult var10 = var7.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("", (java.lang.Object)var1, (java.lang.Object)var10);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var5 = var1.getName();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    int var7 = var6.countTestCases();
    java.lang.String var8 = var6.getName();
    junit.framework.TestResult var9 = var6.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var1, (java.lang.Object)var6);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    java.lang.Object var3 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var3, (java.lang.Object)var4);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)(short)(-1), var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", var3);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse(" expected:<10> but was:<10>", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)(-1.0f), (java.lang.Object)0L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", 100.0d, 0.0d, 10.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", '4', 'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    junit.framework.Assert.assertNotSame((java.lang.Object)(-1.0f), (java.lang.Object)(short)100);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", false, false);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (short)100, (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", 10L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    java.lang.String var5 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var3);
    java.lang.String var6 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var3);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var5.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    java.lang.Object var1 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", var1, (java.lang.Object)(-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", " expected:<10> but was:<10>", "hi! expected:<100> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
    java.lang.String var5 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)(byte)10, (java.lang.Object)var5);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var5 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var5, (java.lang.Object)100.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    junit.framework.TestResult var5 = var3.run();
    junit.framework.TestResult var6 = var3.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var8);
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var6, (java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("", (java.lang.Object)1.0f, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1);
    junit.framework.TestResult var4 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var1, (java.lang.Object)100.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", '4', '4');

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", 100.0d, 1.0d, 10.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)'4');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
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

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", 0.0f, 0.0f, 10.0f);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)1, (byte)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    java.lang.String var2 = var0.toString();
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
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("hi!");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (short)0, (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", (short)(-1), (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    int var1 = var0.countTestCases();
    java.lang.String var2 = var0.getName();
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

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    junit.framework.TestResult var9 = var7.run();
    junit.framework.TestResult var10 = var7.run();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var12);
    java.lang.String var15 = var12.toString();
    java.lang.String var16 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var10, (java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)var12);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
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

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    junit.framework.Assert.assertEquals("", true, true);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", true, false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", false);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    junit.framework.Assert.assertEquals("hi!", (byte)(-1), (byte)(-1));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    junit.framework.Assert.assertEquals(1.0d, (-1.0d), 100.0d);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    java.lang.String var7 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)true);
    java.lang.String var8 = var1.toString();
    java.lang.String var9 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    var11.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var11, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var1, (java.lang.Object)" expected:<10> but was:<10>");
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
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)10L, (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (short)10, (short)10);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var1);
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

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    junit.framework.TestResult var3 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var3, (java.lang.Object)true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi!", (java.lang.Object)(-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    junit.framework.TestResult var3 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    junit.framework.TestResult var7 = var5.run();
    junit.framework.TestResult var8 = var5.run();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var10);
    java.lang.String var13 = var10.toString();
    java.lang.String var14 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var8, (java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var3, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");
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
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10L, 100L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var6 = var2.countTestCases();
    java.lang.String var8 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)true);
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame(" expected:<10> but was:<10>", (java.lang.Object)var2, (java.lang.Object)10.0f);
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

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    int var4 = var0.countTestCases();
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

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"hi!");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", "", "null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", (short)(-1), (short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    int var1 = var0.countTestCases();
    junit.framework.Assert.assertNotNull((java.lang.Object)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    junit.framework.Assert.assertEquals(10, 10);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((byte)0, (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (byte)10, (byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    java.lang.String var7 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)true);
    java.lang.String var8 = var1.toString();
    java.lang.String var9 = var1.toString();
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
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100.0f, (-1.0f), 100.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    var0.run(var5);
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    var7.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var11 = var7.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var5, (java.lang.Object)var11);
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
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100, (-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var1, (java.lang.Object)(byte)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    junit.framework.Assert.assertEquals(1.0f, 1.0f, 10.0f);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (java.lang.Object)1.0d, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
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

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0, 1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1), 10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var5);
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

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (byte)100, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (short)(-1), (short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    java.lang.String var5 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var3);
    java.lang.String var6 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var3, (java.lang.Object)(byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var5.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var4 = var3.run();
    junit.framework.TestResult var5 = var3.run();
    junit.framework.TestResult var6 = var3.run();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var8);
    java.lang.String var11 = var8.toString();
    java.lang.String var12 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var6, (java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)' ', (java.lang.Object)var12);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    junit.framework.Assert.assertEquals((short)(-1), (short)(-1));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100, 1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", "hi!");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", "null(com.application.ciadobusao.test.EncontroTeste)");

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    junit.framework.Assert.assertEquals((byte)100, (byte)100);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    java.lang.String var7 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)true);
    java.lang.String var8 = var1.toString();
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

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)0.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)' ', (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100.0d, (-1.0d), 10.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)(short)10);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10, 100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste)", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", 100L, 100L);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)(short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (byte)(-1), (byte)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (-1.0d), 0.0d, 1.0d);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", (-1.0d), 1.0d, 10.0d);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", "hi!", "hi!");

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", 'a', 'a');

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", true);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 10, 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)0, (short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    int var2 = var1.countTestCases();
    java.lang.String var3 = var1.getName();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    junit.framework.TestResult var7 = var5.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", (java.lang.Object)var1, (java.lang.Object)var5);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (-1), 1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (short)100, (short)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100L, 1L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.TestResult var5 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var7);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var5, (java.lang.Object)var7);
    java.lang.String var13 = junit.framework.Assert.format("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
    
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
    assertTrue("'" + var13 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>"+ "'", var13.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>"));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var6);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    junit.framework.Assert.assertEquals("hi!", (short)0, (short)0);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    int var1 = var0.countTestCases();
    java.lang.String var2 = var0.getName();
    int var3 = var0.countTestCases();
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

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    java.lang.Object var3 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var3, (java.lang.Object)var4);
    java.lang.String var6 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var4);
    java.lang.String var7 = var4.toString();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    var8.test();
    junit.framework.TestResult var11 = var8.run();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var15 = var14.run();
    junit.framework.TestResult var16 = var14.run();
    junit.framework.TestResult var17 = var14.run();
    com.application.ciadobusao.test.EncontroTeste var19 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var20 = var19.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var19);
    java.lang.String var22 = var19.toString();
    java.lang.String var23 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var17, (java.lang.Object)var19);
    com.application.ciadobusao.test.EncontroTeste var24 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var25 = var24.run();
    junit.framework.TestResult var26 = var24.run();
    java.lang.String var27 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var17, (java.lang.Object)var26);
    var8.run(var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var7, (java.lang.Object)var26);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var6.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var22.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", 0L, (-1L));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)(short)(-1), var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    int var4 = var0.countTestCases();
    int var5 = var0.countTestCases();
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
    java.lang.String var19 = var6.toString();
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
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    var2.run(var5);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)10.0d, (java.lang.Object)var5);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


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
    com.application.ciadobusao.test.EncontroTeste var21 = new com.application.ciadobusao.test.EncontroTeste();
    int var22 = var21.countTestCases();
    java.lang.String var23 = var21.getName();
    junit.framework.TestResult var24 = var21.run();
    int var25 = var21.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var18, (java.lang.Object)var25);
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
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", (short)10, (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", "");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("", (java.lang.Object)" expected:<10> but was:<10>", (java.lang.Object)(byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertFalse("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    int var4 = var0.countTestCases();
    int var5 = var0.countTestCases();
    junit.framework.TestResult var6 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var9.test();
    junit.framework.TestResult var12 = var9.run();
    var7.run(var12);
    junit.framework.TestResult var14 = var7.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)var14);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    junit.framework.Assert.assertEquals((byte)(-1), (byte)(-1));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    junit.framework.Assert.assertEquals((-1.0d), (-1.0d), (-1.0d));

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


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
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var13 = var12.toString();
    var12.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var16 = var12.countTestCases();
    java.lang.String var18 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var12, (java.lang.Object)true);
    java.lang.String var19 = var12.toString();
    java.lang.String var20 = var12.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var9, (java.lang.Object)var12);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
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
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var20.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", 100.0f, 0.0f, 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)100.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", 0L, 0L);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    int var1 = var0.countTestCases();
    java.lang.String var2 = var0.getName();
    int var3 = var0.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)(byte)100);
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

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)100, (java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)' ');

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1, (-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 100, (-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    junit.framework.TestResult var3 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    junit.framework.Assert.assertEquals((-1.0d), (-1.0d), 100.0d);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    java.lang.String var4 = var1.toString();
    java.lang.String var5 = var1.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)10.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", false, true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", 0.0f, 0.0f, 10.0f);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var6 = var2.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)"hi!", (java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    junit.framework.Assert.assertEquals(1.0f, 0.0f, 100.0f);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (-1L), 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    var0.setName(" expected:<10> but was:<10>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    java.lang.String var7 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)true);
    java.lang.String var8 = var1.toString();
    java.lang.String var9 = var1.toString();
    junit.framework.TestResult var10 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)var1);
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
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", ' ', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail(" expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)1, (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("null(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", true, true);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.TestResult var5 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var7);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var5, (java.lang.Object)var7);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (byte)100, (byte)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (short)1, (short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test346");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1.0d), 100.0d, 0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test347");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)(short)0, (java.lang.Object)'#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test348");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    junit.framework.Assert.assertNotNull("hi!", (java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var9 = var8.run();
    junit.framework.TestResult var10 = var8.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)"hi!", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var5.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test349");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10.0d, (-1.0d), 10.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test350");


    junit.framework.Assert.assertEquals(0, 0);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test351");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", "");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test352");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1.0d), 10.0d, 0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test353");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var6 = var5.toString();
    var5.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var9 = var5.countTestCases();
    java.lang.String var11 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var5, (java.lang.Object)true);
    java.lang.String var12 = var5.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var2, (java.lang.Object)var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.runBare();
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var12.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test354");


    junit.framework.Assert.assertTrue("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", true);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test355");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0L, 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test356");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", 100.0f, 10.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test357");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("", (java.lang.Object)0L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test358");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)(-1), (short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test359");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    java.lang.String var4 = var1.getName();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var6 = var5.run();
    var1.run(var6);
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    java.lang.String var11 = var9.toString();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    var12.test();
    junit.framework.TestResult var15 = var12.run();
    java.lang.String var16 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var11, (java.lang.Object)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("", (java.lang.Object)var1, (java.lang.Object)var11);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test360");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)(byte)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test361");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10, 1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test362");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertTrue("hi! expected:<100> but was:<10>", false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test363");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test364");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var19, (java.lang.Object)1.0f);
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

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test365");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)100.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test366");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var2);
    java.lang.String var5 = var2.toString();
    int var6 = var2.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    var7.test();
    java.lang.String var10 = var7.getName();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    var7.run(var12);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var2, (java.lang.Object)var7);
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test367");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", 0.0d, 10.0d, (-1.0d));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test368");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)100L, (java.lang.Object)var1);
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

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test369");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (byte)0, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test370");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)100.0f, (java.lang.Object)var19);
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

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test371");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", '#', 'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test372");


    junit.framework.Assert.assertTrue("hi! expected:<100> but was:<10>", true);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test373");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    var0.run(var5);
    java.lang.String var7 = var0.getName();
    com.application.ciadobusao.test.EncontroTeste var8 = new com.application.ciadobusao.test.EncontroTeste();
    int var9 = var8.countTestCases();
    java.lang.String var10 = var8.getName();
    junit.framework.TestResult var11 = var8.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)var8);
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test374");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", true, false);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test375");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", false, false);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test376");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (-1), 1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test377");


    junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", 100.0f, 100.0f, 1.0f);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test378");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failSame("");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test379");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var4 = var0.run();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
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
    assertNotNull(var4);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test380");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", '#', '4');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test381");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    int var1 = var0.countTestCases();
    java.lang.String var2 = var0.getName();
    junit.framework.TestResult var3 = var0.run();
    int var4 = var0.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)"hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test382");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", 10, (-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test383");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", "null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test384");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    int var6 = var1.countTestCases();
    junit.framework.TestResult var7 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
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
    assertNotNull(var7);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test385");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(0.0f, 100.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test386");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (byte)(-1), (byte)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test387");


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
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)'4', (java.lang.Object)var7);
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

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test388");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    junit.framework.TestResult var2 = var0.run();
    junit.framework.TestResult var3 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    int var6 = var5.countTestCases();
    java.lang.String var7 = var5.getName();
    junit.framework.TestResult var8 = var5.run();
    int var9 = var5.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var11 = var10.toString();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var13 = var12.run();
    var10.run(var13);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var5, (java.lang.Object)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var3, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");
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
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var11.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test389");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10.0f, 100.0f, 10.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test390");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var6 = var2.countTestCases();
    java.lang.String var8 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)true);
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    junit.framework.TestResult var11 = var2.run();
    int var12 = var2.countTestCases();
    java.lang.Object var14 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var14, (java.lang.Object)var15);
    com.application.ciadobusao.test.EncontroTeste var18 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var19 = var18.toString();
    var18.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var22 = var18.countTestCases();
    java.lang.String var24 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var18, (java.lang.Object)true);
    java.lang.String var25 = var18.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var15, (java.lang.Object)var25);
    java.lang.String var27 = var15.toString();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var12, (java.lang.Object)var27);
    
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
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var24.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var25.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var27.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test391");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (byte)100, (byte)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test392");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", '4', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test393");


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
      junit.framework.Assert.failNotEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)(byte)10);
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

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test394");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (byte)0, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test395");


    java.lang.Object var3 = new java.lang.Object();
    junit.framework.Assert.assertNotSame("hi! expected:<100> but was:<10>", (java.lang.Object)1.0d, var3);
    com.application.ciadobusao.test.EncontroTeste var5 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var6 = var5.toString();
    var5.setName(" expected:<10> but was:<10>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)1.0d, (java.lang.Object)" expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var6.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test396");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals('#', '4');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test397");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test398");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)100.0f, (java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test399");


    junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste)", false);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test400");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    var0.setName(" expected:<10> but was:<10>");
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var9.test();
    java.lang.String var12 = var9.getName();
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var14 = var13.run();
    var9.run(var14);
    var6.run(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)" expected:<10> but was:<10>", (java.lang.Object)var14);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test401");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", ' ', 'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test402");


    junit.framework.Assert.assertFalse("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", false);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test403");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var2);
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var8 = var2.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test404");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    var2.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var6 = var2.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var6);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test405");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", 0.0f, 0.0f, (-1.0f));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test406");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (short)1, (short)10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test407");


    junit.framework.Assert.assertEquals(10.0d, (-1.0d), 100.0d);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test408");


    junit.framework.Assert.assertEquals(0L, 0L);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test409");


    java.lang.Object var3 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var3, (java.lang.Object)var4);
    java.lang.String var6 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var4);
    java.lang.String var7 = var4.toString();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var9.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var9, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var14 = var9.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (java.lang.Object)var4, (java.lang.Object)var9);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var6.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var7.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test410");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test411");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", false, true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test412");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", '#', '#');

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test413");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)");

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test414");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)10, (short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test415");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var7 = var2.getName();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var10 = var2.run();
    java.lang.Object var12 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var13 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var12, (java.lang.Object)var13);
    java.lang.String var15 = var13.getName();
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >", (java.lang.Object)var13, (java.lang.Object)1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
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
    assertNull(var15);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test416");


    junit.framework.Assert.assertEquals((short)0, (short)0);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test417");


    junit.framework.Assert.assertEquals(1.0d, 10.0d, 100.0d);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test418");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var6 = var2.countTestCases();
    java.lang.String var8 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)true);
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    junit.framework.TestResult var11 = var2.run();
    int var12 = var2.countTestCases();
    java.lang.Object var13 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var14 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var13, (java.lang.Object)var14);
    java.lang.String var16 = var14.toString();
    junit.framework.TestResult var17 = var14.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (java.lang.Object)var12, (java.lang.Object)var17);
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
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test419");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", false, true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test420");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", "", "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test421");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", false, false);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test422");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)(byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test423");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var5 = var4.run();
    junit.framework.TestResult var6 = var4.run();
    junit.framework.TestResult var7 = var4.run();
    java.lang.String var8 = var4.toString();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    var10.test();
    junit.framework.Assert.assertNotSame(" expected:<10> but was:<10>", (java.lang.Object)var10, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    java.lang.String var15 = var10.getName();
    var10.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var4, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test424");


    junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (-1.0f), (-1.0f), 0.0f);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test425");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", false, false);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test426");


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

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test427");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (-1.0f), 10.0f, 10.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test428");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    var0.run(var5);
    junit.framework.TestResult var7 = var0.run();
    java.lang.String var8 = var0.getName();
    java.lang.String var9 = var0.getName();
    junit.framework.TestResult var10 = var0.run();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test429");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", 0.0f, 10.0f, 1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test430");


    junit.framework.Assert.assertEquals(1.0d, 0.0d, 10.0d);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test431");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)(byte)100, (java.lang.Object)1.0f);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test432");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", 100, 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test433");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (byte)10, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test434");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1), 100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test435");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    java.lang.String var3 = var0.getName();
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
    assertNull(var3);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test436");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)0, (short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test437");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", 10, 0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test438");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    var1.setName(" expected:<10> but was:<10>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var2.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test439");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", "null(com.application.ciadobusao.test.EncontroTeste) expected:<hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>> but was:< >");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test440");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", " expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test441");


    junit.framework.Assert.assertNotNull("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)1L);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test442");


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
      junit.framework.Assert.assertEquals((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var8);
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

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test443");


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
      junit.framework.Assert.assertSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)(-1));
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

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test444");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    java.lang.String var3 = var1.toString();
    junit.framework.TestResult var4 = var1.run();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var7 = var6.run();
    junit.framework.TestResult var8 = var6.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", (java.lang.Object)var6);
    var6.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
    junit.framework.TestResult var12 = var6.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var4, (java.lang.Object)var12);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var3.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test445");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (byte)1, (byte)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test446");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    var1.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var1, (java.lang.Object)(-1));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test447");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.toString();
    var2.setName("hi!");
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)var7);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var8.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test448");


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
    java.lang.String var15 = var3.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var3, (java.lang.Object)(short)1);
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
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test449");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    junit.framework.TestResult var4 = var2.run();
    java.lang.Object var5 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var6 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var5, (java.lang.Object)var6);
    junit.framework.TestResult var8 = var6.run();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var9.test();
    junit.framework.TestResult var12 = var9.run();
    int var13 = var9.countTestCases();
    junit.framework.TestResult var14 = var9.run();
    var6.run(var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", (java.lang.Object)var2, (java.lang.Object)var6);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test450");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    java.lang.String var7 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)true);
    java.lang.String var8 = var1.toString();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    int var11 = var10.countTestCases();
    java.lang.String var12 = var10.getName();
    junit.framework.TestResult var13 = var10.run();
    int var14 = var10.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var16 = var15.toString();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var18 = var17.run();
    var15.run(var18);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var10, (java.lang.Object)var18);
    int var21 = var10.countTestCases();
    java.lang.Object var22 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var23 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var22, (java.lang.Object)var23);
    java.lang.String var25 = var23.toString();
    junit.framework.TestResult var26 = var23.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var10, (java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((java.lang.Object)var1, (java.lang.Object)var10);
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
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var25.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test451");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (-1L), 0L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test452");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (short)1, (short)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test453");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.fail("hi!");
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test454");


    junit.framework.Assert.assertEquals("", 100.0d, 100.0d, 100.0d);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test455");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1L), 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test456");


    junit.framework.Assert.assertTrue("null(com.application.ciadobusao.test.EncontroTeste)", true);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test457");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    junit.framework.TestResult var2 = var0.run();
    junit.framework.TestResult var3 = var0.run();
    var0.test();
    var0.test();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var8 = var7.toString();
    var7.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var11 = var7.countTestCases();
    java.lang.String var13 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var7, (java.lang.Object)true);
    java.lang.String var14 = var7.toString();
    java.lang.String var15 = var7.toString();
    junit.framework.TestResult var16 = var7.run();
    int var17 = var7.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)var7);
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
    assertTrue(var17 == 1);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test458");


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
    com.application.ciadobusao.test.EncontroTeste var18 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var19 = var18.run();
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var21 = var20.run();
    var20.test();
    junit.framework.TestResult var23 = var20.run();
    var18.run(var23);
    junit.framework.TestResult var25 = var18.run();
    java.lang.String var26 = var18.getName();
    var18.setName("hi!");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var14, (java.lang.Object)var18);
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
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test459");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var5 = var1.countTestCases();
    java.lang.String var7 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)true);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");
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

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test460");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", 100.0f, 10.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test461");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var4 = var0.countTestCases();
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
    assertTrue(var4 == 1);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test462");


    junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)", true, true);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test463");


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
      var6.runBare();
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

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test464");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)(-1), (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test465");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var6 = var2.countTestCases();
    java.lang.String var8 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)true);
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    junit.framework.TestResult var11 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    int var13 = var12.countTestCases();
    java.lang.String var14 = var12.getName();
    junit.framework.TestResult var15 = var12.run();
    var12.test();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)var12);
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
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test466");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var1 = var0.toString();
    var0.setName("null(com.application.ciadobusao.test.EncontroTeste)");
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
    assertTrue("'" + var1 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var1.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test467");


    java.lang.Object var2 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var3 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var2, (java.lang.Object)var3);
    java.lang.String var5 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var3);
    java.lang.String var6 = var3.toString();
    var3.setName("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>");
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

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test468");


    java.lang.Object var0 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var0, (java.lang.Object)var1);
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test469");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals('a', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test470");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var2 = var1.toString();
    var1.setName(" expected:<10> but was:<10>");
    junit.framework.TestResult var5 = var1.run();
    var1.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    java.lang.String var8 = var1.toString();
    java.lang.Object var11 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var11, (java.lang.Object)var12);
    java.lang.String var14 = junit.framework.Assert.format("hi!", (java.lang.Object)(-1), (java.lang.Object)var12);
    java.lang.String var15 = var12.toString();
    java.lang.String var16 = var12.getName();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var1, (java.lang.Object)var12);
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
    assertTrue("'" + var14 + "' != '" + "hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"+ "'", var14.equals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var15.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test471");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((short)0, (short)1);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test472");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)10L, (java.lang.Object)1.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test473");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(1.0d, 100.0d, 0.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test474");


    junit.framework.Assert.assertFalse("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)> expected:<null(com.application.ciadobusao.test.EncontroTeste)> but was:<null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>>", false);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test475");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var6 = var2.countTestCases();
    java.lang.String var8 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)true);
    java.lang.String var9 = var2.toString();
    int var10 = var2.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var12 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var13 = var12.toString();
    var12.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var16 = var12.countTestCases();
    java.lang.String var18 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var12, (java.lang.Object)true);
    java.lang.String var19 = var12.toString();
    int var20 = var12.countTestCases();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi! expected:<100> but was:<10>", (java.lang.Object)var2, (java.lang.Object)var20);
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
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var13.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"+ "'", var18.equals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test476");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(10.0f, (-1.0f), (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test477");


    java.lang.Object var1 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var1, (java.lang.Object)var2);
    java.lang.String var4 = var2.toString();
    var2.setName("hi!");
    junit.framework.TestResult var7 = var2.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertNull("hi!", (java.lang.Object)var7);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var4.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test478");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (-1L), 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test479");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals((-1.0f), 1.0f, (-1.0f));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test480");


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

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test481");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.test();
    junit.framework.TestResult var5 = var2.run();
    var0.run(var5);
    junit.framework.TestResult var7 = var0.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame((java.lang.Object)var0, (java.lang.Object)0.0f);
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

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test482");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (byte)(-1), (byte)0);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test483");


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
    var14.setName(" expected:<10> but was:<10>");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("", (java.lang.Object)var10, (java.lang.Object)var14);
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

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test484");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste) expected:<1.0> but was:<0>", (java.lang.Object)var2);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test485");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    junit.framework.TestResult var6 = var1.run();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var6, (java.lang.Object)10.0f);
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
    assertNotNull(var6);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test486");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", ' ', 'a');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test487");


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
    junit.framework.TestResult var14 = var13.run();
    junit.framework.TestResult var15 = var13.run();
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var13);
    com.application.ciadobusao.test.EncontroTeste var18 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var19 = var18.toString();
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var21 = var20.run();
    var18.run(var21);
    junit.framework.Assert.assertNotNull("hi! expected:<100> but was:<10>", (java.lang.Object)var21);
    var13.run(var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame("hi! expected:<100> but was:<10>", (java.lang.Object)"hi!", (java.lang.Object)var13);
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test488");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", 0, 10);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test489");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var3 = var2.run();
    junit.framework.TestResult var4 = var2.run();
    junit.framework.TestResult var5 = var2.run();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    junit.framework.Assert.assertNotNull("hi! expected:<-1> but was:<null(com.application.ciadobusao.test.EncontroTeste)>", (java.lang.Object)var7);
    java.lang.String var10 = var7.toString();
    java.lang.String var11 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var5, (java.lang.Object)var7);
    junit.framework.Assert.assertNotNull("null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var5);
    junit.framework.Assert.assertNotNull((java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)");
    
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

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test490");


    com.application.ciadobusao.test.EncontroTeste var4 = new com.application.ciadobusao.test.EncontroTeste();
    int var5 = var4.countTestCases();
    java.lang.String var6 = var4.getName();
    junit.framework.TestResult var7 = var4.run();
    int var8 = var4.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var10 = var9.toString();
    com.application.ciadobusao.test.EncontroTeste var11 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var12 = var11.run();
    var9.run(var12);
    junit.framework.Assert.assertNotSame("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var4, (java.lang.Object)var12);
    int var15 = var4.countTestCases();
    java.lang.Object var16 = new java.lang.Object();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.Assert.assertNotSame(var16, (java.lang.Object)var17);
    java.lang.String var19 = var17.toString();
    junit.framework.TestResult var20 = var17.run();
    junit.framework.Assert.assertNotSame((java.lang.Object)var4, (java.lang.Object)var20);
    junit.framework.Assert.assertNotSame((java.lang.Object)(short)100, (java.lang.Object)var20);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(" expected:<10> but was:<10>", (java.lang.Object)" expected:<10> but was:<10>", (java.lang.Object)(short)100);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var10.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var19.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test491");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", "null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>(com.application.ciadobusao.test.EncontroTeste)", " expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test492");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!", (-1.0d), 10.0d, (-1.0d));
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test493");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(' ', '#');
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test494");


    com.application.ciadobusao.test.EncontroTeste var1 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var2 = var1.run();
    var1.test();
    junit.framework.TestResult var4 = var1.run();
    int var5 = var1.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var7 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var8 = var7.run();
    java.lang.String var9 = var7.toString();
    com.application.ciadobusao.test.EncontroTeste var10 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var11 = var10.run();
    var10.test();
    junit.framework.TestResult var13 = var10.run();
    java.lang.String var14 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var9, (java.lang.Object)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.failNotSame("null(com.application.ciadobusao.test.EncontroTeste) expected:<null(com.application.ciadobusao.test.EncontroTeste)(com.application.ciadobusao.test.EncontroTeste)> but was:<true>", (java.lang.Object)var1, (java.lang.Object)"null(com.application.ciadobusao.test.EncontroTeste)");
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
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var9.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test495");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("hi!(com.application.ciadobusao.test.EncontroTeste)", " expected:<10> but was:<10>");
      fail("Expected exception of type junit.framework.ComparisonFailure");
    } catch (junit.framework.ComparisonFailure e) {
      // Expected exception.
    }

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test496");


    com.application.ciadobusao.test.EncontroTeste var2 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var3 = var2.toString();
    var2.setName("null(com.application.ciadobusao.test.EncontroTeste)");
    int var6 = var2.countTestCases();
    java.lang.String var8 = junit.framework.Assert.format("null(com.application.ciadobusao.test.EncontroTeste)", (java.lang.Object)var2, (java.lang.Object)true);
    com.application.ciadobusao.test.EncontroTeste var9 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var10 = var9.run();
    var9.test();
    junit.framework.TestResult var12 = var9.run();
    int var13 = var9.countTestCases();
    int var14 = var9.countTestCases();
    com.application.ciadobusao.test.EncontroTeste var15 = new com.application.ciadobusao.test.EncontroTeste();
    java.lang.String var16 = var15.toString();
    com.application.ciadobusao.test.EncontroTeste var17 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var18 = var17.run();
    var15.run(var18);
    com.application.ciadobusao.test.EncontroTeste var20 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var21 = var20.run();
    com.application.ciadobusao.test.EncontroTeste var22 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var23 = var22.run();
    var22.test();
    junit.framework.TestResult var25 = var22.run();
    var20.run(var25);
    var15.run(var25);
    var9.run(var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertSame(" expected:<10> but was:<10>", (java.lang.Object)true, (java.lang.Object)var9);
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "null(com.application.ciadobusao.test.EncontroTeste)"+ "'", var16.equals("null(com.application.ciadobusao.test.EncontroTeste)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test497");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("", 100.0d, 1.0d, 1.0d);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test498");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals("null(com.application.ciadobusao.test.EncontroTeste) expected:<100> but was:<-1>", false, true);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test499");


    com.application.ciadobusao.test.EncontroTeste var0 = new com.application.ciadobusao.test.EncontroTeste();
    junit.framework.TestResult var1 = var0.run();
    var0.test();
    junit.framework.TestResult var3 = var0.run();
    java.lang.String var4 = var0.toString();
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

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test500");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      junit.framework.Assert.assertEquals(100L, 10L);
      fail("Expected exception of type junit.framework.AssertionFailedError");
    } catch (junit.framework.AssertionFailedError e) {
      // Expected exception.
    }

  }

}
