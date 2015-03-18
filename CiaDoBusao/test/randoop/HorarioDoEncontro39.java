package randoop;

import junit.framework.*;

public class HorarioDoEncontro39 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test1");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(1);
    int var8 = var0.getMin();
    int var9 = var0.getHora();
    var0.setHora(0);
    java.lang.String var12 = var0.toString();
    int var13 = var0.getMin();
    var0.setMin(1);
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test2");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    var0.setMin(10);
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setHora(0);
    var0.setMin(1);
    int var15 = var0.getHora();
    int var16 = var0.getMin();
    int var17 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test3");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    var2.setHora(10);
    var2.setMin(10);
    var2.setMin((-1));
    int var15 = var2.getMin();
    java.lang.String var16 = var2.toString();
    java.lang.String var17 = var2.toString();
    int var18 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10:-01"+ "'", var16.equals("10:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10:-01"+ "'", var17.equals("10:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test4");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 1);
    var2.setHora(100);
    var2.setMin((-1));
    var2.setHora(100);
    var2.setHora(0);
    var2.setMin(10);
    int var13 = var2.getMin();
    var2.setHora(0);
    var2.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test5");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(100);
    var0.setMin((-1));
    java.lang.String var12 = var0.toString();
    var0.setMin(100);
    int var15 = var0.getMin();
    int var16 = var0.getHora();
    var0.setHora(100);
    var0.setMin(100);
    var0.setHora(100);
    var0.setHora((-1));
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:-01"+ "'", var12.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test6");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    var0.setHora((-1));
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getMin();
    int var12 = var0.getMin();
    int var13 = var0.getMin();
    int var14 = var0.getHora();
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:-01"+ "'", var10.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test7");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setMin(0);
    int var13 = var0.getHora();
    var0.setHora((-1));
    int var16 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test8");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    var2.setMin(10);
    int var8 = var2.getHora();
    int var9 = var2.getHora();
    int var10 = var2.getMin();
    int var11 = var2.getMin();
    var2.setMin(1);
    var2.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:10"+ "'", var5.equals("100:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test9");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setMin(10);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    int var7 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01:10"+ "'", var5.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "01:10"+ "'", var6.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test10");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setMin(10);
    var0.setMin(100);
    var0.setMin(10);
    int var17 = var0.getHora();
    var0.setMin(10);
    int var20 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test11");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    java.lang.String var7 = var0.toString();
    var0.setHora((-1));
    int var10 = var0.getMin();
    var0.setMin(100);
    int var13 = var0.getHora();
    var0.setMin(0);
    var0.setMin((-1));
    java.lang.String var18 = var0.toString();
    int var19 = var0.getHora();
    int var20 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:-01"+ "'", var7.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "-01:-01"+ "'", var18.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test12");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    int var5 = var0.getMin();
    var0.setHora((-1));
    java.lang.String var8 = var0.toString();
    int var9 = var0.getMin();
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    var0.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:00"+ "'", var8.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:00"+ "'", var11.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:00"+ "'", var12.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:00"+ "'", var13.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test13");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    var0.setHora(1);
    var0.setMin(10);
    var0.setMin(1);
    int var11 = var0.getMin();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getHora();
    var0.setHora((-1));
    int var16 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "01:01"+ "'", var12.equals("01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test14");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    int var7 = var2.getHora();
    var2.setMin(0);
    var2.setMin(1);
    int var12 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test15");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    var0.setHora(0);
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    var0.setMin(0);
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:00"+ "'", var9.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:00"+ "'", var11.equals("00:00"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test16");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin((-1));
    var0.setHora(10);
    var0.setMin(0);
    int var10 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test17");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora(1);
    var2.setMin(0);
    int var13 = var2.getMin();
    var2.setMin(10);
    int var16 = var2.getMin();
    var2.setHora(0);
    var2.setMin(1);
    var2.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test18");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(0);
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getMin();
    int var9 = var2.getHora();
    int var10 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10:00"+ "'", var7.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test19");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(0);
    var0.setHora((-1));
    java.lang.String var10 = var0.toString();
    var0.setMin(10);
    int var13 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:00"+ "'", var10.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test20");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setHora(0);
    var2.setMin((-1));
    var2.setMin((-1));
    int var14 = var2.getMin();
    var2.setMin(0);
    int var17 = var2.getHora();
    int var18 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test21");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    java.lang.String var5 = var2.toString();
    var2.setHora(1);
    int var8 = var2.getMin();
    int var9 = var2.getMin();
    var2.setHora(10);
    int var12 = var2.getMin();
    var2.setMin(100);
    int var15 = var2.getHora();
    var2.setMin(10);
    java.lang.String var18 = var2.toString();
    var2.setHora(10);
    var2.setHora(1);
    int var23 = var2.getHora();
    int var24 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10:10"+ "'", var18.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test22");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    var0.setMin(10);
    int var9 = var0.getHora();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:10"+ "'", var10.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:10"+ "'", var11.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:10"+ "'", var12.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:10"+ "'", var13.equals("00:10"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test23");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    var0.setMin(10);
    int var11 = var0.getHora();
    java.lang.String var12 = var0.toString();
    var0.setMin(100);
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:10"+ "'", var12.equals("00:10"));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test24");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    var2.setHora(100);
    int var7 = var2.getHora();
    java.lang.String var8 = var2.toString();
    var2.setMin(100);
    var2.setHora(0);
    var2.setMin(1);
    int var15 = var2.getMin();
    java.lang.String var16 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01:00"+ "'", var4.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100:00"+ "'", var8.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:01"+ "'", var16.equals("00:01"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test25");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    int var6 = var0.getMin();
    var0.setMin(1);
    int var9 = var0.getMin();
    java.lang.String var10 = var0.toString();
    var0.setMin((-1));
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:01"+ "'", var10.equals("00:01"));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test26");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    var0.setMin(10);
    int var9 = var0.getMin();
    var0.setHora((-1));
    var0.setMin(0);
    var0.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test27");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    var0.setHora(1);
    int var8 = var0.getMin();
    var0.setMin(1);
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:01"+ "'", var11.equals("01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test28");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    var0.setHora((-1));
    var0.setMin(100);
    java.lang.String var10 = var0.toString();
    int var11 = var0.getHora();
    java.lang.String var12 = var0.toString();
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:100"+ "'", var10.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:100"+ "'", var12.equals("-01:100"));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test29");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 0);
    var2.setMin(100);
    var2.setMin(100);
    java.lang.String var7 = var2.toString();
    var2.setHora(0);
    java.lang.String var10 = var2.toString();
    int var11 = var2.getHora();
    var2.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:100"+ "'", var7.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:100"+ "'", var10.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test30");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    var0.setMin(10);
    int var9 = var0.getMin();
    var0.setHora((-1));
    java.lang.String var12 = var0.toString();
    var0.setHora(100);
    var0.setHora(10);
    int var17 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:10"+ "'", var12.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test31");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 1);
    var2.setHora(100);
    var2.setMin((-1));
    var2.setHora(100);
    var2.setHora((-1));
    java.lang.String var11 = var2.toString();
    var2.setHora(0);
    int var14 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:-01"+ "'", var11.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test32");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    var2.setMin((-1));
    java.lang.String var11 = var2.toString();
    int var12 = var2.getHora();
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:-01"+ "'", var11.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test33");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora((-1));
    int var11 = var2.getMin();
    var2.setMin(10);
    var2.setMin(0);
    int var16 = var2.getMin();
    var2.setHora(10);
    int var19 = var2.getMin();
    var2.setHora((-1));
    var2.setMin(10);
    java.lang.String var24 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "-01:10"+ "'", var24.equals("-01:10"));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test34");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    int var3 = var2.getMin();
    var2.setMin(100);
    int var6 = var2.getMin();
    var2.setMin(0);
    int var9 = var2.getMin();
    java.lang.String var10 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:00"+ "'", var10.equals("-01:00"));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test35");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(1);
    var0.setHora(1);
    int var8 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test36");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    int var3 = var0.getHora();
    var0.setHora(1);
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    var0.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test37");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    int var3 = var2.getHora();
    var2.setMin(1);
    var2.setMin(1);
    java.lang.String var8 = var2.toString();
    int var9 = var2.getHora();
    var2.setHora(1);
    var2.setMin(100);
    var2.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:01"+ "'", var8.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test38");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    var2.setHora(100);
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    var2.setMin(100);
    var2.setHora(0);
    var2.setHora(0);
    int var15 = var2.getMin();
    java.lang.String var16 = var2.toString();
    var2.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:100"+ "'", var16.equals("00:100"));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test39");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    var0.setHora(0);
    var0.setMin(0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    int var15 = var0.getMin();
    int var16 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:00"+ "'", var13.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:00"+ "'", var14.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test40");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    var2.setMin((-1));
    var2.setMin(100);
    int var12 = var2.getMin();
    java.lang.String var13 = var2.toString();
    int var14 = var2.getMin();
    java.lang.String var15 = var2.toString();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10:100"+ "'", var13.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10:100"+ "'", var15.equals("10:100"));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test41");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    var2.setMin(0);
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setMin(0);
    java.lang.String var10 = var2.toString();
    var2.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test42");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, 100);
    java.lang.String var3 = var2.toString();
    var2.setMin(100);
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getMin();
    var2.setMin(10);
    var2.setHora((-1));
    var2.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:100"+ "'", var3.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:100"+ "'", var6.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:100"+ "'", var7.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test43");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    java.lang.String var3 = var0.toString();
    var0.setMin(0);
    var0.setHora(0);
    java.lang.String var8 = var0.toString();
    int var9 = var0.getHora();
    int var10 = var0.getHora();
    int var11 = var0.getHora();
    var0.setHora(1);
    int var14 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:00"+ "'", var3.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:00"+ "'", var8.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test44");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getMin();
    var0.setHora(0);
    var0.setMin(100);
    int var11 = var0.getHora();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getHora();
    var0.setMin((-1));
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:00"+ "'", var5.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:100"+ "'", var12.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test45");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setMin(10);
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    var2.setHora(10);
    var2.setHora(10);
    int var14 = var2.getHora();
    int var15 = var2.getHora();
    int var16 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:10"+ "'", var8.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:10"+ "'", var9.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test46");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    var0.setHora(0);
    int var5 = var0.getHora();
    int var6 = var0.getMin();
    int var7 = var0.getMin();
    java.lang.String var8 = var0.toString();
    var0.setMin(10);
    var0.setMin(10);
    var0.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:00"+ "'", var8.equals("00:00"));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test47");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    var0.setMin(100);
    var0.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test48");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    int var13 = var0.getMin();
    int var14 = var0.getHora();
    var0.setMin(0);
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:10"+ "'", var11.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test49");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    int var7 = var0.getHora();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getHora();
    int var10 = var0.getMin();
    var0.setMin(0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:-01"+ "'", var8.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:00"+ "'", var13.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:00"+ "'", var14.equals("00:00"));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test50");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    java.lang.String var8 = var2.toString();
    int var9 = var2.getMin();
    int var10 = var2.getMin();
    int var11 = var2.getHora();
    var2.setHora(1);
    var2.setHora(0);
    var2.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:-01"+ "'", var8.equals("10:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test51");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getMin();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    var2.setMin(10);
    int var12 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:00"+ "'", var8.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:00"+ "'", var9.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test52");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, 0);
    int var3 = var2.getMin();
    var2.setHora((-1));
    int var6 = var2.getHora();
    int var7 = var2.getHora();
    int var8 = var2.getMin();
    var2.setMin(1);
    var2.setHora((-1));
    var2.setMin(100);
    java.lang.String var15 = var2.toString();
    int var16 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01:100"+ "'", var15.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test53");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    var0.setHora(0);
    var0.setMin(0);
    int var10 = var0.getMin();
    int var11 = var0.getHora();
    java.lang.String var12 = var0.toString();
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test54");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    var0.setHora((-1));
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    var0.setHora(10);
    int var9 = var0.getMin();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01:00"+ "'", var6.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10:00"+ "'", var10.equals("10:00"));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test55");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    int var7 = var0.getHora();
    java.lang.String var8 = var0.toString();
    var0.setMin(100);
    var0.setHora(10);
    int var13 = var0.getMin();
    int var14 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:-01"+ "'", var8.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test56");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    var0.setMin((-1));
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    var0.setHora((-1));
    var0.setHora(0);
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:-01"+ "'", var8.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:-01"+ "'", var9.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:-01"+ "'", var14.equals("00:-01"));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test57");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(100, 1);
    var2.setMin(100);
    int var5 = var2.getHora();
    var2.setMin(100);
    int var8 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test58");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setMin(1);
    var0.setHora(1);
    var0.setHora(0);
    var0.setMin(100);
    var0.setMin(0);
    var0.setMin(100);
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test59");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    var2.setMin((-1));
    var2.setMin(100);
    int var12 = var2.getMin();
    var2.setHora(1);
    var2.setMin(10);
    java.lang.String var17 = var2.toString();
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "01:10"+ "'", var17.equals("01:10"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test60");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    var0.setHora((-1));
    var0.setHora((-1));
    java.lang.String var8 = var0.toString();
    var0.setMin(100);
    int var11 = var0.getHora();
    int var12 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:00"+ "'", var8.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test61");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setMin(0);
    java.lang.String var6 = var0.toString();
    var0.setMin(1);
    var0.setMin(10);
    var0.setMin(10);
    var0.setMin(1);
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    int var18 = var0.getMin();
    var0.setHora(10);
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00:01"+ "'", var15.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:01"+ "'", var16.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00:01"+ "'", var17.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "10:01"+ "'", var21.equals("10:01"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test62");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora((-1));
    int var11 = var2.getMin();
    var2.setMin(10);
    var2.setMin(0);
    int var16 = var2.getHora();
    var2.setHora(0);
    var2.setMin((-1));
    int var21 = var2.getMin();
    int var22 = var2.getMin();
    int var23 = var2.getMin();
    int var24 = var2.getHora();
    var2.setMin(1);
    var2.setMin(10);
    java.lang.String var29 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "00:10"+ "'", var29.equals("00:10"));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test63");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    java.lang.String var5 = var2.toString();
    var2.setHora(1);
    var2.setHora((-1));
    java.lang.String var10 = var2.toString();
    var2.setHora(100);
    java.lang.String var13 = var2.toString();
    java.lang.String var14 = var2.toString();
    var2.setHora(10);
    int var17 = var2.getMin();
    int var18 = var2.getHora();
    int var19 = var2.getHora();
    var2.setHora(0);
    int var22 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:00"+ "'", var10.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100:00"+ "'", var13.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "100:00"+ "'", var14.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test64");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setMin(10);
    java.lang.String var8 = var2.toString();
    var2.setMin((-1));
    var2.setMin(1);
    int var13 = var2.getHora();
    int var14 = var2.getMin();
    var2.setMin(1);
    var2.setMin(0);
    java.lang.String var19 = var2.toString();
    int var20 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:10"+ "'", var8.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "00:00"+ "'", var19.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test65");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setMin(10);
    var2.setHora((-1));
    java.lang.String var7 = var2.toString();
    int var8 = var2.getHora();
    int var9 = var2.getMin();
    var2.setMin((-1));
    var2.setMin(100);
    int var14 = var2.getHora();
    int var15 = var2.getHora();
    int var16 = var2.getMin();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:10"+ "'", var7.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test66");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    java.lang.String var3 = var0.toString();
    var0.setMin(0);
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    int var8 = var0.getHora();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    var0.setHora(100);
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(10);
    var0.setMin(1);
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:00"+ "'", var3.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:00"+ "'", var9.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:00"+ "'", var10.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "00:01"+ "'", var21.equals("00:01"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test67");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    int var3 = var2.getHora();
    var2.setHora(10);
    int var6 = var2.getHora();
    var2.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test68");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setMin((-1));
    java.lang.String var5 = var2.toString();
    var2.setMin(10);
    int var8 = var2.getHora();
    int var9 = var2.getHora();
    java.lang.String var10 = var2.toString();
    java.lang.String var11 = var2.toString();
    var2.setMin(10);
    java.lang.String var14 = var2.toString();
    var2.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01:-01"+ "'", var5.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "01:10"+ "'", var10.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:10"+ "'", var11.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "01:10"+ "'", var14.equals("01:10"));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test69");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    var2.setMin(1);
    int var5 = var2.getMin();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora(1);
    java.lang.String var11 = var2.toString();
    var2.setMin(1);
    var2.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:01"+ "'", var11.equals("01:01"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test70");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    var0.setHora((-1));
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    var0.setHora((-1));
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01:00"+ "'", var6.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:00"+ "'", var10.equals("-01:00"));

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test71");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getHora();
    var0.setMin(1);
    int var6 = var0.getMin();
    var0.setMin(1);
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test72");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora(1);
    var2.setMin(0);
    int var13 = var2.getMin();
    var2.setMin(10);
    int var16 = var2.getHora();
    var2.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test73");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    var2.setMin(0);
    java.lang.String var8 = var2.toString();
    var2.setMin(10);
    var2.setHora(10);
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "01:10"+ "'", var3.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01:10"+ "'", var4.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "01:00"+ "'", var8.equals("01:00"));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test74");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    var0.setHora((-1));
    var0.setHora(10);
    int var8 = var0.getHora();
    int var9 = var0.getHora();
    int var10 = var0.getHora();
    var0.setMin(100);
    var0.setMin(1);
    var0.setHora(100);
    var0.setHora((-1));
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test75");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 10);
    int var3 = var2.getMin();
    var2.setHora(10);
    var2.setMin(100);
    var2.setMin(0);
    int var10 = var2.getHora();
    int var11 = var2.getMin();
    var2.setHora(10);
    var2.setHora(10);
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test76");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(1);
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getHora();
    var0.setMin(100);
    int var15 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:01"+ "'", var11.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test77");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 100);
    var2.setMin(1);
    int var5 = var2.getHora();
    var2.setHora(0);
    int var8 = var2.getMin();
    java.lang.String var9 = var2.toString();
    int var10 = var2.getMin();
    int var11 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:01"+ "'", var9.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test78");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(100, 100);
    var2.setHora(0);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test79");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    var2.setHora(100);
    java.lang.String var7 = var2.toString();
    int var8 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-01:01"+ "'", var4.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100:01"+ "'", var7.equals("100:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test80");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setMin(0);
    var2.setHora(10);
    var2.setMin(100);
    var2.setMin(100);
    java.lang.String var16 = var2.toString();
    var2.setMin((-1));
    var2.setMin((-1));
    int var21 = var2.getMin();
    java.lang.String var22 = var2.toString();
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10:100"+ "'", var16.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "10:-01"+ "'", var22.equals("10:-01"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test81");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setMin(0);
    int var5 = var2.getMin();
    int var6 = var2.getMin();
    int var7 = var2.getMin();
    var2.setHora(0);
    java.lang.String var10 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test82");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    int var7 = var0.getMin();
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    int var10 = var0.getMin();
    int var11 = var0.getMin();
    int var12 = var0.getMin();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:00"+ "'", var13.equals("00:00"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test83");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 100);
    var2.setHora(100);
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    var2.setHora((-1));
    int var9 = var2.getMin();
    int var10 = var2.getMin();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test84");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    var2.setMin((-1));
    var2.setMin(100);
    int var12 = var2.getMin();
    java.lang.String var13 = var2.toString();
    java.lang.String var14 = var2.toString();
    var2.setHora(0);
    var2.setHora(0);
    int var19 = var2.getHora();
    int var20 = var2.getMin();
    var2.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10:100"+ "'", var13.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:100"+ "'", var14.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test85");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getMin();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    var2.setMin(0);
    var2.setHora(100);
    var2.setHora(0);
    var2.setHora(100);
    int var17 = var2.getHora();
    int var18 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:00"+ "'", var8.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test86");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    var2.setMin((-1));
    var2.setHora(10);
    int var13 = var2.getMin();
    java.lang.String var14 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:-01"+ "'", var14.equals("10:-01"));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test87");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    int var9 = var0.getMin();
    var0.setHora((-1));
    var0.setHora(10);
    int var14 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test88");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    int var7 = var0.getMin();
    var0.setHora((-1));
    var0.setMin(1);
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:01"+ "'", var12.equals("-01:01"));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test89");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    var0.setHora(100);
    var0.setMin(1);
    var0.setMin(100);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    var0.setHora(0);
    int var17 = var0.getMin();
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100:100"+ "'", var12.equals("100:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100:100"+ "'", var13.equals("100:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "100:100"+ "'", var14.equals("100:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test90");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    var0.setMin(10);
    int var10 = var0.getHora();
    var0.setHora(100);
    int var13 = var0.getMin();
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test91");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    var0.setHora((-1));
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    var0.setMin(0);
    var0.setHora((-1));
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:00"+ "'", var5.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01:00"+ "'", var6.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:00"+ "'", var11.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test92");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    java.lang.String var5 = var2.toString();
    var2.setHora(1);
    int var8 = var2.getMin();
    var2.setMin(10);
    java.lang.String var11 = var2.toString();
    var2.setMin((-1));
    java.lang.String var14 = var2.toString();
    java.lang.String var15 = var2.toString();
    var2.setHora(0);
    int var18 = var2.getMin();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:10"+ "'", var11.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "01:-01"+ "'", var14.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "01:-01"+ "'", var15.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test93");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setHora(0);
    var0.setMin(1);
    java.lang.String var15 = var0.toString();
    int var16 = var0.getMin();
    var0.setHora(0);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    int var21 = var0.getMin();
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00:01"+ "'", var15.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "00:01"+ "'", var19.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "00:01"+ "'", var20.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "00:01"+ "'", var22.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "00:01"+ "'", var23.equals("00:01"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test94");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    var2.setHora(10);
    int var11 = var2.getMin();
    int var12 = var2.getMin();
    var2.setHora(100);
    var2.setHora(10);
    var2.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test95");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    var0.setMin(1);
    int var11 = var0.getMin();
    var0.setMin(10);
    int var14 = var0.getHora();
    int var15 = var0.getMin();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:10"+ "'", var16.equals("00:10"));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test96");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setHora(0);
    java.lang.String var13 = var0.toString();
    var0.setHora(10);
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:10"+ "'", var13.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10:10"+ "'", var16.equals("10:10"));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test97");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    var0.setHora(0);
    var0.setMin(0);
    var0.setHora(100);
    var0.setHora(0);
    var0.setHora(0);
    var0.setMin(1);
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test98");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    var0.setHora((-1));
    int var9 = var0.getHora();
    int var10 = var0.getHora();
    java.lang.String var11 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:00"+ "'", var11.equals("-01:00"));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test99");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(0);
    int var5 = var2.getHora();
    var2.setHora(0);
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    var2.setMin(0);
    java.lang.String var12 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:00"+ "'", var8.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:00"+ "'", var9.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test100");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 1);
    var2.setMin(100);
    var2.setMin(0);
    java.lang.String var7 = var2.toString();
    var2.setHora(100);
    var2.setMin(100);
    var2.setMin((-1));
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10:00"+ "'", var7.equals("10:00"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test101");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin(1);
    java.lang.String var5 = var0.toString();
    int var6 = var0.getMin();
    var0.setMin(0);
    java.lang.String var9 = var0.toString();
    int var10 = var0.getMin();
    int var11 = var0.getMin();
    var0.setHora(0);
    java.lang.String var14 = var0.toString();
    var0.setHora(100);
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:01"+ "'", var5.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:00"+ "'", var9.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:00"+ "'", var14.equals("00:00"));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test102");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    var2.setMin(10);
    var2.setHora((-1));
    int var7 = var2.getMin();
    var2.setMin(100);
    int var10 = var2.getHora();
    int var11 = var2.getHora();
    var2.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test103");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora((-1));
    int var11 = var2.getHora();
    var2.setHora(10);
    var2.setHora(1);
    var2.setHora(0);
    int var18 = var2.getMin();
    java.lang.String var19 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "00:-01"+ "'", var19.equals("00:-01"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test104");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    var0.setHora(100);
    var0.setMin(1);
    int var10 = var0.getMin();
    var0.setHora((-1));
    java.lang.String var13 = var0.toString();
    var0.setMin(100);
    java.lang.String var16 = var0.toString();
    var0.setHora(1);
    java.lang.String var19 = var0.toString();
    var0.setMin(100);
    var0.setMin((-1));
    var0.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:01"+ "'", var13.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "-01:100"+ "'", var16.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "01:100"+ "'", var19.equals("01:100"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test105");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin(1);
    int var5 = var0.getHora();
    int var6 = var0.getHora();
    int var7 = var0.getMin();
    java.lang.String var8 = var0.toString();
    var0.setHora(10);
    int var11 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:01"+ "'", var8.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test106");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    var2.setHora((-1));
    var2.setMin(10);
    var2.setHora(100);
    var2.setMin(100);
    var2.setMin(1);
    int var15 = var2.getMin();
    var2.setHora(0);
    java.lang.String var18 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10:00"+ "'", var4.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "00:01"+ "'", var18.equals("00:01"));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test107");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setMin(1);
    var0.setHora(1);
    var0.setHora(0);
    var0.setMin(100);
    var0.setMin(0);
    int var14 = var0.getMin();
    var0.setHora(100);
    int var17 = var0.getHora();
    var0.setHora(10);
    var0.setMin(100);
    var0.setMin((-1));
    int var24 = var0.getMin();
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == (-1));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test108");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    java.lang.String var7 = var0.toString();
    var0.setMin(100);
    int var10 = var0.getHora();
    var0.setHora(10);
    int var13 = var0.getHora();
    int var14 = var0.getMin();
    int var15 = var0.getMin();
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:-01"+ "'", var7.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test109");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    var0.setHora(1);
    java.lang.String var9 = var0.toString();
    int var10 = var0.getMin();
    int var11 = var0.getHora();
    var0.setMin(0);
    var0.setHora(0);
    int var16 = var0.getHora();
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:00"+ "'", var9.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test110");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    var0.setHora(100);
    int var10 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test111");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora(0);
    var0.setHora(10);
    int var11 = var0.getMin();
    var0.setMin(1);
    java.lang.String var14 = var0.toString();
    int var15 = var0.getHora();
    java.lang.String var16 = var0.toString();
    var0.setMin(10);
    var0.setMin(100);
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:01"+ "'", var14.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10:01"+ "'", var16.equals("10:01"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test112");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getMin();
    var2.setMin(100);
    var2.setHora(0);
    var2.setMin((-1));
    var2.setMin(0);
    var2.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:10"+ "'", var5.equals("100:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100:10"+ "'", var7.equals("100:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test113");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    var0.setMin(1);
    java.lang.String var10 = var0.toString();
    var0.setHora((-1));
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10:00"+ "'", var6.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10:01"+ "'", var10.equals("10:01"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test114");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getHora();
    var2.setMin(0);
    var2.setMin((-1));
    java.lang.String var13 = var2.toString();
    int var14 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:-01"+ "'", var7.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:-01"+ "'", var13.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test115");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getMin();
    var0.setHora(100);
    int var16 = var0.getHora();
    var0.setHora(0);
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:00"+ "'", var11.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "00:00"+ "'", var19.equals("00:00"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test116");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    var0.setHora(0);
    int var10 = var0.getMin();
    var0.setHora(0);
    int var13 = var0.getHora();
    int var14 = var0.getHora();
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test117");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    int var3 = var2.getHora();
    var2.setMin(1);
    int var6 = var2.getMin();
    var2.setMin(0);
    int var9 = var2.getHora();
    int var10 = var2.getMin();
    int var11 = var2.getHora();
    int var12 = var2.getMin();
    int var13 = var2.getMin();
    java.lang.String var14 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:00"+ "'", var14.equals("10:00"));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test118");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    var0.setHora((-1));
    var0.setHora(10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getMin();
    int var11 = var0.getMin();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getMin();
    int var14 = var0.getHora();
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:00"+ "'", var8.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10:00"+ "'", var9.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:00"+ "'", var12.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test119");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    var2.setHora(1);
    int var10 = var2.getHora();
    var2.setHora(100);
    java.lang.String var13 = var2.toString();
    var2.setHora(1);
    java.lang.String var16 = var2.toString();
    var2.setMin(100);
    var2.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100:-01"+ "'", var13.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "01:-01"+ "'", var16.equals("01:-01"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test120");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(1);
    int var4 = var0.getHora();
    var0.setHora(1);
    var0.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test121");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    var2.setMin(1);
    java.lang.String var8 = var2.toString();
    int var9 = var2.getHora();
    java.lang.String var10 = var2.toString();
    var2.setHora(0);
    java.lang.String var13 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:01"+ "'", var8.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:01"+ "'", var10.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:01"+ "'", var13.equals("00:01"));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test122");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getMin();
    var2.setHora(1);
    var2.setMin(1);
    var2.setMin(10);
    var2.setMin((-1));
    int var17 = var2.getHora();
    var2.setMin(100);
    int var20 = var2.getMin();
    var2.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:00"+ "'", var7.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test123");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    java.lang.String var5 = var2.toString();
    var2.setHora(1);
    var2.setHora((-1));
    var2.setHora(10);
    var2.setMin(0);
    java.lang.String var14 = var2.toString();
    var2.setHora((-1));
    java.lang.String var17 = var2.toString();
    var2.setMin(0);
    var2.setMin(100);
    java.lang.String var22 = var2.toString();
    int var23 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:00"+ "'", var14.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "-01:00"+ "'", var17.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "-01:100"+ "'", var22.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test124");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    var2.setHora(100);
    int var6 = var2.getMin();
    int var7 = var2.getMin();
    int var8 = var2.getHora();
    var2.setMin(1);
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test125");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    var0.setMin(100);
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    var0.setHora(0);
    var0.setMin((-1));
    var0.setMin(1);
    int var15 = var0.getMin();
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test126");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setMin(0);
    var2.setHora(10);
    var2.setMin(1);
    java.lang.String var14 = var2.toString();
    var2.setMin((-1));
    var2.setHora((-1));
    java.lang.String var19 = var2.toString();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:01"+ "'", var14.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "-01:-01"+ "'", var19.equals("-01:-01"));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test127");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    int var9 = var0.getMin();
    var0.setHora((-1));
    var0.setHora(100);
    var0.setMin(100);
    java.lang.String var16 = var0.toString();
    int var17 = var0.getMin();
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "100:100"+ "'", var16.equals("100:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test128");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    int var4 = var0.getMin();
    var0.setMin(0);
    int var7 = var0.getMin();
    var0.setMin(1);
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:01"+ "'", var10.equals("-01:01"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test129");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    var0.setHora((-1));
    java.lang.String var9 = var0.toString();
    var0.setHora(100);
    int var12 = var0.getMin();
    int var13 = var0.getMin();
    int var14 = var0.getHora();
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test130");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setMin(0);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    var0.setMin(10);
    var0.setHora(1);
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:00"+ "'", var7.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "01:10"+ "'", var12.equals("01:10"));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test131");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    var2.setHora(100);
    var2.setHora((-1));
    var2.setMin(100);
    java.lang.String var10 = var2.toString();
    var2.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:100"+ "'", var10.equals("-01:100"));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test132");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    var0.setMin((-1));
    int var10 = var0.getHora();
    var0.setHora((-1));
    var0.setHora(0);
    var0.setHora(0);
    int var17 = var0.getMin();
    int var18 = var0.getMin();
    int var19 = var0.getMin();
    int var20 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test133");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    var0.setHora(10);
    var0.setHora(100);
    var0.setHora(10);
    java.lang.String var12 = var0.toString();
    var0.setMin(1);
    var0.setMin((-1));
    int var17 = var0.getMin();
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:10"+ "'", var12.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test134");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    var0.setHora((-1));
    java.lang.String var9 = var0.toString();
    var0.setMin((-1));
    var0.setHora(0);
    int var14 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test135");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    java.lang.String var6 = var0.toString();
    var0.setMin(0);
    int var9 = var0.getMin();
    var0.setMin((-1));
    int var12 = var0.getMin();
    int var13 = var0.getHora();
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:-01"+ "'", var14.equals("00:-01"));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test136");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    int var3 = var0.getMin();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    var0.setMin(10);
    var0.setHora(0);
    java.lang.String var11 = var0.toString();
    var0.setHora(1);
    int var14 = var0.getMin();
    int var15 = var0.getMin();
    int var16 = var0.getHora();
    int var17 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:01"+ "'", var5.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:10"+ "'", var11.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test137");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    var0.setHora(100);
    var0.setMin(1);
    var0.setMin(100);
    var0.setHora(1);
    java.lang.String var14 = var0.toString();
    int var15 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "01:100"+ "'", var14.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test138");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, 10);
    int var3 = var2.getMin();
    int var4 = var2.getMin();
    int var5 = var2.getHora();
    var2.setHora(0);
    var2.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test139");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(0);
    int var5 = var2.getMin();
    var2.setMin(1);
    int var8 = var2.getMin();
    java.lang.String var9 = var2.toString();
    var2.setHora(0);
    int var12 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10:01"+ "'", var9.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test140");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora(1);
    int var3 = var0.getHora();
    var0.setHora(10);
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test141");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getHora();
    var0.setMin(1);
    int var12 = var0.getMin();
    int var13 = var0.getMin();
    var0.setHora(1);
    var0.setMin(1);
    int var18 = var0.getHora();
    int var19 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:10"+ "'", var6.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:10"+ "'", var7.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:10"+ "'", var8.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test142");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    var0.setHora(100);
    var0.setMin(1);
    int var10 = var0.getMin();
    var0.setMin(100);
    java.lang.String var13 = var0.toString();
    int var14 = var0.getHora();
    java.lang.String var15 = var0.toString();
    var0.setHora(1);
    var0.setMin(0);
    int var20 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100:100"+ "'", var13.equals("100:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100:100"+ "'", var15.equals("100:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test143");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    var2.setHora((-1));
    var2.setMin(10);
    int var9 = var2.getMin();
    var2.setHora(10);
    int var12 = var2.getHora();
    var2.setMin(100);
    var2.setHora(1);
    java.lang.String var17 = var2.toString();
    var2.setHora(1);
    int var20 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10:00"+ "'", var4.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "01:100"+ "'", var17.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test144");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    var0.setMin(100);
    int var9 = var0.getHora();
    var0.setHora(10);
    int var12 = var0.getMin();
    int var13 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test145");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    var0.setHora(10);
    var0.setMin(10);
    var0.setHora((-1));
    int var10 = var0.getHora();
    int var11 = var0.getHora();
    int var12 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test146");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    var0.setMin(1);
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    var0.setMin(0);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:01"+ "'", var11.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:01"+ "'", var12.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:01"+ "'", var13.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:00"+ "'", var16.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00:00"+ "'", var17.equals("00:00"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test147");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 1);
    java.lang.String var3 = var2.toString();
    int var4 = var2.getHora();
    int var5 = var2.getHora();
    var2.setMin(100);
    java.lang.String var8 = var2.toString();
    var2.setMin(10);
    var2.setHora((-1));
    java.lang.String var13 = var2.toString();
    int var14 = var2.getMin();
    java.lang.String var15 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "10:01"+ "'", var3.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:100"+ "'", var8.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:10"+ "'", var13.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01:10"+ "'", var15.equals("-01:10"));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test148");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(1);
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getHora();
    java.lang.String var14 = var0.toString();
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:01"+ "'", var11.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:01"+ "'", var12.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:01"+ "'", var14.equals("00:01"));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test149");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    java.lang.String var6 = var2.toString();
    var2.setMin((-1));
    var2.setMin((-1));
    java.lang.String var11 = var2.toString();
    var2.setHora(0);
    var2.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:-01"+ "'", var6.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:-01"+ "'", var11.equals("00:-01"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test150");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    var2.setMin(100);
    int var5 = var2.getMin();
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    var2.setMin(1);
    var2.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01:100"+ "'", var6.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:100"+ "'", var7.equals("-01:100"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test151");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, (-1));
    int var3 = var2.getHora();
    var2.setHora((-1));
    var2.setHora((-1));
    int var8 = var2.getMin();
    java.lang.String var9 = var2.toString();
    var2.setMin(1);
    var2.setMin(100);
    int var14 = var2.getHora();
    var2.setMin(10);
    var2.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test152");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getHora();
    var2.setHora(0);
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    int var10 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:00"+ "'", var8.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:00"+ "'", var9.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test153");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    int var8 = var2.getHora();
    var2.setHora(0);
    int var11 = var2.getMin();
    int var12 = var2.getMin();
    var2.setHora((-1));
    var2.setMin(100);
    var2.setMin(10);
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test154");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), (-1));
    int var3 = var2.getMin();
    int var4 = var2.getMin();
    var2.setMin(100);
    int var7 = var2.getHora();
    var2.setMin((-1));
    var2.setHora(10);
    int var12 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test155");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:01"+ "'", var3.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-01:01"+ "'", var4.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test156");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    var0.setHora((-1));
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    int var7 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:00"+ "'", var5.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test157");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    var0.setMin(10);
    var0.setMin(0);
    var0.setHora(0);
    var0.setMin(100);
    int var14 = var0.getMin();
    java.lang.String var15 = var0.toString();
    var0.setMin((-1));
    int var18 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00:100"+ "'", var15.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test158");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(1);
    var0.setMin(100);
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    var0.setHora((-1));
    int var15 = var0.getMin();
    var0.setMin(10);
    int var18 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:100"+ "'", var11.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test159");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    int var5 = var2.getHora();
    var2.setMin((-1));
    var2.setHora((-1));
    java.lang.String var10 = var2.toString();
    var2.setHora(0);
    int var13 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:-01"+ "'", var10.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test160");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    int var3 = var0.getMin();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getMin();
    var0.setHora(1);
    int var14 = var0.getMin();
    int var15 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:01"+ "'", var4.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:01"+ "'", var5.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:01"+ "'", var6.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:01"+ "'", var8.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:01"+ "'", var9.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:01"+ "'", var10.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test161");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    int var9 = var2.getHora();
    int var10 = var2.getHora();
    int var11 = var2.getHora();
    var2.setMin(100);
    java.lang.String var14 = var2.toString();
    var2.setHora(10);
    int var17 = var2.getMin();
    var2.setHora(0);
    java.lang.String var20 = var2.toString();
    var2.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "-01:100"+ "'", var14.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "00:100"+ "'", var20.equals("00:100"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test162");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setMin(10);
    var2.setMin(1);
    var2.setHora(1);
    var2.setMin(100);
    java.lang.String var11 = var2.toString();
    var2.setHora((-1));
    var2.setHora(10);
    int var16 = var2.getMin();
    var2.setHora((-1));
    var2.setMin(0);
    int var21 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:100"+ "'", var11.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test163");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    java.lang.String var8 = var2.toString();
    var2.setMin(1);
    var2.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:00"+ "'", var5.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:00"+ "'", var8.equals("10:00"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test164");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    var0.setHora(10);
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setMin(10);
    int var13 = var0.getHora();
    var0.setMin(0);
    java.lang.String var16 = var0.toString();
    var0.setMin(0);
    int var19 = var0.getMin();
    int var20 = var0.getHora();
    var0.setMin(0);
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10:00"+ "'", var16.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test165");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 0);
    var2.setMin(0);
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setMin((-1));
    int var10 = var2.getHora();
    java.lang.String var11 = var2.toString();
    int var12 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:-01"+ "'", var11.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test166");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getHora();
    var0.setMin(1);
    int var12 = var0.getHora();
    int var13 = var0.getHora();
    int var14 = var0.getMin();
    java.lang.String var15 = var0.toString();
    var0.setHora(1);
    int var18 = var0.getMin();
    var0.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:10"+ "'", var6.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:10"+ "'", var7.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:10"+ "'", var8.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00:01"+ "'", var15.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test167");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setMin((-1));
    var2.setHora(1);
    int var7 = var2.getHora();
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    var2.setMin(100);
    int var12 = var2.getHora();
    int var13 = var2.getMin();
    java.lang.String var14 = var2.toString();
    java.lang.String var15 = var2.toString();
    var2.setMin(10);
    java.lang.String var18 = var2.toString();
    java.lang.String var19 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "01:-01"+ "'", var8.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:-01"+ "'", var9.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "01:100"+ "'", var14.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "01:100"+ "'", var15.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "01:10"+ "'", var18.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "01:10"+ "'", var19.equals("01:10"));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test168");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    int var9 = var0.getHora();
    java.lang.String var10 = var0.toString();
    var0.setMin(100);
    var0.setHora(1);
    java.lang.String var15 = var0.toString();
    int var16 = var0.getHora();
    int var17 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:100"+ "'", var10.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "01:100"+ "'", var15.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test169");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    var2.setMin(0);
    var2.setMin(0);
    var2.setMin(1);
    int var12 = var2.getHora();
    java.lang.String var13 = var2.toString();
    var2.setMin(0);
    var2.setHora(100);
    var2.setHora(1);
    int var20 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:01"+ "'", var13.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test170");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    var0.setHora(10);
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setMin(1);
    var0.setHora(10);
    int var15 = var0.getMin();
    java.lang.String var16 = var0.toString();
    var0.setMin((-1));
    int var19 = var0.getHora();
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10:01"+ "'", var16.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10:-01"+ "'", var20.equals("10:-01"));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test171");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    java.lang.String var3 = var2.toString();
    int var4 = var2.getHora();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getHora();
    int var7 = var2.getMin();
    int var8 = var2.getHora();
    var2.setHora((-1));
    int var11 = var2.getHora();
    var2.setHora((-1));
    java.lang.String var14 = var2.toString();
    java.lang.String var15 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:01"+ "'", var3.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:01"+ "'", var5.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "-01:01"+ "'", var14.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01:01"+ "'", var15.equals("-01:01"));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test172");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setHora(0);
    var0.setHora(0);
    java.lang.String var7 = var0.toString();
    var0.setMin(0);
    var0.setMin(100);
    int var12 = var0.getHora();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    int var15 = var0.getMin();
    int var16 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:00"+ "'", var7.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:100"+ "'", var13.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test173");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    var0.setHora(1);
    int var5 = var0.getHora();
    var0.setMin(1);
    int var8 = var0.getHora();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00:00"+ "'", var2.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:01"+ "'", var9.equals("01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "01:01"+ "'", var10.equals("01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:01"+ "'", var11.equals("01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test174");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    java.lang.String var5 = var2.toString();
    var2.setHora(1);
    var2.setHora((-1));
    var2.setHora(10);
    var2.setHora((-1));
    int var14 = var2.getMin();
    var2.setHora(1);
    int var17 = var2.getMin();
    int var18 = var2.getHora();
    var2.setHora(0);
    int var21 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test175");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setMin(0);
    int var10 = var2.getHora();
    java.lang.String var11 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:00"+ "'", var11.equals("00:00"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test176");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    java.lang.String var6 = var0.toString();
    var0.setMin(10);
    var0.setMin(0);
    var0.setHora((-1));
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:10"+ "'", var6.equals("00:10"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test177");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    var0.setHora(100);
    java.lang.String var9 = var0.toString();
    var0.setHora(0);
    java.lang.String var12 = var0.toString();
    var0.setMin(0);
    int var15 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "100:-01"+ "'", var9.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:-01"+ "'", var12.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test178");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    int var5 = var0.getMin();
    var0.setHora((-1));
    java.lang.String var8 = var0.toString();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    int var11 = var0.getMin();
    var0.setMin(10);
    int var14 = var0.getMin();
    int var15 = var0.getMin();
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:00"+ "'", var8.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test179");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    int var7 = var0.getHora();
    java.lang.String var8 = var0.toString();
    var0.setMin(100);
    var0.setHora((-1));
    int var13 = var0.getMin();
    java.lang.String var14 = var0.toString();
    var0.setMin(10);
    int var17 = var0.getMin();
    var0.setMin(10);
    int var20 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:-01"+ "'", var8.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "-01:100"+ "'", var14.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test180");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    var0.setHora((-1));
    int var9 = var0.getMin();
    var0.setHora(10);
    int var12 = var0.getHora();
    var0.setMin(1);
    int var15 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test181");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora(0);
    var0.setHora(100);
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    int var13 = var0.getMin();
    int var14 = var0.getMin();
    java.lang.String var15 = var0.toString();
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100:10"+ "'", var11.equals("100:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100:10"+ "'", var15.equals("100:10"));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test182");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    var2.setHora(1);
    java.lang.String var10 = var2.toString();
    java.lang.String var11 = var2.toString();
    int var12 = var2.getHora();
    java.lang.String var13 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "01:-01"+ "'", var10.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:-01"+ "'", var11.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01:-01"+ "'", var13.equals("01:-01"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test183");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:-01"+ "'", var7.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test184");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    java.lang.String var6 = var2.toString();
    var2.setMin((-1));
    var2.setMin((-1));
    java.lang.String var11 = var2.toString();
    int var12 = var2.getMin();
    java.lang.String var13 = var2.toString();
    var2.setHora((-1));
    var2.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:-01"+ "'", var6.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:-01"+ "'", var11.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:-01"+ "'", var13.equals("00:-01"));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test185");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    var2.setMin(0);
    int var7 = var2.getHora();
    int var8 = var2.getMin();
    int var9 = var2.getHora();
    var2.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test186");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(1);
    int var5 = var2.getMin();
    var2.setHora(100);
    int var8 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test187");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    int var7 = var0.getMin();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:-01"+ "'", var8.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test188");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    java.lang.String var5 = var0.toString();
    var0.setHora(1);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    var0.setHora(1);
    int var12 = var0.getMin();
    var0.setHora(100);
    var0.setHora(10);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "01:-01"+ "'", var8.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:-01"+ "'", var9.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10:-01"+ "'", var17.equals("10:-01"));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test189");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(1);
    var0.setMin(100);
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    java.lang.String var13 = var0.toString();
    var0.setMin(100);
    var0.setHora(1);
    var0.setMin(10);
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:100"+ "'", var11.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01:100"+ "'", var13.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "01:10"+ "'", var20.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "01:10"+ "'", var21.equals("01:10"));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test190");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    var0.setHora(10);
    var0.setHora(10);
    java.lang.String var14 = var0.toString();
    int var15 = var0.getHora();
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:10"+ "'", var14.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test191");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    var2.setHora(0);
    var2.setHora(100);
    var2.setHora((-1));
    java.lang.String var11 = var2.toString();
    int var12 = var2.getHora();
    int var13 = var2.getMin();
    int var14 = var2.getMin();
    java.lang.String var15 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:-01"+ "'", var11.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01:-01"+ "'", var15.equals("-01:-01"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test192");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(1);
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    var0.setMin(10);
    var0.setMin(100);
    var0.setHora(10);
    java.lang.String var18 = var0.toString();
    var0.setMin(100);
    int var21 = var0.getMin();
    java.lang.String var22 = var0.toString();
    int var23 = var0.getHora();
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:01"+ "'", var11.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10:100"+ "'", var18.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "10:100"+ "'", var22.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "10:100"+ "'", var24.equals("10:100"));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test193");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(100);
    var0.setHora(100);
    java.lang.String var8 = var0.toString();
    var0.setMin(0);
    var0.setMin(10);
    java.lang.String var13 = var0.toString();
    var0.setMin(10);
    java.lang.String var16 = var0.toString();
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100:100"+ "'", var8.equals("100:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100:10"+ "'", var13.equals("100:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "100:10"+ "'", var16.equals("100:10"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test194");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    var2.setMin(1);
    java.lang.String var8 = var2.toString();
    int var9 = var2.getMin();
    var2.setHora(1);
    var2.setHora((-1));
    int var14 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:01"+ "'", var8.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test195");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    int var11 = var0.getMin();
    var0.setHora((-1));
    int var14 = var0.getHora();
    int var15 = var0.getMin();
    int var16 = var0.getHora();
    var0.setHora((-1));
    int var19 = var0.getHora();
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test196");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(1);
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    int var7 = var2.getHora();
    int var8 = var2.getHora();
    java.lang.String var9 = var2.toString();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10:01"+ "'", var9.equals("10:01"));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test197");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setMin(0);
    java.lang.String var6 = var0.toString();
    var0.setMin(1);
    int var9 = var0.getHora();
    int var10 = var0.getMin();
    int var11 = var0.getMin();
    var0.setHora(100);
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "100:01"+ "'", var14.equals("100:01"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test198");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setMin(1);
    var0.setHora(1);
    var0.setHora(0);
    var0.setMin(100);
    var0.setMin(0);
    int var14 = var0.getMin();
    var0.setHora(100);
    int var17 = var0.getHora();
    var0.setHora(10);
    int var20 = var0.getMin();
    int var21 = var0.getHora();
    int var22 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test199");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    var2.setHora((-1));
    var2.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:01"+ "'", var3.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-01:01"+ "'", var4.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test200");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getMin();
    java.lang.String var8 = var2.toString();
    var2.setMin(10);
    int var11 = var2.getMin();
    var2.setMin(1);
    int var14 = var2.getHora();
    java.lang.String var15 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:-01"+ "'", var8.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00:01"+ "'", var15.equals("00:01"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test201");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora(0);
    var0.setHora(10);
    int var11 = var0.getMin();
    var0.setHora((-1));
    var0.setMin((-1));
    int var16 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test202");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(100, 0);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    java.lang.String var6 = var2.toString();
    var2.setHora(10);
    int var9 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "100:00"+ "'", var3.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100:00"+ "'", var4.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100:00"+ "'", var6.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test203");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    int var7 = var0.getHora();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getHora();
    var0.setHora(10);
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:-01"+ "'", var8.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:-01"+ "'", var9.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test204");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    var0.setHora(1);
    int var5 = var0.getMin();
    var0.setHora(10);
    int var8 = var0.getHora();
    var0.setHora(10);
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    int var15 = var0.getHora();
    int var16 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00:00"+ "'", var2.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10:00"+ "'", var11.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10:00"+ "'", var13.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test205");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, (-1));
    int var3 = var2.getHora();
    var2.setHora((-1));
    var2.setHora((-1));
    int var8 = var2.getMin();
    int var9 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test206");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    int var9 = var0.getHora();
    int var10 = var0.getHora();
    var0.setMin(10);
    var0.setMin(1);
    int var15 = var0.getMin();
    int var16 = var0.getMin();
    int var17 = var0.getHora();
    int var18 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test207");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    int var5 = var2.getHora();
    var2.setMin((-1));
    var2.setMin(1);
    var2.setMin((-1));
    var2.setMin(1);
    int var14 = var2.getMin();
    int var15 = var2.getMin();
    int var16 = var2.getMin();
    int var17 = var2.getMin();
    int var18 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test208");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setMin(0);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    var0.setHora(100);
    var0.setHora(1);
    int var12 = var0.getMin();
    var0.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:00"+ "'", var7.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test209");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    java.lang.String var7 = var0.toString();
    var0.setHora((-1));
    int var10 = var0.getMin();
    var0.setMin(100);
    java.lang.String var13 = var0.toString();
    var0.setHora(0);
    int var16 = var0.getMin();
    int var17 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:-01"+ "'", var7.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:100"+ "'", var13.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test210");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    int var5 = var0.getMin();
    var0.setHora((-1));
    int var8 = var0.getMin();
    int var9 = var0.getMin();
    var0.setMin((-1));
    int var12 = var0.getMin();
    int var13 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test211");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    java.lang.String var6 = var0.toString();
    var0.setMin(100);
    java.lang.String var9 = var0.toString();
    int var10 = var0.getHora();
    int var11 = var0.getHora();
    int var12 = var0.getHora();
    int var13 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10:00"+ "'", var6.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10:100"+ "'", var9.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test212");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(100, (-1));
    var2.setMin(100);
    int var5 = var2.getMin();
    var2.setHora(1);
    var2.setHora(0);
    int var10 = var2.getMin();
    var2.setMin((-1));
    var2.setHora((-1));
    int var15 = var2.getHora();
    var2.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test213");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setMin(0);
    java.lang.String var5 = var2.toString();
    var2.setMin(1);
    var2.setMin((-1));
    java.lang.String var10 = var2.toString();
    var2.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01:00"+ "'", var5.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "01:-01"+ "'", var10.equals("01:-01"));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test214");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    int var9 = var0.getHora();
    java.lang.String var10 = var0.toString();
    var0.setMin(100);
    int var13 = var0.getHora();
    int var14 = var0.getMin();
    var0.setMin(10);
    var0.setHora(100);
    int var19 = var0.getMin();
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:100"+ "'", var10.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test215");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    java.lang.String var3 = var0.toString();
    var0.setMin(0);
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    int var10 = var0.getMin();
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:00"+ "'", var3.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test216");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    int var3 = var0.getMin();
    java.lang.String var4 = var0.toString();
    var0.setHora(0);
    var0.setMin(10);
    var0.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:01"+ "'", var4.equals("00:01"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test217");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(1);
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    int var7 = var2.getHora();
    int var8 = var2.getHora();
    java.lang.String var9 = var2.toString();
    var2.setMin(10);
    int var12 = var2.getHora();
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10:01"+ "'", var9.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test218");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:00"+ "'", var8.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:00"+ "'", var11.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test219");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    java.lang.String var6 = var0.toString();
    var0.setHora(1);
    java.lang.String var9 = var0.toString();
    var0.setHora(0);
    int var12 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:10"+ "'", var6.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:10"+ "'", var9.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test220");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    java.lang.String var3 = var0.toString();
    var0.setMin(0);
    int var6 = var0.getHora();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:00"+ "'", var3.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test221");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    int var9 = var0.getHora();
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test222");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    var0.setMin(0);
    int var12 = var0.getHora();
    var0.setMin(0);
    var0.setMin(0);
    int var17 = var0.getHora();
    var0.setMin(100);
    java.lang.String var20 = var0.toString();
    var0.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:10"+ "'", var6.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "00:100"+ "'", var20.equals("00:100"));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test223");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(100);
    java.lang.String var10 = var0.toString();
    var0.setHora((-1));
    int var13 = var0.getHora();
    int var14 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:100"+ "'", var10.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test224");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, (-1));
    var2.setHora(0);
    var2.setMin(100);
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:100"+ "'", var7.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:100"+ "'", var8.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:100"+ "'", var9.equals("00:100"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test225");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 100);
    var2.setMin(100);
    var2.setMin(0);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test226");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(100);
    var0.setHora((-1));
    var0.setMin(100);
    int var14 = var0.getHora();
    var0.setHora(0);
    int var17 = var0.getMin();
    var0.setMin(1);
    var0.setMin(1);
    int var22 = var0.getHora();
    var0.setMin(0);
    int var25 = var0.getMin();
    java.lang.String var26 = var0.toString();
    var0.setMin(100);
    var0.setMin(0);
    var0.setMin(1);
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "00:00"+ "'", var26.equals("00:00"));

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test227");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getMin();
    var0.setMin((-1));
    var0.setMin(1);
    int var14 = var0.getHora();
    int var15 = var0.getMin();
    var0.setMin(10);
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:-01"+ "'", var7.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test228");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    int var8 = var0.getHora();
    var0.setHora((-1));
    int var11 = var0.getMin();
    var0.setMin(1);
    java.lang.String var14 = var0.toString();
    var0.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "-01:01"+ "'", var14.equals("-01:01"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test229");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    int var3 = var2.getHora();
    var2.setMin(1);
    int var6 = var2.getMin();
    var2.setMin(0);
    int var9 = var2.getHora();
    int var10 = var2.getMin();
    var2.setMin(10);
    int var13 = var2.getMin();
    var2.setHora(0);
    var2.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test230");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(100);
    var0.setMin((-1));
    java.lang.String var12 = var0.toString();
    var0.setHora(100);
    int var15 = var0.getMin();
    int var16 = var0.getHora();
    int var17 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:-01"+ "'", var12.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test231");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getMin();
    var0.setMin(1);
    int var13 = var0.getMin();
    int var14 = var0.getMin();
    var0.setHora(10);
    int var17 = var0.getMin();
    int var18 = var0.getHora();
    var0.setMin(0);
    int var21 = var0.getMin();
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "10:00"+ "'", var22.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "10:00"+ "'", var23.equals("10:00"));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test232");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 100);
    var2.setHora(1);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.toString();
    int var9 = var2.getHora();
    var2.setHora(100);
    int var12 = var2.getHora();
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01:100"+ "'", var5.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "01:100"+ "'", var6.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "01:100"+ "'", var7.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "01:100"+ "'", var8.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test233");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora(1);
    int var11 = var2.getHora();
    var2.setHora(0);
    var2.setMin(10);
    var2.setHora(1);
    int var18 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test234");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, 100);
    java.lang.String var3 = var2.toString();
    var2.setMin(1);
    java.lang.String var6 = var2.toString();
    var2.setHora(10);
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:100"+ "'", var3.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:01"+ "'", var6.equals("00:01"));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test235");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setMin((-1));
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    int var7 = var2.getHora();
    int var8 = var2.getHora();
    int var9 = var2.getHora();
    int var10 = var2.getHora();
    int var11 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test236");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    var0.setMin(100);
    int var9 = var0.getMin();
    java.lang.String var10 = var0.toString();
    var0.setHora(1);
    var0.setMin(100);
    var0.setMin((-1));
    int var17 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:100"+ "'", var10.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test237");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 0);
    var2.setMin(100);
    var2.setMin(100);
    int var7 = var2.getHora();
    java.lang.String var8 = var2.toString();
    var2.setMin(0);
    java.lang.String var11 = var2.toString();
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:100"+ "'", var8.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:00"+ "'", var11.equals("-01:00"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test238");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    var0.setMin(10);
    int var11 = var0.getHora();
    var0.setMin(0);
    var0.setHora(1);
    var0.setMin(0);
    java.lang.String var18 = var0.toString();
    int var19 = var0.getMin();
    var0.setHora(0);
    var0.setHora(100);
    var0.setMin(10);
    int var26 = var0.getHora();
    var0.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "01:00"+ "'", var18.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test239");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    java.lang.String var6 = var2.toString();
    int var7 = var2.getMin();
    var2.setHora(0);
    java.lang.String var10 = var2.toString();
    var2.setHora(100);
    int var13 = var2.getHora();
    var2.setMin((-1));
    int var16 = var2.getHora();
    var2.setMin(1);
    var2.setMin(10);
    java.lang.String var21 = var2.toString();
    java.lang.String var22 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:-01"+ "'", var6.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:-01"+ "'", var10.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "100:10"+ "'", var21.equals("100:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "100:10"+ "'", var22.equals("100:10"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test240");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    var0.setHora(1);
    var0.setMin(0);
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    var0.setHora((-1));
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:00"+ "'", var11.equals("01:00"));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test241");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setHora(0);
    int var10 = var2.getMin();
    java.lang.String var11 = var2.toString();
    var2.setHora(1);
    int var14 = var2.getHora();
    int var15 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:-01"+ "'", var11.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test242");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    int var3 = var0.getHora();
    var0.setMin(100);
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    var0.setMin(0);
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:100"+ "'", var6.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test243");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    int var9 = var0.getHora();
    var0.setHora(10);
    java.lang.String var12 = var0.toString();
    var0.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:100"+ "'", var12.equals("10:100"));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test244");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 0);
    var2.setMin(1);
    int var5 = var2.getHora();
    var2.setMin(10);
    int var8 = var2.getMin();
    int var9 = var2.getMin();
    int var10 = var2.getHora();
    int var11 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test245");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getMin();
    var2.setHora(1);
    int var11 = var2.getMin();
    int var12 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:00"+ "'", var7.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test246");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setMin(0);
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    java.lang.String var11 = var2.toString();
    java.lang.String var12 = var2.toString();
    java.lang.String var13 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:00"+ "'", var9.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:00"+ "'", var11.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:00"+ "'", var13.equals("00:00"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test247");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    var0.setHora(1);
    int var8 = var0.getMin();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getMin();
    int var11 = var0.getMin();
    java.lang.String var12 = var0.toString();
    var0.setHora(100);
    var0.setHora(100);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:00"+ "'", var9.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "01:00"+ "'", var12.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100:00"+ "'", var17.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100:00"+ "'", var18.equals("100:00"));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test248");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    int var8 = var2.getHora();
    var2.setHora(0);
    int var11 = var2.getMin();
    int var12 = var2.getMin();
    var2.setMin(1);
    int var15 = var2.getHora();
    var2.setHora(0);
    var2.setMin(10);
    java.lang.String var20 = var2.toString();
    int var21 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "00:10"+ "'", var20.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test249");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, 10);
    java.lang.String var3 = var2.toString();
    var2.setMin(100);
    var2.setMin(10);
    java.lang.String var8 = var2.toString();
    int var9 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:10"+ "'", var3.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:10"+ "'", var8.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test250");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    var0.setMin(10);
    var0.setMin((-1));
    int var11 = var0.getHora();
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test251");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    var0.setMin((-1));
    int var10 = var0.getHora();
    int var11 = var0.getHora();
    int var12 = var0.getHora();
    int var13 = var0.getHora();
    java.lang.String var14 = var0.toString();
    var0.setMin(10);
    var0.setMin(100);
    var0.setHora(10);
    var0.setMin((-1));
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:-01"+ "'", var14.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "10:-01"+ "'", var23.equals("10:-01"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test252");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(100, 1);
    int var3 = var2.getMin();
    var2.setMin(0);
    java.lang.String var6 = var2.toString();
    int var7 = var2.getMin();
    java.lang.String var8 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100:00"+ "'", var6.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100:00"+ "'", var8.equals("100:00"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test253");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    var2.setMin((-1));
    var2.setMin(100);
    int var12 = var2.getHora();
    var2.setHora((-1));
    var2.setHora(0);
    var2.setHora(0);
    java.lang.String var19 = var2.toString();
    var2.setHora(1);
    var2.setHora(0);
    int var24 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "00:100"+ "'", var19.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test254");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    var0.setHora(0);
    var0.setHora(100);
    int var14 = var0.getMin();
    var0.setMin(1);
    java.lang.String var17 = var0.toString();
    int var18 = var0.getHora();
    int var19 = var0.getHora();
    var0.setMin((-1));
    int var22 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100:01"+ "'", var17.equals("100:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test255");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getMin();
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    java.lang.String var6 = var0.toString();
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10:00"+ "'", var6.equals("10:00"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test256");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    var2.setHora(100);
    java.lang.String var11 = var2.toString();
    var2.setHora(10);
    var2.setHora(0);
    var2.setHora(10);
    var2.setHora(10);
    var2.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100:-01"+ "'", var11.equals("100:-01"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test257");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setHora(0);
    var0.setHora(0);
    var0.setMin((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    int var11 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test258");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    var0.setMin((-1));
    int var10 = var0.getHora();
    int var11 = var0.getHora();
    var0.setHora(0);
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:-01"+ "'", var14.equals("00:-01"));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test259");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setMin((-1));
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    var2.setHora(10);
    var2.setHora((-1));
    int var11 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test260");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setMin(0);
    int var5 = var2.getMin();
    int var6 = var2.getMin();
    var2.setMin(1);
    var2.setMin((-1));
    int var11 = var2.getHora();
    int var12 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test261");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    var0.setHora(1);
    int var8 = var0.getMin();
    int var9 = var0.getHora();
    var0.setMin(10);
    var0.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test262");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(100, 10);
    int var3 = var2.getMin();
    var2.setHora(0);
    var2.setMin(1);
    int var8 = var2.getMin();
    int var9 = var2.getHora();
    var2.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test263");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    var0.setMin(100);
    int var9 = var0.getMin();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    var0.setMin((-1));
    int var14 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:100"+ "'", var10.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:100"+ "'", var11.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test264");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    int var7 = var0.getMin();
    int var8 = var0.getHora();
    java.lang.String var9 = var0.toString();
    var0.setMin(1);
    var0.setMin(100);
    var0.setMin(10);
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:00"+ "'", var9.equals("00:00"));

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test265");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    var0.setHora(100);
    var0.setMin(1);
    var0.setMin(100);
    java.lang.String var12 = var0.toString();
    int var13 = var0.getHora();
    java.lang.String var14 = var0.toString();
    var0.setHora(100);
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100:100"+ "'", var12.equals("100:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "100:100"+ "'", var14.equals("100:100"));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test266");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    var2.setHora(100);
    var2.setHora((-1));
    var2.setHora((-1));
    var2.setMin(100);
    java.lang.String var12 = var2.toString();
    int var13 = var2.getMin();
    int var14 = var2.getMin();
    int var15 = var2.getHora();
    int var16 = var2.getMin();
    var2.setMin((-1));
    var2.setMin(100);
    java.lang.String var21 = var2.toString();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:100"+ "'", var12.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "-01:100"+ "'", var21.equals("-01:100"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test267");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 1);
    var2.setMin(100);
    var2.setMin(0);
    java.lang.String var7 = var2.toString();
    var2.setHora(100);
    int var10 = var2.getMin();
    int var11 = var2.getMin();
    var2.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10:00"+ "'", var7.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test268");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    var0.setHora((-1));
    var0.setHora(10);
    int var8 = var0.getHora();
    int var9 = var0.getHora();
    int var10 = var0.getHora();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getHora();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    java.lang.String var15 = var0.toString();
    int var16 = var0.getHora();
    var0.setMin(1);
    var0.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10:00"+ "'", var11.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10:00"+ "'", var13.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10:00"+ "'", var15.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test269");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getMin();
    int var8 = var2.getHora();
    int var9 = var2.getMin();
    int var10 = var2.getMin();
    int var11 = var2.getMin();
    int var12 = var2.getMin();
    int var13 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:10"+ "'", var5.equals("100:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test270");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(100, (-1));
    var2.setMin(0);
    int var5 = var2.getHora();
    var2.setMin(0);
    var2.setMin(1);
    java.lang.String var10 = var2.toString();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100:01"+ "'", var10.equals("100:01"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test271");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getHora();
    var0.setMin(1);
    int var12 = var0.getHora();
    java.lang.String var13 = var0.toString();
    var0.setMin(1);
    int var16 = var0.getMin();
    int var17 = var0.getHora();
    int var18 = var0.getHora();
    int var19 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:10"+ "'", var6.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:10"+ "'", var7.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:10"+ "'", var8.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:01"+ "'", var13.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test272");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setHora(100);
    int var10 = var2.getMin();
    var2.setMin((-1));
    java.lang.String var13 = var2.toString();
    var2.setMin((-1));
    var2.setHora(0);
    int var18 = var2.getMin();
    var2.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100:-01"+ "'", var13.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test273");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    int var3 = var0.getHora();
    var0.setHora(1);
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    var0.setMin(1);
    int var10 = var0.getMin();
    int var11 = var0.getMin();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "01:01"+ "'", var12.equals("01:01"));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test274");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    var0.setHora((-1));
    java.lang.String var9 = var0.toString();
    var0.setMin(100);
    int var12 = var0.getHora();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:00"+ "'", var9.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:100"+ "'", var13.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test275");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 0);
    var2.setMin(0);
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    int var8 = var2.getHora();
    int var9 = var2.getMin();
    java.lang.String var10 = var2.toString();
    int var11 = var2.getHora();
    var2.setHora(0);
    var2.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:00"+ "'", var10.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test276");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setHora(100);
    var2.setHora(1);
    var2.setMin(10);
    int var14 = var2.getHora();
    int var15 = var2.getHora();
    var2.setMin((-1));
    var2.setMin(100);
    var2.setMin(0);
    int var22 = var2.getHora();
    var2.setHora(1);
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test277");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(100);
    var0.setHora((-1));
    var0.setMin(100);
    var0.setMin(100);
    java.lang.String var16 = var0.toString();
    var0.setHora(1);
    java.lang.String var19 = var0.toString();
    int var20 = var0.getMin();
    var0.setMin(0);
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "-01:100"+ "'", var16.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "01:100"+ "'", var19.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test278");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    var0.setMin(10);
    int var9 = var0.getHora();
    var0.setHora(1);
    var0.setMin(100);
    var0.setMin(100);
    var0.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test279");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getMin();
    int var6 = var2.getMin();
    var2.setHora((-1));
    var2.setMin(0);
    int var11 = var2.getHora();
    int var12 = var2.getMin();
    int var13 = var2.getMin();
    var2.setMin(0);
    var2.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test280");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    int var3 = var0.getMin();
    var0.setHora(0);
    var0.setMin(100);
    int var8 = var0.getMin();
    var0.setMin(1);
    int var11 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test281");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    var0.setHora(100);
    java.lang.String var9 = var0.toString();
    var0.setHora(0);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    var0.setMin((-1));
    int var16 = var0.getHora();
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "100:-01"+ "'", var9.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:-01"+ "'", var12.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:-01"+ "'", var13.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00:-01"+ "'", var17.equals("00:-01"));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test282");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora(0);
    var0.setHora(10);
    int var11 = var0.getMin();
    var0.setMin(1);
    java.lang.String var14 = var0.toString();
    int var15 = var0.getHora();
    int var16 = var0.getMin();
    int var17 = var0.getMin();
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:01"+ "'", var14.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test283");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    int var8 = var0.getHora();
    var0.setHora(100);
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test284");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setMin(1);
    var0.setHora(1);
    var0.setHora(0);
    var0.setMin(100);
    var0.setMin(0);
    var0.setMin(100);
    int var16 = var0.getMin();
    int var17 = var0.getHora();
    var0.setMin(1);
    int var20 = var0.getMin();
    int var21 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test285");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(1);
    java.lang.String var10 = var0.toString();
    var0.setHora(100);
    var0.setHora(0);
    int var15 = var0.getMin();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    var0.setHora((-1));
    int var20 = var0.getHora();
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:01"+ "'", var10.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:01"+ "'", var16.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00:01"+ "'", var17.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test286");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(1);
    int var5 = var2.getMin();
    var2.setHora(100);
    var2.setMin((-1));
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test287");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(100, (-1));
    var2.setMin(100);
    int var5 = var2.getMin();
    var2.setHora(1);
    var2.setHora(0);
    var2.setMin(10);
    var2.setHora(100);
    int var14 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test288");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(100);
    int var6 = var0.getMin();
    var0.setMin(10);
    var0.setHora(0);
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:10"+ "'", var11.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:10"+ "'", var13.equals("00:10"));

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test289");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setHora(100);
    var2.setHora(10);
    java.lang.String var7 = var2.toString();
    var2.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10:00"+ "'", var7.equals("10:00"));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test290");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(1);
    java.lang.String var5 = var2.toString();
    var2.setMin(10);
    java.lang.String var8 = var2.toString();
    var2.setMin(100);
    var2.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10:01"+ "'", var5.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:10"+ "'", var8.equals("10:10"));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test291");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setMin(1);
    int var4 = var0.getMin();
    var0.setHora(10);
    var0.setHora(1);
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test292");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(100, 0);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    java.lang.String var5 = var2.toString();
    var2.setMin((-1));
    int var8 = var2.getHora();
    int var9 = var2.getMin();
    int var10 = var2.getMin();
    java.lang.String var11 = var2.toString();
    java.lang.String var12 = var2.toString();
    int var13 = var2.getHora();
    var2.setMin(1);
    var2.setHora(0);
    var2.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "100:00"+ "'", var3.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100:00"+ "'", var4.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:00"+ "'", var5.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100:-01"+ "'", var11.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100:-01"+ "'", var12.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test293");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora(0);
    java.lang.String var9 = var0.toString();
    var0.setHora(100);
    var0.setHora(100);
    var0.setMin(0);
    var0.setHora(10);
    int var18 = var0.getHora();
    var0.setHora(10);
    int var21 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:10"+ "'", var9.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test294");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    java.lang.String var3 = var2.toString();
    int var4 = var2.getHora();
    var2.setHora(100);
    int var7 = var2.getMin();
    var2.setMin(100);
    var2.setHora(100);
    var2.setMin(0);
    int var14 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:01"+ "'", var3.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test295");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 1);
    java.lang.String var3 = var2.toString();
    var2.setHora(10);
    int var6 = var2.getHora();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "10:01"+ "'", var3.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10:01"+ "'", var7.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test296");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    var0.setHora((-1));
    var0.setHora(10);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getMin();
    var0.setHora(1);
    int var13 = var0.getMin();
    var0.setMin(100);
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:00"+ "'", var8.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10:00"+ "'", var9.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "01:100"+ "'", var16.equals("01:100"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test297");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 10);
    java.lang.String var3 = var2.toString();
    var2.setHora(0);
    int var6 = var2.getHora();
    int var7 = var2.getMin();
    int var8 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:10"+ "'", var3.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test298");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin(1);
    int var5 = var0.getHora();
    int var6 = var0.getHora();
    java.lang.String var7 = var0.toString();
    int var8 = var0.getHora();
    var0.setHora((-1));
    var0.setMin(0);
    int var13 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:01"+ "'", var7.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test299");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    int var6 = var2.getHora();
    int var7 = var2.getMin();
    var2.setMin(1);
    var2.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:00"+ "'", var5.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test300");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    java.lang.String var6 = var2.toString();
    var2.setMin((-1));
    var2.setHora(0);
    java.lang.String var11 = var2.toString();
    var2.setHora(100);
    var2.setHora(1);
    int var16 = var2.getMin();
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:-01"+ "'", var6.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:-01"+ "'", var11.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test301");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    var0.setMin(10);
    var0.setHora(1);
    var0.setHora(0);
    var0.setMin(10);
    int var15 = var0.getHora();
    var0.setMin(10);
    int var18 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test302");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(1);
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setMin(100);
    int var10 = var2.getMin();
    var2.setMin(10);
    int var13 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test303");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 0);
    var2.setMin(1);
    int var5 = var2.getHora();
    var2.setMin(10);
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    var2.setHora(1);
    int var12 = var2.getMin();
    int var13 = var2.getMin();
    var2.setHora(10);
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:10"+ "'", var8.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:10"+ "'", var9.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test304");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    java.lang.String var5 = var2.toString();
    var2.setHora(1);
    int var8 = var2.getMin();
    int var9 = var2.getHora();
    java.lang.String var10 = var2.toString();
    int var11 = var2.getHora();
    java.lang.String var12 = var2.toString();
    java.lang.String var13 = var2.toString();
    var2.setMin(100);
    java.lang.String var16 = var2.toString();
    java.lang.String var17 = var2.toString();
    var2.setHora(1);
    int var20 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "01:00"+ "'", var10.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "01:00"+ "'", var12.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01:00"+ "'", var13.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "01:100"+ "'", var16.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "01:100"+ "'", var17.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test305");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getMin();
    var0.setHora(0);
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getMin();
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:00"+ "'", var5.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:00"+ "'", var9.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test306");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    int var6 = var2.getHora();
    int var7 = var2.getMin();
    var2.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:00"+ "'", var5.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test307");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    var0.setHora((-1));
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    var0.setMin(100);
    int var13 = var0.getHora();
    int var14 = var0.getMin();
    var0.setMin((-1));
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    var0.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:-01"+ "'", var10.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "-01:-01"+ "'", var17.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "-01:-01"+ "'", var18.equals("-01:-01"));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test308");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    var0.setHora(0);
    java.lang.String var10 = var0.toString();
    int var11 = var0.getMin();
    int var12 = var0.getHora();
    var0.setMin(100);
    int var15 = var0.getMin();
    java.lang.String var16 = var0.toString();
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:100"+ "'", var16.equals("00:100"));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test309");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setMin(0);
    java.lang.String var6 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(0);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    int var15 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:00"+ "'", var13.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:00"+ "'", var14.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test310");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 100);
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test311");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(1);
    var0.setHora(1);
    var0.setMin(1);
    var0.setHora(1);
    java.lang.String var12 = var0.toString();
    var0.setMin(0);
    int var15 = var0.getHora();
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "01:01"+ "'", var12.equals("01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test312");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(1);
    int var5 = var2.getHora();
    var2.setHora((-1));
    int var8 = var2.getMin();
    var2.setHora(0);
    var2.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test313");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    int var9 = var0.getMin();
    int var10 = var0.getMin();
    var0.setMin(0);
    int var13 = var0.getHora();
    var0.setMin(10);
    var0.setMin(10);
    java.lang.String var18 = var0.toString();
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "00:10"+ "'", var18.equals("00:10"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test314");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora((-1));
    int var11 = var2.getHora();
    var2.setHora(10);
    int var14 = var2.getMin();
    int var15 = var2.getMin();
    java.lang.String var16 = var2.toString();
    var2.setHora(10);
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10:-01"+ "'", var16.equals("10:-01"));

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test315");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    int var7 = var0.getHora();
    java.lang.String var8 = var0.toString();
    var0.setMin(100);
    var0.setHora((-1));
    int var13 = var0.getMin();
    var0.setHora(10);
    var0.setMin(100);
    int var18 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:-01"+ "'", var8.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test316");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setMin((-1));
    int var13 = var0.getHora();
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:-01"+ "'", var14.equals("00:-01"));

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test317");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setMin(0);
    int var5 = var2.getMin();
    var2.setHora(10);
    int var8 = var2.getHora();
    int var9 = var2.getMin();
    int var10 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test318");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    int var7 = var0.getMin();
    java.lang.String var8 = var0.toString();
    var0.setMin((-1));
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:00"+ "'", var8.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:-01"+ "'", var11.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test319");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setHora(0);
    int var10 = var2.getMin();
    java.lang.String var11 = var2.toString();
    var2.setHora(1);
    int var14 = var2.getHora();
    int var15 = var2.getMin();
    int var16 = var2.getHora();
    var2.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:-01"+ "'", var11.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test320");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    var2.setHora(10);
    int var11 = var2.getMin();
    int var12 = var2.getMin();
    var2.setHora(0);
    int var15 = var2.getHora();
    java.lang.String var16 = var2.toString();
    var2.setHora(100);
    java.lang.String var19 = var2.toString();
    java.lang.String var20 = var2.toString();
    int var21 = var2.getHora();
    int var22 = var2.getHora();
    var2.setHora(1);
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:-01"+ "'", var16.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "100:-01"+ "'", var19.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "100:-01"+ "'", var20.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test321");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    var0.setHora(100);
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    var0.setHora(100);
    var0.setHora(1);
    java.lang.String var15 = var0.toString();
    var0.setMin(10);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "100:-01"+ "'", var9.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100:-01"+ "'", var10.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "01:-01"+ "'", var15.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "01:10"+ "'", var18.equals("01:10"));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test322");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    var0.setHora(10);
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setMin(10);
    var0.setHora(100);
    var0.setHora(1);
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test323");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setMin((-1));
    java.lang.String var5 = var2.toString();
    var2.setMin(10);
    int var8 = var2.getHora();
    int var9 = var2.getHora();
    var2.setMin(0);
    int var12 = var2.getHora();
    int var13 = var2.getHora();
    java.lang.String var14 = var2.toString();
    int var15 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01:-01"+ "'", var5.equals("01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "01:00"+ "'", var14.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test324");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getMin();
    var2.setHora(1);
    var2.setMin(1);
    java.lang.String var13 = var2.toString();
    int var14 = var2.getMin();
    java.lang.String var15 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:00"+ "'", var7.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01:01"+ "'", var13.equals("01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "01:01"+ "'", var15.equals("01:01"));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test325");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    var0.setHora((-1));
    var0.setHora((-1));
    int var8 = var0.getMin();
    var0.setMin(1);
    var0.setHora(10);
    int var13 = var0.getMin();
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test326");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    var2.setHora(100);
    int var9 = var2.getHora();
    int var10 = var2.getHora();
    var2.setMin(0);
    int var13 = var2.getMin();
    var2.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test327");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    java.lang.String var7 = var0.toString();
    var0.setHora((-1));
    int var10 = var0.getMin();
    var0.setMin(100);
    var0.setHora(10);
    int var15 = var0.getHora();
    var0.setMin(10);
    int var18 = var0.getHora();
    int var19 = var0.getHora();
    java.lang.String var20 = var0.toString();
    int var21 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:-01"+ "'", var7.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10:10"+ "'", var20.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test328");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(1);
    int var8 = var0.getMin();
    var0.setMin(10);
    var0.setMin(10);
    var0.setHora(10);
    var0.setHora(0);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00:10"+ "'", var17.equals("00:10"));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test329");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    int var9 = var0.getHora();
    var0.setMin(10);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:10"+ "'", var12.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:10"+ "'", var13.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test330");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setMin(10);
    var2.setMin(1);
    var2.setHora(1);
    int var9 = var2.getHora();
    int var10 = var2.getMin();
    int var11 = var2.getHora();
    int var12 = var2.getHora();
    var2.setHora(0);
    var2.setHora(0);
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test331");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getMin();
    var0.setHora(0);
    var0.setMin(100);
    java.lang.String var11 = var0.toString();
    var0.setMin((-1));
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:00"+ "'", var5.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:100"+ "'", var11.equals("00:100"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test332");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    var0.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:10"+ "'", var6.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test333");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    var0.setMin(100);
    int var7 = var0.getHora();
    int var8 = var0.getHora();
    int var9 = var0.getHora();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getMin();
    int var12 = var0.getHora();
    var0.setMin((-1));
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:100"+ "'", var10.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test334");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setHora(0);
    var0.setMin(1);
    var0.setHora(0);
    var0.setHora(10);
    int var19 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test335");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    var0.setMin(100);
    int var9 = var0.getMin();
    var0.setHora(1);
    var0.setMin(100);
    var0.setMin(10);
    var0.setMin(1);
    int var18 = var0.getHora();
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "01:01"+ "'", var19.equals("01:01"));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test336");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 100);
    var2.setHora(100);
    int var5 = var2.getMin();
    int var6 = var2.getMin();
    int var7 = var2.getMin();
    int var8 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test337");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    int var11 = var0.getHora();
    java.lang.String var12 = var0.toString();
    var0.setMin(1);
    var0.setMin(1);
    int var17 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test338");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(1);
    var2.setMin(0);
    int var11 = var2.getMin();
    var2.setHora(100);
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:10"+ "'", var5.equals("100:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test339");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setHora(0);
    java.lang.String var10 = var2.toString();
    java.lang.String var11 = var2.toString();
    var2.setHora(1);
    var2.setHora(10);
    int var16 = var2.getMin();
    var2.setHora((-1));
    int var19 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:-01"+ "'", var10.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:-01"+ "'", var11.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test340");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    var2.setMin(1);
    java.lang.String var8 = var2.toString();
    int var9 = var2.getHora();
    java.lang.String var10 = var2.toString();
    int var11 = var2.getHora();
    int var12 = var2.getHora();
    java.lang.String var13 = var2.toString();
    var2.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:01"+ "'", var8.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:01"+ "'", var10.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:01"+ "'", var13.equals("00:01"));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test341");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora((-1));
    int var11 = var2.getMin();
    var2.setHora(10);
    var2.setMin((-1));
    int var16 = var2.getHora();
    var2.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test342");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    var0.setMin(1);
    java.lang.String var5 = var0.toString();
    var0.setHora(100);
    var0.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:01"+ "'", var5.equals("00:01"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test343");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setMin(0);
    java.lang.String var9 = var2.toString();
    var2.setMin(1);
    java.lang.String var12 = var2.toString();
    int var13 = var2.getHora();
    var2.setHora(10);
    java.lang.String var16 = var2.toString();
    var2.setHora((-1));
    var2.setHora(10);
    var2.setHora(10);
    int var23 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:00"+ "'", var9.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:01"+ "'", var12.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10:01"+ "'", var16.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test344");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    int var9 = var2.getHora();
    int var10 = var2.getHora();
    var2.setHora(100);
    var2.setMin((-1));
    int var15 = var2.getHora();
    java.lang.String var16 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "100:-01"+ "'", var16.equals("100:-01"));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test345");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    var2.setHora(100);
    var2.setHora((-1));
    var2.setHora((-1));
    var2.setMin(100);
    java.lang.String var12 = var2.toString();
    int var13 = var2.getMin();
    int var14 = var2.getMin();
    int var15 = var2.getHora();
    var2.setMin(10);
    var2.setHora(10);
    java.lang.String var20 = var2.toString();
    int var21 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:100"+ "'", var12.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10:10"+ "'", var20.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test346");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test347");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    var0.setHora(100);
    var0.setMin(1);
    int var10 = var0.getMin();
    var0.setHora((-1));
    java.lang.String var13 = var0.toString();
    var0.setMin(100);
    java.lang.String var16 = var0.toString();
    var0.setHora(10);
    var0.setHora(10);
    java.lang.String var21 = var0.toString();
    int var22 = var0.getHora();
    int var23 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:01"+ "'", var13.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "-01:100"+ "'", var16.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "10:100"+ "'", var21.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test348");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getMin();
    var0.setMin(0);
    var0.setMin((-1));
    int var11 = var0.getHora();
    int var12 = var0.getMin();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    var0.setMin(10);
    int var17 = var0.getMin();
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:00"+ "'", var5.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:-01"+ "'", var13.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test349");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 0);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    var2.setMin(0);
    var2.setHora(0);
    java.lang.String var10 = var2.toString();
    int var11 = var2.getHora();
    var2.setHora(1);
    var2.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:00"+ "'", var5.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test350");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setMin(100);
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    int var6 = var0.getHora();
    int var7 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test351");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    var0.setHora((-1));
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    var0.setMin(100);
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:-01"+ "'", var10.equals("-01:-01"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test352");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(10);
    int var5 = var2.getMin();
    int var6 = var2.getMin();
    java.lang.String var7 = var2.toString();
    var2.setHora(1);
    var2.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10:00"+ "'", var7.equals("10:00"));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test353");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    int var3 = var0.getMin();
    int var4 = var0.getHora();
    var0.setHora(10);
    var0.setMin((-1));
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10:-01"+ "'", var9.equals("10:-01"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test354");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setMin((-1));
    var2.setHora((-1));
    var2.setHora(100);
    java.lang.String var12 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100:-01"+ "'", var12.equals("100:-01"));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test355");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:00"+ "'", var5.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01:00"+ "'", var6.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:00"+ "'", var7.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:00"+ "'", var8.equals("-01:00"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test356");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    var0.setHora(100);
    var0.setMin(1);
    var0.setHora(1);
    var0.setMin((-1));
    int var14 = var0.getHora();
    var0.setMin(0);
    var0.setHora((-1));
    java.lang.String var19 = var0.toString();
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "-01:00"+ "'", var19.equals("-01:00"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test357");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    var0.setHora((-1));
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    int var8 = var0.getHora();
    java.lang.String var9 = var0.toString();
    var0.setMin(100);
    int var12 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01:00"+ "'", var6.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:00"+ "'", var9.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test358");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getMin();
    int var6 = var2.getMin();
    var2.setHora((-1));
    java.lang.String var9 = var2.toString();
    var2.setMin(1);
    java.lang.String var12 = var2.toString();
    var2.setHora(0);
    int var15 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:00"+ "'", var9.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:01"+ "'", var12.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test359");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(1);
    int var8 = var0.getMin();
    var0.setMin(10);
    java.lang.String var11 = var0.toString();
    var0.setMin(10);
    var0.setHora(10);
    java.lang.String var16 = var0.toString();
    int var17 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:10"+ "'", var11.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10:10"+ "'", var16.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test360");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    var2.setMin(10);
    var2.setMin(10);
    var2.setHora(0);
    int var12 = var2.getMin();
    java.lang.String var13 = var2.toString();
    var2.setMin(100);
    int var16 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:10"+ "'", var5.equals("100:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:10"+ "'", var13.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test361");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    var0.setMin(10);
    int var9 = var0.getMin();
    var0.setHora((-1));
    int var12 = var0.getMin();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    int var15 = var0.getHora();
    java.lang.String var16 = var0.toString();
    int var17 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:10"+ "'", var13.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "-01:10"+ "'", var16.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test362");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    var2.setMin(0);
    var2.setMin(10);
    var2.setHora(10);
    int var12 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "01:10"+ "'", var3.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01:10"+ "'", var4.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test363");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, (-1));
    int var3 = var2.getHora();
    var2.setHora((-1));
    int var6 = var2.getMin();
    int var7 = var2.getMin();
    int var8 = var2.getHora();
    int var9 = var2.getMin();
    java.lang.String var10 = var2.toString();
    int var11 = var2.getMin();
    var2.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:-01"+ "'", var10.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test364");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    int var3 = var2.getMin();
    var2.setHora((-1));
    java.lang.String var6 = var2.toString();
    int var7 = var2.getMin();
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    int var10 = var2.getHora();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01:01"+ "'", var6.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:01"+ "'", var8.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:01"+ "'", var9.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test365");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(1);
    var0.setMin(100);
    int var10 = var0.getMin();
    int var11 = var0.getHora();
    int var12 = var0.getHora();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01:100"+ "'", var13.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "01:100"+ "'", var14.equals("01:100"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test366");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    var0.setHora(1);
    java.lang.String var9 = var0.toString();
    int var10 = var0.getHora();
    var0.setHora(0);
    var0.setMin(10);
    java.lang.String var15 = var0.toString();
    var0.setHora(0);
    var0.setMin((-1));
    int var20 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:00"+ "'", var9.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00:10"+ "'", var15.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test367");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setMin(10);
    java.lang.String var8 = var2.toString();
    var2.setMin((-1));
    var2.setMin(1);
    var2.setHora(0);
    int var15 = var2.getMin();
    int var16 = var2.getMin();
    var2.setMin((-1));
    var2.setMin((-1));
    var2.setHora(1);
    int var23 = var2.getHora();
    var2.setHora((-1));
    var2.setHora(1);
    var2.setMin(10);
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:10"+ "'", var8.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test368");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 100);
    var2.setHora(1);
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setMin((-1));
    java.lang.String var9 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01:100"+ "'", var5.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:-01"+ "'", var9.equals("01:-01"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test369");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(100);
    var0.setHora(0);
    var0.setHora(1);
    var0.setHora(1);
    int var16 = var0.getHora();
    int var17 = var0.getMin();
    int var18 = var0.getMin();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    int var21 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "01:100"+ "'", var19.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "01:100"+ "'", var20.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test370");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(1);
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    var0.setMin(10);
    var0.setMin(100);
    var0.setHora(10);
    java.lang.String var18 = var0.toString();
    var0.setMin(100);
    int var21 = var0.getMin();
    java.lang.String var22 = var0.toString();
    int var23 = var0.getHora();
    int var24 = var0.getMin();
    int var25 = var0.getHora();
    int var26 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:01"+ "'", var11.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10:100"+ "'", var18.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "10:100"+ "'", var22.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 10);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test371");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    int var3 = var0.getHora();
    var0.setMin(100);
    var0.setHora((-1));
    var0.setHora(10);
    int var10 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test372");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(1);
    java.lang.String var10 = var0.toString();
    var0.setHora(100);
    var0.setHora(0);
    var0.setHora(0);
    var0.setMin(1);
    java.lang.String var19 = var0.toString();
    var0.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:01"+ "'", var10.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "00:01"+ "'", var19.equals("00:01"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test373");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    var2.setHora(100);
    var2.setHora(1);
    var2.setHora((-1));
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    int var11 = var2.getMin();
    var2.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:-01"+ "'", var10.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test374");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    var0.setHora(10);
    java.lang.String var8 = var0.toString();
    var0.setMin(1);
    var0.setHora(0);
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:10"+ "'", var8.equals("10:10"));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test375");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    var0.setMin(1);
    java.lang.String var5 = var0.toString();
    var0.setHora(100);
    var0.setHora(0);
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:01"+ "'", var5.equals("00:01"));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test376");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    java.lang.String var7 = var2.toString();
    var2.setMin(100);
    java.lang.String var10 = var2.toString();
    int var11 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:-01"+ "'", var7.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:100"+ "'", var10.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test377");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora(0);
    var0.setHora(10);
    int var11 = var0.getMin();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getHora();
    int var14 = var0.getMin();
    var0.setMin(100);
    var0.setHora(10);
    var0.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:10"+ "'", var12.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test378");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    var0.setHora((-1));
    java.lang.String var5 = var0.toString();
    var0.setMin(100);
    int var8 = var0.getHora();
    var0.setHora(0);
    var0.setMin(10);
    int var13 = var0.getHora();
    int var14 = var0.getMin();
    int var15 = var0.getHora();
    int var16 = var0.getMin();
    var0.setMin((-1));
    var0.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:00"+ "'", var5.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test379");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 10);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getMin();
    int var8 = var2.getHora();
    int var9 = var2.getHora();
    var2.setMin(0);
    int var12 = var2.getHora();
    var2.setHora(0);
    int var15 = var2.getMin();
    int var16 = var2.getMin();
    int var17 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:10"+ "'", var5.equals("100:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test380");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(100);
    var0.setHora((-1));
    var0.setMin(100);
    int var14 = var0.getHora();
    java.lang.String var15 = var0.toString();
    var0.setMin((-1));
    var0.setMin(100);
    int var20 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01:100"+ "'", var15.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test381");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 10);
    int var3 = var2.getMin();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-01:10"+ "'", var4.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test382");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    var0.setMin(1);
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    var0.setHora(0);
    java.lang.String var17 = var0.toString();
    int var18 = var0.getMin();
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:01"+ "'", var11.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:01"+ "'", var12.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:01"+ "'", var13.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00:01"+ "'", var17.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test383");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    int var9 = var0.getHora();
    var0.setHora(10);
    java.lang.String var12 = var0.toString();
    int var13 = var0.getHora();
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:100"+ "'", var12.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test384");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    int var6 = var0.getMin();
    int var7 = var0.getMin();
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    int var10 = var0.getMin();
    var0.setMin(10);
    int var13 = var0.getHora();
    int var14 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test385");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setHora(1);
    int var6 = var0.getMin();
    int var7 = var0.getHora();
    var0.setHora((-1));
    int var10 = var0.getHora();
    int var11 = var0.getMin();
    int var12 = var0.getHora();
    int var13 = var0.getHora();
    int var14 = var0.getMin();
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01:00"+ "'", var15.equals("-01:00"));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test386");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    var0.setHora(1);
    int var8 = var0.getMin();
    var0.setMin(1);
    var0.setMin(10);
    java.lang.String var13 = var0.toString();
    int var14 = var0.getHora();
    int var15 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01:10"+ "'", var13.equals("01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test387");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), (-1));
    var2.setHora(10);
    var2.setMin(0);
    int var7 = var2.getHora();
    java.lang.String var8 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:00"+ "'", var8.equals("10:00"));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test388");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getHora();
    var0.setMin(1);
    int var12 = var0.getHora();
    var0.setHora(0);
    var0.setHora(1);
    int var17 = var0.getHora();
    int var18 = var0.getMin();
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:10"+ "'", var6.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:10"+ "'", var7.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:10"+ "'", var8.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test389");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    var0.setHora(0);
    java.lang.String var8 = var0.toString();
    int var9 = var0.getHora();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getMin();
    java.lang.String var12 = var0.toString();
    var0.setMin(10);
    int var15 = var0.getMin();
    var0.setHora((-1));
    int var18 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:00"+ "'", var8.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test390");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setMin(10);
    java.lang.String var8 = var2.toString();
    var2.setMin((-1));
    var2.setMin(1);
    var2.setHora(0);
    int var15 = var2.getMin();
    int var16 = var2.getHora();
    int var17 = var2.getMin();
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:10"+ "'", var8.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test391");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    var0.setHora(1);
    int var8 = var0.getMin();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getMin();
    int var11 = var0.getMin();
    var0.setHora(0);
    int var14 = var0.getHora();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:00"+ "'", var9.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test392");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 100);
    var2.setHora(0);
    var2.setMin(0);
    var2.setHora(1);
    int var9 = var2.getHora();
    var2.setMin(0);
    int var12 = var2.getHora();
    var2.setMin(1);
    int var15 = var2.getHora();
    var2.setHora((-1));
    var2.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test393");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    java.lang.String var6 = var2.toString();
    int var7 = var2.getMin();
    var2.setHora(0);
    java.lang.String var10 = var2.toString();
    var2.setHora(100);
    int var13 = var2.getHora();
    var2.setMin((-1));
    int var16 = var2.getHora();
    var2.setMin(1);
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:-01"+ "'", var6.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:-01"+ "'", var10.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test394");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    var0.setHora(0);
    var0.setMin((-1));
    int var11 = var0.getMin();
    java.lang.String var12 = var0.toString();
    var0.setMin((-1));
    int var15 = var0.getHora();
    java.lang.String var16 = var0.toString();
    int var17 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:-01"+ "'", var12.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:-01"+ "'", var16.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test395");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, (-1));
    int var3 = var2.getHora();
    var2.setHora((-1));
    int var6 = var2.getMin();
    var2.setMin(10);
    var2.setMin(100);
    int var11 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test396");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    int var11 = var0.getMin();
    int var12 = var0.getHora();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    int var15 = var0.getHora();
    int var16 = var0.getHora();
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:00"+ "'", var13.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test397");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora(0);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test398");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(1);
    int var3 = var0.getMin();
    int var4 = var0.getHora();
    var0.setHora(10);
    java.lang.String var7 = var0.toString();
    int var8 = var0.getHora();
    var0.setHora(100);
    int var11 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10:01"+ "'", var7.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test399");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora((-1));
    int var11 = var2.getMin();
    var2.setMin(10);
    var2.setMin(0);
    int var16 = var2.getHora();
    var2.setHora(0);
    var2.setMin((-1));
    int var21 = var2.getMin();
    int var22 = var2.getMin();
    int var23 = var2.getMin();
    int var24 = var2.getHora();
    var2.setMin(1);
    int var27 = var2.getMin();
    var2.setMin(1);
    java.lang.String var30 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "00:01"+ "'", var30.equals("00:01"));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test400");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    int var4 = var0.getMin();
    int var5 = var0.getHora();
    var0.setMin(100);
    java.lang.String var8 = var0.toString();
    int var9 = var0.getHora();
    int var10 = var0.getMin();
    int var11 = var0.getHora();
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:100"+ "'", var8.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test401");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    int var3 = var0.getMin();
    var0.setHora((-1));
    var0.setHora(10);
    java.lang.String var8 = var0.toString();
    var0.setHora(1);
    java.lang.String var11 = var0.toString();
    var0.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:00"+ "'", var8.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01:00"+ "'", var11.equals("01:00"));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test402");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    var0.setHora(10);
    int var8 = var0.getHora();
    var0.setHora(0);
    int var11 = var0.getHora();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    var0.setMin(100);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:00"+ "'", var13.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:00"+ "'", var14.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00:100"+ "'", var17.equals("00:100"));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test403");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(0);
    var0.setHora(100);
    var0.setMin(100);
    int var12 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test404");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(100);
    var0.setHora((-1));
    var0.setMin(100);
    int var14 = var0.getHora();
    var0.setHora(0);
    var0.setMin(1);
    int var19 = var0.getMin();
    int var20 = var0.getMin();
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test405");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora((-1));
    java.lang.String var11 = var2.toString();
    int var12 = var2.getMin();
    int var13 = var2.getHora();
    var2.setHora((-1));
    java.lang.String var16 = var2.toString();
    var2.setMin(10);
    int var19 = var2.getMin();
    int var20 = var2.getMin();
    var2.setHora(10);
    java.lang.String var23 = var2.toString();
    int var24 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:-01"+ "'", var11.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "-01:-01"+ "'", var16.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "10:10"+ "'", var23.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test406");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    java.lang.String var8 = var2.toString();
    int var9 = var2.getMin();
    var2.setMin(10);
    java.lang.String var12 = var2.toString();
    int var13 = var2.getMin();
    int var14 = var2.getHora();
    var2.setHora(1);
    var2.setMin(1);
    var2.setMin(0);
    java.lang.String var21 = var2.toString();
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:-01"+ "'", var8.equals("10:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:10"+ "'", var12.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "01:00"+ "'", var21.equals("01:00"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test407");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    int var9 = var0.getHora();
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    int var13 = var0.getMin();
    int var14 = var0.getHora();
    int var15 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:100"+ "'", var11.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test408");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    var2.setMin(1);
    var2.setMin((-1));
    int var7 = var2.getMin();
    int var8 = var2.getMin();
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    var2.setMin(100);
    var2.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:-01"+ "'", var10.equals("-01:-01"));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test409");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    java.lang.String var6 = var0.toString();
    var0.setMin(10);
    var0.setMin(0);
    var0.setMin(0);
    int var13 = var0.getMin();
    var0.setHora(100);
    var0.setHora(1);
    int var18 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:10"+ "'", var6.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test410");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    java.lang.String var3 = var0.toString();
    var0.setMin(0);
    int var6 = var0.getHora();
    var0.setMin((-1));
    var0.setMin((-1));
    var0.setHora(10);
    var0.setMin(1);
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:00"+ "'", var3.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test411");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(1);
    int var8 = var0.getHora();
    int var9 = var0.getHora();
    var0.setHora(10);
    int var12 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test412");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    int var5 = var2.getHora();
    java.lang.String var6 = var2.toString();
    int var7 = var2.getHora();
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    int var10 = var2.getHora();
    int var11 = var2.getMin();
    var2.setMin(10);
    java.lang.String var14 = var2.toString();
    var2.setMin((-1));
    var2.setHora(10);
    var2.setHora(100);
    int var21 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:-01"+ "'", var6.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:-01"+ "'", var8.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:-01"+ "'", var9.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:10"+ "'", var14.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test413");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    var2.setMin(0);
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    var2.setHora(0);
    int var9 = var2.getMin();
    int var10 = var2.getMin();
    var2.setHora(10);
    int var13 = var2.getHora();
    java.lang.String var14 = var2.toString();
    int var15 = var2.getHora();
    var2.setHora(100);
    var2.setHora(100);
    var2.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:00"+ "'", var14.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test414");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(100);
    var0.setHora((-1));
    var0.setMin(100);
    int var14 = var0.getHora();
    int var15 = var0.getHora();
    int var16 = var0.getHora();
    var0.setMin(100);
    var0.setMin(1);
    var0.setMin(100);
    var0.setMin(0);
    int var25 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test415");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    int var8 = var2.getHora();
    int var9 = var2.getMin();
    var2.setMin(1);
    int var12 = var2.getHora();
    int var13 = var2.getMin();
    java.lang.String var14 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:01"+ "'", var14.equals("10:01"));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test416");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    int var11 = var0.getHora();
    java.lang.String var12 = var0.toString();
    var0.setMin(1);
    int var15 = var0.getHora();
    var0.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test417");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    java.lang.String var8 = var2.toString();
    int var9 = var2.getMin();
    var2.setHora((-1));
    var2.setMin(100);
    int var14 = var2.getHora();
    var2.setHora((-1));
    java.lang.String var17 = var2.toString();
    var2.setMin(100);
    var2.setHora(0);
    var2.setHora(10);
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:-01"+ "'", var5.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:-01"+ "'", var8.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "-01:100"+ "'", var17.equals("-01:100"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test418");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    var0.setHora(10);
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setMin(10);
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    int var15 = var0.getMin();
    var0.setMin(1);
    var0.setHora(100);
    var0.setHora(100);
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10:10"+ "'", var13.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "100:01"+ "'", var22.equals("100:01"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test419");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setHora(1);
    int var6 = var0.getMin();
    var0.setHora(10);
    var0.setHora(10);
    int var11 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test420");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    java.lang.String var3 = var2.toString();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    int var6 = var2.getMin();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.toString();
    int var9 = var2.getMin();
    int var10 = var2.getMin();
    int var11 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:01"+ "'", var3.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-01:01"+ "'", var4.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:01"+ "'", var7.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01:01"+ "'", var8.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test421");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    var0.setHora((-1));
    var0.setMin(0);
    var0.setMin(1);
    int var13 = var0.getMin();
    int var14 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test422");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin(1);
    int var5 = var0.getHora();
    java.lang.String var6 = var0.toString();
    var0.setHora(10);
    int var9 = var0.getHora();
    int var10 = var0.getHora();
    var0.setHora(100);
    int var13 = var0.getMin();
    var0.setMin((-1));
    var0.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:01"+ "'", var6.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test423");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    int var11 = var0.getMin();
    int var12 = var0.getHora();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    var0.setMin(1);
    var0.setMin(10);
    var0.setHora(100);
    var0.setHora((-1));
    var0.setMin((-1));
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:00"+ "'", var13.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test424");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    var2.setHora(100);
    var2.setHora((-1));
    var2.setHora((-1));
    var2.setMin(100);
    int var12 = var2.getHora();
    var2.setHora(1);
    int var15 = var2.getHora();
    var2.setHora((-1));
    var2.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test425");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    java.lang.String var7 = var0.toString();
    var0.setHora((-1));
    int var10 = var0.getMin();
    var0.setMin(100);
    var0.setHora(100);
    int var15 = var0.getMin();
    var0.setHora(0);
    int var18 = var0.getHora();
    var0.setHora(10);
    java.lang.String var21 = var0.toString();
    int var22 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:-01"+ "'", var7.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "10:100"+ "'", var21.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test426");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    java.lang.String var5 = var2.toString();
    var2.setHora(1);
    int var8 = var2.getMin();
    int var9 = var2.getHora();
    java.lang.String var10 = var2.toString();
    int var11 = var2.getHora();
    java.lang.String var12 = var2.toString();
    java.lang.String var13 = var2.toString();
    var2.setMin(100);
    java.lang.String var16 = var2.toString();
    int var17 = var2.getMin();
    int var18 = var2.getMin();
    java.lang.String var19 = var2.toString();
    var2.setMin(0);
    int var22 = var2.getHora();
    int var23 = var2.getMin();
    var2.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "01:00"+ "'", var10.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "01:00"+ "'", var12.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01:00"+ "'", var13.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "01:100"+ "'", var16.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "01:100"+ "'", var19.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test427");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    var0.setMin(10);
    int var11 = var0.getHora();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    int var15 = var0.getMin();
    int var16 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:10"+ "'", var12.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:10"+ "'", var13.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:10"+ "'", var14.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test428");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    var0.setMin(1);
    var0.setHora(0);
    var0.setHora((-1));
    int var14 = var0.getHora();
    int var15 = var0.getMin();
    var0.setHora(10);
    java.lang.String var18 = var0.toString();
    int var19 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10:01"+ "'", var18.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test429");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(0);
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    int var8 = var2.getMin();
    int var9 = var2.getHora();
    int var10 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test430");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    var0.setHora(10);
    int var8 = var0.getMin();
    int var9 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test431");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMin();
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getMin();
    var0.setMin(100);
    java.lang.String var16 = var0.toString();
    var0.setHora(100);
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:00"+ "'", var11.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:00"+ "'", var12.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:100"+ "'", var16.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "100:100"+ "'", var19.equals("100:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "100:100"+ "'", var20.equals("100:100"));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test432");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setMin(1);
    java.lang.String var6 = var0.toString();
    var0.setMin(10);
    var0.setHora(10);
    var0.setHora((-1));
    int var13 = var0.getMin();
    var0.setMin(100);
    var0.setHora((-1));
    int var18 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:01"+ "'", var6.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test433");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    var0.setHora(0);
    int var8 = var0.getHora();
    var0.setHora(100);
    int var11 = var0.getHora();
    var0.setHora((-1));
    int var14 = var0.getHora();
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test434");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    var0.setMin(1);
    int var11 = var0.getMin();
    var0.setMin((-1));
    int var14 = var0.getHora();
    int var15 = var0.getHora();
    var0.setHora((-1));
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test435");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    java.lang.String var7 = var0.toString();
    var0.setHora((-1));
    int var10 = var0.getMin();
    var0.setMin(100);
    int var13 = var0.getHora();
    var0.setMin(0);
    var0.setMin(10);
    java.lang.String var18 = var0.toString();
    int var19 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:-01"+ "'", var7.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "-01:10"+ "'", var18.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test436");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(0);
    var0.setHora(10);
    var0.setMin(0);
    var0.setMin(1);
    var0.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test437");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(0);
    int var8 = var0.getMin();
    int var9 = var0.getHora();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    var0.setHora(0);
    java.lang.String var14 = var0.toString();
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:00"+ "'", var10.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:00"+ "'", var11.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:00"+ "'", var14.equals("00:00"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test438");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    int var7 = var2.getHora();
    int var8 = var2.getHora();
    var2.setHora((-1));
    var2.setMin((-1));
    var2.setHora((-1));
    java.lang.String var15 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01:-01"+ "'", var15.equals("-01:-01"));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test439");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setHora(100);
    int var10 = var2.getMin();
    var2.setMin((-1));
    java.lang.String var13 = var2.toString();
    var2.setMin((-1));
    var2.setHora(1);
    int var18 = var2.getHora();
    int var19 = var2.getHora();
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100:-01"+ "'", var13.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test440");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    int var9 = var0.getHora();
    java.lang.String var10 = var0.toString();
    var0.setMin(100);
    var0.setHora(1);
    java.lang.String var15 = var0.toString();
    int var16 = var0.getMin();
    var0.setHora(10);
    var0.setMin(100);
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:100"+ "'", var10.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "01:100"+ "'", var15.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "10:100"+ "'", var21.equals("10:100"));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test441");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    var0.setHora(0);
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    var0.setHora(100);
    java.lang.String var8 = var0.toString();
    var0.setHora(100);
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100:00"+ "'", var8.equals("100:00"));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test442");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    var2.setMin(1);
    int var5 = var2.getHora();
    var2.setHora(10);
    int var8 = var2.getHora();
    int var9 = var2.getMin();
    int var10 = var2.getMin();
    int var11 = var2.getMin();
    int var12 = var2.getMin();
    int var13 = var2.getMin();
    java.lang.String var14 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:01"+ "'", var14.equals("10:01"));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test443");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    var0.setHora(10);
    int var8 = var0.getHora();
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setMin(10);
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMin();
    int var15 = var0.getMin();
    var0.setMin(1);
    java.lang.String var18 = var0.toString();
    var0.setHora((-1));
    java.lang.String var21 = var0.toString();
    int var22 = var0.getHora();
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10:10"+ "'", var13.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10:01"+ "'", var18.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "-01:01"+ "'", var21.equals("-01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "-01:01"+ "'", var23.equals("-01:01"));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test444");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setMin(0);
    int var5 = var2.getMin();
    int var6 = var2.getMin();
    var2.setMin(1);
    int var9 = var2.getHora();
    java.lang.String var10 = var2.toString();
    int var11 = var2.getHora();
    int var12 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "01:01"+ "'", var10.equals("01:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test445");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    var0.setMin(10);
    int var11 = var0.getHora();
    var0.setMin(0);
    var0.setHora(1);
    var0.setMin(0);
    java.lang.String var18 = var0.toString();
    int var19 = var0.getMin();
    int var20 = var0.getHora();
    var0.setHora(0);
    java.lang.String var23 = var0.toString();
    int var24 = var0.getHora();
    int var25 = var0.getMin();
    java.lang.String var26 = var0.toString();
    java.lang.String var27 = var0.toString();
    int var28 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "01:00"+ "'", var18.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "00:00"+ "'", var23.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "00:00"+ "'", var26.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "00:00"+ "'", var27.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test446");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getMin();
    var0.setHora(100);
    int var9 = var0.getHora();
    var0.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test447");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    var0.setMin(100);
    java.lang.String var12 = var0.toString();
    var0.setHora(100);
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:100"+ "'", var12.equals("-01:100"));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test448");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    var2.setMin(0);
    int var5 = var2.getMin();
    int var6 = var2.getMin();
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.toString();
    int var9 = var2.getMin();
    var2.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:00"+ "'", var7.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00:00"+ "'", var8.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test449");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    var0.setMin((-1));
    int var5 = var0.getMin();
    var0.setMin((-1));
    int var8 = var0.getHora();
    int var9 = var0.getHora();
    var0.setMin((-1));
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test450");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    var0.setHora((-1));
    int var9 = var0.getMin();
    java.lang.String var10 = var0.toString();
    var0.setHora(10);
    java.lang.String var13 = var0.toString();
    int var14 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01:-01"+ "'", var10.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10:-01"+ "'", var13.equals("10:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test451");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    java.lang.String var2 = var0.toString();
    var0.setHora(1);
    int var5 = var0.getMin();
    var0.setHora(10);
    var0.setMin(0);
    int var10 = var0.getMin();
    int var11 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00:00"+ "'", var2.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test452");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    var0.setMin(100);
    int var7 = var0.getHora();
    int var8 = var0.getHora();
    int var9 = var0.getHora();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getHora();
    int var12 = var0.getMin();
    java.lang.String var13 = var0.toString();
    var0.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:100"+ "'", var10.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00:100"+ "'", var13.equals("00:100"));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test453");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    int var3 = var2.getHora();
    var2.setMin(1);
    int var6 = var2.getMin();
    var2.setMin(10);
    int var9 = var2.getMin();
    java.lang.String var10 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10:10"+ "'", var10.equals("10:10"));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test454");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    var0.setHora(100);
    java.lang.String var9 = var0.toString();
    var0.setHora(0);
    int var12 = var0.getHora();
    int var13 = var0.getMin();
    var0.setMin(100);
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    int var18 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "100:-01"+ "'", var9.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:100"+ "'", var16.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00:100"+ "'", var17.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test455");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    var0.setHora(1);
    int var8 = var0.getMin();
    var0.setMin(10);
    int var11 = var0.getMin();
    int var12 = var0.getMin();
    var0.setMin(0);
    var0.setMin(0);
    int var17 = var0.getMin();
    int var18 = var0.getHora();
    int var19 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test456");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    int var5 = var0.getHora();
    int var6 = var0.getMin();
    int var7 = var0.getHora();
    int var8 = var0.getMin();
    var0.setHora(100);
    var0.setHora((-1));
    int var13 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test457");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    var0.setHora((-1));
    int var5 = var0.getMin();
    java.lang.String var6 = var0.toString();
    var0.setHora(10);
    var0.setMin((-1));
    var0.setHora(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01:00"+ "'", var6.equals("-01:00"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test458");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setHora(10);
    var0.setHora(0);
    var0.setMin(100);
    var0.setHora((-1));
    var0.setMin(100);
    int var14 = var0.getHora();
    var0.setHora(0);
    int var17 = var0.getMin();
    var0.setMin(1);
    int var20 = var0.getMin();
    int var21 = var0.getHora();
    var0.setHora(1);
    var0.setMin(100);
    int var26 = var0.getMin();
    java.lang.String var27 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "01:100"+ "'", var27.equals("01:100"));

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test459");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    java.lang.String var7 = var0.toString();
    var0.setHora((-1));
    int var10 = var0.getMin();
    var0.setMin(100);
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    var0.setMin(100);
    java.lang.String var17 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01:-01"+ "'", var7.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:100"+ "'", var13.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "-01:100"+ "'", var14.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "-01:100"+ "'", var17.equals("-01:100"));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test460");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    var0.setHora(100);
    var0.setMin(1);
    int var10 = var0.getMin();
    var0.setHora(100);
    var0.setHora(0);
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test461");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    int var7 = var2.getHora();
    var2.setHora(0);
    int var10 = var2.getMin();
    java.lang.String var11 = var2.toString();
    var2.setMin(100);
    var2.setHora((-1));
    var2.setMin(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:-01"+ "'", var11.equals("00:-01"));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test462");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora(0);
    var0.setHora(10);
    int var11 = var0.getMin();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getHora();
    java.lang.String var14 = var0.toString();
    var0.setHora((-1));
    int var17 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:10"+ "'", var12.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:10"+ "'", var14.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test463");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    java.lang.String var4 = var0.toString();
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    java.lang.String var7 = var0.toString();
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:00"+ "'", var4.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:00"+ "'", var7.equals("00:00"));

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test464");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    var0.setHora(10);
    var0.setHora(100);
    var0.setHora((-1));
    java.lang.String var12 = var0.toString();
    int var13 = var0.getMin();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    int var16 = var0.getMin();
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:10"+ "'", var12.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "-01:10"+ "'", var14.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01:10"+ "'", var15.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test465");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    var2.setHora((-1));
    var2.setMin(10);
    int var9 = var2.getMin();
    var2.setHora(10);
    java.lang.String var12 = var2.toString();
    int var13 = var2.getMin();
    java.lang.String var14 = var2.toString();
    var2.setMin(10);
    var2.setMin(100);
    int var19 = var2.getHora();
    int var20 = var2.getMin();
    java.lang.String var21 = var2.toString();
    int var22 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10:00"+ "'", var4.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:10"+ "'", var12.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10:10"+ "'", var14.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "10:100"+ "'", var21.equals("10:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test466");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    int var7 = var2.getHora();
    int var8 = var2.getMin();
    var2.setMin(1);
    java.lang.String var11 = var2.toString();
    var2.setMin(10);
    int var14 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:00"+ "'", var6.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:01"+ "'", var11.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test467");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    int var4 = var0.getMin();
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    var0.setMin(10);
    var0.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test468");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    var0.setMin(100);
    var0.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:00"+ "'", var11.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test469");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setHora((-1));
    var0.setHora((-1));
    java.lang.String var9 = var0.toString();
    var0.setMin(0);
    var0.setMin(0);
    int var14 = var0.getMin();
    var0.setHora((-1));
    int var17 = var0.getMin();
    int var18 = var0.getHora();
    var0.setMin((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test470");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    var2.setHora(100);
    var2.setHora((-1));
    var2.setMin(100);
    var2.setHora(100);
    int var12 = var2.getHora();
    java.lang.String var13 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100:100"+ "'", var13.equals("100:100"));

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test471");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    var0.setMin(10);
    var0.setHora(10);
    var0.setHora(100);
    var0.setHora(10);
    java.lang.String var12 = var0.toString();
    var0.setMin(1);
    java.lang.String var15 = var0.toString();
    int var16 = var0.getHora();
    int var17 = var0.getHora();
    int var18 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:10"+ "'", var12.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10:01"+ "'", var15.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test472");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 0);
    var2.setHora(100);
    java.lang.String var5 = var2.toString();
    var2.setMin(0);
    java.lang.String var8 = var2.toString();
    java.lang.String var9 = var2.toString();
    var2.setMin(1);
    int var12 = var2.getMin();
    int var13 = var2.getHora();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100:00"+ "'", var5.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100:00"+ "'", var8.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "100:00"+ "'", var9.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test473");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora(1);
    int var3 = var0.getHora();
    int var4 = var0.getHora();
    var0.setMin((-1));
    var0.setHora((-1));
    var0.setMin(0);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01:00"+ "'", var11.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:00"+ "'", var12.equals("-01:00"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test474");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    int var10 = var0.getHora();
    var0.setHora(0);
    var0.setMin(1);
    int var15 = var0.getMin();
    java.lang.String var16 = var0.toString();
    var0.setHora(1);
    int var19 = var0.getMin();
    var0.setHora(10);
    var0.setHora(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00:01"+ "'", var16.equals("00:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test475");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 1);
    var2.setMin(1);
    java.lang.String var5 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01:01"+ "'", var5.equals("-01:01"));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test476");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 0);
    var2.setMin(1);
    var2.setHora(10);
    java.lang.String var7 = var2.toString();
    java.lang.String var8 = var2.toString();
    var2.setHora(100);
    int var11 = var2.getMin();
    int var12 = var2.getMin();
    java.lang.String var13 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10:01"+ "'", var7.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:01"+ "'", var8.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100:01"+ "'", var13.equals("100:01"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test477");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    int var6 = var2.getMin();
    var2.setHora(0);
    var2.setHora(1);
    var2.setMin(0);
    int var13 = var2.getMin();
    var2.setHora(100);
    java.lang.String var16 = var2.toString();
    int var17 = var2.getHora();
    java.lang.String var18 = var2.toString();
    int var19 = var2.getHora();
    int var20 = var2.getMin();
    java.lang.String var21 = var2.toString();
    var2.setHora(0);
    var2.setMin(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "100:00"+ "'", var16.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100:00"+ "'", var18.equals("100:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "100:00"+ "'", var21.equals("100:00"));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test478");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    var0.setMin(100);
    var0.setMin(0);
    var0.setHora(1);
    java.lang.String var16 = var0.toString();
    var0.setMin(0);
    int var19 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "01:00"+ "'", var16.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test479");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setMin(0);
    java.lang.String var5 = var2.toString();
    var2.setMin((-1));
    var2.setHora(1);
    var2.setHora((-1));
    int var12 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01:00"+ "'", var5.equals("01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test480");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    int var3 = var0.getHora();
    var0.setHora(1);
    int var6 = var0.getMin();
    int var7 = var0.getMin();
    int var8 = var0.getMin();
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:00"+ "'", var9.equals("01:00"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test481");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora((-1));
    int var9 = var0.getMin();
    var0.setMin(100);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:100"+ "'", var12.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:100"+ "'", var13.equals("-01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "-01:100"+ "'", var14.equals("-01:100"));

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test482");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro((-1), 100);
    var2.setHora(1);
    java.lang.String var5 = var2.toString();
    java.lang.String var6 = var2.toString();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getMin();
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    var2.setMin(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01:100"+ "'", var5.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "01:100"+ "'", var6.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "01:100"+ "'", var7.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01:100"+ "'", var9.equals("01:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "01:100"+ "'", var10.equals("01:100"));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test483");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    int var5 = var2.getHora();
    int var6 = var2.getMin();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getHora();
    java.lang.String var9 = var2.toString();
    java.lang.String var10 = var2.toString();
    int var11 = var2.getHora();
    var2.setHora(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:-01"+ "'", var7.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:-01"+ "'", var9.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:-01"+ "'", var10.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test484");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    java.lang.String var1 = var0.toString();
    int var2 = var0.getHora();
    int var3 = var0.getHora();
    var0.setMin(10);
    var0.setHora(100);
    var0.setMin(1);
    var0.setHora(1);
    var0.setMin((-1));
    int var14 = var0.getHora();
    var0.setHora((-1));
    int var17 = var0.getMin();
    int var18 = var0.getMin();
    java.lang.String var19 = var0.toString();
    var0.setHora((-1));
    var0.setHora(10);
    int var24 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "00:00"+ "'", var1.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "-01:-01"+ "'", var19.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 10);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test485");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    int var9 = var0.getHora();
    var0.setHora((-1));
    var0.setMin(1);
    var0.setHora(1);
    int var16 = var0.getMin();
    int var17 = var0.getHora();
    var0.setHora(1);
    int var20 = var0.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test486");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, (-1));
    var2.setHora((-1));
    int var5 = var2.getHora();
    var2.setMin((-1));
    var2.setMin(1);
    var2.setMin((-1));
    var2.setMin(1);
    int var14 = var2.getMin();
    int var15 = var2.getMin();
    int var16 = var2.getMin();
    int var17 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test487");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    int var3 = var2.getHora();
    var2.setMin(1);
    var2.setMin(1);
    java.lang.String var8 = var2.toString();
    int var9 = var2.getHora();
    int var10 = var2.getMin();
    var2.setMin(10);
    java.lang.String var13 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10:01"+ "'", var8.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10:10"+ "'", var13.equals("10:10"));

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test488");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setHora((-1));
    int var8 = var2.getHora();
    java.lang.String var9 = var2.toString();
    int var10 = var2.getMin();
    var2.setHora(0);
    var2.setHora((-1));
    var2.setHora(0);
    var2.setHora((-1));
    var2.setHora((-1));
    var2.setMin(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01:-01"+ "'", var9.equals("-01:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test489");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setHora(0);
    var0.setHora(10);
    int var11 = var0.getMin();
    java.lang.String var12 = var0.toString();
    int var13 = var0.getHora();
    int var14 = var0.getMin();
    var0.setMin(1);
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:10"+ "'", var12.equals("10:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10:01"+ "'", var17.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10:01"+ "'", var18.equals("10:01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10:01"+ "'", var19.equals("10:01"));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test490");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    int var5 = var0.getMin();
    int var6 = var0.getHora();
    var0.setMin(10);
    java.lang.String var9 = var0.toString();
    var0.setHora(100);
    int var12 = var0.getHora();
    int var13 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00:10"+ "'", var9.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test491");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    var2.setHora(0);
    int var7 = var2.getHora();
    int var8 = var2.getHora();
    int var9 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test492");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(1, 0);
    var2.setHora(0);
    int var5 = var2.getMin();
    int var6 = var2.getHora();
    java.lang.String var7 = var2.toString();
    int var8 = var2.getMin();
    var2.setHora(0);
    java.lang.String var11 = var2.toString();
    int var12 = var2.getHora();
    var2.setHora((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00:00"+ "'", var7.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:00"+ "'", var11.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test493");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    int var4 = var2.getMin();
    java.lang.String var5 = var2.toString();
    var2.setHora(10);
    int var8 = var2.getHora();
    int var9 = var2.getHora();
    var2.setHora(100);
    java.lang.String var12 = var2.toString();
    var2.setMin((-1));
    var2.setMin(1);
    int var17 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:-01"+ "'", var5.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100:-01"+ "'", var12.equals("100:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test494");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 100);
    int var3 = var2.getHora();
    var2.setHora(0);
    var2.setHora(0);
    var2.setMin((-1));
    java.lang.String var10 = var2.toString();
    int var11 = var2.getHora();
    java.lang.String var12 = var2.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:-01"+ "'", var10.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00:-01"+ "'", var12.equals("00:-01"));

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test495");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    java.lang.String var3 = var0.toString();
    int var4 = var0.getHora();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getHora();
    int var7 = var0.getHora();
    var0.setMin(10);
    java.lang.String var10 = var0.toString();
    var0.setHora(10);
    var0.setHora((-1));
    int var15 = var0.getMin();
    int var16 = var0.getMin();
    int var17 = var0.getMin();
    java.lang.String var18 = var0.toString();
    int var19 = var0.getMin();
    var0.setHora(100);
    int var22 = var0.getHora();
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00:00"+ "'", var3.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00:00"+ "'", var5.equals("00:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00:10"+ "'", var10.equals("00:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "-01:10"+ "'", var18.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "100:10"+ "'", var23.equals("100:10"));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test496");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(10, 0);
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    var2.setHora((-1));
    var2.setMin(10);
    int var9 = var2.getHora();
    var2.setHora((-1));
    java.lang.String var12 = var2.toString();
    java.lang.String var13 = var2.toString();
    int var14 = var2.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10:00"+ "'", var4.equals("10:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01:10"+ "'", var12.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01:10"+ "'", var13.equals("-01:10"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test497");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setHora((-1));
    java.lang.String var3 = var0.toString();
    var0.setMin(0);
    int var6 = var0.getHora();
    var0.setHora(100);
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "-01:00"+ "'", var3.equals("-01:00"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "100:00"+ "'", var9.equals("100:00"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test498");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setMin((-1));
    var0.setMin(10);
    var0.setMin(100);
    int var9 = var0.getHora();
    int var10 = var0.getMin();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMin();
    int var13 = var0.getHora();
    java.lang.String var14 = var0.toString();
    int var15 = var0.getHora();
    int var16 = var0.getHora();
    var0.setHora(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00:100"+ "'", var11.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00:100"+ "'", var14.equals("00:100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test499");


    com.application.ciadobusao.util.HorarioDoEncontro var0 = new com.application.ciadobusao.util.HorarioDoEncontro();
    var0.setMin(0);
    var0.setHora(1);
    int var5 = var0.getMin();
    var0.setHora((-1));
    var0.setHora(1);
    int var10 = var0.getMin();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nHorarioDoEncontro39.test500");


    com.application.ciadobusao.util.HorarioDoEncontro var2 = new com.application.ciadobusao.util.HorarioDoEncontro(0, (-1));
    int var3 = var2.getHora();
    java.lang.String var4 = var2.toString();
    int var5 = var2.getMin();
    java.lang.String var6 = var2.toString();
    int var7 = var2.getHora();
    var2.setHora(0);
    var2.setHora(10);
    java.lang.String var12 = var2.toString();
    int var13 = var2.getHora();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00:-01"+ "'", var4.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00:-01"+ "'", var6.equals("00:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10:-01"+ "'", var12.equals("10:-01"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

}
