package randoop;

import junit.framework.*;

public class DataDoEncontro62 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test1");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, (-1));
    java.lang.String var4 = var3.toString();
    var3.setMes(101);
    java.lang.String var7 = var3.toString();
    var3.setAno(101);
    int var10 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/101/-0001"+ "'", var4.equals("10/101/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10/101/-0001"+ "'", var7.equals("10/101/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test2");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 102, 1);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    var3.setDia(101);
    var3.setDia(102);
    var3.setAno(13);
    int var12 = var3.getMes();
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "102/103/0013"+ "'", var13.equals("102/103/0013"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test3");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(0);
    var3.setDia(1);
    java.lang.String var13 = var3.toString();
    int var14 = var3.getAno();
    var3.setDia(15);
    int var17 = var3.getMes();
    var3.setDia(1);
    var3.setDia(18);
    var3.setAno(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01/00/0000"+ "'", var13.equals("01/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test4");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setMes(0);
    var3.setMes(2);
    var3.setMes(103);
    var3.setMes(101);
    java.lang.String var15 = var3.toString();
    var3.setAno(10);
    java.lang.String var18 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10/101/0001"+ "'", var15.equals("10/101/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10/101/0010"+ "'", var18.equals("10/101/0010"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test5");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 103, 12);
    var3.setAno(3);
    int var6 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test6");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 12, 0);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    var3.setAno(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01/13/0000"+ "'", var5.equals("-01/13/0000"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test7");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 100, 8);
    var3.setDia(2);
    var3.setDia(16);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test8");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 108, 109);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test9");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 102, 104);
    var3.setDia(15);
    var3.setMes(107);
    var3.setDia(104);
    int var10 = var3.getMes();
    int var11 = var3.getMes();
    var3.setDia(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 107);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test10");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 102, 11);
    int var4 = var3.getAno();
    var3.setAno(16);
    int var7 = var3.getDia();
    int var8 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 103);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test11");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 0, 2);
    var3.setDia(0);
    int var6 = var3.getDia();
    int var7 = var3.getAno();
    int var8 = var3.getDia();
    java.lang.String var9 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00/01/0002"+ "'", var9.equals("00/01/0002"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test12");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 100, 13);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 101);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test13");


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
    int var15 = var3.getAno();
    var3.setAno(102);
    var3.setAno(16);
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
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01/00/0000"+ "'", var13.equals("01/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test14");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 7, 20);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test15");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 2, 10);
    int var4 = var3.getDia();
    var3.setDia(3);
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    var3.setDia(17);
    var3.setMes(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test16");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    int var10 = var3.getMes();
    var3.setAno(102);
    var3.setDia(10);
    int var15 = var3.getMes();
    int var16 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 102);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test17");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setMes(1);
    var3.setAno(0);
    var3.setMes((-1));
    int var13 = var3.getDia();
    int var14 = var3.getDia();
    int var15 = var3.getAno();
    java.lang.String var16 = var3.toString();
    var3.setDia(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00/-01/0000"+ "'", var16.equals("00/-01/0000"));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test18");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(1);
    var3.setDia(100);
    var3.setDia(10);
    int var15 = var3.getAno();
    int var16 = var3.getDia();
    int var17 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test19");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, (-1));
    java.lang.String var4 = var3.toString();
    var3.setMes(101);
    java.lang.String var7 = var3.toString();
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/101/-0001"+ "'", var4.equals("10/101/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10/101/-0001"+ "'", var7.equals("10/101/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test20");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, (-1), 110);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test21");


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
    var3.setMes(10);
    
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

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test22");


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
    int var19 = var3.getDia();
    int var20 = var3.getDia();
    int var21 = var3.getMes();
    
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
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 11);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test23");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(9, (-1), 8);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test24");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getAno();
    java.lang.String var9 = var3.toString();
    
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
    assertTrue("'" + var9 + "' != '" + "100/00/0000"+ "'", var9.equals("100/00/0000"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test25");


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
    int var14 = var3.getMes();
    int var15 = var3.getAno();
    var3.setDia(1);
    int var18 = var3.getAno();
    int var19 = var3.getAno();
    var3.setMes(10);
    
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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test26");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 102, 1);
    var3.setAno(100);
    var3.setDia(10);
    int var8 = var3.getAno();
    var3.setAno(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test27");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, (-1), 5);
    var3.setAno(4);
    var3.setMes(100);
    int var8 = var3.getMes();
    int var9 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test28");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 10, 2);
    var3.setAno(104);
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 104);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test29");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 1, 4);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test30");


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
    java.lang.String var23 = var3.toString();
    var3.setDia(103);
    var3.setDia(0);
    var3.setMes((-1));
    
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
    assertTrue("'" + var23 + "' != '" + "-01/10/0103"+ "'", var23.equals("-01/10/0103"));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test31");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    int var8 = var3.getAno();
    var3.setDia(1);
    int var11 = var3.getDia();
    int var12 = var3.getDia();
    var3.setDia(14);
    
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

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test32");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(10);
    var3.setMes(10);
    var3.setMes((-1));
    var3.setDia(10);
    int var14 = var3.getDia();
    int var15 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test33");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    java.lang.String var10 = var3.toString();
    var3.setAno(2);
    var3.setMes(0);
    int var15 = var3.getMes();
    int var16 = var3.getAno();
    var3.setMes(17);
    
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
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test34");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setDia(10);
    int var8 = var3.getDia();
    var3.setDia(2);
    var3.setDia(1);
    int var13 = var3.getAno();
    var3.setMes(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test35");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(100);
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    var0.setMes(0);
    int var10 = var0.getDia();
    int var11 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00/-01/0100"+ "'", var6.equals("00/-01/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/-01/0100"+ "'", var7.equals("00/-01/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test36");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 12, 0);
    var3.setDia(7);
    var3.setDia(17);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test37");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 10, 12);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test38");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 5, 4);
    var3.setAno(6);
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    var3.setDia(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 6);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test39");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 6, 4);
    int var4 = var3.getDia();
    var3.setAno(109);
    int var7 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 4);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test40");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setAno(101);
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    var3.setAno(2);
    int var13 = var3.getAno();
    var3.setAno(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test41");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    java.lang.String var10 = var3.toString();
    var3.setMes(10);
    int var13 = var3.getMes();
    int var14 = var3.getAno();
    var3.setAno(102);
    int var17 = var3.getMes();
    int var18 = var3.getDia();
    var3.setDia(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/00/0000"+ "'", var10.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test42");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    int var10 = var3.getMes();
    var3.setAno(2);
    int var13 = var3.getAno();
    int var14 = var3.getMes();
    int var15 = var3.getMes();
    var3.setMes(6);
    var3.setAno(10);
    var3.setAno(109);
    
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
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test43");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 1, 101);
    var3.setAno(10);
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test44");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getAno();
    var0.setDia(10);
    int var6 = var0.getMes();
    var0.setDia(0);
    int var9 = var0.getAno();
    var0.setMes(1);
    int var12 = var0.getMes();
    int var13 = var0.getAno();
    int var14 = var0.getMes();
    int var15 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test45");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 12, 13);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 13);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test46");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 1, (-1));
    var3.setDia(106);
    int var6 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test47");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setDia((-1));
    int var9 = var3.getDia();
    int var10 = var3.getMes();
    var3.setMes(2);
    int var13 = var3.getDia();
    int var14 = var3.getDia();
    var3.setAno(2);
    var3.setAno(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test48");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    var3.setAno(10);
    var3.setMes(103);
    var3.setMes(105);
    java.lang.String var12 = var3.toString();
    int var13 = var3.getMes();
    var3.setAno(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10/105/0010"+ "'", var12.equals("10/105/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 105);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test49");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 11, (-1));
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    var3.setMes(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test50");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    var3.setMes(101);
    var3.setAno(102);
    var3.setAno(13);
    var3.setAno(5);
    int var20 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test51");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, (-1), 0);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "105/00/0000"+ "'", var5.equals("105/00/0000"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test52");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    var3.setDia((-1));
    var3.setAno((-1));
    int var10 = var3.getDia();
    int var11 = var3.getDia();
    java.lang.String var12 = var3.toString();
    var3.setDia(3);
    int var15 = var3.getAno();
    int var16 = var3.getDia();
    var3.setDia(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01/100/-0001"+ "'", var12.equals("-01/100/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 3);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test53");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 11, 1);
    var3.setDia(12);
    int var6 = var3.getDia();
    var3.setMes(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 12);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test54");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 10, 103);
    var3.setDia(2);
    var3.setDia(15);
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 103);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test55");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    int var4 = var3.getDia();
    var3.setMes((-1));
    int var7 = var3.getAno();
    var3.setMes(12);
    var3.setMes(3);
    var3.setMes(100);
    int var14 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test56");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setDia(101);
    var3.setMes(1);
    var3.setDia(13);
    var3.setDia(103);
    var3.setMes(11);
    var3.setMes(104);
    int var21 = var3.getDia();
    int var22 = var3.getMes();
    
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
    assertTrue(var21 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 104);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test57");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setMes(1);
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    int var12 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test58");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 2, 10);
    int var4 = var3.getAno();
    var3.setMes(101);
    var3.setDia(13);
    java.lang.String var9 = var3.toString();
    var3.setMes(5);
    int var12 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "13/101/0010"+ "'", var9.equals("13/101/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test59");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 100, 15);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 15);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test60");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getAno();
    var0.setAno(103);
    var0.setDia(100);
    var0.setDia(12);
    int var10 = var0.getDia();
    var0.setDia(12);
    int var13 = var0.getAno();
    var0.setAno(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 103);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test61");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 10, 3);
    var3.setDia(19);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test62");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setAno(0);
    int var14 = var3.getAno();
    int var15 = var3.getAno();
    var3.setMes(10);
    java.lang.String var18 = var3.toString();
    java.lang.String var19 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100/10/0000"+ "'", var18.equals("100/10/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "100/10/0000"+ "'", var19.equals("100/10/0000"));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test63");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, (-1), 106);
    int var4 = var3.getAno();
    var3.setDia(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 106);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test64");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(20, 7, 6);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test65");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 1, 111);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test66");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, (-1), 0);
    var3.setMes(0);
    int var6 = var3.getAno();
    var3.setAno(3);
    var3.setDia(104);
    int var11 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 3);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test67");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 103, 12);
    var3.setAno(3);
    var3.setDia(8);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test68");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    int var10 = var3.getMes();
    var3.setAno(101);
    var3.setDia(0);
    int var15 = var3.getMes();
    int var16 = var3.getDia();
    var3.setDia(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test69");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(100);
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    var3.setDia(102);
    int var14 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test70");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getMes();
    var3.setAno(2);
    var3.setMes(102);
    int var15 = var3.getMes();
    int var16 = var3.getMes();
    int var17 = var3.getDia();
    var3.setMes(109);
    
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
    assertTrue(var15 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test71");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 20, 110);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test72");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 101, 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setDia(101);
    var3.setAno(104);
    int var11 = var3.getAno();
    var3.setAno(2);
    int var14 = var3.getAno();
    int var15 = var3.getAno();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test73");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 102, 2);
    int var4 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(15);
    int var9 = var3.getAno();
    int var10 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test74");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 102, 2);
    var3.setMes(3);
    int var6 = var3.getMes();
    var3.setAno(14);
    int var9 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test75");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getAno();
    var0.setDia(10);
    var0.setAno(102);
    int var8 = var0.getMes();
    var0.setMes(102);
    java.lang.String var11 = var0.toString();
    int var12 = var0.getAno();
    var0.setMes(12);
    var0.setDia(101);
    var0.setDia(4);
    int var19 = var0.getDia();
    int var20 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10/102/0102"+ "'", var11.equals("10/102/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 102);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test76");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 102, 102);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "108/103/0102"+ "'", var4.equals("108/103/0102"));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test77");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 11, 103);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    var3.setAno(104);
    var3.setAno(15);
    int var10 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "101/12/0103"+ "'", var4.equals("101/12/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test78");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 9, 105);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test79");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, (-1), (-1));
    var3.setMes(0);
    var3.setMes(101);
    var3.setDia(4);
    var3.setAno(12);
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    java.lang.String var14 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "04/101/0012"+ "'", var12.equals("04/101/0012"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "04/101/0012"+ "'", var13.equals("04/101/0012"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "04/101/0012"+ "'", var14.equals("04/101/0012"));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test80");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    var3.setDia(100);
    var3.setDia(100);
    var3.setMes((-1));
    int var11 = var3.getMes();
    int var12 = var3.getDia();
    int var13 = var3.getDia();
    int var14 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test81");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 1);
    var3.setDia(101);
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    var3.setAno(104);
    var3.setAno(100);
    int var12 = var3.getAno();
    int var13 = var3.getMes();
    java.lang.String var14 = var3.toString();
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "101/103/0100"+ "'", var14.equals("101/103/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "101/103/0100"+ "'", var15.equals("101/103/0100"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test82");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 102, 105);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test83");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(9, 9, 16);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test84");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 11, 12);
    int var4 = var3.getMes();
    var3.setMes(17);
    var3.setMes(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test85");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 19, 104);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test86");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, 100);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    int var7 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/101/0100"+ "'", var4.equals("100/101/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/101/0100"+ "'", var5.equals("100/101/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100/101/0100"+ "'", var6.equals("100/101/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test87");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 0, 0);
    var3.setMes(0);
    var3.setMes(0);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    java.lang.String var10 = var3.toString();
    var3.setAno(0);
    java.lang.String var13 = var3.toString();
    int var14 = var3.getAno();
    var3.setAno(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/00/0000"+ "'", var8.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10/00/0000"+ "'", var10.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/00/0000"+ "'", var13.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test88");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 102, 10);
    int var4 = var3.getAno();
    var3.setAno(101);
    var3.setAno(1);
    var3.setAno(1);
    var3.setAno((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test89");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 104, 100);
    var3.setDia(101);
    var3.setDia(7);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test90");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 102, 100);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    var3.setAno(101);
    int var8 = var3.getMes();
    var3.setMes(7);
    java.lang.String var11 = var3.toString();
    int var12 = var3.getDia();
    var3.setAno(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "102/103/0100"+ "'", var4.equals("102/103/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "102/07/0101"+ "'", var11.equals("102/07/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test91");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    java.lang.String var11 = var3.toString();
    var3.setAno(10);
    int var14 = var3.getDia();
    var3.setMes(110);
    
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
    assertTrue(var14 == 0);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test92");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 8, 3);
    var3.setAno(6);
    var3.setAno(105);
    var3.setMes((-1));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test93");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(10);
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    var3.setAno(102);
    int var15 = var3.getMes();
    var3.setMes(0);
    java.lang.String var18 = var3.toString();
    var3.setAno(12);
    var3.setMes(106);
    int var23 = var3.getDia();
    var3.setDia(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100/00/0102"+ "'", var18.equals("100/00/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test94");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    java.lang.String var4 = var3.toString();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/00/0000"+ "'", var4.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0001"+ "'", var8.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test95");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getMes();
    var3.setAno(0);
    var3.setAno(10);
    var3.setAno(10);
    int var17 = var3.getAno();
    java.lang.String var18 = var3.toString();
    int var19 = var3.getMes();
    java.lang.String var20 = var3.toString();
    
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
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "00/00/0010"+ "'", var18.equals("00/00/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "00/00/0010"+ "'", var20.equals("00/00/0010"));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test96");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    var3.setDia(102);
    var3.setDia(101);
    java.lang.String var11 = var3.toString();
    var3.setDia((-1));
    int var14 = var3.getAno();
    var3.setAno(1);
    var3.setAno(14);
    var3.setAno(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "101/102/0002"+ "'", var11.equals("101/102/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test97");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getMes();
    var0.setMes(2);
    int var7 = var0.getAno();
    var0.setAno(103);
    var0.setDia(100);
    var0.setDia(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test98");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setDia((-1));
    int var11 = var3.getMes();
    var3.setAno(6);
    
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

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test99");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 2, 12);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    java.lang.String var7 = var3.toString();
    var3.setDia(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "104/03/0012"+ "'", var4.equals("104/03/0012"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "104/03/0012"+ "'", var7.equals("104/03/0012"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test100");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 11, 103);
    var3.setMes(0);
    int var6 = var3.getDia();
    var3.setDia(2);
    var3.setMes(2);
    var3.setDia(104);
    var3.setAno(8);
    java.lang.String var15 = var3.toString();
    var3.setDia(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "104/02/0008"+ "'", var15.equals("104/02/0008"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test101");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 2, 10);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    var3.setMes(2);
    var3.setAno(1);
    int var10 = var3.getAno();
    int var11 = var3.getDia();
    var3.setMes(7);
    int var14 = var3.getMes();
    var3.setAno(5);
    java.lang.String var17 = var3.toString();
    var3.setMes(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/03/0010"+ "'", var4.equals("00/03/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00/03/0010"+ "'", var5.equals("00/03/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00/07/0005"+ "'", var17.equals("00/07/0005"));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test102");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, (-1), 102);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    var3.setDia(102);
    int var8 = var3.getMes();
    var3.setAno(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test103");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getMes();
    var3.setAno(1);
    java.lang.String var10 = var3.toString();
    int var11 = var3.getMes();
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    var3.setMes(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/100/0001"+ "'", var6.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10/100/0001"+ "'", var10.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10/100/0001"+ "'", var12.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/100/0001"+ "'", var13.equals("10/100/0001"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test104");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(100);
    int var11 = var3.getAno();
    var3.setDia(2);
    var3.setDia(102);
    int var16 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test105");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 2, (-1));
    int var4 = var3.getMes();
    var3.setAno(3);
    int var7 = var3.getMes();
    var3.setAno(7);
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "103/03/0007"+ "'", var10.equals("103/03/0007"));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test106");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 11, 101);
    var3.setDia((-1));
    var3.setAno(12);
    java.lang.String var8 = var3.toString();
    var3.setMes(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01/12/0012"+ "'", var8.equals("-01/12/0012"));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test107");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 0, 10);
    var3.setAno(10);
    int var6 = var3.getAno();
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    int var9 = var3.getDia();
    var3.setAno(15);
    var3.setDia(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test108");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 103, 110);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 110);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test109");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 12, 11);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01/13/0011"+ "'", var4.equals("01/13/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01/13/0011"+ "'", var5.equals("01/13/0011"));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test110");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 10, 102);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    var3.setAno(10);
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test111");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 11, 8);
    int var4 = var3.getMes();
    var3.setDia(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test112");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 102, 102);
    int var4 = var3.getDia();
    var3.setDia(101);
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "101/103/0102"+ "'", var8.equals("101/103/0102"));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test113");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getAno();
    var0.setMes(14);
    var0.setAno(2);
    int var8 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 14);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test114");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    var0.setMes(1);
    int var5 = var0.getMes();
    int var6 = var0.getMes();
    var0.setAno(1);
    java.lang.String var9 = var0.toString();
    int var10 = var0.getAno();
    int var11 = var0.getMes();
    int var12 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00/01/0001"+ "'", var9.equals("00/01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test115");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, (-1), 3);
    java.lang.String var4 = var3.toString();
    var3.setAno(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "02/00/0003"+ "'", var4.equals("02/00/0003"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test116");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 101, 105);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 105);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test117");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 102, 4);
    var3.setMes(108);
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 108);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test118");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    int var8 = var3.getAno();
    var3.setDia(1);
    int var11 = var3.getDia();
    var3.setAno(101);
    java.lang.String var14 = var3.toString();
    var3.setAno(105);
    var3.setAno(16);
    java.lang.String var19 = var3.toString();
    int var20 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "01/-01/0101"+ "'", var14.equals("01/-01/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "01/-01/0016"+ "'", var19.equals("01/-01/0016"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test119");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getAno();
    var3.setAno(104);
    var3.setDia(2);
    java.lang.String var15 = var3.toString();
    int var16 = var3.getDia();
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
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "100/00/0000"+ "'", var9.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "02/00/0104"+ "'", var15.equals("02/00/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test120");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    var3.setAno(102);
    var3.setMes((-1));
    int var12 = var3.getAno();
    var3.setAno(8);
    var3.setDia(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test121");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 8, 12);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test122");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 6);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test123");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 100);
    var3.setDia(10);
    int var6 = var3.getAno();
    var3.setAno(103);
    int var9 = var3.getDia();
    var3.setAno(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test124");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 106, 4);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 107);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test125");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 17, 4);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test126");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(7, 1, 12);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test127");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 101, 103);
    var3.setMes(11);
    int var6 = var3.getMes();
    java.lang.String var7 = var3.toString();
    var3.setMes(103);
    var3.setMes(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10/11/0103"+ "'", var7.equals("10/11/0103"));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test128");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 7, 14);
    var3.setDia(105);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test129");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getAno();
    var0.setMes(0);
    int var5 = var0.getAno();
    int var6 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test130");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 6, 4);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "17/07/0004"+ "'", var4.equals("17/07/0004"));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test131");


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
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test132");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 7, 108);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "11/08/0108"+ "'", var4.equals("11/08/0108"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test133");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 1, 1);
    var3.setAno(1);
    var3.setDia(0);
    var3.setMes(10);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test134");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, (-1), 102);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test135");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/00/0000"+ "'", var4.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test136");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 4, 103);
    int var4 = var3.getDia();
    var3.setAno(110);
    var3.setAno(111);
    var3.setAno(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test137");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 11, 102);
    var3.setMes((-1));
    var3.setAno(100);
    var3.setAno(106);
    var3.setDia(2);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test138");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 12, 10);
    int var4 = var3.getMes();
    var3.setMes(110);
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 110);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test139");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getAno();
    java.lang.String var3 = var0.toString();
    var0.setMes(1);
    var0.setMes(15);
    int var8 = var0.getAno();
    int var9 = var0.getDia();
    int var10 = var0.getMes();
    int var11 = var0.getAno();
    var0.setMes(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00/00/0000"+ "'", var3.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test140");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    var3.setDia((-1));
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    var3.setDia(2);
    var3.setMes(17);
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "02/17/0001"+ "'", var15.equals("02/17/0001"));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test141");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 102, 102);
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    java.lang.String var6 = var3.toString();
    int var7 = var3.getMes();
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "103/103/0102"+ "'", var6.equals("103/103/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test142");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(10);
    int var11 = var3.getMes();
    int var12 = var3.getDia();
    int var13 = var3.getAno();
    var3.setMes(5);
    var3.setAno(13);
    var3.setDia(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test143");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    int var8 = var3.getAno();
    var3.setMes(2);
    var3.setMes(0);
    var3.setAno(2);
    var3.setDia(12);
    var3.setAno(12);
    var3.setDia(5);
    int var21 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 12);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test144");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 10, 106);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test145");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 15, 6);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test146");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 0);
    var3.setMes(102);
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    int var8 = var3.getAno();
    int var9 = var3.getAno();
    var3.setAno(4);
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    var3.setDia(10);
    var3.setMes(102);
    int var18 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01/102/0004"+ "'", var12.equals("-01/102/0004"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01/102/0004"+ "'", var13.equals("-01/102/0004"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 102);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test147");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    var0.setAno(0);
    var0.setAno(11);
    int var6 = var0.getMes();
    int var7 = var0.getAno();
    int var8 = var0.getAno();
    int var9 = var0.getDia();
    var0.setAno(3);
    int var12 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test148");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setDia(10);
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getMes();
    var0.setAno(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10/00/0000"+ "'", var5.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/00/0000"+ "'", var6.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test149");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    var3.setMes(101);
    var3.setAno(100);
    java.lang.String var16 = var3.toString();
    var3.setMes(107);
    var3.setAno(15);
    var3.setAno(2);
    var3.setDia(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00/101/0100"+ "'", var16.equals("00/101/0100"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test150");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    int var5 = var0.getMes();
    var0.setDia(101);
    var0.setAno((-1));
    var0.setAno(106);
    int var12 = var0.getAno();
    var0.setMes(11);
    int var15 = var0.getDia();
    var0.setMes(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 101);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test151");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 0, 2);
    int var4 = var3.getAno();
    var3.setAno(108);
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "02/01/0108"+ "'", var7.equals("02/01/0108"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test152");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.toString();
    var3.setAno(101);
    int var10 = var3.getAno();
    int var11 = var3.getAno();
    var3.setMes(104);
    int var14 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/100/0001"+ "'", var6.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10/100/0001"+ "'", var7.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test153");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    int var11 = var3.getDia();
    var3.setAno((-1));
    java.lang.String var14 = var3.toString();
    var3.setAno(14);
    java.lang.String var17 = var3.toString();
    var3.setAno(10);
    int var20 = var3.getMes();
    int var21 = var3.getAno();
    
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
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "100/00/-0001"+ "'", var14.equals("100/00/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100/00/0014"+ "'", var17.equals("100/00/0014"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test154");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 100, (-1));
    int var4 = var3.getAno();
    int var5 = var3.getDia();
    var3.setDia(109);
    var3.setDia(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test155");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 103, 101);
    var3.setMes(107);
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 107);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test156");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 15, 15);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test157");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.toString();
    int var13 = var3.getDia();
    var3.setAno(5);
    var3.setDia(14);
    int var18 = var3.getMes();
    int var19 = var3.getAno();
    
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
    assertTrue("'" + var12 + "' != '" + "00/00/0000"+ "'", var12.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 5);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test158");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setAno((-1));
    int var9 = var3.getMes();
    var3.setAno(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test159");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 19, 18);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test160");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 11, (-1));
    var3.setAno(101);
    var3.setMes(1);
    int var8 = var3.getDia();
    var3.setAno((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test161");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    int var9 = var3.getAno();
    int var10 = var3.getAno();
    var3.setAno(11);
    var3.setAno(104);
    var3.setMes(6);
    int var17 = var3.getDia();
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
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test162");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 7, 14);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test163");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 6, 11);
    var3.setMes(8);
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    var3.setMes(101);
    var3.setDia(0);
    var3.setAno(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test164");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getAno();
    var3.setAno(104);
    var3.setDia(2);
    java.lang.String var15 = var3.toString();
    int var16 = var3.getAno();
    
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
    assertTrue("'" + var9 + "' != '" + "100/00/0000"+ "'", var9.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "02/00/0104"+ "'", var15.equals("02/00/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 104);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test165");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 8, 7);
    int var4 = var3.getMes();
    var3.setAno(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 9);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test166");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getMes();
    var3.setAno(100);
    var3.setMes(10);
    var3.setAno(13);
    int var17 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test167");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    var3.setDia(100);
    int var12 = var3.getDia();
    var3.setMes((-1));
    int var15 = var3.getAno();
    int var16 = var3.getAno();
    
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
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test168");


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
    var3.setMes(6);
    int var19 = var3.getDia();
    int var20 = var3.getMes();
    
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
    assertTrue(var19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 6);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test169");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 103, 100);
    int var4 = var3.getAno();
    var3.setDia(4);
    java.lang.String var7 = var3.toString();
    var3.setAno(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "04/104/0100"+ "'", var7.equals("04/104/0100"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test170");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getDia();
    var3.setDia(10);
    java.lang.String var11 = var3.toString();
    var3.setDia(103);
    int var14 = var3.getAno();
    var3.setDia(5);
    var3.setMes(7);
    var3.setAno(10);
    int var21 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10/-01/0001"+ "'", var11.equals("10/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 7);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test171");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, 4, 20);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test172");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 17, 107);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test173");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setDia(10);
    var3.setDia(10);
    java.lang.String var13 = var3.toString();
    var3.setAno(12);
    var3.setDia(11);
    var3.setAno(4);
    var3.setMes(104);
    java.lang.String var22 = var3.toString();
    var3.setMes((-1));
    
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
    assertTrue("'" + var22 + "' != '" + "11/104/0004"+ "'", var22.equals("11/104/0004"));

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test174");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setMes(101);
    int var14 = var3.getMes();
    var3.setDia((-1));
    var3.setDia(10);
    java.lang.String var19 = var3.toString();
    var3.setMes(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10/101/0001"+ "'", var19.equals("10/101/0001"));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test175");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setDia(0);
    var3.setAno(10);
    java.lang.String var13 = var3.toString();
    var3.setMes(1);
    int var16 = var3.getMes();
    var3.setAno(10);
    var3.setDia(0);
    int var21 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00/01/0010"+ "'", var13.equals("00/01/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test176");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setDia(100);
    var3.setAno(103);
    int var12 = var3.getMes();
    var3.setAno(103);
    int var15 = var3.getDia();
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
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test177");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(10);
    int var7 = var3.getMes();
    var3.setAno(102);
    int var10 = var3.getAno();
    int var11 = var3.getAno();
    var3.setMes(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 102);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test178");


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
    int var24 = var3.getAno();
    int var25 = var3.getMes();
    
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
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test179");


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
    var3.setAno(101);
    int var21 = var3.getAno();
    var3.setMes((-1));
    int var24 = var3.getAno();
    java.lang.String var25 = var3.toString();
    int var26 = var3.getAno();
    var3.setAno(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0001"+ "'", var12.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "100/-01/0101"+ "'", var25.equals("100/-01/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 101);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test180");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, (-1), 102);
    var3.setMes(0);
    int var6 = var3.getMes();
    var3.setMes(10);
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    var3.setDia(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 102);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test181");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 105, 13);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 106);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test182");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    var3.setDia(0);
    int var13 = var3.getAno();
    int var14 = var3.getDia();
    int var15 = var3.getAno();
    int var16 = var3.getAno();
    int var17 = var3.getMes();
    int var18 = var3.getMes();
    int var19 = var3.getDia();
    int var20 = var3.getDia();
    var3.setMes(9);
    int var23 = var3.getAno();
    
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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test183");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(100);
    int var11 = var3.getAno();
    var3.setMes(0);
    java.lang.String var14 = var3.toString();
    int var15 = var3.getMes();
    int var16 = var3.getAno();
    var3.setDia(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/00/0000"+ "'", var14.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test184");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno((-1));
    var3.setMes(104);
    int var14 = var3.getMes();
    int var15 = var3.getDia();
    var3.setAno(105);
    java.lang.String var18 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100/104/0105"+ "'", var18.equals("100/104/0105"));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test185");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 1, 17);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test186");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    int var8 = var3.getAno();
    var3.setAno(10);
    int var11 = var3.getMes();
    var3.setAno((-1));
    var3.setMes((-1));
    int var16 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test187");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    java.lang.String var4 = var3.toString();
    var3.setAno(11);
    int var7 = var3.getDia();
    var3.setAno(2);
    int var10 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01/01/0000"+ "'", var4.equals("01/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test188");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(100);
    int var5 = var0.getMes();
    var0.setAno(4);
    var0.setDia(102);
    int var10 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 102);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test189");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, (-1), 12);
    var3.setDia(5);
    int var6 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 12);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test190");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 102);
    var3.setMes(101);
    var3.setAno((-1));
    var3.setDia(1);
    int var10 = var3.getDia();
    java.lang.String var11 = var3.toString();
    var3.setAno(100);
    int var14 = var3.getMes();
    int var15 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01/101/-0001"+ "'", var11.equals("01/101/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 101);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test191");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, 0);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    java.lang.String var6 = var3.toString();
    var3.setMes(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/101/0000"+ "'", var4.equals("100/101/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100/101/0000"+ "'", var6.equals("100/101/0000"));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test192");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 6, 4);
    var3.setAno(15);
    int var6 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test193");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 100, 11);
    int var4 = var3.getDia();
    var3.setMes((-1));
    int var7 = var3.getMes();
    var3.setDia(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test194");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    var0.setMes(10);
    int var7 = var0.getAno();
    int var8 = var0.getDia();
    var0.setMes(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test195");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 2, 10);
    var3.setAno(105);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "02/03/0105"+ "'", var6.equals("02/03/0105"));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test196");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 13, 13);
    var3.setMes(10);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test197");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, (-1), 6);
    var3.setAno(15);
    var3.setMes(15);
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 15);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test198");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 4);
    var3.setAno(100);
    var3.setMes(14);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test199");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 11, 103);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test200");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 100, 103);
    java.lang.String var4 = var3.toString();
    var3.setDia(5);
    var3.setAno(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "11/101/0103"+ "'", var4.equals("11/101/0103"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test201");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(10);
    var3.setMes(10);
    int var10 = var3.getDia();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getMes();
    int var13 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10/10/0001"+ "'", var11.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test202");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 20, 1);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test203");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    var3.setDia(10);
    int var12 = var3.getDia();
    var3.setMes(102);
    int var15 = var3.getAno();
    int var16 = var3.getAno();
    int var17 = var3.getDia();
    java.lang.String var18 = var3.toString();
    int var19 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10/102/0100"+ "'", var18.equals("10/102/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test204");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(9, 20, 1);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test205");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setDia(100);
    java.lang.String var6 = var0.toString();
    int var7 = var0.getDia();
    java.lang.String var8 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100/-01/0000"+ "'", var6.equals("100/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/-01/0000"+ "'", var8.equals("100/-01/0000"));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test206");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 2, 103);
    var3.setMes(103);
    var3.setAno((-1));
    int var8 = var3.getDia();
    var3.setMes(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test207");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    int var5 = var0.getMes();
    java.lang.String var6 = var0.toString();
    var0.setAno(103);
    var0.setAno(0);
    var0.setDia(0);
    var0.setMes(102);
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00/-01/0000"+ "'", var6.equals("00/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00/102/0000"+ "'", var15.equals("00/102/0000"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test208");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getAno();
    var0.setDia(10);
    int var6 = var0.getMes();
    var0.setDia(0);
    int var9 = var0.getDia();
    int var10 = var0.getMes();
    int var11 = var0.getAno();
    var0.setAno(103);
    java.lang.String var14 = var0.toString();
    var0.setDia(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/00/0103"+ "'", var14.equals("00/00/0103"));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test209");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    var0.setAno(103);
    int var8 = var0.getAno();
    var0.setDia(15);
    int var11 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test210");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    java.lang.String var10 = var3.toString();
    var3.setDia(2);
    int var13 = var3.getAno();
    int var14 = var3.getDia();
    var3.setAno(103);
    
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
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test211");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, (-1));
    int var4 = var3.getAno();
    var3.setAno(0);
    int var7 = var3.getAno();
    int var8 = var3.getDia();
    var3.setMes(103);
    var3.setDia(10);
    var3.setAno(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test212");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    int var9 = var3.getDia();
    var3.setAno(0);
    java.lang.String var12 = var3.toString();
    var3.setDia(100);
    int var15 = var3.getMes();
    var3.setMes(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00/00/0000"+ "'", var12.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test213");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 102, 101);
    int var4 = var3.getDia();
    var3.setMes(110);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test214");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 109, 101);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test215");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getAno();
    var0.setDia(10);
    var0.setAno(102);
    int var8 = var0.getMes();
    var0.setMes(102);
    java.lang.String var11 = var0.toString();
    int var12 = var0.getAno();
    var0.setDia(101);
    var0.setAno(101);
    var0.setMes(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10/102/0102"+ "'", var11.equals("10/102/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test216");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 105, 11);
    var3.setAno(14);
    var3.setAno(13);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test217");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 100, 101);
    var3.setDia(3);
    var3.setMes(0);
    java.lang.String var8 = var3.toString();
    var3.setDia(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "03/00/0101"+ "'", var8.equals("03/00/0101"));

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test218");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno((-1));
    int var12 = var3.getDia();
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test219");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    var3.setDia(102);
    var3.setDia(101);
    java.lang.String var11 = var3.toString();
    var3.setAno(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "101/102/0002"+ "'", var11.equals("101/102/0002"));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test220");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 1, 1);
    var3.setDia(103);
    var3.setAno(102);
    java.lang.String var8 = var3.toString();
    var3.setDia(11);
    var3.setAno(102);
    int var13 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "103/02/0102"+ "'", var8.equals("103/02/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 102);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test221");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 2, 11);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    var3.setMes(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test222");


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
    int var18 = var3.getMes();
    var3.setMes((-1));
    int var21 = var3.getDia();
    
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
    assertTrue(var21 == 10);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test223");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 8, 107);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test224");


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
    int var15 = var0.getMes();
    var0.setAno(104);
    java.lang.String var18 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/-01/0001"+ "'", var7.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "-01/-01/0104"+ "'", var18.equals("-01/-01/0104"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test225");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setMes(0);
    int var9 = var3.getDia();
    var3.setMes(100);
    var3.setAno(100);
    int var14 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test226");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    var3.setMes(0);
    int var13 = var3.getDia();
    java.lang.String var14 = var3.toString();
    int var15 = var3.getAno();
    var3.setAno(10);
    var3.setAno(2);
    var3.setMes(1);
    
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
    assertTrue("'" + var14 + "' != '" + "00/00/0000"+ "'", var14.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test227");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    var3.setMes(0);
    var3.setDia((-1));
    int var14 = var3.getMes();
    int var15 = var3.getAno();
    int var16 = var3.getMes();
    var3.setMes(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test228");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(7, 18, 107);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test229");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    var3.setAno(10);
    var3.setAno(2);
    var3.setAno(106);
    var3.setDia(15);
    int var19 = var3.getAno();
    var3.setAno(3);
    
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
    assertTrue(var19 == 106);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test230");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes((-1));
    var3.setAno(0);
    int var11 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test231");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 102);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    var3.setAno(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01/01/0102"+ "'", var5.equals("-01/01/0102"));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test232");


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
    int var22 = var3.getMes();
    var3.setMes(103);
    int var25 = var3.getMes();
    var3.setAno(13);
    var3.setMes(105);
    var3.setDia(102);
    
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
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 103);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test233");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 18, 100);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test234");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 14, 101);
    var3.setDia(107);
    var3.setMes(111);
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 107);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test235");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 14, (-1));
    var3.setAno(15);
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test236");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 4, 102);
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    var3.setMes(17);
    var3.setAno(15);
    var3.setMes(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "13/05/0102"+ "'", var5.equals("13/05/0102"));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test237");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 107, 104);
    var3.setDia(10);
    var3.setAno(13);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test238");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 3, 2);
    var3.setDia(105);
    var3.setDia(9);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test239");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 17, 13);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test240");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 0, 0);
    int var4 = var3.getDia();
    var3.setAno(0);
    int var7 = var3.getMes();
    var3.setMes(100);
    var3.setAno(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test241");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 107, 3);
    var3.setDia(6);
    var3.setDia(16);
    var3.setAno(108);
    var3.setAno(1);
    var3.setAno(2);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test242");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 0, 101);
    java.lang.String var4 = var3.toString();
    var3.setAno(101);
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    var3.setMes(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "11/01/0101"+ "'", var4.equals("11/01/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "11/01/0101"+ "'", var8.equals("11/01/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 11);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test243");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    var3.setAno(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0001"+ "'", var8.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "100/00/0001"+ "'", var9.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test244");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getMes();
    int var8 = var3.getMes();
    int var9 = var3.getDia();
    var3.setMes(11);
    int var12 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test245");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, 7, 14);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test246");


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
    int var20 = var3.getMes();
    int var21 = var3.getMes();
    int var22 = var3.getAno();
    var3.setMes(101);
    var3.setAno(7);
    
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
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test247");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 102, 108);
    var3.setAno(101);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test248");


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
    int var17 = var3.getDia();
    var3.setMes(102);
    var3.setMes(5);
    var3.setAno(6);
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
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 103);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test249");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    java.lang.String var10 = var3.toString();
    var3.setMes(11);
    int var13 = var3.getMes();
    var3.setMes(103);
    var3.setAno(104);
    
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
    assertTrue("'" + var10 + "' != '" + "100/00/0000"+ "'", var10.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 11);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test250");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 102);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    int var6 = var3.getDia();
    int var7 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test251");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(7, 17, 101);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test252");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    var3.setAno(100);
    int var6 = var3.getDia();
    var3.setDia(2);
    var3.setMes(103);
    var3.setMes(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test253");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 15, 111);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 111);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test254");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 102, 11);
    int var4 = var3.getMes();
    var3.setMes(105);
    var3.setAno(102);
    var3.setDia(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test255");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(100);
    var0.setDia(1);
    int var7 = var0.getDia();
    var0.setAno(106);
    var0.setDia(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test256");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setDia(10);
    int var8 = var3.getDia();
    var3.setDia(1);
    var3.setMes(0);
    int var13 = var3.getDia();
    var3.setDia(6);
    java.lang.String var16 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "06/00/0000"+ "'", var16.equals("06/00/0000"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test257");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 10, 104);
    int var4 = var3.getDia();
    int var5 = var3.getAno();
    var3.setDia(10);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/11/0104"+ "'", var8.equals("10/11/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 11);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test258");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    var0.setMes(1);
    var0.setAno(102);
    int var9 = var0.getAno();
    var0.setMes(103);
    var0.setAno(10);
    var0.setAno(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test259");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes((-1));
    var3.setDia(101);
    int var11 = var3.getDia();
    int var12 = var3.getMes();
    int var13 = var3.getAno();
    var3.setAno(101);
    int var16 = var3.getDia();
    var3.setAno(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 101);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test260");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 13, (-1));
    var3.setMes((-1));
    var3.setAno(18);
    var3.setDia(102);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test261");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 1, 103);
    var3.setMes(3);
    var3.setAno(7);
    java.lang.String var8 = var3.toString();
    var3.setDia(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "102/03/0007"+ "'", var8.equals("102/03/0007"));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test262");


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
    var3.setAno(0);
    int var19 = var3.getMes();
    var3.setAno(102);
    int var22 = var3.getDia();
    var3.setDia(5);
    int var25 = var3.getAno();
    int var26 = var3.getMes();
    int var27 = var3.getAno();
    
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
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 102);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test263");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setDia(0);
    var3.setAno(10);
    java.lang.String var13 = var3.toString();
    var3.setMes(1);
    var3.setMes(0);
    int var18 = var3.getDia();
    var3.setDia(4);
    int var21 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00/01/0010"+ "'", var13.equals("00/01/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 4);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test264");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    int var6 = var0.getMes();
    java.lang.String var7 = var0.toString();
    var0.setAno(2);
    var0.setMes(1);
    int var12 = var0.getDia();
    var0.setMes(107);
    int var15 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/-01/0001"+ "'", var7.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 107);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test265");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 105, 107);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 106);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test266");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 106, 10);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 107);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test267");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, (-1), 3);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test268");


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
    var3.setMes(18);
    
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

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test269");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    var3.setMes(101);
    java.lang.String var14 = var3.toString();
    java.lang.String var15 = var3.toString();
    var3.setAno((-1));
    int var18 = var3.getAno();
    var3.setMes(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/101/0000"+ "'", var14.equals("00/101/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00/101/0000"+ "'", var15.equals("00/101/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test270");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 101, 14);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "102/102/0014"+ "'", var5.equals("102/102/0014"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test271");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, (-1));
    var3.setMes(102);
    var3.setAno(103);
    var3.setAno(1);
    var3.setDia(14);
    var3.setAno(111);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test272");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    var3.setMes(0);
    int var13 = var3.getDia();
    java.lang.String var14 = var3.toString();
    var3.setDia(15);
    int var17 = var3.getDia();
    int var18 = var3.getDia();
    
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
    assertTrue("'" + var14 + "' != '" + "00/00/0000"+ "'", var14.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 15);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test273");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 16, 103);
    var3.setAno(6);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test274");


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
    int var14 = var3.getMes();
    int var15 = var3.getMes();
    
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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test275");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 10, 2);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 104);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test276");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, (-1), 19);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test277");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    var3.setMes(3);
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/00/0000"+ "'", var4.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test278");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 10, 5);
    var3.setAno(105);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "107/11/0105"+ "'", var6.equals("107/11/0105"));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test279");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 101);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getAno();
    var3.setAno(108);
    var3.setAno((-1));
    
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

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test280");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    int var5 = var0.getMes();
    var0.setDia(101);
    int var8 = var0.getAno();
    int var9 = var0.getMes();
    int var10 = var0.getAno();
    java.lang.String var11 = var0.toString();
    var0.setMes(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "101/-01/0000"+ "'", var11.equals("101/-01/0000"));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test281");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setAno(101);
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    var3.setDia(5);
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 5);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test282");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    var3.setAno(100);
    int var8 = var3.getMes();
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test283");


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
    int var14 = var3.getMes();
    int var15 = var3.getAno();
    int var16 = var3.getDia();
    int var17 = var3.getMes();
    var3.setDia(6);
    var3.setAno(103);
    
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
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test284");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, 2, 15);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 16);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test285");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 2, 1);
    var3.setAno(0);
    int var6 = var3.getMes();
    var3.setMes(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test286");


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
    var3.setDia(10);
    java.lang.String var19 = var3.toString();
    var3.setMes(13);
    
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
    assertTrue("'" + var19 + "' != '" + "10/11/-0001"+ "'", var19.equals("10/11/-0001"));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test287");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(20, 3, 2);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test288");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 1, 103);
    var3.setMes(15);
    var3.setDia(108);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test289");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    var3.setMes(101);
    var3.setDia(10);
    var3.setDia(2);
    var3.setMes(6);
    int var20 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test290");


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
    var3.setDia(0);
    int var23 = var3.getMes();
    var3.setAno(10);
    java.lang.String var26 = var3.toString();
    int var27 = var3.getMes();
    var3.setMes(106);
    var3.setMes(18);
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
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "00/02/0010"+ "'", var26.equals("00/02/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 18);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test291");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 100, (-1));
    int var4 = var3.getAno();
    var3.setMes(103);
    var3.setAno(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test292");


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
    var3.setMes(1);
    java.lang.String var19 = var3.toString();
    var3.setAno(108);
    
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
    assertTrue("'" + var19 + "' != '" + "101/01/-0001"+ "'", var19.equals("101/01/-0001"));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test293");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 19, 12);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "108/20/0012"+ "'", var4.equals("108/20/0012"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test294");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getMes();
    var3.setDia(0);
    var3.setDia(18);
    
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

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test295");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 4, 103);
    int var4 = var3.getMes();
    var3.setDia(103);
    var3.setDia(105);
    var3.setMes(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test296");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(0);
    var3.setMes(10);
    int var13 = var3.getAno();
    java.lang.String var14 = var3.toString();
    var3.setMes(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/10/0000"+ "'", var14.equals("00/10/0000"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test297");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 101, 3);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test298");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 101, 0);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    var3.setMes(105);
    var3.setDia(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/102/0000"+ "'", var4.equals("10/102/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10/102/0000"+ "'", var5.equals("10/102/0000"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test299");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    java.lang.String var4 = var3.toString();
    var3.setAno(11);
    var3.setAno(100);
    var3.setMes(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01/01/0000"+ "'", var4.equals("01/01/0000"));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test300");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 1, 1);
    var3.setDia(103);
    var3.setAno(102);
    java.lang.String var8 = var3.toString();
    var3.setDia(11);
    var3.setAno(102);
    int var13 = var3.getMes();
    var3.setDia(14);
    java.lang.String var16 = var3.toString();
    var3.setAno(16);
    var3.setDia(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "103/02/0102"+ "'", var8.equals("103/02/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "14/02/0102"+ "'", var16.equals("14/02/0102"));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test301");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 11, 13);
    java.lang.String var4 = var3.toString();
    var3.setAno(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "15/12/0013"+ "'", var4.equals("15/12/0013"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test302");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(20, 6, 109);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test303");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 3, 13);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/04/0013"+ "'", var5.equals("100/04/0013"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test304");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setMes((-1));
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "01/-01/0000"+ "'", var6.equals("01/-01/0000"));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test305");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 0, 15);
    int var4 = var3.getMes();
    var3.setDia(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test306");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 101, 13);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test307");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setMes(0);
    var3.setMes(2);
    var3.setMes(2);
    var3.setDia(103);
    var3.setMes(101);
    int var17 = var3.getAno();
    var3.setMes(0);
    int var20 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test308");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 102, 100);
    int var4 = var3.getDia();
    var3.setDia(13);
    var3.setDia(106);
    var3.setMes(2);
    var3.setMes(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test309");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 102, 4);
    var3.setAno(10);
    var3.setAno(8);
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 14);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test310");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 4, 6);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test311");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    java.lang.String var12 = var3.toString();
    int var13 = var3.getAno();
    int var14 = var3.getDia();
    
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
    assertTrue("'" + var9 + "' != '" + "100/00/0000"+ "'", var9.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0000"+ "'", var12.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test312");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(10);
    int var10 = var3.getDia();
    var3.setAno(10);
    java.lang.String var13 = var3.toString();
    int var14 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/00/0010"+ "'", var13.equals("100/00/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test313");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(20, 101, 15);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test314");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 0, 13);
    var3.setDia(12);
    var3.setAno(0);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test315");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getMes();
    var3.setAno(100);
    var3.setMes(10);
    var3.setAno(13);
    int var17 = var3.getMes();
    java.lang.String var18 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100/10/0013"+ "'", var18.equals("100/10/0013"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test316");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 106, (-1));
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    var3.setMes(3);
    int var8 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "101/107/-0001"+ "'", var4.equals("101/107/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 3);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test317");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 106, 1);
    java.lang.String var4 = var3.toString();
    var3.setDia(106);
    var3.setMes(15);
    int var9 = var3.getAno();
    var3.setDia(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/107/0001"+ "'", var4.equals("100/107/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test318");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 5, 3);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    int var7 = var3.getDia();
    var3.setMes(109);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/109/0003"+ "'", var10.equals("100/109/0003"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/109/0003"+ "'", var11.equals("100/109/0003"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 109);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test319");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 10, 12);
    var3.setAno(10);
    var3.setAno(18);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getMes();
    int var10 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "102/11/0018"+ "'", var8.equals("102/11/0018"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 11);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test320");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 2, 1);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 6);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test321");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 105, 109);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test322");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 6, 14);
    var3.setMes(13);
    var3.setAno(10);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test323");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    var3.setAno(10);
    java.lang.String var11 = var3.toString();
    var3.setMes(10);
    int var14 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00/00/0010"+ "'", var11.equals("00/00/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test324");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 6, 15);
    var3.setMes(101);
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test325");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    var0.setDia(102);
    var0.setDia(103);
    int var8 = var0.getAno();
    var0.setDia(2);
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "02/00/0000"+ "'", var11.equals("02/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "02/00/0000"+ "'", var12.equals("02/00/0000"));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test326");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 4, (-1));
    int var4 = var3.getDia();
    var3.setDia(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 105);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test327");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, 101);
    var3.setMes((-1));
    int var6 = var3.getMes();
    var3.setAno(111);
    int var9 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test328");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setMes(2);
    var3.setMes(100);
    int var8 = var3.getAno();
    var3.setMes(106);
    var3.setDia(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test329");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 10, 10);
    var3.setAno(11);
    var3.setAno(102);
    int var8 = var3.getDia();
    var3.setDia(11);
    int var11 = var3.getAno();
    java.lang.String var12 = var3.toString();
    int var13 = var3.getDia();
    var3.setMes(0);
    int var16 = var3.getMes();
    java.lang.String var17 = var3.toString();
    java.lang.String var18 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "11/11/0102"+ "'", var12.equals("11/11/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "11/00/0102"+ "'", var17.equals("11/00/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "11/00/0102"+ "'", var18.equals("11/00/0102"));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test330");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, 15, 1);
    int var4 = var3.getAno();
    var3.setDia(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test331");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(1);
    int var5 = var0.getAno();
    var0.setAno(0);
    var0.setDia(12);
    int var10 = var0.getDia();
    int var11 = var0.getAno();
    var0.setMes(14);
    var0.setMes(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test332");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 5, (-1));
    java.lang.String var4 = var3.toString();
    var3.setAno(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "04/06/-0001"+ "'", var4.equals("04/06/-0001"));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test333");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(111, 7, 108);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test334");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 1);
    var3.setDia(101);
    int var6 = var3.getDia();
    java.lang.String var7 = var3.toString();
    var3.setMes(11);
    java.lang.String var10 = var3.toString();
    var3.setMes(1);
    int var13 = var3.getMes();
    int var14 = var3.getMes();
    int var15 = var3.getAno();
    var3.setDia(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "101/103/0001"+ "'", var7.equals("101/103/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "101/11/0001"+ "'", var10.equals("101/11/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test335");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 19, 11);
    var3.setMes(6);
    var3.setMes(18);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test336");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 6, 3);
    var3.setMes(15);
    var3.setAno(1);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test337");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setMes(1);
    var3.setDia(100);
    java.lang.String var11 = var3.toString();
    var3.setDia(11);
    int var14 = var3.getDia();
    var3.setDia(10);
    int var17 = var3.getDia();
    int var18 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/01/0000"+ "'", var11.equals("100/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test338");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 104, 11);
    var3.setMes(2);
    int var6 = var3.getAno();
    java.lang.String var7 = var3.toString();
    var3.setDia(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "12/02/0011"+ "'", var7.equals("12/02/0011"));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test339");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 12, 100);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 13);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test340");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 101, 18);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test341");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getMes();
    java.lang.String var8 = var3.toString();
    var3.setDia(0);
    java.lang.String var11 = var3.toString();
    var3.setMes(15);
    int var14 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/00/0000"+ "'", var8.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00/00/0000"+ "'", var11.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test342");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getMes();
    var3.setAno(0);
    int var13 = var3.getAno();
    
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

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test343");


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
    var3.setDia((-1));
    var3.setAno(0);
    java.lang.String var18 = var3.toString();
    int var19 = var3.getMes();
    var3.setDia(103);
    java.lang.String var22 = var3.toString();
    
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
    assertTrue("'" + var18 + "' != '" + "-01/00/0000"+ "'", var18.equals("-01/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "103/00/0000"+ "'", var22.equals("103/00/0000"));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test344");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 6, 11);
    int var4 = var3.getDia();
    var3.setMes(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test345");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setDia(10);
    int var14 = var3.getMes();
    java.lang.String var15 = var3.toString();
    int var16 = var3.getMes();
    var3.setDia(12);
    int var19 = var3.getMes();
    java.lang.String var20 = var3.toString();
    int var21 = var3.getMes();
    var3.setAno(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10/00/0001"+ "'", var15.equals("10/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "12/00/0001"+ "'", var20.equals("12/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test346");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 13, 0);
    var3.setDia((-1));
    var3.setDia(1);
    var3.setAno(14);
    int var10 = var3.getMes();
    var3.setDia(103);
    var3.setAno(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 14);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test347");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 2, 10);
    java.lang.String var4 = var3.toString();
    var3.setAno(103);
    var3.setDia(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/03/0010"+ "'", var4.equals("00/03/0010"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test348");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(20, 20, 104);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test349");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 101, 101);
    var3.setDia(1);
    int var6 = var3.getAno();
    var3.setMes((-1));
    int var9 = var3.getMes();
    var3.setMes(110);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test350");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 100, 100);
    var3.setMes((-1));
    var3.setAno(11);
    java.lang.String var8 = var3.toString();
    var3.setAno(2);
    var3.setDia(104);
    var3.setMes(7);
    int var15 = var3.getAno();
    var3.setMes(5);
    var3.setMes(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "101/-01/0011"+ "'", var8.equals("101/-01/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test351");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 11, 5);
    var3.setDia(102);
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test352");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 11, 104);
    var3.setAno(3);
    var3.setDia(8);
    int var8 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 12);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test353");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 4, 16);
    var3.setDia(8);
    var3.setDia(103);
    var3.setDia(13);
    int var10 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 16);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test354");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 106, 100);
    var3.setAno(2);
    var3.setMes(18);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test355");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setAno(0);
    var3.setDia(10);
    int var13 = var3.getMes();
    var3.setDia(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test356");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 1);
    var3.setDia(101);
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    var3.setAno(104);
    int var10 = var3.getDia();
    var3.setMes(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test357");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(1);
    var3.setDia(100);
    int var13 = var3.getMes();
    var3.setDia((-1));
    var3.setDia(106);
    var3.setMes(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test358");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(10);
    int var11 = var3.getMes();
    var3.setMes(11);
    var3.setDia(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test359");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setAno(0);
    int var11 = var3.getAno();
    var3.setMes(104);
    java.lang.String var14 = var3.toString();
    var3.setDia(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "100/104/0000"+ "'", var14.equals("100/104/0000"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test360");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    int var11 = var3.getDia();
    var3.setAno(103);
    int var14 = var3.getAno();
    var3.setDia(101);
    var3.setAno(1);
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
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test361");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    var3.setAno(10);
    java.lang.String var13 = var3.toString();
    var3.setAno(15);
    var3.setDia(7);
    
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
    assertTrue("'" + var13 + "' != '" + "00/00/0010"+ "'", var13.equals("00/00/0010"));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test362");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, (-1), 102);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    var3.setAno(14);
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test363");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 1, (-1));
    var3.setAno(101);
    var3.setDia(101);
    var3.setAno(1);
    int var10 = var3.getMes();
    var3.setMes(10);
    var3.setMes((-1));
    var3.setDia(105);
    var3.setDia(103);
    var3.setAno(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test364");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 105, 15);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 105);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test365");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(18, 7, 18);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test366");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 10, 0);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    var3.setDia(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test367");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    var3.setDia(10);
    int var12 = var3.getDia();
    var3.setAno(106);
    var3.setMes(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test368");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getDia();
    var3.setAno(101);
    int var10 = var3.getDia();
    var3.setMes(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/100/0001"+ "'", var6.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test369");


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
    java.lang.String var16 = var3.toString();
    var3.setAno(102);
    var3.setAno(102);
    
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
    assertTrue("'" + var16 + "' != '" + "10/-01/0000"+ "'", var16.equals("10/-01/0000"));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test370");


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
    var3.setDia(0);
    int var23 = var3.getMes();
    var3.setAno(10);
    java.lang.String var26 = var3.toString();
    int var27 = var3.getMes();
    var3.setMes(106);
    var3.setMes(18);
    var3.setAno(2);
    
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
    assertTrue(var23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "00/02/0010"+ "'", var26.equals("00/02/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 2);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test371");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 101, 102);
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    var3.setAno(2);
    int var8 = var3.getDia();
    java.lang.String var9 = var3.toString();
    var3.setAno(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "101/102/0002"+ "'", var9.equals("101/102/0002"));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test372");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setDia(0);
    var3.setAno(10);
    java.lang.String var13 = var3.toString();
    var3.setMes(1);
    var3.setMes(0);
    java.lang.String var18 = var3.toString();
    int var19 = var3.getDia();
    var3.setDia((-1));
    int var22 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00/01/0010"+ "'", var13.equals("00/01/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "00/00/0010"+ "'", var18.equals("00/00/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test373");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 102, (-1));
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    var3.setMes(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "105/103/-0001"+ "'", var4.equals("105/103/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test374");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 4, 0);
    var3.setMes(105);
    var3.setDia(109);
    var3.setAno(5);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test375");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    int var5 = var0.getMes();
    var0.setDia(101);
    java.lang.String var8 = var0.toString();
    var0.setMes(0);
    int var11 = var0.getAno();
    var0.setDia(105);
    int var14 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "101/-01/0000"+ "'", var8.equals("101/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test376");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 15, 0);
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test377");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 0);
    var3.setMes(102);
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    var3.setDia((-1));
    java.lang.String var10 = var3.toString();
    int var11 = var3.getMes();
    int var12 = var3.getMes();
    int var13 = var3.getDia();
    int var14 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01/102/0000"+ "'", var10.equals("-01/102/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 102);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test378");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setDia((-1));
    java.lang.String var9 = var3.toString();
    var3.setAno(0);
    var3.setAno(103);
    var3.setAno(4);
    var3.setDia(101);
    var3.setAno(4);
    var3.setDia(13);
    java.lang.String var22 = var3.toString();
    var3.setMes(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01/10/0001"+ "'", var9.equals("-01/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "13/10/0004"+ "'", var22.equals("13/10/0004"));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test379");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(9, 10, 13);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test380");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 13, 110);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test381");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 102, 101);
    var3.setDia(4);
    int var6 = var3.getDia();
    var3.setAno((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test382");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    int var3 = var0.getAno();
    var0.setDia(10);
    var0.setAno(102);
    int var8 = var0.getMes();
    var0.setMes(102);
    var0.setAno(103);
    int var13 = var0.getMes();
    var0.setMes(103);
    int var16 = var0.getDia();
    var0.setMes(13);
    int var19 = var0.getMes();
    int var20 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 103);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test383");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setAno(2);
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    int var12 = var3.getMes();
    int var13 = var3.getDia();
    int var14 = var3.getAno();
    int var15 = var3.getDia();
    int var16 = var3.getAno();
    
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
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test384");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, (-1), 16);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 13);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test385");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    java.lang.String var10 = var3.toString();
    var3.setMes(10);
    int var13 = var3.getMes();
    int var14 = var3.getMes();
    int var15 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/00/0000"+ "'", var10.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test386");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 10, 102);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "05/11/0102"+ "'", var5.equals("05/11/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test387");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 17, 2);
    var3.setAno(20);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test388");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 1, 1);
    var3.setMes((-1));
    java.lang.String var6 = var3.toString();
    var3.setMes(1);
    var3.setAno(109);
    int var11 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00/-01/0001"+ "'", var6.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 109);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test389");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    int var10 = var3.getMes();
    var3.setAno(11);
    java.lang.String var13 = var3.toString();
    var3.setDia(104);
    int var16 = var3.getDia();
    int var17 = var3.getAno();
    int var18 = var3.getAno();
    
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
    assertTrue("'" + var13 + "' != '" + "100/00/0011"+ "'", var13.equals("100/00/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 11);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test390");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.toString();
    int var11 = var3.getAno();
    int var12 = var3.getAno();
    int var13 = var3.getMes();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test391");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(10);
    int var7 = var3.getMes();
    var3.setDia(100);
    int var10 = var3.getDia();
    var3.setDia(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test392");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    var3.setMes(101);
    java.lang.String var14 = var3.toString();
    int var15 = var3.getDia();
    int var16 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/101/0000"+ "'", var14.equals("00/101/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test393");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(18, 6, 12);
    var3.setAno(109);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test394");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 107, 5);
    var3.setDia(3);
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 5);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test395");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    java.lang.String var4 = var3.toString();
    var3.setMes(0);
    java.lang.String var7 = var3.toString();
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/01/0002"+ "'", var4.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/00/0002"+ "'", var7.equals("00/00/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test396");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 15, 4);
    var3.setAno(11);
    int var6 = var3.getAno();
    var3.setDia(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test397");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 4, 11);
    int var4 = var3.getAno();
    var3.setDia(110);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test398");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    var3.setDia(100);
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test399");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getDia();
    var3.setDia(10);
    int var11 = var3.getDia();
    int var12 = var3.getMes();
    java.lang.String var13 = var3.toString();
    var3.setAno(100);
    java.lang.String var16 = var3.toString();
    int var17 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/-01/0001"+ "'", var13.equals("10/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "10/-01/0100"+ "'", var16.equals("10/-01/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test400");


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
    int var21 = var3.getAno();
    var3.setAno(0);
    int var24 = var3.getMes();
    int var25 = var3.getAno();
    
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
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test401");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 2, 18);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 18);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test402");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    int var10 = var3.getMes();
    var3.setMes(100);
    var3.setMes(3);
    var3.setDia(104);
    int var17 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test403");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    int var6 = var3.getMes();
    var3.setAno(13);
    var3.setAno(12);
    var3.setDia(11);
    var3.setDia(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test404");


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
    java.lang.String var16 = var3.toString();
    var3.setMes(11);
    java.lang.String var19 = var3.toString();
    var3.setMes(107);
    int var22 = var3.getAno();
    
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
    assertTrue("'" + var16 + "' != '" + "10/-01/0000"+ "'", var16.equals("10/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "10/11/0000"+ "'", var19.equals("10/11/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test405");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 102, 10);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test406");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 1, 106);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test407");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, (-1));
    var3.setMes((-1));
    var3.setMes(101);
    int var8 = var3.getDia();
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test408");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 10, 2);
    var3.setDia(15);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test409");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, 16, 111);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test410");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getAno();
    java.lang.String var13 = var3.toString();
    var3.setMes(10);
    var3.setAno(12);
    int var18 = var3.getMes();
    var3.setDia(105);
    java.lang.String var21 = var3.toString();
    int var22 = var3.getAno();
    
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
    assertTrue("'" + var13 + "' != '" + "100/00/0000"+ "'", var13.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "105/10/0012"+ "'", var21.equals("105/10/0012"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 12);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test411");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, (-1));
    int var4 = var3.getAno();
    var3.setAno(0);
    java.lang.String var7 = var3.toString();
    var3.setMes((-1));
    int var10 = var3.getAno();
    java.lang.String var11 = var3.toString();
    var3.setDia(104);
    int var14 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10/101/0000"+ "'", var7.equals("10/101/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "10/-01/0000"+ "'", var11.equals("10/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test412");


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
    var3.setDia(3);
    int var27 = var3.getAno();
    var3.setDia(104);
    int var30 = var3.getAno();
    var3.setAno(20);
    
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
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test413");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setDia(10);
    int var14 = var3.getMes();
    var3.setDia(0);
    java.lang.String var17 = var3.toString();
    var3.setDia(0);
    var3.setMes(3);
    var3.setAno(100);
    var3.setAno(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00/00/0001"+ "'", var17.equals("00/00/0001"));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test414");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    int var5 = var0.getMes();
    var0.setDia(101);
    java.lang.String var8 = var0.toString();
    var0.setMes(0);
    int var11 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "101/-01/0000"+ "'", var8.equals("101/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test415");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 102, 100);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test416");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 2, 100);
    var3.setDia(104);
    java.lang.String var6 = var3.toString();
    var3.setAno(6);
    var3.setAno(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "104/03/0100"+ "'", var6.equals("104/03/0100"));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test417");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 8, 6);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test418");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 10, 14);
    var3.setAno(107);
    var3.setAno(15);
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/11/0015"+ "'", var8.equals("00/11/0015"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test419");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    var3.setMes(100);
    int var6 = var3.getDia();
    var3.setDia(14);
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test420");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    int var6 = var0.getMes();
    int var7 = var0.getAno();
    int var8 = var0.getMes();
    var0.setDia(105);
    var0.setAno((-1));
    var0.setDia(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test421");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 106, (-1));
    var3.setMes(5);
    var3.setDia(0);
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/05/-0001"+ "'", var8.equals("00/05/-0001"));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test422");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 12, 101);
    var3.setDia(10);
    var3.setMes(108);
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test423");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 4, 103);
    var3.setMes(11);
    var3.setAno(6);
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "101/11/0006"+ "'", var8.equals("101/11/0006"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "101/11/0006"+ "'", var9.equals("101/11/0006"));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test424");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 14, 12);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test425");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 12, 2);
    java.lang.String var4 = var3.toString();
    var3.setAno(20);
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "05/13/0002"+ "'", var4.equals("05/13/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "05/13/0020"+ "'", var7.equals("05/13/0020"));

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test426");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getMes();
    int var8 = var3.getMes();
    int var9 = var3.getDia();
    java.lang.String var10 = var3.toString();
    var3.setAno(3);
    
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

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test427");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 2, 1);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test428");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 10, 12);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    var3.setDia(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/11/0012"+ "'", var4.equals("10/11/0012"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10/11/0012"+ "'", var5.equals("10/11/0012"));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test429");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, (-1), 10);
    var3.setDia((-1));
    var3.setDia(3);
    var3.setAno(0);
    var3.setDia(105);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test430");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 102, 101);
    int var4 = var3.getAno();
    var3.setDia(11);
    int var7 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test431");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 0, 12);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "102/01/0012"+ "'", var4.equals("102/01/0012"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "102/01/0012"+ "'", var7.equals("102/01/0012"));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test432");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setAno(2);
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    var3.setAno(103);
    var3.setDia(2);
    var3.setMes(7);
    var3.setDia(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test433");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 10, 0);
    var3.setAno(103);
    var3.setAno(1);
    int var8 = var3.getMes();
    int var9 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test434");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    var3.setMes(2);
    var3.setAno(108);
    var3.setMes(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10/-01/0001"+ "'", var9.equals("10/-01/0001"));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test435");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 12, 0);
    var3.setMes(100);
    int var6 = var3.getDia();
    java.lang.String var7 = var3.toString();
    var3.setAno(103);
    int var10 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "105/100/0000"+ "'", var7.equals("105/100/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test436");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    int var9 = var3.getAno();
    int var10 = var3.getAno();
    var3.setAno(11);
    var3.setAno(104);
    var3.setMes(6);
    java.lang.String var17 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100/06/0104"+ "'", var17.equals("100/06/0104"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test437");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    int var12 = var3.getAno();
    var3.setDia(0);
    var3.setMes(10);
    int var17 = var3.getDia();
    int var18 = var3.getDia();
    
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
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test438");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 100, 1);
    var3.setMes((-1));
    int var6 = var3.getDia();
    var3.setMes(10);
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    var3.setMes(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test439");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setMes(1);
    var3.setDia(100);
    java.lang.String var11 = var3.toString();
    var3.setDia(11);
    var3.setAno(10);
    var3.setAno(108);
    var3.setMes(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/01/0000"+ "'", var11.equals("100/01/0000"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test440");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 13, 4);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setAno(105);
    int var8 = var3.getAno();
    var3.setAno(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 105);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test441");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 1, 1);
    var3.setMes((-1));
    int var6 = var3.getDia();
    var3.setDia(11);
    var3.setDia(10);
    var3.setDia(101);
    var3.setDia(100);
    var3.setAno(101);
    java.lang.String var17 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100/-01/0101"+ "'", var17.equals("100/-01/0101"));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test442");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 103, 11);
    var3.setMes(104);
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test443");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    int var9 = var3.getDia();
    var3.setMes(5);
    var3.setMes(106);
    java.lang.String var14 = var3.toString();
    int var15 = var3.getAno();
    int var16 = var3.getDia();
    int var17 = var3.getAno();
    
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
    assertTrue("'" + var14 + "' != '" + "100/106/0000"+ "'", var14.equals("100/106/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test444");


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
    int var22 = var3.getMes();
    var3.setDia((-1));
    var3.setDia(0);
    var3.setAno(103);
    var3.setAno(106);
    var3.setAno(109);
    
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
    assertTrue(var22 == 0);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test445");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(100);
    int var10 = var3.getMes();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getDia();
    int var13 = var3.getDia();
    int var14 = var3.getDia();
    java.lang.String var15 = var3.toString();
    
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
    assertTrue("'" + var11 + "' != '" + "100/00/0100"+ "'", var11.equals("100/00/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100/00/0100"+ "'", var15.equals("100/00/0100"));

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test446");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setMes(0);
    var3.setAno(2);
    int var13 = var3.getDia();
    int var14 = var3.getMes();
    var3.setAno(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/00/0000"+ "'", var8.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test447");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setAno(101);
    int var9 = var3.getDia();
    var3.setAno(10);
    var3.setDia(100);
    var3.setAno(110);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test448");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 102, 1);
    var3.setAno(100);
    var3.setDia(10);
    int var8 = var3.getMes();
    var3.setDia(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 103);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test449");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(102);
    int var8 = var3.getMes();
    var3.setAno(1);
    java.lang.String var11 = var3.toString();
    var3.setMes(100);
    var3.setAno(12);
    var3.setAno(14);
    java.lang.String var18 = var3.toString();
    int var19 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "102/102/0001"+ "'", var11.equals("102/102/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "102/100/0014"+ "'", var18.equals("102/100/0014"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test450");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setAno((-1));
    int var9 = var3.getAno();
    var3.setMes(13);
    java.lang.String var12 = var3.toString();
    var3.setMes(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10/13/-0001"+ "'", var12.equals("10/13/-0001"));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test451");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 1, 3);
    var3.setAno(103);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test452");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(110, 3, 13);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test453");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 10, 103);
    var3.setDia(18);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test454");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 11, 10);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getDia();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/12/0010"+ "'", var5.equals("100/12/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/12/0010"+ "'", var7.equals("100/12/0010"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test455");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 2, 10);
    var3.setMes(104);
    int var6 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test456");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    var3.setDia(101);
    int var10 = var3.getDia();
    var3.setDia(2);
    var3.setMes(100);
    int var15 = var3.getDia();
    var3.setDia((-1));
    java.lang.String var18 = var3.toString();
    int var19 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "-01/100/0000"+ "'", var18.equals("-01/100/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test457");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 11, 4);
    int var4 = var3.getDia();
    var3.setAno(101);
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "01/12/0101"+ "'", var8.equals("01/12/0101"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test458");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 8, 100);
    var3.setDia(16);
    var3.setAno(0);
    var3.setDia(19);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test459");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setMes(0);
    var3.setAno(1);
    int var13 = var3.getDia();
    java.lang.String var14 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/00/0000"+ "'", var8.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/00/0001"+ "'", var14.equals("00/00/0001"));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test460");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 101, 100);
    var3.setMes(7);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test461");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 104, 11);
    java.lang.String var4 = var3.toString();
    var3.setAno(1);
    var3.setAno(5);
    var3.setDia(11);
    int var11 = var3.getMes();
    int var12 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "12/105/0011"+ "'", var4.equals("12/105/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 105);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test462");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 17, 16);
    var3.setMes(8);
    int var6 = var3.getMes();
    var3.setAno(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 8);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test463");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(10);
    int var11 = var3.getMes();
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/-01/0010"+ "'", var12.equals("100/-01/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/-01/0010"+ "'", var13.equals("100/-01/0010"));

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test464");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, (-1), 2);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getDia();
    int var6 = var3.getDia();
    var3.setMes(104);
    java.lang.String var9 = var3.toString();
    int var10 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "102/00/0002"+ "'", var4.equals("102/00/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "102/104/0002"+ "'", var9.equals("102/104/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test465");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 4, 3);
    int var4 = var3.getMes();
    var3.setMes(12);
    int var7 = var3.getDia();
    var3.setAno(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test466");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 0, 1);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    java.lang.String var6 = var3.toString();
    var3.setDia(11);
    int var9 = var3.getAno();
    var3.setMes(14);
    int var12 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "102/01/0001"+ "'", var6.equals("102/01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test467");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, 7, 100);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 109);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test468");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(102);
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    var3.setAno(2);
    var3.setDia(8);
    var3.setMes(18);
    int var16 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "102/102/0001"+ "'", var9.equals("102/102/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test469");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(0);
    var3.setAno(10);
    int var13 = var3.getDia();
    var3.setAno(0);
    var3.setAno(2);
    int var18 = var3.getAno();
    var3.setMes(110);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test470");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 4, 10);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    var3.setMes(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/05/0010"+ "'", var4.equals("10/05/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 5);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test471");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 101, 10);
    int var4 = var3.getMes();
    var3.setMes(103);
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    int var9 = var3.getDia();
    var3.setAno(4);
    var3.setDia(6);
    int var14 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 6);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test472");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 15);
    int var4 = var3.getMes();
    var3.setDia(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test473");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    var3.setAno(2);
    int var16 = var3.getMes();
    java.lang.String var17 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0001"+ "'", var12.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/00/0001"+ "'", var13.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100/00/0002"+ "'", var17.equals("100/00/0002"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test474");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(18, 19, 6);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test475");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 100, 14);
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 14);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test476");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 103, 12);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    var3.setDia(16);
    var3.setAno(6);
    var3.setAno(111);
    java.lang.String var12 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "16/104/0111"+ "'", var12.equals("16/104/0111"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test477");


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
    int var19 = var3.getDia();
    int var20 = var3.getMes();
    java.lang.String var21 = var3.toString();
    var3.setDia(107);
    java.lang.String var24 = var3.toString();
    
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
    assertTrue(var19 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "103/03/0002"+ "'", var21.equals("103/03/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "107/03/0002"+ "'", var24.equals("107/03/0002"));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test478");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    var3.setDia(100);
    int var7 = var3.getMes();
    var3.setMes((-1));
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    int var12 = var3.getMes();
    int var13 = var3.getAno();
    var3.setMes(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test479");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 106, 106);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "104/107/0106"+ "'", var4.equals("104/107/0106"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "104/107/0106"+ "'", var5.equals("104/107/0106"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 104);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test480");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, (-1));
    var3.setMes((-1));
    var3.setMes(101);
    var3.setMes(2);
    var3.setDia(103);
    int var12 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 103);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test481");


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
    int var15 = var3.getMes();
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
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0000"+ "'", var12.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test482");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, (-1), 106);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "11/00/0106"+ "'", var4.equals("11/00/0106"));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test483");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    var3.setMes(0);
    int var6 = var3.getDia();
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    var3.setAno(100);
    int var11 = var3.getDia();
    var3.setAno(103);
    var3.setAno(104);
    int var16 = var3.getDia();
    java.lang.String var17 = var3.toString();
    var3.setAno(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100/00/0104"+ "'", var17.equals("100/00/0104"));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test484");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 5, 13);
    var3.setMes(7);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test485");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getDia();
    var3.setDia(10);
    int var11 = var3.getMes();
    int var12 = var3.getMes();
    java.lang.String var13 = var3.toString();
    var3.setMes(110);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/-01/0001"+ "'", var13.equals("10/-01/0001"));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test486");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    java.lang.String var4 = var3.toString();
    var3.setAno(11);
    var3.setDia(0);
    int var9 = var3.getAno();
    var3.setDia((-1));
    var3.setDia(100);
    int var14 = var3.getAno();
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01/01/0000"+ "'", var4.equals("01/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100/01/0011"+ "'", var15.equals("100/01/0011"));

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test487");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getAno();
    var3.setAno(104);
    int var13 = var3.getAno();
    int var14 = var3.getDia();
    int var15 = var3.getMes();
    var3.setDia(9);
    int var18 = var3.getDia();
    
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
    assertTrue("'" + var9 + "' != '" + "100/00/0000"+ "'", var9.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 9);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test488");


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
    var3.setMes(7);
    var3.setMes((-1));
    java.lang.String var19 = var3.toString();
    var3.setDia(103);
    
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
    assertTrue("'" + var19 + "' != '" + "100/-01/0001"+ "'", var19.equals("100/-01/0001"));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test489");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    int var8 = var3.getAno();
    var3.setMes(2);
    int var11 = var3.getAno();
    var3.setDia(7);
    int var14 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 7);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test490");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    var3.setDia(2);
    var3.setMes(104);
    int var11 = var3.getMes();
    var3.setDia((-1));
    int var14 = var3.getAno();
    int var15 = var3.getDia();
    var3.setDia(106);
    int var18 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 106);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test491");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 101, 12);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test492");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 15, 105);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test493");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 0, 104);
    int var4 = var3.getDia();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 104);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test494");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setDia(100);
    var3.setMes(101);
    int var12 = var3.getMes();
    var3.setAno(11);
    int var15 = var3.getAno();
    var3.setAno(0);
    var3.setMes(6);
    var3.setDia(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 11);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test495");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 2, 15);
    int var4 = var3.getDia();
    var3.setDia(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 8);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test496");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 0, 100);
    var3.setMes(102);
    int var6 = var3.getMes();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "11/102/0100"+ "'", var7.equals("11/102/0100"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test497");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setDia(100);
    java.lang.String var6 = var0.toString();
    int var7 = var0.getAno();
    var0.setAno((-1));
    var0.setAno(4);
    int var12 = var0.getDia();
    int var13 = var0.getMes();
    int var14 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100/-01/0000"+ "'", var6.equals("100/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test498");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 102, 10);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 103);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test499");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 3, 8);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro62.test500");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 0, 10);
    var3.setMes(104);
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 103);

  }

}
