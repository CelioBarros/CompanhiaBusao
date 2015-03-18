package randoop;

import junit.framework.*;

public class SingletonDB6 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test1");


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
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test2");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
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

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test3");


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
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test4");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
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

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test5");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test6");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test7");


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
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getEncontros();
    java.util.List var20 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test8");


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
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test9");


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

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test10");


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

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test11");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
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

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test12");


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

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test13");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
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

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test14");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
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

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test15");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test16");


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

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test17");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test18");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test19");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
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

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test20");


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
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test21");


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

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test22");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
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

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test23");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test24");


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
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test25");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
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

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test26");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test27");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
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

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test28");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test29");


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

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test30");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test31");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
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

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test32");


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
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test33");


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
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getNotificacoes();
    java.util.List var19 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test34");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
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

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test35");


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
    java.util.List var14 = var0.getNotificacoes();
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

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test36");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test37");


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
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
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

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test38");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test39");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test40");


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
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test41");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
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

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test42");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
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

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test43");


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
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test44");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
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

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test45");


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

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test46");


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
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getEncontros();
    java.util.List var20 = var0.getNotificacoes();
    java.util.List var21 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test47");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
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

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test48");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test49");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
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

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test50");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
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

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test51");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test52");


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
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test53");


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
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
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

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test54");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test55");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
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

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test56");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test57");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
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

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test58");


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

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test59");


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
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test60");


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

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test61");


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
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getNotificacoes();
    java.util.List var20 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test62");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
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

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test63");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
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

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test64");


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
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getNotificacoes();
    java.util.List var19 = var0.getEncontros();
    java.util.List var20 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test65");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test66");


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
    java.util.List var13 = var0.getNotificacoes();
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

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test67");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test68");


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

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test69");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
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

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test70");


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

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test71");


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
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test72");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test73");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test74");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test75");


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
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test76");


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
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test77");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
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

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test78");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test79");


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
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test80");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test81");


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

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test82");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test83");


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

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test84");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test85");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test86");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
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

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test87");


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

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test88");


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
    java.util.List var10 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test89");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test90");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
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

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test91");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test92");


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
    java.util.List var14 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test93");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
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

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test94");


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

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test95");


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
    java.util.List var11 = var0.getEncontros();
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

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test96");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
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

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test97");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
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

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test98");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test99");


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
    java.util.List var11 = var0.getNotificacoes();
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

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test100");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test101");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
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

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test102");


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
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test103");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test104");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
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

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test105");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test106");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
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

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test107");


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
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test108");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
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

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test109");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test110");


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
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
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

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test111");


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
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
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

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test112");


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
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
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

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test113");


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

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test114");


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
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test115");


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
    java.util.List var16 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test116");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test117");


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
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test118");


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
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test119");


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
    java.util.List var10 = var0.getEncontros();
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

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test120");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test121");


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

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test122");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
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

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test123");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test124");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
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

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test125");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

    if (debug) System.out.printf("%nSingletonDB6.test126");


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
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test127");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
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

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test128");


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
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
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

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test129");


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
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test130");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
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

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test131");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test132");


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
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test133");


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
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
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

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test134");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
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

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test135");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test136");


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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test137");


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
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test138");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test139");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test140");


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
    java.util.List var10 = var0.getEncontros();
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

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test141");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test142");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test143");


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
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getNotificacoes();
    java.util.List var19 = var0.getEncontros();
    java.util.List var20 = var0.getNotificacoes();
    java.util.List var21 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test144");


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

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test145");


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
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test146");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
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

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test147");


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
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
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

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test148");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
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

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test149");


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
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test150");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
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

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test151");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test152");


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
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
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

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test153");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
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

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test154");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test155");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test156");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
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

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test157");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test158");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test159");


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
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getNotificacoes();
    java.util.List var19 = var0.getEncontros();
    java.util.List var20 = var0.getNotificacoes();
    java.util.List var21 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test160");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test161");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test162");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
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

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test163");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
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

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test164");


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
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test165");


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
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test166");


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
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test167");


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

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test168");


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
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
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

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test169");


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

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test170");


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

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test171");


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
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test172");


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
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test173");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getNotificacoes();
    java.util.List var19 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test174");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
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

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test175");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
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

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test176");


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
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test177");


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
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getNotificacoes();
    java.util.List var19 = var0.getNotificacoes();
    java.util.List var20 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test178");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getNotificacoes();
    java.util.List var19 = var0.getNotificacoes();
    java.util.List var20 = var0.getEncontros();
    java.util.List var21 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test179");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test180");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test181");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test182");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
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

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test183");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test184");


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

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test185");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test186");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
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

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test187");


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
    java.util.List var11 = var0.getNotificacoes();
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

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test188");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
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

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test189");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getNotificacoes();
    java.util.List var19 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test190");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test191");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
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

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test192");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test193");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
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

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test194");


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
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test195");


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

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test196");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test197");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test198");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
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

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test199");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test200");


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
    java.util.List var13 = var0.getNotificacoes();
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

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test201");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
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

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test202");


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

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test203");


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

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test204");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test205");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
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

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test206");


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
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
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

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test207");


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
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
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

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test208");


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
    java.util.List var13 = var0.getNotificacoes();
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

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test209");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test210");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
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

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test211");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getEncontros();
    java.util.List var20 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test212");


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
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getEncontros();
    java.util.List var20 = var0.getNotificacoes();
    java.util.List var21 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test213");


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
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test214");


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

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test215");


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

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test216");


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
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test217");


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

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test218");


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
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    java.util.List var18 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test219");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
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

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test220");


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
    java.util.List var15 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test221");


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
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test222");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getNotificacoes();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test223");


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
    java.util.List var13 = var0.getNotificacoes();
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

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test224");


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
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getEncontros();
    java.util.List var20 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test225");


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
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
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

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test226");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test227");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
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

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test228");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test229");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test230");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test231");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
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

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test232");


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
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getEncontros();
    java.util.List var19 = var0.getNotificacoes();
    java.util.List var20 = var0.getEncontros();
    java.util.List var21 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test233");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test234");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
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

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test235");


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

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test236");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test237");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getNotificacoes();
    java.util.List var17 = var0.getEncontros();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test238");


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
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
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

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test239");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test240");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test241");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
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

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test242");


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

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test243");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getEncontros();
    java.util.List var3 = var0.getNotificacoes();
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

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test244");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
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

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test245");


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
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getEncontros();
    java.util.List var15 = var0.getNotificacoes();
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

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test246");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test247");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getEncontros();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test248");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test249");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
    java.util.List var4 = var0.getNotificacoes();
    java.util.List var5 = var0.getNotificacoes();
    java.util.List var6 = var0.getEncontros();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getNotificacoes();
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
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

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test250");


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
    java.util.List var15 = var0.getNotificacoes();
    java.util.List var16 = var0.getEncontros();
    java.util.List var17 = var0.getEncontros();
    java.util.List var18 = var0.getNotificacoes();
    java.util.List var19 = var0.getEncontros();
    java.util.List var20 = var0.getNotificacoes();
    java.util.List var21 = var0.getNotificacoes();
    java.util.List var22 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test251");


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
    java.util.List var10 = var0.getNotificacoes();
    java.util.List var11 = var0.getNotificacoes();
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getEncontros();
    java.util.List var16 = var0.getNotificacoes();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test252");


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
    java.util.List var10 = var0.getNotificacoes();
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

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test253");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getNotificacoes();
    java.util.List var4 = var0.getEncontros();
    java.util.List var5 = var0.getEncontros();
    java.util.List var6 = var0.getNotificacoes();
    java.util.List var7 = var0.getNotificacoes();
    java.util.List var8 = var0.getEncontros();
    java.util.List var9 = var0.getEncontros();
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

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test254");


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
    java.util.List var10 = var0.getEncontros();
    java.util.List var11 = var0.getEncontros();
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getEncontros();
    java.util.List var14 = var0.getNotificacoes();
    java.util.List var15 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test255");


    com.application.ciadobusao.db.SingletonDB var0 = com.application.ciadobusao.db.SingletonDB.getInstance();
    java.util.List var1 = var0.getNotificacoes();
    java.util.List var2 = var0.getNotificacoes();
    java.util.List var3 = var0.getEncontros();
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

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test256");


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
    java.util.List var12 = var0.getEncontros();
    java.util.List var13 = var0.getEncontros();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nSingletonDB6.test257");


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
    java.util.List var12 = var0.getNotificacoes();
    java.util.List var13 = var0.getNotificacoes();
    java.util.List var14 = var0.getNotificacoes();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
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

}
