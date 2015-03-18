package randoop;

import junit.framework.*;

public class DataDoEncontro41 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test1");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    java.lang.String var10 = var3.toString();
    var3.setAno(1);
    var3.setDia(103);
    var3.setDia(3);
    var3.setAno(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00/00/0000"+ "'", var10.equals("00/00/0000"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test2");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getDia();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/01/0002"+ "'", var4.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00/01/0002"+ "'", var6.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/01/0002"+ "'", var7.equals("00/01/0002"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test3");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, (-1), 101);
    java.lang.String var4 = var3.toString();
    var3.setDia(2);
    int var7 = var3.getMes();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "15/00/0101"+ "'", var4.equals("15/00/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "02/00/0101"+ "'", var8.equals("02/00/0101"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test4");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 8, 100);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test5");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, 101, 101);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test6");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 9, 110);
    var3.setAno(8);
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test7");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 12, 101);
    var3.setMes(103);
    int var6 = var3.getMes();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/103/0101"+ "'", var7.equals("100/103/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/103/0101"+ "'", var8.equals("100/103/0101"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test8");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(18, 1, 0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test9");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setMes(2);
    int var6 = var3.getAno();
    var3.setAno(1);
    var3.setDia(2);
    var3.setMes(0);
    var3.setMes(107);
    var3.setDia(16);
    java.lang.String var17 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "16/107/0001"+ "'", var17.equals("16/107/0001"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test10");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setDia(10);
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    var3.setAno(102);
    int var12 = var3.getMes();
    var3.setMes(0);
    var3.setDia(2);
    var3.setDia((-1));
    var3.setAno(108);
    int var21 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test11");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 101, 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setDia(101);
    var3.setAno(104);
    int var11 = var3.getAno();
    var3.setAno(2);
    int var14 = var3.getAno();
    var3.setMes(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test12");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setAno(101);
    java.lang.String var9 = var3.toString();
    var3.setMes(102);
    var3.setAno(101);
    var3.setDia(10);
    var3.setAno(0);
    int var18 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10/10/0101"+ "'", var9.equals("10/10/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 102);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test13");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setAno(102);
    var3.setAno(2);
    int var12 = var3.getMes();
    int var13 = var3.getMes();
    var3.setDia(11);
    java.lang.String var16 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "11/00/0002"+ "'", var16.equals("11/00/0002"));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test14");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 105, 12);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test15");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setDia(10);
    int var3 = var0.getMes();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getAno();
    int var7 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/00/0000"+ "'", var4.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10/00/0000"+ "'", var5.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test16");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    java.lang.String var4 = var3.toString();
    var3.setAno(11);
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01/01/0000"+ "'", var4.equals("01/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 11);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test17");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 100, 108);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test18");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    int var12 = var3.getDia();
    int var13 = var3.getAno();
    var3.setDia(3);
    int var16 = var3.getMes();
    int var17 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test19");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setDia(10);
    int var14 = var3.getMes();
    var3.setAno(0);
    java.lang.String var17 = var3.toString();
    int var18 = var3.getAno();
    int var19 = var3.getDia();
    int var20 = var3.getMes();
    var3.setAno(100);
    int var23 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10/00/0000"+ "'", var17.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test20");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 2, 10);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    var3.setAno(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test21");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 16, 7);
    var3.setMes(13);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test22");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    var3.setAno(3);
    var3.setMes(3);
    var3.setAno(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test23");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setMes(2);
    var3.setMes(11);
    int var8 = var3.getAno();
    var3.setMes(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test24");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, 1, 3);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test25");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 2, 104);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    var3.setDia(3);
    var3.setAno(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/03/0104"+ "'", var4.equals("10/03/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10/03/0104"+ "'", var5.equals("10/03/0104"));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test26");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getMes();
    var3.setMes(1);
    int var11 = var3.getMes();
    int var12 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test27");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 107, 0);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test28");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getMes();
    int var5 = var0.getAno();
    var0.setAno(100);
    int var8 = var0.getDia();
    var0.setAno(8);
    var0.setDia(12);
    int var13 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 12);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test29");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 10, 101);
    var3.setMes(4);
    int var6 = var3.getAno();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "103/04/0101"+ "'", var7.equals("103/04/0101"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test30");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 101, 17);
    int var4 = var3.getMes();
    var3.setMes(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test31");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    var3.setMes(103);
    var3.setDia(102);
    var3.setMes(107);
    int var13 = var3.getAno();
    int var14 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 102);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test32");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), (-1), 100);
    var3.setDia(101);
    var3.setMes(0);
    int var8 = var3.getMes();
    var3.setDia(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test33");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    var3.setAno(10);
    int var13 = var3.getMes();
    int var14 = var3.getDia();
    int var15 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test34");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setMes(101);
    var3.setDia(102);
    int var16 = var3.getDia();
    int var17 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test35");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    var3.setAno(10);
    var3.setAno(2);
    java.lang.String var15 = var3.toString();
    var3.setDia(18);
    var3.setAno(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100/00/0002"+ "'", var15.equals("100/00/0002"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test36");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    var3.setMes(0);
    int var13 = var3.getDia();
    var3.setAno((-1));
    int var16 = var3.getDia();
    int var17 = var3.getAno();
    var3.setAno((-1));
    var3.setAno(10);
    java.lang.String var22 = var3.toString();
    var3.setDia(0);
    int var25 = var3.getAno();
    var3.setMes(11);
    int var28 = var3.getAno();
    var3.setDia(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00/00/0000"+ "'", var9.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "00/00/0010"+ "'", var22.equals("00/00/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test37");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 0, 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    java.lang.String var7 = var3.toString();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    var3.setDia(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/01/0000"+ "'", var7.equals("00/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test38");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setMes(101);
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    var3.setDia(101);
    var3.setAno((-1));
    var3.setAno(104);
    int var19 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 101);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test39");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getMes();
    var3.setAno(1);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/100/0001"+ "'", var6.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10/100/0001"+ "'", var10.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10/100/0001"+ "'", var11.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10/100/0001"+ "'", var12.equals("10/100/0001"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test40");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 3, 2);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    var3.setDia(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00/04/0002"+ "'", var5.equals("00/04/0002"));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test41");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getAno();
    var3.setDia(100);
    int var10 = var3.getAno();
    int var11 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test42");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    var3.setDia(0);
    var3.setMes((-1));
    int var15 = var3.getAno();
    var3.setAno(0);
    var3.setMes(3);
    var3.setAno(107);
    int var22 = var3.getMes();
    var3.setAno(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 3);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test43");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 10, 102);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 108);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test44");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    int var6 = var0.getMes();
    java.lang.String var7 = var0.toString();
    var0.setDia(101);
    var0.setDia(100);
    int var12 = var0.getAno();
    var0.setDia((-1));
    var0.setMes(104);
    var0.setAno(105);
    var0.setMes(10);
    var0.setMes(0);
    int var23 = var0.getDia();
    int var24 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/-01/0001"+ "'", var7.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 105);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test45");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 10, 11);
    int var4 = var3.getMes();
    var3.setAno(14);
    var3.setDia(4);
    var3.setAno(110);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test46");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 13, 8);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test47");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 1, (-1));
    int var4 = var3.getDia();
    var3.setAno(100);
    int var7 = var3.getAno();
    int var8 = var3.getDia();
    int var9 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test48");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes((-1));
    var3.setDia(101);
    int var11 = var3.getDia();
    var3.setAno(104);
    int var14 = var3.getDia();
    int var15 = var3.getAno();
    java.lang.String var16 = var3.toString();
    java.lang.String var17 = var3.toString();
    int var18 = var3.getDia();
    var3.setDia(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "101/-01/0104"+ "'", var16.equals("101/-01/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "101/-01/0104"+ "'", var17.equals("101/-01/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 101);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test49");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 4, 17);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test50");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 108, 5);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test51");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setDia(10);
    int var14 = var3.getMes();
    var3.setAno(0);
    java.lang.String var17 = var3.toString();
    int var18 = var3.getAno();
    java.lang.String var19 = var3.toString();
    java.lang.String var20 = var3.toString();
    var3.setMes(1);
    int var23 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10/00/0000"+ "'", var17.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10/00/0000"+ "'", var19.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10/00/0000"+ "'", var20.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test52");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 101, 1);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    var3.setAno(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test53");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(19, 102, 18);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test54");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 11, 10);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    var3.setAno(0);
    int var8 = var3.getAno();
    var3.setAno(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test55");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 5, 6);
    var3.setDia(100);
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 6);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test56");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getMes();
    int var5 = var0.getDia();
    var0.setAno(10);
    var0.setDia(104);
    int var10 = var0.getAno();
    int var11 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 104);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test57");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 104, 100);
    var3.setAno(104);
    java.lang.String var6 = var3.toString();
    var3.setMes(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01/105/0104"+ "'", var6.equals("-01/105/0104"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test58");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setAno(2);
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    int var11 = var3.getDia();
    var3.setMes(110);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test59");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 0, 1);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    var3.setAno(14);
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "102/01/0014"+ "'", var9.equals("102/01/0014"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "102/01/0014"+ "'", var10.equals("102/01/0014"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test60");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 0, 10);
    var3.setAno(10);
    int var6 = var3.getAno();
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    int var9 = var3.getDia();
    var3.setMes((-1));
    java.lang.String var12 = var3.toString();
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "101/-01/0010"+ "'", var12.equals("101/-01/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 101);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test61");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 10, 12);
    var3.setDia(104);
    int var6 = var3.getMes();
    var3.setMes(101);
    var3.setDia(12);
    int var11 = var3.getAno();
    int var12 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 12);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test62");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 2, 9);
    var3.setAno(11);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test63");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 10, 0);
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getDia();
    var3.setAno(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/11/0000"+ "'", var5.equals("100/11/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test64");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(1);
    var0.setMes(101);
    int var7 = var0.getDia();
    int var8 = var0.getMes();
    var0.setAno(0);
    int var11 = var0.getDia();
    var0.setMes(0);
    int var14 = var0.getMes();
    int var15 = var0.getDia();
    var0.setMes(3);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "00/03/0000"+ "'", var18.equals("00/03/0000"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test65");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 10, 104);
    int var4 = var3.getMes();
    var3.setAno(103);
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    var3.setMes(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "103/11/0103"+ "'", var7.equals("103/11/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "103/11/0103"+ "'", var8.equals("103/11/0103"));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test66");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 12, 18);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test67");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 102, 13);
    var3.setMes(6);
    var3.setDia(108);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test68");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 102, 2);
    int var4 = var3.getAno();
    var3.setMes(18);
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 18);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test69");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    int var10 = var3.getMes();
    var3.setMes(2);
    int var13 = var3.getAno();
    var3.setMes(107);
    int var16 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test70");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 10, 0);
    var3.setAno(103);
    var3.setAno(1);
    var3.setDia(11);
    var3.setMes(9);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test71");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 107, 106);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test72");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 102);
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    var3.setAno(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test73");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    int var12 = var3.getDia();
    var3.setAno(101);
    var3.setAno(100);
    int var17 = var3.getAno();
    var3.setMes(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test74");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 103, 10);
    int var4 = var3.getMes();
    var3.setAno(107);
    int var7 = var3.getAno();
    var3.setDia(15);
    var3.setAno(108);
    var3.setMes(9);
    var3.setDia(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 107);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test75");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    var3.setDia(100);
    int var12 = var3.getDia();
    int var13 = var3.getAno();
    var3.setAno(1);
    int var16 = var3.getMes();
    java.lang.String var17 = var3.toString();
    java.lang.String var18 = var3.toString();
    java.lang.String var19 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100/00/0001"+ "'", var17.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100/00/0001"+ "'", var18.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "100/00/0001"+ "'", var19.equals("100/00/0001"));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test76");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setAno(0);
    var3.setMes(11);
    int var13 = var3.getDia();
    var3.setAno(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/00/0000"+ "'", var8.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test77");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 11, 11);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 108);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test78");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(18, 108, 108);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 109);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test79");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 5, 103);
    int var4 = var3.getDia();
    var3.setMes(11);
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test80");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, 11, 102);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test81");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 14, 12);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test82");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 3, 0);
    var3.setDia(2);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getDia();
    var3.setDia(13);
    int var10 = var3.getMes();
    int var11 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "02/04/0000"+ "'", var6.equals("02/04/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 13);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test83");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    int var13 = var3.getMes();
    int var14 = var3.getDia();
    java.lang.String var15 = var3.toString();
    var3.setMes(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
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
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00/00/0000"+ "'", var15.equals("00/00/0000"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test84");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    int var11 = var3.getAno();
    java.lang.String var12 = var3.toString();
    var3.setMes((-1));
    var3.setDia((-1));
    var3.setMes(2);
    var3.setMes(2);
    int var21 = var3.getDia();
    int var22 = var3.getMes();
    java.lang.String var23 = var3.toString();
    java.lang.String var24 = var3.toString();
    int var25 = var3.getDia();
    var3.setMes(104);
    var3.setAno(100);
    int var30 = var3.getDia();
    java.lang.String var31 = var3.toString();
    int var32 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0000"+ "'", var12.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "-01/02/0000"+ "'", var23.equals("-01/02/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "-01/02/0000"+ "'", var24.equals("-01/02/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "-01/104/0100"+ "'", var31.equals("-01/104/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 104);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test85");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(7, 15, 108);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 7);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test86");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 104, 0);
    java.lang.String var4 = var3.toString();
    var3.setDia(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "108/105/0000"+ "'", var4.equals("108/105/0000"));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test87");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    var3.setDia(101);
    int var10 = var3.getDia();
    var3.setMes(101);
    int var13 = var3.getAno();
    java.lang.String var14 = var3.toString();
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "101/101/0000"+ "'", var14.equals("101/101/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "101/101/0000"+ "'", var15.equals("101/101/0000"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test88");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 100, 101);
    int var4 = var3.getMes();
    var3.setMes(100);
    var3.setDia(100);
    var3.setMes(11);
    int var11 = var3.getMes();
    var3.setMes(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 11);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test89");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 101, 103);
    int var4 = var3.getDia();
    var3.setAno(104);
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "01/102/0104"+ "'", var7.equals("01/102/0104"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test90");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 10, 108);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 108);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test91");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 1);
    var3.setDia(101);
    int var6 = var3.getDia();
    var3.setMes(100);
    var3.setMes(10);
    int var11 = var3.getDia();
    var3.setDia(101);
    int var14 = var3.getDia();
    int var15 = var3.getMes();
    java.lang.String var16 = var3.toString();
    var3.setAno(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "101/10/0001"+ "'", var16.equals("101/10/0001"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test92");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 107, 100);
    java.lang.String var4 = var3.toString();
    var3.setAno(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "102/108/0100"+ "'", var4.equals("102/108/0100"));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test93");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    var3.setMes(0);
    int var13 = var3.getDia();
    var3.setAno((-1));
    int var16 = var3.getDia();
    int var17 = var3.getAno();
    var3.setMes(0);
    var3.setAno(102);
    var3.setDia(102);
    int var24 = var3.getMes();
    java.lang.String var25 = var3.toString();
    int var26 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00/00/0000"+ "'", var9.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "102/00/0102"+ "'", var25.equals("102/00/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 102);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test94");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(102);
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    var3.setAno(2);
    var3.setDia(8);
    var3.setAno(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "102/102/0001"+ "'", var9.equals("102/102/0001"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test95");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 102, 100);
    int var4 = var3.getMes();
    var3.setAno((-1));
    var3.setDia(2);
    int var9 = var3.getMes();
    int var10 = var3.getDia();
    var3.setDia(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test96");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(1);
    var3.setDia(100);
    int var13 = var3.getMes();
    var3.setDia((-1));
    var3.setDia(4);
    var3.setMes(0);
    java.lang.String var20 = var3.toString();
    int var21 = var3.getAno();
    int var22 = var3.getMes();
    var3.setMes(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "04/00/0000"+ "'", var20.equals("04/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test97");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 109, 105);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test98");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setDia(10);
    var3.setDia(10);
    java.lang.String var13 = var3.toString();
    int var14 = var3.getAno();
    int var15 = var3.getMes();
    int var16 = var3.getDia();
    int var17 = var3.getAno();
    var3.setDia(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/00/0000"+ "'", var13.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test99");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, (-1), 1);
    int var4 = var3.getMes();
    var3.setMes(103);
    var3.setAno(107);
    int var9 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 107);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test100");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    var0.setDia(102);
    var0.setDia(103);
    int var8 = var0.getAno();
    int var9 = var0.getDia();
    java.lang.String var10 = var0.toString();
    var0.setMes(102);
    var0.setMes((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "103/00/0000"+ "'", var10.equals("103/00/0000"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test101");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 1, 11);
    var3.setMes(105);
    int var6 = var3.getAno();
    var3.setMes(3);
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test102");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(100);
    var0.setDia(1);
    int var7 = var0.getAno();
    int var8 = var0.getMes();
    var0.setDia(1);
    int var11 = var0.getMes();
    int var12 = var0.getAno();
    int var13 = var0.getMes();
    int var14 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test103");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 5, 103);
    int var4 = var3.getDia();
    var3.setDia(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test104");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    var3.setAno(102);
    var3.setMes((-1));
    int var12 = var3.getAno();
    int var13 = var3.getMes();
    int var14 = var3.getDia();
    var3.setDia(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test105");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    var3.setMes(10);
    int var12 = var3.getAno();
    java.lang.String var13 = var3.toString();
    var3.setAno(102);
    var3.setDia(4);
    var3.setDia(2);
    var3.setMes(102);
    var3.setMes(11);
    var3.setAno(14);
    var3.setDia(106);
    
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
    assertTrue("'" + var9 + "' != '" + "100/00/0000"+ "'", var9.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/10/0000"+ "'", var13.equals("100/10/0000"));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test106");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 3, 10);
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "106/04/0010"+ "'", var5.equals("106/04/0010"));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test107");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 11, 1);
    var3.setDia(12);
    var3.setMes(15);
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 12);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test108");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 14, 10);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test109");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getAno();
    int var13 = var3.getDia();
    var3.setMes(0);
    var3.setDia(104);
    int var18 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/00/0000"+ "'", var10.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/00/0000"+ "'", var11.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 104);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test110");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.toString();
    var3.setAno(102);
    var3.setDia(12);
    var3.setAno(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/00/0000"+ "'", var8.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00/00/0000"+ "'", var9.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00/00/0000"+ "'", var10.equals("00/00/0000"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test111");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 1);
    var3.setAno(103);
    var3.setAno(4);
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test112");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 11, 103);
    var3.setDia(10);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/12/0103"+ "'", var6.equals("10/12/0103"));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test113");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 103, 103);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    var3.setAno(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/104/0103"+ "'", var5.equals("100/104/0103"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test114");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 105, 100);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "101/106/0100"+ "'", var4.equals("101/106/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test115");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    var3.setMes(100);
    var3.setMes(105);
    int var13 = var3.getDia();
    int var14 = var3.getAno();
    
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
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test116");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 11, 0);
    var3.setAno(110);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test117");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getMes();
    int var8 = var3.getMes();
    var3.setDia(101);
    java.lang.String var11 = var3.toString();
    int var12 = var3.getAno();
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "101/00/0000"+ "'", var11.equals("101/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "101/00/0000"+ "'", var13.equals("101/00/0000"));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test118");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, (-1), 8);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test119");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 14, 103);
    var3.setMes(14);
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 14);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test120");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    var3.setDia(100);
    int var7 = var3.getMes();
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test121");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(100);
    var3.setAno(103);
    int var12 = var3.getDia();
    var3.setAno(103);
    var3.setAno(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test122");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 104, 18);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 17);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test123");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setAno(101);
    int var9 = var3.getDia();
    var3.setAno(10);
    var3.setDia(100);
    int var14 = var3.getMes();
    int var15 = var3.getAno();
    int var16 = var3.getDia();
    var3.setAno(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test124");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 0, 101);
    int var4 = var3.getDia();
    var3.setDia(3);
    var3.setDia(6);
    int var9 = var3.getAno();
    var3.setAno(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test125");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    int var12 = var3.getMes();
    int var13 = var3.getDia();
    int var14 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test126");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(10);
    int var7 = var3.getAno();
    var3.setAno(0);
    int var10 = var3.getAno();
    var3.setAno(1);
    var3.setMes(109);
    var3.setMes(101);
    int var17 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 101);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test127");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(1);
    var0.setMes(101);
    int var7 = var0.getDia();
    int var8 = var0.getMes();
    var0.setAno(0);
    var0.setDia(10);
    var0.setDia(3);
    int var15 = var0.getAno();
    int var16 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 3);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test128");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getAno();
    java.lang.String var13 = var3.toString();
    var3.setDia(103);
    int var16 = var3.getMes();
    var3.setAno(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00/00/0000"+ "'", var11.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00/00/0000"+ "'", var13.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test129");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, (-1), 102);
    var3.setAno(11);
    var3.setAno(2);
    int var8 = var3.getAno();
    var3.setAno(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test130");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 2, 11);
    java.lang.String var4 = var3.toString();
    var3.setAno(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "06/03/0011"+ "'", var4.equals("06/03/0011"));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test131");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(7, 10, 3);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test132");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 103, 104);
    int var4 = var3.getMes();
    var3.setDia(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 104);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test133");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getDia();
    var3.setAno(102);
    var3.setAno(7);
    var3.setMes(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test134");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 101, 10);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 101);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test135");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 11, 1);
    int var4 = var3.getDia();
    var3.setMes(101);
    var3.setMes(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test136");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setDia(3);
    java.lang.String var11 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/100/0001"+ "'", var6.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "03/100/0001"+ "'", var11.equals("03/100/0001"));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test137");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 4, 13);
    int var4 = var3.getMes();
    var3.setDia((-1));
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01/05/0013"+ "'", var7.equals("-01/05/0013"));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test138");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(10);
    int var11 = var3.getAno();
    var3.setDia(1);
    int var14 = var3.getDia();
    int var15 = var3.getAno();
    var3.setDia(3);
    int var18 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test139");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(111, 1, 106);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test140");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 2, 10);
    int var4 = var3.getDia();
    var3.setDia(2);
    int var7 = var3.getAno();
    var3.setDia(10);
    int var10 = var3.getAno();
    var3.setAno(7);
    var3.setDia(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test141");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getDia();
    java.lang.String var3 = var0.toString();
    var0.setMes(3);
    int var6 = var0.getMes();
    var0.setMes(3);
    var0.setAno(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00/00/0000"+ "'", var3.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test142");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    var3.setMes(102);
    int var15 = var3.getDia();
    int var16 = var3.getMes();
    java.lang.String var17 = var3.toString();
    int var18 = var3.getDia();
    int var19 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100/102/0000"+ "'", var17.equals("100/102/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test143");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 100, 10);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test144");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 2, 101);
    var3.setAno(101);
    var3.setDia(106);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test145");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, (-1));
    java.lang.String var4 = var3.toString();
    var3.setDia(9);
    var3.setDia((-1));
    java.lang.String var9 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/101/-0001"+ "'", var4.equals("10/101/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01/101/-0001"+ "'", var9.equals("-01/101/-0001"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test146");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 104, 16);
    var3.setDia(13);
    var3.setAno(12);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test147");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 104, 5);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/105/0005"+ "'", var4.equals("10/105/0005"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10/105/0005"+ "'", var5.equals("10/105/0005"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test148");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getMes();
    var3.setAno(2);
    int var13 = var3.getMes();
    var3.setDia(103);
    int var16 = var3.getAno();
    java.lang.String var17 = var3.toString();
    int var18 = var3.getAno();
    int var19 = var3.getAno();
    int var20 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "103/-01/0002"+ "'", var17.equals("103/-01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 103);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test149");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 101);
    int var4 = var3.getMes();
    var3.setMes(102);
    java.lang.String var7 = var3.toString();
    int var8 = var3.getMes();
    var3.setAno(104);
    var3.setDia(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/102/0101"+ "'", var7.equals("100/102/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test150");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    var3.setMes(0);
    int var6 = var3.getDia();
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getAno();
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "100/00/-0001"+ "'", var9.equals("100/00/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/00/-0001"+ "'", var11.equals("100/00/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/-0001"+ "'", var12.equals("100/00/-0001"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test151");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 106, 3);
    var3.setMes(109);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test152");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(0);
    var3.setAno(10);
    int var13 = var3.getDia();
    var3.setMes(101);
    int var16 = var3.getAno();
    var3.setMes(11);
    int var19 = var3.getAno();
    java.lang.String var20 = var3.toString();
    var3.setAno(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "00/11/0010"+ "'", var20.equals("00/11/0010"));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test153");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 10, 10);
    var3.setAno(11);
    var3.setAno(102);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getAno();
    int var10 = var3.getDia();
    var3.setAno(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01/11/0102"+ "'", var8.equals("-01/11/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test154");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    var3.setAno((-1));
    int var13 = var3.getMes();
    var3.setMes(102);
    int var16 = var3.getMes();
    var3.setAno(100);
    var3.setAno(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 102);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test155");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 2, 105);
    var3.setMes(5);
    var3.setAno(8);
    var3.setMes(4);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test156");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, (-1), 12);
    int var4 = var3.getMes();
    var3.setMes(15);
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test157");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 8, 6);
    int var4 = var3.getDia();
    var3.setAno(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test158");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setMes(2);
    var3.setAno(100);
    java.lang.String var8 = var3.toString();
    var3.setAno((-1));
    var3.setAno(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "01/02/0100"+ "'", var8.equals("01/02/0100"));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test159");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 101, 103);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    var3.setAno(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test160");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(9, 15, 13);
    var3.setMes(110);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test161");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getAno();
    int var8 = var3.getAno();
    var3.setAno(108);
    int var11 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test162");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, (-1), 11);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test163");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 106, 2);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    var3.setDia(1);
    var3.setAno(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "105/107/0002"+ "'", var5.equals("105/107/0002"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test164");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 2, 2);
    int var4 = var3.getDia();
    var3.setAno(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test165");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    var3.setAno((-1));
    var3.setMes(3);
    int var15 = var3.getDia();
    java.lang.String var16 = var3.toString();
    int var17 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00/03/-0001"+ "'", var16.equals("00/03/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test166");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), (-1), 100);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    var3.setAno(10);
    var3.setDia(3);
    var3.setDia(6);
    int var12 = var3.getDia();
    var3.setAno(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 6);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test167");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 0, 105);
    var3.setMes(0);
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 104);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test168");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    var3.setDia(11);
    var3.setAno(11);
    var3.setAno(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test169");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 101, (-1));
    int var4 = var3.getDia();
    var3.setAno(3);
    int var7 = var3.getDia();
    var3.setMes(101);
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "103/101/0003"+ "'", var10.equals("103/101/0003"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test170");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    var3.setDia(101);
    int var10 = var3.getDia();
    var3.setAno(11);
    var3.setDia(2);
    int var15 = var3.getAno();
    int var16 = var3.getDia();
    int var17 = var3.getDia();
    var3.setDia(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test171");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setDia(10);
    int var8 = var3.getDia();
    var3.setDia(1);
    var3.setMes(0);
    var3.setMes(13);
    int var15 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 13);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test172");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(100);
    var0.setDia(100);
    java.lang.String var7 = var0.toString();
    var0.setDia(10);
    var0.setDia(3);
    int var12 = var0.getAno();
    var0.setAno(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0100"+ "'", var7.equals("100/00/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test173");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(10);
    int var7 = var3.getAno();
    var3.setAno(10);
    int var10 = var3.getAno();
    var3.setMes(17);
    int var13 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test174");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getMes();
    int var5 = var0.getDia();
    var0.setAno(10);
    var0.setMes(10);
    int var10 = var0.getMes();
    var0.setDia(12);
    var0.setAno(1);
    var0.setMes(4);
    var0.setDia(12);
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "12/04/0001"+ "'", var19.equals("12/04/0001"));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test175");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setMes((-1));
    var3.setMes(0);
    int var8 = var3.getAno();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getDia();
    var3.setMes((-1));
    int var13 = var3.getAno();
    int var14 = var3.getMes();
    var3.setDia(101);
    var3.setDia(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01/00/0000"+ "'", var9.equals("01/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test176");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 10, 12);
    var3.setDia(12);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test177");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getMes();
    var3.setDia((-1));
    var3.setMes(101);
    var3.setDia(4);
    var3.setMes(5);
    var3.setDia((-1));
    var3.setMes(0);
    var3.setDia(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test178");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 100, 4);
    var3.setDia(3);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test179");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 111, 105);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test180");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 106);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test181");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 16, 1);
    var3.setAno(100);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test182");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    var0.setDia(102);
    var0.setDia(103);
    int var8 = var0.getAno();
    int var9 = var0.getDia();
    var0.setAno((-1));
    int var12 = var0.getMes();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getMes();
    var0.setAno(15);
    var0.setMes(1);
    int var19 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "103/00/-0001"+ "'", var13.equals("103/00/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test183");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 10, (-1));
    int var4 = var3.getDia();
    int var5 = var3.getMes();
    var3.setAno((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 11);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test184");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 105, 13);
    var3.setMes(2);
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 13);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test185");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 107, 101);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 108);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test186");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    var3.setDia(101);
    int var10 = var3.getDia();
    var3.setAno(11);
    var3.setDia(2);
    var3.setDia(100);
    var3.setMes(16);
    var3.setDia(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test187");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 102);
    var3.setDia(1);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getMes();
    var3.setDia(4);
    int var10 = var3.getMes();
    var3.setDia(4);
    var3.setAno(0);
    int var15 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "01/01/0102"+ "'", var6.equals("01/01/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test188");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 101);
    int var4 = var3.getMes();
    var3.setDia(10);
    var3.setDia(5);
    int var9 = var3.getDia();
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "05/02/0101"+ "'", var10.equals("05/02/0101"));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test189");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    int var11 = var3.getAno();
    java.lang.String var12 = var3.toString();
    var3.setMes((-1));
    var3.setDia((-1));
    java.lang.String var17 = var3.toString();
    int var18 = var3.getDia();
    java.lang.String var19 = var3.toString();
    var3.setDia(102);
    java.lang.String var22 = var3.toString();
    int var23 = var3.getAno();
    java.lang.String var24 = var3.toString();
    var3.setDia(18);
    var3.setMes(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0000"+ "'", var12.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "-01/-01/0000"+ "'", var17.equals("-01/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "-01/-01/0000"+ "'", var19.equals("-01/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "102/-01/0000"+ "'", var22.equals("102/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "102/-01/0000"+ "'", var24.equals("102/-01/0000"));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test190");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 15, 5);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test191");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 4, 103);
    var3.setAno(104);
    int var6 = var3.getAno();
    var3.setMes(12);
    int var9 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 104);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test192");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    java.lang.String var12 = var3.toString();
    var3.setAno(10);
    var3.setAno(100);
    var3.setAno(2);
    var3.setAno(1);
    var3.setMes(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0001"+ "'", var12.equals("100/00/0001"));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test193");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 2, 15);
    var3.setMes(7);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test194");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setAno(101);
    int var9 = var3.getDia();
    var3.setAno(10);
    java.lang.String var12 = var3.toString();
    var3.setDia((-1));
    java.lang.String var15 = var3.toString();
    int var16 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10/10/0010"+ "'", var12.equals("10/10/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01/10/0010"+ "'", var15.equals("-01/10/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test195");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 102, 102);
    var3.setAno(103);
    int var6 = var3.getAno();
    var3.setMes((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 103);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test196");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 100);
    var3.setMes(3);
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    int var9 = var3.getDia();
    var3.setDia(18);
    int var12 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test197");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    java.lang.String var10 = var3.toString();
    var3.setDia(2);
    var3.setDia(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/00/0100"+ "'", var10.equals("100/00/0100"));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test198");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getMes();
    int var5 = var0.getAno();
    var0.setAno(100);
    int var8 = var0.getDia();
    var0.setAno(8);
    var0.setDia(12);
    int var13 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 8);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test199");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setAno(1);
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    java.lang.String var13 = var3.toString();
    int var14 = var3.getAno();
    int var15 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/00/0001"+ "'", var13.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test200");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 101);
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setAno(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00/01/0101"+ "'", var5.equals("00/01/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test201");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 3, 101);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    var3.setDia(4);
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "02/04/0101"+ "'", var5.equals("02/04/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test202");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 102);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.toString();
    var3.setMes((-1));
    var3.setDia(2);
    int var12 = var3.getDia();
    var3.setAno(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01/01/0102"+ "'", var5.equals("-01/01/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01/01/0102"+ "'", var6.equals("-01/01/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01/01/0102"+ "'", var7.equals("-01/01/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test203");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setMes(101);
    var3.setDia(102);
    var3.setDia(11);
    var3.setDia(5);
    int var20 = var3.getAno();
    var3.setAno(12);
    int var23 = var3.getMes();
    int var24 = var3.getAno();
    int var25 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 12);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test204");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 3, 0);
    var3.setDia((-1));
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test205");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    var3.setDia((-1));
    var3.setAno((-1));
    int var10 = var3.getMes();
    int var11 = var3.getMes();
    var3.setMes(2);
    java.lang.String var14 = var3.toString();
    java.lang.String var15 = var3.toString();
    java.lang.String var16 = var3.toString();
    java.lang.String var17 = var3.toString();
    var3.setDia(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "-01/02/-0001"+ "'", var14.equals("-01/02/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01/02/-0001"+ "'", var15.equals("-01/02/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "-01/02/-0001"+ "'", var16.equals("-01/02/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "-01/02/-0001"+ "'", var17.equals("-01/02/-0001"));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test206");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 101, 13);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    var3.setMes(7);
    var3.setDia(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test207");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 0);
    var3.setMes(102);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01/102/0000"+ "'", var6.equals("-01/102/0000"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test208");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 111, 15);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test209");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 13, 108);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test210");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 18, 2);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test211");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getMes();
    int var11 = var3.getAno();
    var3.setDia((-1));
    int var14 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
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
    assertTrue(var14 == 0);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test212");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(1);
    var0.setMes(101);
    int var7 = var0.getDia();
    int var8 = var0.getMes();
    var0.setAno(0);
    int var11 = var0.getDia();
    var0.setMes(0);
    int var14 = var0.getMes();
    int var15 = var0.getDia();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00/00/0000"+ "'", var16.equals("00/00/0000"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test213");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 13, 0);
    int var4 = var3.getAno();
    var3.setMes(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test214");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 2, 10);
    int var4 = var3.getAno();
    var3.setMes(101);
    var3.setMes(2);
    var3.setMes(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test215");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    int var8 = var3.getAno();
    int var9 = var3.getAno();
    var3.setMes(10);
    int var12 = var3.getAno();
    int var13 = var3.getDia();
    int var14 = var3.getMes();
    var3.setAno(0);
    java.lang.String var17 = var3.toString();
    var3.setAno(16);
    var3.setDia(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100/10/0000"+ "'", var17.equals("100/10/0000"));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test216");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getMes();
    var3.setAno(2);
    int var13 = var3.getMes();
    var3.setDia(103);
    int var16 = var3.getMes();
    var3.setMes(3);
    int var19 = var3.getMes();
    var3.setMes(1);
    int var22 = var3.getAno();
    var3.setDia(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 2);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test217");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setMes(101);
    var3.setAno(10);
    int var13 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/00/0000"+ "'", var8.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test218");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 15, 5);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "03/16/0005"+ "'", var4.equals("03/16/0005"));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test219");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(100);
    int var11 = var3.getAno();
    int var12 = var3.getAno();
    var3.setAno(104);
    java.lang.String var15 = var3.toString();
    var3.setDia(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00/100/0104"+ "'", var15.equals("00/100/0104"));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test220");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setDia((-1));
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    java.lang.String var13 = var3.toString();
    int var14 = var3.getAno();
    int var15 = var3.getMes();
    int var16 = var3.getMes();
    java.lang.String var17 = var3.toString();
    java.lang.String var18 = var3.toString();
    int var19 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01/10/0001"+ "'", var9.equals("-01/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01/10/0001"+ "'", var13.equals("-01/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "-01/10/0001"+ "'", var17.equals("-01/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "-01/10/0001"+ "'", var18.equals("-01/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test221");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setDia(10);
    int var11 = var3.getMes();
    var3.setDia(13);
    int var14 = var3.getMes();
    int var15 = var3.getAno();
    var3.setMes(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test222");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 0, 13);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test223");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(10);
    int var7 = var3.getMes();
    var3.setMes(102);
    var3.setAno(103);
    int var12 = var3.getMes();
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test224");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 0, 100);
    int var4 = var3.getAno();
    var3.setDia(101);
    var3.setDia(102);
    java.lang.String var9 = var3.toString();
    var3.setMes((-1));
    java.lang.String var12 = var3.toString();
    var3.setMes(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "102/01/0100"+ "'", var9.equals("102/01/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "102/-01/0100"+ "'", var12.equals("102/-01/0100"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test225");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 1);
    var3.setDia(101);
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    var3.setAno(104);
    var3.setAno(105);
    var3.setDia(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 103);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test226");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 16, 110);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test227");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getDia();
    java.lang.String var3 = var0.toString();
    var0.setMes(3);
    var0.setAno(7);
    int var8 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00/00/0000"+ "'", var3.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test228");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 2, 10);
    var3.setDia(101);
    int var6 = var3.getDia();
    int var7 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test229");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 18, 1);
    var3.setAno(103);
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test230");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setMes(0);
    int var9 = var3.getDia();
    var3.setMes(100);
    int var12 = var3.getAno();
    var3.setAno(103);
    java.lang.String var15 = var3.toString();
    int var16 = var3.getAno();
    var3.setDia(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10/100/0103"+ "'", var15.equals("10/100/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 103);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test231");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 101);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test232");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getAno();
    var0.setDia(10);
    int var6 = var0.getMes();
    int var7 = var0.getDia();
    var0.setMes(103);
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10/103/0000"+ "'", var10.equals("10/103/0000"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test233");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    int var10 = var3.getDia();
    var3.setAno(105);
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/-01/0105"+ "'", var13.equals("10/-01/0105"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test234");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    java.lang.String var4 = var3.toString();
    var3.setDia(2);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    int var11 = var3.getDia();
    var3.setAno(7);
    int var14 = var3.getMes();
    int var15 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/01/0002"+ "'", var4.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test235");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    var3.setDia(1);
    java.lang.String var13 = var3.toString();
    int var14 = var3.getDia();
    int var15 = var3.getMes();
    var3.setAno(11);
    var3.setAno(108);
    int var20 = var3.getAno();
    var3.setMes(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01/00/0000"+ "'", var13.equals("01/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 108);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test236");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 102, 104);
    var3.setMes(2);
    var3.setMes(13);
    var3.setDia(4);
    int var10 = var3.getDia();
    int var11 = var3.getMes();
    java.lang.String var12 = var3.toString();
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "04/13/0104"+ "'", var12.equals("04/13/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 4);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test237");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 10);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "02/102/0010"+ "'", var4.equals("02/102/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test238");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setMes(101);
    int var8 = var3.getMes();
    var3.setMes((-1));
    int var11 = var3.getMes();
    int var12 = var3.getDia();
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test239");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    var3.setAno(106);
    var3.setMes(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/01/0002"+ "'", var4.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00/01/0002"+ "'", var5.equals("00/01/0002"));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test240");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    int var10 = var3.getMes();
    var3.setAno(2);
    java.lang.String var13 = var3.toString();
    var3.setMes(104);
    var3.setMes(105);
    var3.setMes(15);
    java.lang.String var20 = var3.toString();
    java.lang.String var21 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/00/0002"+ "'", var13.equals("100/00/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "100/15/0002"+ "'", var20.equals("100/15/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "100/15/0002"+ "'", var21.equals("100/15/0002"));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test241");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getAno();
    var3.setDia(0);
    int var7 = var3.getMes();
    int var8 = var3.getMes();
    var3.setAno((-1));
    int var11 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 102);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test242");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(102);
    int var8 = var3.getMes();
    var3.setAno(1);
    java.lang.String var11 = var3.toString();
    int var12 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "102/102/0001"+ "'", var11.equals("102/102/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test243");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 102, (-1));
    int var4 = var3.getMes();
    var3.setMes(2);
    int var7 = var3.getMes();
    var3.setMes(10);
    var3.setDia(3);
    int var12 = var3.getMes();
    int var13 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test244");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    var3.setMes(12);
    int var14 = var3.getDia();
    int var15 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/10/0001"+ "'", var8.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10/10/0001"+ "'", var9.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10/10/0001"+ "'", var10.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10/10/0001"+ "'", var11.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test245");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 11, 109);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test246");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 1, 1);
    var3.setAno(1);
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/02/0001"+ "'", var8.equals("00/02/0001"));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test247");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 0);
    var3.setDia(101);
    var3.setDia(0);
    int var8 = var3.getDia();
    var3.setDia(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test248");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 102, 102);
    var3.setDia(10);
    int var6 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test249");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 19, 17);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test250");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 6, 9);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test251");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 104, 14);
    var3.setDia(10);
    int var6 = var3.getAno();
    var3.setDia(4);
    int var9 = var3.getAno();
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "04/105/0014"+ "'", var10.equals("04/105/0014"));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test252");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 15, 15);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01/16/0015"+ "'", var5.equals("01/16/0015"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test253");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 2, 10);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    var3.setDia(107);
    var3.setMes(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test254");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setDia(10);
    var3.setDia(10);
    java.lang.String var13 = var3.toString();
    var3.setDia(10);
    var3.setDia(101);
    java.lang.String var18 = var3.toString();
    int var19 = var3.getDia();
    int var20 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/00/0000"+ "'", var13.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "101/00/0000"+ "'", var18.equals("101/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test255");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 101);
    int var4 = var3.getDia();
    var3.setMes(101);
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test256");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setAno(2);
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    var3.setAno(103);
    var3.setDia(2);
    java.lang.String var15 = var3.toString();
    java.lang.String var16 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "02/00/0103"+ "'", var15.equals("02/00/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "02/00/0103"+ "'", var16.equals("02/00/0103"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test257");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 12, 11);
    int var4 = var3.getAno();
    var3.setMes(3);
    int var7 = var3.getAno();
    var3.setMes(107);
    var3.setAno(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test258");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    var3.setDia((-1));
    var3.setAno((-1));
    int var10 = var3.getDia();
    var3.setDia(12);
    int var13 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test259");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 13, (-1));
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 13);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test260");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 105, 1);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getAno();
    var3.setAno(10);
    var3.setDia(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/106/0001"+ "'", var4.equals("100/106/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/106/0001"+ "'", var5.equals("100/106/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test261");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 104, 100);
    int var4 = var3.getAno();
    var3.setAno(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test262");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setMes(1);
    var3.setDia(100);
    java.lang.String var11 = var3.toString();
    int var12 = var3.getDia();
    int var13 = var3.getDia();
    var3.setAno(101);
    var3.setDia(10);
    var3.setDia(4);
    var3.setDia(11);
    int var22 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/01/0000"+ "'", var11.equals("100/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 101);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test263");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 1, (-1));
    var3.setAno(101);
    var3.setDia(101);
    var3.setMes(100);
    var3.setDia(15);
    int var12 = var3.getMes();
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test264");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getMes();
    int var11 = var3.getAno();
    var3.setAno(1);
    int var14 = var3.getAno();
    java.lang.String var15 = var3.toString();
    var3.setDia((-1));
    int var18 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
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
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00/00/0001"+ "'", var15.equals("00/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test265");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 16, 2);
    int var4 = var3.getMes();
    var3.setMes(102);
    var3.setDia(14);
    int var9 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test266");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 101, 103);
    var3.setMes(103);
    var3.setDia(100);
    int var8 = var3.getMes();
    var3.setMes((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 103);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test267");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getDia();
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getMes();
    int var13 = var3.getDia();
    java.lang.String var14 = var3.toString();
    int var15 = var3.getMes();
    var3.setAno(108);
    int var18 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/00/0000"+ "'", var11.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "100/00/0000"+ "'", var14.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test268");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 12, 101);
    int var4 = var3.getAno();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "03/13/0101"+ "'", var8.equals("03/13/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 13);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test269");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 1, 10);
    var3.setAno(104);
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test270");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 13, 104);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "12/14/0104"+ "'", var5.equals("12/14/0104"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test271");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, (-1), 12);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    var3.setDia(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test272");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    int var11 = var3.getAno();
    java.lang.String var12 = var3.toString();
    var3.setMes((-1));
    int var15 = var3.getAno();
    java.lang.String var16 = var3.toString();
    int var17 = var3.getAno();
    int var18 = var3.getDia();
    int var19 = var3.getAno();
    int var20 = var3.getAno();
    int var21 = var3.getAno();
    int var22 = var3.getAno();
    int var23 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0000"+ "'", var12.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "100/-01/0000"+ "'", var16.equals("100/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test273");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 102, 102);
    var3.setDia(103);
    var3.setMes(2);
    int var8 = var3.getMes();
    var3.setAno(10);
    int var11 = var3.getDia();
    var3.setAno(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 103);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test274");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setDia(10);
    var3.setMes((-1));
    var3.setDia(100);
    var3.setMes(106);
    java.lang.String var20 = var3.toString();
    var3.setMes(17);
    var3.setAno(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "100/106/0001"+ "'", var20.equals("100/106/0001"));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test275");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(18, 107, 101);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 18);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test276");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setMes(1);
    var3.setAno(0);
    var3.setMes((-1));
    var3.setDia(102);
    var3.setAno(100);
    var3.setMes(0);
    var3.setDia(103);
    var3.setDia(13);
    var3.setMes(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test277");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    int var6 = var0.getMes();
    java.lang.String var7 = var0.toString();
    var0.setAno(2);
    var0.setMes(1);
    int var12 = var0.getDia();
    int var13 = var0.getAno();
    java.lang.String var14 = var0.toString();
    int var15 = var0.getMes();
    var0.setDia(2);
    int var18 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/-01/0001"+ "'", var7.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/01/0002"+ "'", var14.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test278");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(1);
    var0.setMes(101);
    int var7 = var0.getDia();
    var0.setMes(4);
    var0.setAno(104);
    int var12 = var0.getAno();
    var0.setDia(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 104);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test279");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    var3.setAno(10);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    var3.setAno(1);
    var3.setAno(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/101/0010"+ "'", var10.equals("100/101/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/101/0010"+ "'", var11.equals("100/101/0010"));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test280");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, (-1));
    int var4 = var3.getAno();
    var3.setAno(0);
    var3.setMes((-1));
    java.lang.String var9 = var3.toString();
    var3.setDia(12);
    int var12 = var3.getAno();
    int var13 = var3.getAno();
    var3.setMes(12);
    int var16 = var3.getMes();
    java.lang.String var17 = var3.toString();
    var3.setMes(15);
    var3.setDia(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10/-01/0000"+ "'", var9.equals("10/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "12/12/0000"+ "'", var17.equals("12/12/0000"));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test281");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 103, 11);
    var3.setMes(106);
    int var6 = var3.getDia();
    var3.setDia(4);
    int var9 = var3.getMes();
    var3.setDia(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 106);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test282");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 108, 12);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 104);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test283");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 12, 3);
    var3.setAno(13);
    var3.setDia(104);
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "104/13/0013"+ "'", var8.equals("104/13/0013"));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test284");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 10, 12);
    int var4 = var3.getDia();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 12);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test285");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getDia();
    int var9 = var3.getAno();
    var3.setMes(102);
    int var12 = var3.getAno();
    var3.setAno(13);
    var3.setDia(13);
    var3.setDia(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test286");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 1, 1);
    var3.setDia(103);
    var3.setAno(102);
    java.lang.String var8 = var3.toString();
    var3.setDia(11);
    var3.setAno(102);
    int var13 = var3.getMes();
    var3.setDia(14);
    java.lang.String var16 = var3.toString();
    int var17 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "103/02/0102"+ "'", var8.equals("103/02/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "14/02/0102"+ "'", var16.equals("14/02/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 14);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test287");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 14, 14);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test288");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getAno();
    int var3 = var0.getAno();
    int var4 = var0.getDia();
    int var5 = var0.getDia();
    int var6 = var0.getDia();
    var0.setAno(107);
    java.lang.String var9 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00/00/0107"+ "'", var9.equals("00/00/0107"));

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test289");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, 1, 13);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test290");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 102, (-1));
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    var3.setDia(104);
    var3.setMes(10);
    int var10 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "02/103/-0001"+ "'", var5.equals("02/103/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test291");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes((-1));
    int var9 = var3.getAno();
    int var10 = var3.getDia();
    int var11 = var3.getDia();
    java.lang.String var12 = var3.toString();
    var3.setMes(105);
    java.lang.String var15 = var3.toString();
    int var16 = var3.getAno();
    int var17 = var3.getMes();
    java.lang.String var18 = var3.toString();
    var3.setDia(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/-01/0000"+ "'", var12.equals("100/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100/105/0000"+ "'", var15.equals("100/105/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100/105/0000"+ "'", var18.equals("100/105/0000"));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test292");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 16, 108);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test293");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setAno(0);
    int var11 = var3.getAno();
    int var12 = var3.getDia();
    var3.setDia(0);
    int var15 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test294");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setMes(0);
    var3.setMes(2);
    var3.setMes(2);
    var3.setDia(103);
    var3.setMes(101);
    var3.setAno(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test295");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 103, 105);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test296");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(9, 12, 17);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test297");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 1, 1);
    var3.setMes((-1));
    int var6 = var3.getDia();
    var3.setDia(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test298");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 12, 109);
    var3.setAno(9);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test299");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 11, 12);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    var3.setDia(110);
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/12/0012"+ "'", var5.equals("100/12/0012"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 110);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test300");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 10, 10);
    var3.setAno(11);
    var3.setAno(102);
    int var8 = var3.getDia();
    var3.setDia(11);
    int var11 = var3.getAno();
    java.lang.String var12 = var3.toString();
    int var13 = var3.getDia();
    int var14 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "11/11/0102"+ "'", var12.equals("11/11/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 11);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test301");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 2, 14);
    java.lang.String var4 = var3.toString();
    var3.setMes(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "104/03/0014"+ "'", var4.equals("104/03/0014"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test302");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 10, 2);
    var3.setAno(102);
    int var6 = var3.getDia();
    int var7 = var3.getDia();
    var3.setAno(5);
    var3.setAno(11);
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    java.lang.String var14 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00/11/0011"+ "'", var12.equals("00/11/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00/11/0011"+ "'", var13.equals("00/11/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/11/0011"+ "'", var14.equals("00/11/0011"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test303");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getAno();
    java.lang.String var3 = var0.toString();
    int var4 = var0.getMes();
    var0.setAno(0);
    var0.setDia(4);
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00/00/0000"+ "'", var3.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "04/00/0000"+ "'", var9.equals("04/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "04/00/0000"+ "'", var10.equals("04/00/0000"));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test304");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    var3.setMes(2);
    java.lang.String var12 = var3.toString();
    int var13 = var3.getMes();
    int var14 = var3.getMes();
    int var15 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10/-01/0001"+ "'", var9.equals("10/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10/02/0001"+ "'", var12.equals("10/02/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test305");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 10, 16);
    var3.setDia(11);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "11/11/0016"+ "'", var6.equals("11/11/0016"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test306");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(7, 14, 5);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test307");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 1);
    var3.setDia(101);
    int var6 = var3.getDia();
    var3.setMes(100);
    var3.setMes(10);
    int var11 = var3.getDia();
    int var12 = var3.getDia();
    java.lang.String var13 = var3.toString();
    java.lang.String var14 = var3.toString();
    int var15 = var3.getDia();
    var3.setMes(17);
    var3.setDia(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "101/10/0001"+ "'", var13.equals("101/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "101/10/0001"+ "'", var14.equals("101/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 101);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test308");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 110, 102);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test309");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(10);
    int var7 = var3.getMes();
    var3.setAno(102);
    java.lang.String var10 = var3.toString();
    var3.setAno(8);
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10/00/0102"+ "'", var10.equals("10/00/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/00/0008"+ "'", var13.equals("10/00/0008"));

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test310");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 1, 2);
    var3.setAno(2);
    java.lang.String var6 = var3.toString();
    var3.setMes(7);
    var3.setAno(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "101/02/0002"+ "'", var6.equals("101/02/0002"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test311");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 12, 10);
    var3.setDia(3);
    var3.setDia(5);
    var3.setAno(1);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test312");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 101);
    int var4 = var3.getMes();
    var3.setMes(102);
    var3.setDia(10);
    int var9 = var3.getAno();
    var3.setDia(105);
    var3.setMes(8);
    var3.setDia(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test313");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setAno(2);
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    int var12 = var3.getMes();
    var3.setAno(104);
    java.lang.String var15 = var3.toString();
    int var16 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00/00/0104"+ "'", var15.equals("00/00/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test314");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    var3.setDia((-1));
    var3.setAno((-1));
    int var10 = var3.getMes();
    int var11 = var3.getMes();
    var3.setMes(2);
    int var14 = var3.getAno();
    var3.setAno(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test315");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 1);
    int var4 = var3.getAno();
    var3.setMes(104);
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "02/104/0001"+ "'", var7.equals("02/104/0001"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test316");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 14, 109);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 109);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test317");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 101, 101);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test318");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getAno();
    var0.setDia(10);
    var0.setDia(5);
    var0.setMes(13);
    var0.setMes(100);
    var0.setDia(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test319");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getMes();
    var3.setMes(101);
    var3.setDia((-1));
    var3.setMes((-1));
    java.lang.String var15 = var3.toString();
    int var16 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01/-01/0000"+ "'", var15.equals("-01/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test320");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 111, 105);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test321");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 1, (-1));
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    var3.setMes(14);
    var3.setMes(103);
    int var10 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 103);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test322");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 10, 2);
    var3.setAno(104);
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    int var8 = var3.getDia();
    int var9 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 104);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test323");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 101, 105);
    var3.setMes(6);
    var3.setDia(101);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test324");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getMes();
    var3.setAno(2);
    int var13 = var3.getMes();
    var3.setDia(103);
    var3.setAno(104);
    int var18 = var3.getMes();
    int var19 = var3.getDia();
    var3.setAno(3);
    int var22 = var3.getMes();
    int var23 = var3.getDia();
    java.lang.String var24 = var3.toString();
    int var25 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "103/-01/0003"+ "'", var24.equals("103/-01/0003"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 103);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test325");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getDia();
    var0.setMes(101);
    int var7 = var0.getDia();
    var0.setMes((-1));
    int var10 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test326");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 0);
    var3.setMes(102);
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    int var8 = var3.getAno();
    var3.setAno(104);
    var3.setDia(100);
    int var13 = var3.getDia();
    int var14 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test327");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 101, 107);
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "14/102/0107"+ "'", var5.equals("14/102/0107"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test328");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 101, 0);
    int var4 = var3.getMes();
    var3.setMes(8);
    var3.setMes(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test329");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 100, 14);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test330");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 2, 1);
    var3.setMes(105);
    var3.setMes(13);
    var3.setDia(110);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test331");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, 18, 9);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test332");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 17, 106);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test333");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getMes();
    var0.setMes(2);
    int var7 = var0.getAno();
    var0.setAno(103);
    var0.setDia(100);
    java.lang.String var12 = var0.toString();
    var0.setMes(15);
    var0.setMes(106);
    int var17 = var0.getDia();
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/02/0103"+ "'", var12.equals("100/02/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100/106/0103"+ "'", var18.equals("100/106/0103"));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test334");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 15, 101);
    int var4 = var3.getDia();
    var3.setDia(3);
    int var7 = var3.getDia();
    var3.setAno(107);
    var3.setDia(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test335");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 0);
    var3.setDia(101);
    var3.setDia(0);
    int var8 = var3.getDia();
    int var9 = var3.getAno();
    var3.setMes(2);
    java.lang.String var12 = var3.toString();
    var3.setAno(16);
    var3.setDia(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00/02/0000"+ "'", var12.equals("00/02/0000"));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test336");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 5, 3);
    int var4 = var3.getAno();
    var3.setDia(11);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test337");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getMes();
    var3.setDia(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test338");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 2, 103);
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    var3.setDia(11);
    var3.setMes(100);
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "11/100/0103"+ "'", var10.equals("11/100/0103"));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test339");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 2, 10);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "12/03/0010"+ "'", var4.equals("12/03/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test340");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 102, 11);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "102/103/0011"+ "'", var5.equals("102/103/0011"));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test341");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 4, 0);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test342");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    var3.setDia(100);
    int var12 = var3.getDia();
    int var13 = var3.getAno();
    var3.setAno(1);
    int var16 = var3.getMes();
    java.lang.String var17 = var3.toString();
    int var18 = var3.getAno();
    int var19 = var3.getMes();
    var3.setDia(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100/00/0001"+ "'", var17.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test343");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 10, 2);
    var3.setMes(5);
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 104);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test344");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    var3.setMes(1);
    var3.setMes(102);
    var3.setAno(101);
    var3.setAno(2);
    java.lang.String var17 = var3.toString();
    int var18 = var3.getMes();
    var3.setAno(13);
    
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
    assertTrue("'" + var17 + "' != '" + "100/102/0002"+ "'", var17.equals("100/102/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 102);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test345");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    var3.setMes(10);
    int var12 = var3.getAno();
    java.lang.String var13 = var3.toString();
    var3.setAno(0);
    java.lang.String var16 = var3.toString();
    int var17 = var3.getDia();
    
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
    assertTrue("'" + var9 + "' != '" + "100/00/0000"+ "'", var9.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/10/0000"+ "'", var13.equals("100/10/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "100/10/0000"+ "'", var16.equals("100/10/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test346");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    var3.setMes(0);
    int var13 = var3.getDia();
    var3.setAno((-1));
    int var16 = var3.getDia();
    int var17 = var3.getAno();
    var3.setAno((-1));
    var3.setAno(10);
    java.lang.String var22 = var3.toString();
    var3.setDia(3);
    var3.setAno(14);
    int var27 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00/00/0000"+ "'", var9.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "00/00/0010"+ "'", var22.equals("00/00/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test347");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 0, (-1));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test348");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 0, (-1));
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    var3.setDia(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test349");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    java.lang.String var4 = var3.toString();
    var3.setMes(11);
    int var7 = var3.getMes();
    var3.setMes(100);
    int var10 = var3.getDia();
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    var3.setDia(104);
    java.lang.String var15 = var3.toString();
    int var16 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/01/0002"+ "'", var4.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "104/100/0002"+ "'", var15.equals("104/100/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test350");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setMes(101);
    int var11 = var3.getAno();
    int var12 = var3.getAno();
    var3.setMes(11);
    int var15 = var3.getDia();
    int var16 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test351");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 108, 103);
    int var4 = var3.getDia();
    var3.setMes(111);
    var3.setDia(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 6);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test352");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 11, 100);
    java.lang.String var4 = var3.toString();
    var3.setMes(105);
    int var7 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "11/12/0100"+ "'", var4.equals("11/12/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test353");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 1, 10);
    var3.setDia(2);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getAno();
    var3.setAno(101);
    var3.setAno(2);
    java.lang.String var12 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "02/02/0010"+ "'", var6.equals("02/02/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "02/02/0002"+ "'", var12.equals("02/02/0002"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test354");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(19, 15, 4);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "19/16/0004"+ "'", var4.equals("19/16/0004"));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test355");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    var3.setDia(101);
    int var11 = var3.getMes();
    int var12 = var3.getDia();
    int var13 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(106);
    int var18 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/10/0001"+ "'", var8.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 106);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test356");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 3, 16);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 105);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test357");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 11, 14);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test358");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    java.lang.String var10 = var3.toString();
    int var11 = var3.getAno();
    var3.setMes(3);
    var3.setMes(108);
    int var16 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00/00/0000"+ "'", var10.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test359");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setMes(0);
    int var9 = var3.getDia();
    var3.setMes(100);
    int var12 = var3.getAno();
    var3.setAno(100);
    var3.setMes(1);
    java.lang.String var17 = var3.toString();
    var3.setDia(110);
    var3.setDia(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10/01/0100"+ "'", var17.equals("10/01/0100"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test360");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 2, 3);
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test361");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 102, 13);
    int var4 = var3.getDia();
    var3.setMes(17);
    var3.setAno(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test362");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    var3.setAno(101);
    int var9 = var3.getMes();
    var3.setDia(14);
    java.lang.String var12 = var3.toString();
    var3.setMes(100);
    var3.setMes(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "14/101/0101"+ "'", var12.equals("14/101/0101"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test363");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 3, 10);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 4);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test364");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 100);
    int var4 = var3.getAno();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test365");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 0);
    var3.setMes(102);
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    int var8 = var3.getAno();
    var3.setAno(104);
    var3.setDia(100);
    int var13 = var3.getDia();
    var3.setMes(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test366");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 2, 107);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test367");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    int var10 = var3.getMes();
    var3.setAno(102);
    var3.setAno(1);
    int var15 = var3.getAno();
    var3.setDia(100);
    var3.setMes(4);
    int var20 = var3.getAno();
    int var21 = var3.getDia();
    int var22 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test368");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 104, 103);
    var3.setAno(108);
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test369");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, 11);
    var3.setDia(104);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test370");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 1, 108);
    var3.setAno(0);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test371");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 0, 100);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test372");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 17, 10);
    var3.setAno(1);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test373");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 101);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getAno();
    int var10 = var3.getAno();
    var3.setAno(6);
    int var13 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/02/0101"+ "'", var8.equals("100/02/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 6);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test374");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 102, 1);
    var3.setAno(100);
    var3.setDia(10);
    int var8 = var3.getMes();
    var3.setAno(0);
    int var11 = var3.getDia();
    int var12 = var3.getDia();
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/103/0000"+ "'", var13.equals("10/103/0000"));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test375");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 101, 105);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    var3.setAno(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 105);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test376");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    int var10 = var3.getMes();
    var3.setDia(0);
    int var13 = var3.getAno();
    int var14 = var3.getAno();
    int var15 = var3.getAno();
    int var16 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test377");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 10, 0);
    var3.setAno(103);
    var3.setAno(1);
    var3.setDia(11);
    var3.setMes(14);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test378");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 100, 106);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test379");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    var3.setAno(3);
    var3.setAno(0);
    
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

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test380");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 2, 104);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test381");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, (-1), 13);
    int var4 = var3.getDia();
    int var5 = var3.getAno();
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 14);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test382");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 16, 9);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test383");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 105, 13);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "03/106/0013"+ "'", var4.equals("03/106/0013"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 106);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test384");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, (-1), 107);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test385");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes((-1));
    var3.setDia(101);
    int var11 = var3.getDia();
    var3.setAno(104);
    java.lang.String var14 = var3.toString();
    var3.setAno(1);
    int var17 = var3.getAno();
    java.lang.String var18 = var3.toString();
    java.lang.String var19 = var3.toString();
    java.lang.String var20 = var3.toString();
    var3.setAno(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "101/-01/0104"+ "'", var14.equals("101/-01/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "101/-01/0001"+ "'", var18.equals("101/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "101/-01/0001"+ "'", var19.equals("101/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "101/-01/0001"+ "'", var20.equals("101/-01/0001"));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test386");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setMes(2);
    var3.setMes(11);
    var3.setDia(10);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    var3.setDia(1);
    java.lang.String var14 = var3.toString();
    int var15 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10/11/0000"+ "'", var10.equals("10/11/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10/11/0000"+ "'", var11.equals("10/11/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "01/11/0000"+ "'", var14.equals("01/11/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test387");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 109, 110);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 110);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test388");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    int var8 = var3.getAno();
    int var9 = var3.getAno();
    var3.setMes(10);
    int var12 = var3.getAno();
    java.lang.String var13 = var3.toString();
    int var14 = var3.getDia();
    int var15 = var3.getAno();
    var3.setAno(1);
    int var18 = var3.getDia();
    var3.setMes(10);
    var3.setAno(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/10/0000"+ "'", var13.equals("100/10/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test389");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(10);
    var3.setMes(10);
    int var10 = var3.getDia();
    var3.setAno((-1));
    int var13 = var3.getMes();
    int var14 = var3.getAno();
    var3.setDia(2);
    int var17 = var3.getAno();
    int var18 = var3.getAno();
    var3.setDia(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test390");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    int var8 = var3.getAno();
    var3.setDia(1);
    int var11 = var3.getDia();
    int var12 = var3.getDia();
    var3.setDia(102);
    var3.setMes(100);
    java.lang.String var17 = var3.toString();
    java.lang.String var18 = var3.toString();
    int var19 = var3.getMes();
    int var20 = var3.getAno();
    int var21 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "102/100/0000"+ "'", var17.equals("102/100/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "102/100/0000"+ "'", var18.equals("102/100/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 102);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test391");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 3, 15);
    var3.setMes(107);
    var3.setMes(108);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test392");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 102, 16);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test393");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getMes();
    var3.setDia((-1));
    int var13 = var3.getMes();
    var3.setDia(10);
    int var16 = var3.getDia();
    java.lang.String var17 = var3.toString();
    int var18 = var3.getDia();
    java.lang.String var19 = var3.toString();
    var3.setAno(13);
    var3.setDia(104);
    var3.setAno(103);
    var3.setMes(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10/-01/0000"+ "'", var17.equals("10/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10/-01/0000"+ "'", var19.equals("10/-01/0000"));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test394");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 102, 100);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getDia();
    var3.setMes(1);
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test395");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    var3.setDia(1);
    var3.setDia(100);
    var3.setAno(1);
    int var17 = var3.getDia();
    java.lang.String var18 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100/00/0001"+ "'", var18.equals("100/00/0001"));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test396");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 5, 13);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    var3.setMes(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test397");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(111, 106, 12);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test398");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 13, 4);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test399");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 1, 2);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test400");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(10);
    int var11 = var3.getAno();
    var3.setDia(1);
    int var14 = var3.getAno();
    int var15 = var3.getMes();
    var3.setDia((-1));
    java.lang.String var18 = var3.toString();
    java.lang.String var19 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "-01/-01/0010"+ "'", var18.equals("-01/-01/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "-01/-01/0010"+ "'", var19.equals("-01/-01/0010"));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test401");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 105, 8);
    var3.setAno(0);
    var3.setDia(18);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test402");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 7, 7);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 7);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test403");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setMes(101);
    var3.setDia(102);
    int var16 = var3.getDia();
    java.lang.String var17 = var3.toString();
    var3.setAno(101);
    var3.setAno(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "102/101/0001"+ "'", var17.equals("102/101/0001"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test404");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 6, 12);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test405");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 101, 1);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getDia();
    var3.setMes(103);
    var3.setAno(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/102/0001"+ "'", var4.equals("00/102/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test406");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 100);
    var3.setAno(10);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test407");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(0);
    var3.setAno(10);
    int var13 = var3.getDia();
    var3.setAno(0);
    int var16 = var3.getMes();
    var3.setAno(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test408");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 103, 0);
    int var4 = var3.getMes();
    var3.setDia((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 104);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test409");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    var3.setDia(100);
    var3.setDia(11);
    var3.setAno((-1));
    int var11 = var3.getAno();
    int var12 = var3.getDia();
    java.lang.String var13 = var3.toString();
    var3.setMes(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "11/101/-0001"+ "'", var13.equals("11/101/-0001"));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test410");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    int var13 = var3.getMes();
    int var14 = var3.getAno();
    var3.setAno(9);
    int var17 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test411");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 12, 2);
    var3.setDia(0);
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    java.lang.String var8 = var3.toString();
    var3.setDia(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/13/0002"+ "'", var8.equals("00/13/0002"));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test412");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 1, 19);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test413");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(9, 0, 104);
    var3.setDia(8);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test414");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 101, 10);
    var3.setDia(100);
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test415");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 103, 101);
    java.lang.String var4 = var3.toString();
    var3.setMes(4);
    var3.setDia(1);
    var3.setMes(103);
    var3.setMes(107);
    var3.setDia(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "03/104/0101"+ "'", var4.equals("03/104/0101"));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test416");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    int var9 = var3.getDia();
    var3.setMes(101);
    int var12 = var3.getDia();
    int var13 = var3.getAno();
    int var14 = var3.getMes();
    var3.setAno(101);
    var3.setDia(17);
    var3.setMes(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test417");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 105, 13);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "01/106/0013"+ "'", var6.equals("01/106/0013"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test418");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 106, 106);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test419");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 100, 1);
    int var4 = var3.getMes();
    var3.setMes(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test420");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 11, 19);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test421");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 102, 2);
    var3.setMes(13);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test422");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 3, 11);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test423");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    var3.setAno((-1));
    java.lang.String var13 = var3.toString();
    var3.setMes(11);
    var3.setDia(107);
    var3.setAno(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/00/-0001"+ "'", var13.equals("100/00/-0001"));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test424");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 0, 107);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test425");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 3, 108);
    var3.setDia(8);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test426");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 7, 107);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "13/08/0107"+ "'", var4.equals("13/08/0107"));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test427");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(0);
    var3.setMes(2);
    int var13 = var3.getMes();
    int var14 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test428");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    var3.setAno(10);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getAno();
    var3.setMes(1);
    int var12 = var3.getAno();
    int var13 = var3.getAno();
    var3.setAno(103);
    int var16 = var3.getAno();
    java.lang.String var17 = var3.toString();
    var3.setMes(4);
    java.lang.String var20 = var3.toString();
    int var21 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/100/0010"+ "'", var8.equals("10/100/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10/01/0103"+ "'", var17.equals("10/01/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10/04/0103"+ "'", var20.equals("10/04/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 103);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test429");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setDia(10);
    java.lang.String var9 = var3.toString();
    int var10 = var3.getAno();
    java.lang.String var11 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10/00/0000"+ "'", var9.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10/00/0000"+ "'", var11.equals("10/00/0000"));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test430");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 17, 103);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test431");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 101, 6);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "04/102/0006"+ "'", var4.equals("04/102/0006"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 6);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test432");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 16, 4);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test433");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setDia(10);
    int var14 = var3.getMes();
    var3.setAno(0);
    int var17 = var3.getMes();
    int var18 = var3.getAno();
    int var19 = var3.getAno();
    var3.setDia(105);
    var3.setDia(8);
    var3.setAno(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test434");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    int var11 = var3.getAno();
    java.lang.String var12 = var3.toString();
    var3.setMes((-1));
    var3.setDia((-1));
    var3.setMes(2);
    var3.setMes(10);
    var3.setAno(103);
    int var23 = var3.getDia();
    var3.setMes(101);
    int var26 = var3.getDia();
    var3.setAno(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0000"+ "'", var12.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test435");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setAno(102);
    var3.setAno(2);
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    var3.setAno(101);
    int var16 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0002"+ "'", var12.equals("100/00/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/00/0002"+ "'", var13.equals("100/00/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 101);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test436");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    java.lang.String var12 = var3.toString();
    int var13 = var3.getMes();
    java.lang.String var14 = var3.toString();
    var3.setMes(101);
    var3.setMes(3);
    int var19 = var3.getMes();
    var3.setMes(103);
    var3.setMes(17);
    var3.setAno(111);
    int var26 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0001"+ "'", var12.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "100/00/0001"+ "'", var14.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 111);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test437");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    int var12 = var3.getDia();
    var3.setAno(0);
    int var15 = var3.getMes();
    var3.setMes(101);
    java.lang.String var18 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "00/101/0000"+ "'", var18.equals("00/101/0000"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test438");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 100, 100);
    var3.setDia(12);
    var3.setAno(101);
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test439");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    int var5 = var0.getMes();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMes();
    int var8 = var0.getAno();
    var0.setAno(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00/-01/0000"+ "'", var6.equals("00/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test440");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    var3.setDia(0);
    var3.setAno(107);
    int var12 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 107);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test441");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 6, 12);
    var3.setMes(110);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test442");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 100, 2);
    var3.setMes(100);
    var3.setMes(13);
    int var8 = var3.getAno();
    int var9 = var3.getAno();
    var3.setAno(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test443");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 10, 104);
    int var4 = var3.getDia();
    var3.setAno(16);
    var3.setMes(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test444");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 102, 111);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test445");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(10);
    int var11 = var3.getAno();
    var3.setDia(1);
    int var14 = var3.getDia();
    int var15 = var3.getAno();
    java.lang.String var16 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "01/-01/0010"+ "'", var16.equals("01/-01/0010"));

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test446");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setAno(2);
    java.lang.String var9 = var3.toString();
    int var10 = var3.getDia();
    int var11 = var3.getDia();
    int var12 = var3.getDia();
    var3.setDia(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00/00/0002"+ "'", var9.equals("00/00/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test447");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    int var10 = var3.getMes();
    var3.setMes(10);
    int var13 = var3.getAno();
    int var14 = var3.getDia();
    var3.setAno(12);
    int var17 = var3.getMes();
    var3.setMes(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test448");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, (-1), 14);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test449");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    var3.setAno((-1));
    int var13 = var3.getMes();
    java.lang.String var14 = var3.toString();
    var3.setMes(11);
    int var17 = var3.getDia();
    var3.setAno(13);
    int var20 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
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
    assertTrue("'" + var14 + "' != '" + "00/00/-0001"+ "'", var14.equals("00/00/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test450");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 11, 101);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 12);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test451");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 109, 104);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test452");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, 107, 100);
    var3.setDia(3);
    int var6 = var3.getMes();
    var3.setAno(102);
    var3.setAno(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 108);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test453");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(7, 0, 1);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test454");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getAno();
    var3.setAno(13);
    var3.setDia(3);
    var3.setAno(107);
    int var19 = var3.getMes();
    var3.setDia(101);
    var3.setDia(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/00/0000"+ "'", var10.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/00/0000"+ "'", var11.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test455");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    var3.setAno(10);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getAno();
    var3.setMes(1);
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/100/0010"+ "'", var8.equals("10/100/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10/01/0010"+ "'", var12.equals("10/01/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/01/0010"+ "'", var13.equals("10/01/0010"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test456");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setDia(100);
    var3.setMes(11);
    int var12 = var3.getMes();
    int var13 = var3.getMes();
    var3.setMes(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 11);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test457");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 11, 1);
    var3.setDia(103);
    int var6 = var3.getAno();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "103/12/0001"+ "'", var8.equals("103/12/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 12);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test458");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 103, 1);
    java.lang.String var4 = var3.toString();
    var3.setMes(12);
    java.lang.String var7 = var3.toString();
    int var8 = var3.getDia();
    var3.setAno(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "101/104/0001"+ "'", var4.equals("101/104/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "101/12/0001"+ "'", var7.equals("101/12/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test459");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 15, 14);
    java.lang.String var4 = var3.toString();
    var3.setMes(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "06/16/0014"+ "'", var4.equals("06/16/0014"));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test460");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(19, 103, 15);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test461");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 105, 4);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test462");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    var3.setDia(102);
    var3.setDia(107);
    java.lang.String var11 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "107/102/0002"+ "'", var11.equals("107/102/0002"));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test463");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    var3.setMes(102);
    java.lang.String var15 = var3.toString();
    var3.setAno(11);
    int var18 = var3.getDia();
    var3.setMes(107);
    java.lang.String var21 = var3.toString();
    int var22 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100/102/0000"+ "'", var15.equals("100/102/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "100/107/0011"+ "'", var21.equals("100/107/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test464");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 0, 0);
    var3.setDia(5);
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test465");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 101, 13);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test466");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 102, 1);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test467");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 12, 10);
    int var4 = var3.getAno();
    var3.setDia(103);
    java.lang.String var7 = var3.toString();
    var3.setAno(11);
    var3.setMes(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "103/13/0010"+ "'", var7.equals("103/13/0010"));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test468");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 104, 104);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test469");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 103, 3);
    var3.setDia(100);
    int var6 = var3.getMes();
    var3.setAno(103);
    var3.setMes(102);
    int var11 = var3.getDia();
    int var12 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test470");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setMes(1);
    int var9 = var3.getDia();
    var3.setMes(2);
    int var12 = var3.getDia();
    var3.setMes(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test471");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 1, 2);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test472");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 10, 102);
    int var4 = var3.getDia();
    var3.setDia(110);
    int var7 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test473");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(102);
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    var3.setAno(2);
    java.lang.String var12 = var3.toString();
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "102/102/0001"+ "'", var9.equals("102/102/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "102/102/0002"+ "'", var12.equals("102/102/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 102);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test474");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    int var10 = var3.getMes();
    var3.setAno(0);
    var3.setDia(15);
    int var15 = var3.getDia();
    var3.setDia(103);
    var3.setAno(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 15);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test475");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(7, 4, 15);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 7);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test476");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 12, 104);
    int var4 = var3.getAno();
    int var5 = var3.getDia();
    var3.setAno(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 104);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test477");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setAno(101);
    var3.setDia(2);
    var3.setMes((-1));
    java.lang.String var13 = var3.toString();
    java.lang.String var14 = var3.toString();
    int var15 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "02/-01/0101"+ "'", var13.equals("02/-01/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "02/-01/0101"+ "'", var14.equals("02/-01/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test478");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 10, 101);
    java.lang.String var4 = var3.toString();
    var3.setMes(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "02/11/0101"+ "'", var4.equals("02/11/0101"));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test479");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 100);
    var3.setDia(10);
    int var6 = var3.getDia();
    java.lang.String var7 = var3.toString();
    int var8 = var3.getAno();
    int var9 = var3.getAno();
    int var10 = var3.getAno();
    var3.setAno(1);
    var3.setMes(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10/103/0100"+ "'", var7.equals("10/103/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test480");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setMes(1);
    int var9 = var3.getMes();
    var3.setAno(2);
    int var12 = var3.getMes();
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00/01/0002"+ "'", var13.equals("00/01/0002"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test481");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    java.lang.String var10 = var3.toString();
    var3.setDia(11);
    int var13 = var3.getMes();
    var3.setMes(100);
    var3.setDia(103);
    int var18 = var3.getDia();
    int var19 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/00/0100"+ "'", var10.equals("100/00/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test482");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 15, 8);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test483");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 11, 11);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    var3.setDia(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "11/12/0011"+ "'", var5.equals("11/12/0011"));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test484");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 3, 101);
    var3.setDia((-1));
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test485");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 4, 0);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test486");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 11, 2);
    var3.setDia(101);
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 12);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test487");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 0, 0);
    int var4 = var3.getDia();
    var3.setAno(0);
    int var7 = var3.getAno();
    int var8 = var3.getAno();
    int var9 = var3.getAno();
    var3.setDia(101);
    int var12 = var3.getAno();
    var3.setAno(4);
    var3.setDia(102);
    var3.setMes(107);
    var3.setMes(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test488");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 10, 12);
    var3.setAno(10);
    int var6 = var3.getAno();
    var3.setMes(101);
    var3.setDia(1);
    int var11 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test489");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    var0.setDia(102);
    var0.setDia(103);
    int var8 = var0.getAno();
    int var9 = var0.getDia();
    int var10 = var0.getMes();
    var0.setAno(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test490");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 5, 107);
    int var4 = var3.getAno();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    var3.setMes(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 6);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test491");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 103, 101);
    var3.setDia(3);
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    var3.setDia(4);
    var3.setMes(15);
    java.lang.String var12 = var3.toString();
    int var13 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "04/15/0101"+ "'", var12.equals("04/15/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 15);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test492");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    var3.setMes(10);
    int var12 = var3.getAno();
    java.lang.String var13 = var3.toString();
    var3.setAno(102);
    var3.setDia(4);
    var3.setDia(2);
    var3.setMes(102);
    var3.setMes(11);
    var3.setAno(109);
    
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
    assertTrue("'" + var9 + "' != '" + "100/00/0000"+ "'", var9.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/10/0000"+ "'", var13.equals("100/10/0000"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test493");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 105, 1);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 106);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test494");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 104, 100);
    int var4 = var3.getAno();
    var3.setAno(2);
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test495");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0001"+ "'", var8.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test496");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 13, 11);
    int var4 = var3.getMes();
    var3.setAno(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test497");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    var3.setMes(100);
    int var11 = var3.getMes();
    var3.setMes(2);
    int var14 = var3.getAno();
    int var15 = var3.getMes();
    java.lang.String var16 = var3.toString();
    var3.setAno(8);
    
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
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "100/02/0000"+ "'", var16.equals("100/02/0000"));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test498");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 16, 7);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 8);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test499");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getDia();
    int var13 = var3.getMes();
    var3.setAno(103);
    java.lang.String var16 = var3.toString();
    var3.setAno(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/00/0000"+ "'", var11.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "100/00/0103"+ "'", var16.equals("100/00/0103"));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro41.test500");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 108, 108);
    var3.setDia(11);
    var3.setDia(12);

  }

}
