package randoop;

import junit.framework.*;

public class SingletonDB0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test1");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test2");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test3");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test4");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test5");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test6");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test7");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test8");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test9");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test10");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test11");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test12");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test13");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test14");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test15");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test16");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test17");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test18");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test19");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test20");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test21");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test22");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test23");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test24");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test25");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test26");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test27");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test28");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test29");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test30");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test31");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test32");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test33");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test34");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test35");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test36");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test37");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test38");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test39");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test40");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test41");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test42");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test43");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test44");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test45");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test46");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test47");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test48");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test49");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test50");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test51");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test52");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test53");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test54");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test55");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test56");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test57");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test58");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test59");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test60");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test61");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test62");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test63");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test64");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test65");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test66");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test67");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test68");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test69");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test70");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test71");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test72");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test73");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test74");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test75");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test76");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test77");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test78");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test79");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test80");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test81");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test82");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test83");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test84");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test85");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test86");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test87");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test88");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test89");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test90");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test91");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test92");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test93");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test94");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test95");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test96");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test97");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test98");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test99");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test100");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test101");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test102");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test103");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test104");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test105");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test106");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test107");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test108");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test109");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test110");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test111");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test112");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test113");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test114");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test115");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test116");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test117");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test118");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test119");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test120");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test121");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test122");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test123");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test124");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test125");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test126");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test127");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test128");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test129");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test130");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test131");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test132");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test133");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test134");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test135");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test136");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test137");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test138");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test139");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test140");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test141");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test142");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test143");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test144");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test145");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test146");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test147");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test148");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test149");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test150");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test151");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test152");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test153");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test154");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test155");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test156");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test157");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test158");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test159");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test160");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test161");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test162");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test163");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test164");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test165");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test166");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test167");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test168");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test169");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test170");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test171");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test172");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test173");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test174");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test175");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test176");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test177");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test178");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test179");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test180");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test181");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test182");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test183");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test184");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test185");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test186");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test187");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test188");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test189");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test190");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test191");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test192");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test193");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test194");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test195");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test196");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test197");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test198");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test199");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test200");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test201");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test202");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test203");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test204");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test205");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test206");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test207");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test208");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test209");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test210");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test211");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test212");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test213");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test214");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test215");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test216");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test217");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test218");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test219");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test220");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test221");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test222");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test223");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test224");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test225");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test226");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test227");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test228");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test229");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test230");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test231");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test232");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test233");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test234");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test235");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test236");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test237");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test238");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test239");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test240");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test241");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test242");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test243");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test244");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test245");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test246");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test247");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test248");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test249");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test250");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test251");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test252");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test253");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test254");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test255");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test256");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test257");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test258");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test259");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test260");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test261");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test262");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test263");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test264");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test265");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test266");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test267");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test268");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test269");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test270");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test271");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test272");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test273");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test274");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test275");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test276");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test277");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test278");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test279");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test280");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test281");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test282");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test283");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test284");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test285");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test286");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test287");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test288");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test289");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test290");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test291");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test292");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test293");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test294");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test295");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test296");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test297");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test298");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test299");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test300");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test301");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test302");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test303");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test304");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test305");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test306");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test307");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test308");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test309");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test310");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test311");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test312");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test313");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test314");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test315");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test316");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test317");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test318");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test319");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test320");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test321");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test322");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test323");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test324");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test325");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test326");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test327");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test328");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test329");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test330");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test331");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test332");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test333");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test334");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test335");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test336");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test337");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test338");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test339");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test340");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test341");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test342");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test343");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test344");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test345");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test346");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test347");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test348");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test349");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test350");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test351");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test352");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test353");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test354");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test355");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test356");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test357");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test358");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test359");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test360");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test361");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test362");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test363");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test364");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test365");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test366");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test367");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test368");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test369");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test370");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test371");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test372");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test373");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test374");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test375");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test376");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test377");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test378");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test379");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test380");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test381");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test382");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test383");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test384");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test385");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test386");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test387");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test388");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test389");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test390");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test391");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test392");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test393");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test394");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test395");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test396");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test397");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test398");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test399");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test400");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test401");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test402");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test403");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test404");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test405");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test406");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test407");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test408");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test409");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test410");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test411");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test412");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test413");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test414");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test415");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test416");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test417");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test418");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test419");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test420");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test421");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test422");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test423");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test424");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test425");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test426");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test427");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test428");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test429");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test430");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test431");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test432");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test433");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test434");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test435");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test436");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test437");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test438");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test439");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test440");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test441");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test442");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test443");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test444");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test445");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test446");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test447");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test448");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test449");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test450");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test451");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test452");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test453");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test454");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test455");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test456");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test457");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test458");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test459");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test460");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test461");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test462");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test463");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test464");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test465");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test466");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test467");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test468");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test469");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test470");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test471");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test472");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test473");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test474");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test475");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test476");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test477");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test478");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test479");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test480");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test481");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test482");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test483");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test484");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test485");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(1);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test486");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test487");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test488");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test489");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test490");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test491");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test492");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test493");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test494");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test495");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test496");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test497");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test498");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(100);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test499");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delNotificacaoAtIndex(0);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB0.test500");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delEncontroAtIndex(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

}
