package randoop;

import junit.framework.*;

public class DataDoEncontro61 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test1");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setDia(0);
    var3.setAno(10);
    var3.setDia(10);
    java.lang.String var15 = var3.toString();
    var3.setMes(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10/01/0010"+ "'", var15.equals("10/01/0010"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test2");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 16, 13);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test3");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 101, 1);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/102/0001"+ "'", var4.equals("00/102/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test4");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), (-1), 100);
    var3.setMes(101);
    var3.setAno(0);
    int var8 = var3.getDia();
    var3.setAno(6);
    var3.setAno(0);
    int var13 = var3.getAno();
    var3.setMes(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test5");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 8, 7);
    java.lang.String var4 = var3.toString();
    var3.setDia(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "06/09/0007"+ "'", var4.equals("06/09/0007"));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test6");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 10, 102);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    var3.setAno(15);
    var3.setDia(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test7");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 2, 10);
    int var4 = var3.getDia();
    int var5 = var3.getMes();
    var3.setMes(1);
    int var8 = var3.getMes();
    var3.setAno(109);
    java.lang.String var11 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/01/0109"+ "'", var11.equals("100/01/0109"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test8");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 1, 11);
    var3.setMes(105);
    int var6 = var3.getAno();
    var3.setMes(3);
    int var9 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 11);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test9");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setAno(101);
    int var9 = var3.getDia();
    var3.setAno(10);
    int var12 = var3.getDia();
    var3.setMes(4);
    int var15 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 4);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test10");


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
    var3.setMes((-1));
    int var21 = var3.getAno();
    var3.setMes(1);
    var3.setMes(0);
    var3.setDia(13);
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
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0000"+ "'", var12.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test11");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), (-1), 100);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    var3.setMes(1);
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    var3.setAno(13);
    int var12 = var3.getAno();
    var3.setMes(7);
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01/00/0100"+ "'", var5.equals("-01/00/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01/01/0100"+ "'", var9.equals("-01/01/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "-01/07/0013"+ "'", var15.equals("-01/07/0013"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test12");


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
    var3.setMes(3);
    int var21 = var3.getDia();
    var3.setDia(1);
    var3.setMes(101);
    
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

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test13");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 102);
    java.lang.String var4 = var3.toString();
    var3.setMes(102);
    var3.setAno(13);
    var3.setAno(1);
    var3.setDia(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-01/01/0102"+ "'", var4.equals("-01/01/0102"));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test14");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    var3.setDia(0);
    var3.setDia(1);
    int var12 = var3.getMes();
    var3.setMes(14);
    int var15 = var3.getDia();
    int var16 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 14);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test15");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 102, 100);
    java.lang.String var4 = var3.toString();
    var3.setAno(102);
    int var7 = var3.getAno();
    int var8 = var3.getDia();
    int var9 = var3.getMes();
    var3.setAno(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "102/103/0100"+ "'", var4.equals("102/103/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 103);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test16");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, (-1), 17);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 17);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test17");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 1, 12);
    int var4 = var3.getMes();
    var3.setMes(12);
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "104/12/0012"+ "'", var7.equals("104/12/0012"));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test18");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    int var10 = var3.getMes();
    int var11 = var3.getDia();
    int var12 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test19");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    var3.setAno(10);
    var3.setAno(2);
    int var12 = var3.getAno();
    int var13 = var3.getAno();
    int var14 = var3.getAno();
    java.lang.String var15 = var3.toString();
    int var16 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100/00/0002"+ "'", var15.equals("100/00/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test20");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(18, 109, 107);
    var3.setMes(108);
    var3.setMes(107);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test21");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getDia();
    var3.setDia(0);
    
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

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test22");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 105, 0);
    var3.setMes(10);
    var3.setAno(13);
    int var8 = var3.getMes();
    var3.setDia(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test23");


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
    var3.setAno(1);
    var3.setMes(0);
    var3.setAno(101);
    int var24 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10/00/0000"+ "'", var17.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 101);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test24");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 1);
    var3.setMes(3);
    var3.setDia(11);
    var3.setAno(13);
    int var10 = var3.getDia();
    var3.setMes(17);
    var3.setMes(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 11);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test25");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 101);
    int var4 = var3.getAno();
    var3.setAno(104);
    var3.setAno(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test26");


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
    int var18 = var3.getMes();
    var3.setAno(10);
    java.lang.String var21 = var3.toString();
    
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
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "00/00/0010"+ "'", var21.equals("00/00/0010"));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test27");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 100, 103);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 106);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test28");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 11, 15);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test29");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    int var6 = var0.getMes();
    int var7 = var0.getDia();
    var0.setMes(11);
    int var10 = var0.getDia();
    var0.setAno(8);
    java.lang.String var13 = var0.toString();
    var0.setDia(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00/11/0008"+ "'", var13.equals("00/11/0008"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test30");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getAno();
    java.lang.String var3 = var0.toString();
    var0.setMes(1);
    var0.setDia(2);
    java.lang.String var8 = var0.toString();
    var0.setMes(14);
    var0.setDia(107);
    int var13 = var0.getAno();
    var0.setMes(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00/00/0000"+ "'", var3.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "02/01/0000"+ "'", var8.equals("02/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test31");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getDia();
    var3.setAno(3);
    java.lang.String var13 = var3.toString();
    var3.setAno(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "02/102/0002"+ "'", var9.equals("02/102/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "02/102/0003"+ "'", var13.equals("02/102/0003"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test32");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 103, 101);
    var3.setDia((-1));
    int var6 = var3.getDia();
    var3.setAno(14);
    int var9 = var3.getMes();
    var3.setAno(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 104);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test33");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, 10, 2);
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test34");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 0, 100);
    int var4 = var3.getAno();
    var3.setDia(101);
    int var7 = var3.getAno();
    int var8 = var3.getAno();
    var3.setAno(6);
    int var11 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 6);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test35");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    var3.setDia(101);
    int var10 = var3.getDia();
    var3.setAno(11);
    var3.setMes(14);
    var3.setMes(11);
    int var17 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 101);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test36");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 7, 1);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 8);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test37");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 102, 100);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getDia();
    var3.setAno(10);
    var3.setMes(12);
    var3.setDia(13);
    int var13 = var3.getAno();
    var3.setMes(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test38");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.toString();
    var3.setAno(101);
    int var10 = var3.getMes();
    var3.setMes(3);
    var3.setDia(3);
    int var15 = var3.getMes();
    var3.setMes(0);
    var3.setAno(3);
    var3.setMes(102);
    int var22 = var3.getDia();
    int var23 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/100/0001"+ "'", var6.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10/100/0001"+ "'", var7.equals("10/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 3);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test39");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    var3.setAno(1);
    int var8 = var3.getMes();
    int var9 = var3.getMes();
    java.lang.String var10 = var3.toString();
    var3.setDia(102);
    int var13 = var3.getAno();
    java.lang.String var14 = var3.toString();
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/00/0000"+ "'", var4.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/00/0001"+ "'", var10.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "102/00/0001"+ "'", var14.equals("102/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "102/00/0001"+ "'", var15.equals("102/00/0001"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test40");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 13, 107);
    int var4 = var3.getMes();
    var3.setDia(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test41");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 105, (-1));
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 106);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test42");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(100);
    var3.setAno(102);
    var3.setAno(102);
    var3.setAno(103);
    int var17 = var3.getDia();
    var3.setDia(105);
    int var20 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test43");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 0, 11);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test44");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 12, 104);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test45");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 10, 100);
    var3.setAno(107);
    java.lang.String var6 = var3.toString();
    var3.setAno(13);
    java.lang.String var9 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/11/0107"+ "'", var6.equals("10/11/0107"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10/11/0013"+ "'", var9.equals("10/11/0013"));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test46");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    int var6 = var0.getMes();
    var0.setDia(1);
    int var9 = var0.getAno();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.toString();
    int var12 = var0.getMes();
    int var13 = var0.getAno();
    var0.setAno(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "01/-01/0001"+ "'", var10.equals("01/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "01/-01/0001"+ "'", var11.equals("01/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test47");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, (-1), 107);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 109);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test48");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 7, 1);
    var3.setMes((-1));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test49");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getAno();
    var3.setAno(13);
    int var15 = var3.getAno();
    var3.setMes(3);
    var3.setAno(14);
    
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
    assertTrue(var15 == 13);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test50");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    var3.setDia(100);
    var3.setDia(11);
    java.lang.String var9 = var3.toString();
    var3.setAno(1);
    var3.setAno(10);
    var3.setDia(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "11/101/-0001"+ "'", var9.equals("11/101/-0001"));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test51");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 12, 10);
    int var4 = var3.getAno();
    var3.setDia(103);
    int var7 = var3.getMes();
    int var8 = var3.getDia();
    var3.setAno(100);
    var3.setDia(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 103);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test52");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getDia();
    java.lang.String var3 = var0.toString();
    var0.setDia(2);
    int var6 = var0.getAno();
    int var7 = var0.getAno();
    int var8 = var0.getDia();
    java.lang.String var9 = var0.toString();
    int var10 = var0.getDia();
    int var11 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00/00/0000"+ "'", var3.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "02/00/0000"+ "'", var9.equals("02/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test53");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 13, 4);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setDia(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 14);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test54");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    int var6 = var0.getMes();
    int var7 = var0.getDia();
    var0.setMes(11);
    int var10 = var0.getDia();
    var0.setAno(1);
    var0.setMes(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test55");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getDia();
    int var9 = var3.getAno();
    var3.setMes(0);
    var3.setMes(107);
    int var14 = var3.getDia();
    var3.setDia(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test56");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 11, 3);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setAno((-1));
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 13);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test57");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 103, 10);
    var3.setAno(103);
    var3.setAno(7);
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 7);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test58");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    int var6 = var3.getAno();
    var3.setMes(11);
    int var9 = var3.getDia();
    var3.setDia(16);
    var3.setAno(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test59");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 14, 10);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test60");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 3, 16);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test61");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getDia();
    var0.setMes((-1));
    var0.setAno(101);
    var0.setDia(12);
    java.lang.String var9 = var0.toString();
    var0.setDia(101);
    var0.setMes(102);
    int var14 = var0.getAno();
    int var15 = var0.getDia();
    java.lang.String var16 = var0.toString();
    int var17 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "12/-01/0101"+ "'", var9.equals("12/-01/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "101/102/0101"+ "'", var16.equals("101/102/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 101);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test62");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    var3.setMes(1);
    var3.setDia(100);
    int var14 = var3.getMes();
    int var15 = var3.getAno();
    var3.setAno(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/10/0001"+ "'", var8.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10/10/0001"+ "'", var9.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test63");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    int var9 = var3.getMes();
    var3.setDia(100);
    java.lang.String var12 = var3.toString();
    var3.setDia(12);
    var3.setAno(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/01/0000"+ "'", var12.equals("100/01/0000"));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test64");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 106, 103);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "11/107/0103"+ "'", var4.equals("11/107/0103"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test65");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, 108, 9);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test66");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    java.lang.String var4 = var3.toString();
    var3.setMes(11);
    int var7 = var3.getAno();
    var3.setMes(0);
    java.lang.String var10 = var3.toString();
    var3.setMes(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/01/0002"+ "'", var4.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00/00/0002"+ "'", var10.equals("00/00/0002"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test67");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 10, 101);
    var3.setMes(101);
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test68");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 12, 101);
    int var4 = var3.getAno();
    int var5 = var3.getDia();
    int var6 = var3.getDia();
    int var7 = var3.getAno();
    var3.setAno(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test69");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    java.lang.String var10 = var3.toString();
    var3.setMes(100);
    java.lang.String var13 = var3.toString();
    int var14 = var3.getAno();
    var3.setDia(0);
    
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
    assertTrue("'" + var13 + "' != '" + "100/100/0000"+ "'", var13.equals("100/100/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test70");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 101);
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    var3.setMes(100);
    int var8 = var3.getAno();
    var3.setDia(103);
    var3.setAno(3);
    var3.setDia(100);
    var3.setDia(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00/01/0101"+ "'", var5.equals("00/01/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test71");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getDia();
    java.lang.String var3 = var0.toString();
    var0.setDia(2);
    int var6 = var0.getAno();
    int var7 = var0.getAno();
    var0.setAno(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "00/00/0000"+ "'", var3.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test72");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 101, 107);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test73");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    int var11 = var3.getDia();
    int var12 = var3.getDia();
    var3.setAno(17);
    var3.setDia(110);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test74");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(10);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getAno();
    var3.setAno(10);
    var3.setDia(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/102/0001"+ "'", var8.equals("10/102/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test75");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, 14, 3);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test76");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, 17, 103);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test77");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setDia(100);
    var3.setMes(101);
    int var12 = var3.getMes();
    var3.setAno(11);
    var3.setDia(105);
    int var17 = var3.getMes();
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
    assertTrue(var12 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 101);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test78");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 2, (-1));
    var3.setAno(11);
    var3.setAno(101);
    var3.setAno(13);
    var3.setAno(102);
    var3.setDia(11);
    int var14 = var3.getMes();
    int var15 = var3.getMes();
    int var16 = var3.getMes();
    var3.setAno(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 3);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test79");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getMes();
    var3.setAno(100);
    var3.setDia(8);
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test80");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    java.lang.String var10 = var3.toString();
    var3.setAno(102);
    java.lang.String var13 = var3.toString();
    var3.setAno(100);
    java.lang.String var16 = var3.toString();
    var3.setDia(104);
    int var19 = var3.getMes();
    var3.setAno(18);
    var3.setDia((-1));
    
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
    assertTrue("'" + var13 + "' != '" + "100/00/0102"+ "'", var13.equals("100/00/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "100/00/0100"+ "'", var16.equals("100/00/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test81");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    java.lang.String var10 = var3.toString();
    var3.setAno(1);
    var3.setDia(103);
    var3.setDia(10);
    java.lang.String var17 = var3.toString();
    int var18 = var3.getDia();
    int var19 = var3.getMes();
    var3.setAno(11);
    java.lang.String var22 = var3.toString();
    var3.setMes(109);
    
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
    assertTrue("'" + var17 + "' != '" + "10/00/0001"+ "'", var17.equals("10/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "10/00/0011"+ "'", var22.equals("10/00/0011"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test82");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    var3.setDia(100);
    var3.setDia(11);
    var3.setAno((-1));
    int var11 = var3.getDia();
    var3.setDia(0);
    int var14 = var3.getAno();
    int var15 = var3.getAno();
    java.lang.String var16 = var3.toString();
    java.lang.String var17 = var3.toString();
    var3.setAno(103);
    int var20 = var3.getAno();
    int var21 = var3.getAno();
    int var22 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "00/101/-0001"+ "'", var16.equals("00/101/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00/101/-0001"+ "'", var17.equals("00/101/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 103);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test83");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 12);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    var3.setMes(1);
    var3.setDia(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test84");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 101, 13);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test85");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    var3.setAno(2);
    int var16 = var3.getAno();
    var3.setDia(103);
    int var19 = var3.getMes();
    int var20 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0001"+ "'", var12.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "100/00/0001"+ "'", var13.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 103);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test86");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 2, 104);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test87");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setDia(10);
    var0.setAno(1);
    int var5 = var0.getMes();
    var0.setMes(102);
    int var8 = var0.getDia();
    var0.setAno(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test88");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 7, 7);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test89");


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
    var3.setAno(100);
    int var16 = var3.getMes();
    
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
    assertTrue(var16 == 0);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test90");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    var3.setMes(3);
    var3.setAno(103);
    var3.setDia(4);
    
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
    assertTrue("'" + var10 + "' != '" + "100/00/0000"+ "'", var10.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/00/0000"+ "'", var11.equals("100/00/0000"));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test91");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 111, 12);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test92");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, 108, 13);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test93");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 103, 101);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    var3.setAno(1);
    var3.setAno(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 104);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test94");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 0, 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    java.lang.String var7 = var3.toString();
    var3.setMes(10);
    var3.setAno(102);
    java.lang.String var12 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/01/0000"+ "'", var7.equals("00/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00/10/0102"+ "'", var12.equals("00/10/0102"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test95");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 11, 101);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test96");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 1, 103);
    var3.setDia(3);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test97");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    int var9 = var3.getMes();
    java.lang.String var10 = var3.toString();
    var3.setDia(12);
    java.lang.String var13 = var3.toString();
    var3.setDia(109);
    int var16 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "02/102/0002"+ "'", var10.equals("02/102/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "12/102/0002"+ "'", var13.equals("12/102/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test98");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 0, 10);
    var3.setAno(10);
    int var6 = var3.getAno();
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    int var9 = var3.getDia();
    int var10 = var3.getMes();
    int var11 = var3.getAno();
    java.lang.String var12 = var3.toString();
    int var13 = var3.getAno();
    var3.setDia(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "101/01/0010"+ "'", var12.equals("101/01/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test99");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, (-1), 0);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    var3.setMes(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "103/00/0000"+ "'", var5.equals("103/00/0000"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test100");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, (-1), 102);
    var3.setMes(0);
    java.lang.String var6 = var3.toString();
    var3.setDia(12);
    var3.setMes(2);
    java.lang.String var11 = var3.toString();
    java.lang.String var12 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/00/0102"+ "'", var6.equals("10/00/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "12/02/0102"+ "'", var11.equals("12/02/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "12/02/0102"+ "'", var12.equals("12/02/0102"));

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test101");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 10, 104);
    int var4 = var3.getDia();
    int var5 = var3.getAno();
    var3.setDia(10);
    java.lang.String var8 = var3.toString();
    var3.setDia(2);
    int var11 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/11/0104"+ "'", var8.equals("10/11/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 11);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test102");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    int var10 = var3.getMes();
    int var11 = var3.getDia();
    int var12 = var3.getAno();
    int var13 = var3.getDia();
    java.lang.String var14 = var3.toString();
    var3.setAno(100);
    int var17 = var3.getMes();
    int var18 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10/-01/0001"+ "'", var14.equals("10/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test103");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setAno(2);
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    int var11 = var3.getAno();
    int var12 = var3.getAno();
    var3.setDia(103);
    int var15 = var3.getAno();
    var3.setAno(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test104");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    var3.setDia(12);
    var3.setAno(2);
    var3.setMes(100);
    var3.setMes(107);
    var3.setMes(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test105");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 6, 4);
    var3.setAno(16);
    int var6 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 16);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test106");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 103, 0);
    var3.setMes(12);
    var3.setAno(19);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test107");


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
    java.lang.String var20 = var3.toString();
    int var21 = var3.getMes();
    int var22 = var3.getMes();
    java.lang.String var23 = var3.toString();
    var3.setAno(14);
    
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
    assertTrue("'" + var20 + "' != '" + "11/00/0004"+ "'", var20.equals("11/00/0004"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "11/00/0004"+ "'", var23.equals("11/00/0004"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test108");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 101, 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    var3.setAno(11);
    int var10 = var3.getAno();
    var3.setAno(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 11);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test109");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getMes();
    var3.setAno(100);
    int var7 = var3.getDia();
    var3.setDia(13);
    var3.setDia(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test110");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 100, 15);
    var3.setMes(13);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test111");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes((-1));
    var3.setAno(0);
    var3.setDia((-1));
    int var13 = var3.getAno();
    int var14 = var3.getDia();
    var3.setAno(2);
    int var17 = var3.getDia();
    var3.setMes(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test112");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, (-1), 102);
    var3.setMes(0);
    java.lang.String var6 = var3.toString();
    var3.setDia(12);
    var3.setMes(2);
    int var11 = var3.getDia();
    var3.setMes(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/00/0102"+ "'", var6.equals("10/00/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 12);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test113");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 102, 100);
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    var3.setMes(17);
    int var8 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "102/103/0100"+ "'", var5.equals("102/103/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 17);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test114");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(110, 5, 110);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test115");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 10, 11);
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    int var8 = var3.getDia();
    java.lang.String var9 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00/11/0011"+ "'", var5.equals("00/11/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00/11/0011"+ "'", var9.equals("00/11/0011"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test116");


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
    int var20 = var3.getAno();
    java.lang.String var21 = var3.toString();
    int var22 = var3.getDia();
    
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
    assertTrue(var20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "00/11/0010"+ "'", var21.equals("00/11/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test117");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 14, 7);
    var3.setMes(6);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test118");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 10, 2);
    var3.setAno(104);
    var3.setMes(2);
    int var8 = var3.getAno();
    var3.setDia((-1));
    int var11 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test119");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, (-1), (-1));
    var3.setAno(13);
    var3.setDia(2);
    int var8 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 13);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test120");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 10, 12);
    var3.setMes(108);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test121");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 0, 19);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test122");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    int var5 = var0.getMes();
    java.lang.String var6 = var0.toString();
    var0.setAno(103);
    var0.setAno(0);
    var0.setMes(13);
    java.lang.String var13 = var0.toString();
    int var14 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00/-01/0000"+ "'", var6.equals("00/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00/13/0000"+ "'", var13.equals("00/13/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test123");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 102, 101);
    var3.setDia(4);
    var3.setAno(12);
    var3.setDia(108);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test124");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(111, 102, 10);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test125");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setDia(10);
    int var14 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test126");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 2, 1);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getAno();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(106);
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    var3.setAno(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/03/0001"+ "'", var5.equals("100/03/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/03/0001"+ "'", var8.equals("100/03/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test127");


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
    var3.setAno((-1));
    int var29 = var3.getMes();
    int var30 = var3.getDia();
    int var31 = var3.getDia();
    int var32 = var3.getDia();
    
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
    assertTrue(var29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test128");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 0, 1);
    var3.setMes(102);
    int var6 = var3.getMes();
    var3.setAno(105);
    java.lang.String var9 = var3.toString();
    var3.setMes(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10/102/0105"+ "'", var9.equals("10/102/0105"));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test129");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    java.lang.String var4 = var3.toString();
    var3.setMes(0);
    int var7 = var3.getAno();
    var3.setMes(2);
    int var10 = var3.getMes();
    int var11 = var3.getDia();
    var3.setDia(4);
    int var14 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/01/0002"+ "'", var4.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test130");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 0, (-1));
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test131");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getDia();
    var0.setMes(101);
    java.lang.String var7 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/101/0000"+ "'", var7.equals("100/101/0000"));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test132");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 101, 105);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    java.lang.String var6 = var3.toString();
    var3.setMes(109);
    int var9 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00/102/0105"+ "'", var6.equals("00/102/0105"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 105);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test133");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 101, 101);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getAno();
    java.lang.String var6 = var3.toString();
    var3.setMes(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/102/0101"+ "'", var4.equals("100/102/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100/102/0101"+ "'", var6.equals("100/102/0101"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test134");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setMes(0);
    int var9 = var3.getDia();
    var3.setDia(11);
    var3.setDia(15);
    var3.setAno(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test135");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 0, 0);
    var3.setMes(0);
    var3.setMes(0);
    var3.setDia(10);
    var3.setAno(1);
    var3.setMes(13);
    java.lang.String var14 = var3.toString();
    var3.setAno(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10/13/0001"+ "'", var14.equals("10/13/0001"));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test136");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setDia(100);
    java.lang.String var6 = var0.toString();
    int var7 = var0.getAno();
    var0.setAno((-1));
    var0.setAno(1);
    int var12 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100/-01/0000"+ "'", var6.equals("100/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test137");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    var3.setDia(0);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    var3.setMes(2);
    var3.setDia(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00/-01/0000"+ "'", var10.equals("00/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00/-01/0000"+ "'", var11.equals("00/-01/0000"));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test138");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getAno();
    int var13 = var3.getDia();
    int var14 = var3.getDia();
    int var15 = var3.getMes();
    int var16 = var3.getAno();
    
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
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test139");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setMes(1);
    var3.setMes(102);
    var3.setAno((-1));
    int var13 = var3.getDia();
    int var14 = var3.getAno();
    var3.setDia(101);
    java.lang.String var17 = var3.toString();
    java.lang.String var18 = var3.toString();
    java.lang.String var19 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "101/102/-0001"+ "'", var17.equals("101/102/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "101/102/-0001"+ "'", var18.equals("101/102/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "101/102/-0001"+ "'", var19.equals("101/102/-0001"));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test140");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    var3.setAno(102);
    int var10 = var3.getAno();
    var3.setDia(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 102);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test141");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    int var11 = var3.getAno();
    var3.setMes(104);
    int var14 = var3.getAno();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test142");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 11, 103);
    var3.setMes(0);
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.toString();
    var3.setMes(8);
    var3.setDia(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "01/00/0103"+ "'", var6.equals("01/00/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "01/00/0103"+ "'", var7.equals("01/00/0103"));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test143");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(19, 103, 20);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test144");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 11, 100);
    var3.setDia(109);
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 12);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test145");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 1);
    var3.setDia(101);
    int var6 = var3.getDia();
    java.lang.String var7 = var3.toString();
    var3.setMes(10);
    var3.setDia(100);
    var3.setDia(100);
    int var14 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "101/103/0001"+ "'", var7.equals("101/103/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test146");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setAno((-1));
    var3.setAno((-1));
    var3.setMes(2);
    int var13 = var3.getAno();
    var3.setMes(102);
    var3.setDia(14);
    int var18 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 14);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test147");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 105, 14);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 107);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test148");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 105, 1);
    var3.setAno(2);
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 106);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test149");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 1);
    var3.setDia(101);
    int var6 = var3.getDia();
    java.lang.String var7 = var3.toString();
    int var8 = var3.getDia();
    int var9 = var3.getDia();
    var3.setMes(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "101/103/0001"+ "'", var7.equals("101/103/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test150");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 0, 111);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test151");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 111, 9);
    var3.setDia(20);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test152");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 106, 1);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test153");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 8, 11);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test154");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 14, 5);
    var3.setDia(107);
    var3.setDia(11);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test155");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setDia(2);
    var3.setAno(0);
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    java.lang.String var10 = var3.toString();
    int var11 = var3.getDia();
    var3.setDia(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "02/01/0000"+ "'", var10.equals("02/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test156");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 106, 3);
    int var4 = var3.getAno();
    var3.setDia(17);
    var3.setDia(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test157");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 12, 102);
    var3.setMes(101);
    int var6 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test158");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 15, 1);
    int var4 = var3.getDia();
    var3.setDia(105);
    java.lang.String var7 = var3.toString();
    var3.setAno(110);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "105/16/0001"+ "'", var7.equals("105/16/0001"));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test159");


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
    var3.setMes(5);
    java.lang.String var19 = var3.toString();
    int var20 = var3.getMes();
    var3.setMes(9);
    
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
    assertTrue("'" + var19 + "' != '" + "00/05/-0001"+ "'", var19.equals("00/05/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 5);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test160");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    int var9 = var3.getMes();
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    var3.setAno(100);
    var3.setAno(14);
    var3.setMes(102);
    java.lang.String var18 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/01/0000"+ "'", var10.equals("100/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/01/0000"+ "'", var11.equals("100/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100/102/0014"+ "'", var18.equals("100/102/0014"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test161");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 101);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 103);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test162");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 11, 103);
    java.lang.String var4 = var3.toString();
    var3.setAno(10);
    java.lang.String var7 = var3.toString();
    var3.setMes(17);
    int var10 = var3.getMes();
    var3.setDia(17);
    var3.setAno(109);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "02/12/0103"+ "'", var4.equals("02/12/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "02/12/0010"+ "'", var7.equals("02/12/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 17);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test163");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 10, 100);
    int var4 = var3.getAno();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    var3.setMes(103);
    int var10 = var3.getMes();
    var3.setDia(1);
    var3.setDia(15);
    int var15 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 103);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test164");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getDia();
    int var13 = var3.getMes();
    int var14 = var3.getAno();
    int var15 = var3.getAno();
    var3.setMes(6);
    var3.setDia(19);
    
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
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test165");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 105, 109);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test166");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 10, 2);
    var3.setAno(102);
    int var6 = var3.getDia();
    int var7 = var3.getDia();
    var3.setAno(5);
    var3.setMes(4);
    var3.setDia(15);
    var3.setMes(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test167");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), (-1), 100);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    var3.setAno(0);
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-01/00/0100"+ "'", var4.equals("-01/00/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test168");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(111, 15, 9);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "111/16/0009"+ "'", var4.equals("111/16/0009"));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test169");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setDia((-1));
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getMes();
    var3.setMes(8);
    var3.setDia(110);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "-01/10/0001"+ "'", var9.equals("-01/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "-01/10/0001"+ "'", var11.equals("-01/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test170");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 107, 103);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test171");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    var3.setMes((-1));
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    int var10 = var3.getMes();
    int var11 = var3.getDia();
    int var12 = var3.getAno();
    int var13 = var3.getDia();
    java.lang.String var14 = var3.toString();
    var3.setAno(100);
    int var17 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "10/-01/0001"+ "'", var14.equals("10/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test172");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 101, 104);
    int var4 = var3.getDia();
    var3.setDia(101);
    int var7 = var3.getDia();
    int var8 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test173");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(16, 11, 18);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 18);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test174");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 1, 100);
    java.lang.String var4 = var3.toString();
    var3.setMes(102);
    int var7 = var3.getMes();
    var3.setMes(13);
    var3.setAno(107);
    int var12 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/02/0100"+ "'", var4.equals("10/02/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 107);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test175");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    int var5 = var0.getMes();
    var0.setDia(101);
    java.lang.String var8 = var0.toString();
    var0.setAno(101);
    var0.setMes(4);
    int var13 = var0.getAno();
    int var14 = var0.getAno();
    int var15 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "101/-01/0000"+ "'", var8.equals("101/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 101);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test176");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 0, 103);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    java.lang.String var6 = var3.toString();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "13/01/0103"+ "'", var6.equals("13/01/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "13/01/0103"+ "'", var7.equals("13/01/0103"));

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test177");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 102, 102);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    var3.setMes(12);
    var3.setAno(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/103/0102"+ "'", var4.equals("00/103/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test178");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 101, 10);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    var3.setMes(109);
    int var8 = var3.getDia();
    var3.setAno(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "105/102/0010"+ "'", var5.equals("105/102/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 105);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test179");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 11, 106);
    var3.setDia(5);
    java.lang.String var6 = var3.toString();
    var3.setAno(100);
    int var9 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "05/12/0106"+ "'", var6.equals("05/12/0106"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test180");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 13, 0);
    var3.setDia((-1));
    int var6 = var3.getMes();
    java.lang.String var7 = var3.toString();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "-01/14/0000"+ "'", var7.equals("-01/14/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "-01/14/0000"+ "'", var8.equals("-01/14/0000"));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test181");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 15, 10);
    var3.setAno(103);
    var3.setDia(16);
    var3.setDia(13);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test182");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 102);
    int var4 = var3.getAno();
    var3.setDia(11);
    var3.setDia(10);
    var3.setMes(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test183");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 18, 19);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test184");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    int var9 = var3.getMes();
    var3.setMes(101);
    var3.setDia(0);
    int var14 = var3.getDia();
    int var15 = var3.getMes();
    int var16 = var3.getMes();
    int var17 = var3.getMes();
    var3.setDia(3);
    var3.setDia(15);
    int var22 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 101);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test185");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    var3.setMes(103);
    var3.setAno((-1));
    int var8 = var3.getMes();
    int var9 = var3.getDia();
    var3.setDia(1);
    int var12 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test186");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getDia();
    int var9 = var3.getDia();
    var3.setDia(18);
    var3.setDia(7);
    
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

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test187");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 3, 103);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 4);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test188");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    int var6 = var0.getMes();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getDia();
    java.lang.String var10 = var0.toString();
    var0.setAno(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/-01/0001"+ "'", var7.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/-01/0001"+ "'", var8.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00/-01/0001"+ "'", var10.equals("00/-01/0001"));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test189");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getAno();
    var3.setAno(104);
    var3.setMes(13);
    var3.setAno(0);
    var3.setDia(16);
    int var19 = var3.getAno();
    var3.setAno(4);
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
    assertTrue("'" + var9 + "' != '" + "100/00/0000"+ "'", var9.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "16/13/0004"+ "'", var22.equals("16/13/0004"));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test190");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 15, 100);
    var3.setMes(103);
    var3.setAno(14);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test191");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 3, 1);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test192");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setAno((-1));
    var3.setAno((-1));
    var3.setMes(2);
    int var13 = var3.getAno();
    var3.setMes(13);
    var3.setMes((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test193");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 3);
    int var4 = var3.getDia();
    int var5 = var3.getAno();
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test194");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 10);
    int var4 = var3.getDia();
    var3.setMes((-1));
    int var7 = var3.getAno();
    var3.setAno(3);
    var3.setDia(14);
    int var12 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test195");


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
    var3.setAno(1);
    int var20 = var3.getDia();
    var3.setAno(107);
    var3.setDia(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10/00/0000"+ "'", var17.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test196");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 102, 4);
    var3.setDia(100);
    var3.setAno(107);
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test197");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 11, 3);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setAno((-1));
    var3.setMes(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 12);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test198");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 102, 103);
    var3.setMes(104);
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 104);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test199");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 0, 10);
    var3.setAno(10);
    int var6 = var3.getAno();
    java.lang.String var7 = var3.toString();
    int var8 = var3.getMes();
    var3.setAno(102);
    var3.setAno(102);
    var3.setMes(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "101/01/0010"+ "'", var7.equals("101/01/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test200");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 5, 18);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test201");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 12, 14);
    var3.setDia(106);
    int var6 = var3.getAno();
    var3.setAno(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 14);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test202");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 102, 102);
    int var4 = var3.getMes();
    var3.setAno(101);
    int var7 = var3.getMes();
    var3.setMes(10);
    var3.setAno((-1));
    java.lang.String var12 = var3.toString();
    var3.setDia(7);
    int var15 = var3.getMes();
    var3.setDia(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "103/10/-0001"+ "'", var12.equals("103/10/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test203");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 103, 103);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 104);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test204");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 1);
    var3.setDia(101);
    int var6 = var3.getDia();
    java.lang.String var7 = var3.toString();
    var3.setMes(11);
    java.lang.String var10 = var3.toString();
    var3.setAno(100);
    int var13 = var3.getDia();
    int var14 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "101/103/0001"+ "'", var7.equals("101/103/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "101/11/0001"+ "'", var10.equals("101/11/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 101);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test205");


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
    var3.setMes(106);
    var3.setDia(0);
    int var20 = var3.getDia();
    var3.setMes(13);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test206");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 10, 100);
    var3.setMes(17);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test207");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 17, 108);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test208");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 11, 102);
    var3.setMes((-1));
    var3.setMes(0);
    var3.setDia(10);
    var3.setDia(1);
    var3.setAno(106);
    int var14 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test209");


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
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/00/-0001"+ "'", var14.equals("00/00/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 11);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test210");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 14, 101);
    var3.setDia(102);
    var3.setMes(15);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test211");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 109, 14);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "04/110/0014"+ "'", var4.equals("04/110/0014"));

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test212");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 4, 3);
    int var4 = var3.getMes();
    var3.setMes(12);
    int var7 = var3.getDia();
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    int var10 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 12);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test213");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 5, 9);
    var3.setMes(14);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test214");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(18, 103, 19);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test215");


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
    int var18 = var3.getAno();
    int var19 = var3.getDia();
    int var20 = var3.getMes();
    var3.setAno(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00/00/0001"+ "'", var17.equals("00/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test216");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 107, 5);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 108);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test217");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    var0.setMes(1);
    var0.setMes(102);
    int var9 = var0.getMes();
    int var10 = var0.getDia();
    int var11 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test218");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 5, 7);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test219");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    var3.setDia(10);
    int var10 = var3.getDia();
    int var11 = var3.getMes();
    var3.setAno(3);
    var3.setDia(3);
    var3.setMes(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test220");


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
    java.lang.String var16 = var3.toString();
    int var17 = var3.getMes();
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
    assertTrue("'" + var16 + "' != '" + "104/00/0011"+ "'", var16.equals("104/00/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 11);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test221");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setAno(0);
    var3.setAno(1);
    var3.setDia(103);
    var3.setDia(12);
    var3.setMes(5);
    java.lang.String var18 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "12/05/0001"+ "'", var18.equals("12/05/0001"));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test222");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 104, 10);
    var3.setAno(11);
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    int var8 = var3.getAno();
    var3.setMes(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 11);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test223");


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
    var3.setAno(12);
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
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "103/-01/0012"+ "'", var22.equals("103/-01/0012"));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test224");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 1, 16);
    var3.setAno(3);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test225");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 100, 3);
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "13/101/0003"+ "'", var5.equals("13/101/0003"));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test226");


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
    java.lang.String var21 = var3.toString();
    int var22 = var3.getMes();
    int var23 = var3.getAno();
    var3.setMes(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "100/00/0001"+ "'", var12.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "100/00/0101"+ "'", var21.equals("100/00/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 101);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test227");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    var3.setAno(104);
    java.lang.String var15 = var3.toString();
    var3.setMes(13);
    
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
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100/00/0104"+ "'", var15.equals("100/00/0104"));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test228");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 0, 1);
    var3.setDia(1);
    int var6 = var3.getMes();
    var3.setMes(5);
    java.lang.String var9 = var3.toString();
    var3.setMes(8);
    int var12 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "01/05/0001"+ "'", var9.equals("01/05/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test229");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setAno((-1));
    int var9 = var3.getAno();
    var3.setDia(10);
    int var12 = var3.getMes();
    var3.setAno(1);
    java.lang.String var15 = var3.toString();
    int var16 = var3.getAno();
    var3.setDia(15);
    int var19 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10/10/0001"+ "'", var15.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 15);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test230");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    java.lang.String var4 = var3.toString();
    var3.setAno(11);
    var3.setDia(0);
    var3.setDia((-1));
    var3.setAno(12);
    var3.setAno(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01/01/0000"+ "'", var4.equals("01/01/0000"));

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test231");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 0, 6);
    var3.setAno(18);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test232");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 18, 4);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "11/19/0004"+ "'", var4.equals("11/19/0004"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test233");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 102, 11);
    var3.setDia(2);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test234");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setAno((-1));
    int var9 = var3.getAno();
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    int var12 = var3.getDia();
    var3.setMes(14);
    var3.setDia(100);
    int var17 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test235");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 1, (-1));
    var3.setAno(12);
    var3.setMes(104);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test236");


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
    var3.setDia(103);
    int var18 = var3.getDia();
    int var19 = var3.getDia();
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
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test237");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(10);
    int var7 = var3.getAno();
    var3.setAno(0);
    int var10 = var3.getAno();
    var3.setAno(1);
    var3.setMes(109);
    var3.setMes(101);
    int var17 = var3.getDia();
    java.lang.String var18 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "10/101/0001"+ "'", var18.equals("10/101/0001"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test238");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setMes(2);
    var3.setDia(100);
    int var8 = var3.getDia();
    int var9 = var3.getAno();
    var3.setAno(17);
    var3.setMes(18);
    var3.setMes(2);
    var3.setDia(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test239");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 0, 6);
    var3.setAno(104);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test240");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 107, 15);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test241");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 13, 100);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test242");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 106, 107);
    var3.setDia(20);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test243");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 10, 12);
    var3.setAno(105);
    int var6 = var3.getDia();
    var3.setAno(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test244");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(14, 101, 101);
    var3.setAno(6);
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 14);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test245");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 10, 102);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    var3.setAno(15);
    java.lang.String var9 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "12/11/0015"+ "'", var9.equals("12/11/0015"));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test246");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 13, 18);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test247");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getAno();
    int var11 = var3.getAno();
    int var12 = var3.getDia();
    int var13 = var3.getAno();
    int var14 = var3.getMes();
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
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test248");


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
    int var17 = var3.getMes();
    int var18 = var3.getDia();
    
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
    assertTrue(var17 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test249");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    java.lang.String var7 = var3.toString();
    var3.setAno(103);
    var3.setDia(2);
    java.lang.String var12 = var3.toString();
    int var13 = var3.getAno();
    int var14 = var3.getDia();
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10/10/0001"+ "'", var7.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "02/10/0103"+ "'", var12.equals("02/10/0103"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "02/10/0103"+ "'", var15.equals("02/10/0103"));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test250");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 12, 0);
    var3.setDia(105);
    var3.setMes(101);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test251");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setAno(2);
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    var3.setAno(103);
    var3.setDia(2);
    int var15 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 103);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test252");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setDia(100);
    java.lang.String var6 = var0.toString();
    int var7 = var0.getDia();
    var0.setAno(100);
    java.lang.String var10 = var0.toString();
    var0.setDia(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100/-01/0000"+ "'", var6.equals("100/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/-01/0100"+ "'", var10.equals("100/-01/0100"));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test253");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    int var9 = var3.getMes();
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    var3.setMes(1);
    int var14 = var3.getAno();
    var3.setDia(13);
    int var17 = var3.getMes();
    var3.setDia(102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/01/0000"+ "'", var10.equals("100/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/01/0000"+ "'", var11.equals("100/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test254");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    var3.setAno(102);
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    var3.setMes(14);
    int var14 = var3.getMes();
    var3.setMes(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 14);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test255");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 102, 2);
    var3.setAno(3);
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    var3.setMes(103);
    java.lang.String var10 = var3.toString();
    java.lang.String var11 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "02/103/0003"+ "'", var10.equals("02/103/0003"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "02/103/0003"+ "'", var11.equals("02/103/0003"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test256");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 103, 12);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "102/104/0012"+ "'", var5.equals("102/104/0012"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "102/104/0012"+ "'", var6.equals("102/104/0012"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test257");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 6, 10);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 6);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test258");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 102, 10);
    int var4 = var3.getAno();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    var3.setDia(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 103);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test259");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 18, 110);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 19);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test260");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 2, 106);
    var3.setDia(10);
    var3.setDia(5);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "05/03/0106"+ "'", var8.equals("05/03/0106"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 5);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test261");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes((-1));
    var3.setAno(0);
    var3.setAno(101);
    var3.setMes(10);
    int var15 = var3.getMes();
    int var16 = var3.getAno();
    int var17 = var3.getAno();
    var3.setAno(7);
    int var20 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 10);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test262");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 100, 2);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    var3.setDia(100);
    var3.setAno(108);
    java.lang.String var10 = var3.toString();
    int var11 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/101/0108"+ "'", var10.equals("100/101/0108"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 108);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test263");


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
    int var20 = var3.getAno();
    int var21 = var3.getMes();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test264");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), (-1), 1);
    var3.setAno(8);
    var3.setMes(11);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test265");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getMes();
    var3.setAno(2);
    int var13 = var3.getMes();
    var3.setDia(104);
    var3.setDia(14);
    var3.setMes(108);
    var3.setAno(102);
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
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 14);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test266");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 100, 3);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "13/101/0003"+ "'", var4.equals("13/101/0003"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test267");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 12, 100);
    var3.setAno(100);
    int var6 = var3.getDia();
    var3.setDia(107);
    int var9 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 107);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test268");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 6, 106);
    var3.setAno(17);
    var3.setAno(13);
    var3.setAno(111);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test269");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(110, 104, 11);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test270");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 11, 2);
    int var4 = var3.getDia();
    var3.setAno(15);
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 12);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test271");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 4, 2);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "05/05/0002"+ "'", var4.equals("05/05/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test272");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(9, 20, 2);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test273");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 5, 19);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test274");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 101);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    var3.setMes(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test275");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 101, 103);
    var3.setMes((-1));
    int var6 = var3.getDia();
    var3.setDia(106);
    var3.setMes(104);
    var3.setMes(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 13);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test276");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    int var9 = var3.getMes();
    java.lang.String var10 = var3.toString();
    int var11 = var3.getAno();
    var3.setMes(13);
    java.lang.String var14 = var3.toString();
    int var15 = var3.getMes();
    var3.setMes(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "02/102/0002"+ "'", var10.equals("02/102/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "02/13/0002"+ "'", var14.equals("02/13/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 13);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test277");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setMes(2);
    var3.setMes(100);
    var3.setMes(2);
    int var10 = var3.getAno();
    var3.setDia(0);
    int var13 = var3.getMes();
    var3.setMes(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test278");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 18, 9);
    var3.setAno(3);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test279");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 1, 0);
    int var4 = var3.getDia();
    int var5 = var3.getAno();
    var3.setMes((-1));
    var3.setDia(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test280");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setMes(0);
    int var9 = var3.getAno();
    var3.setDia((-1));
    int var12 = var3.getMes();
    int var13 = var3.getDia();
    int var14 = var3.getMes();
    var3.setMes(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test281");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 16, 106);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 106);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test282");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    var3.setMes(101);
    var3.setMes(10);
    int var8 = var3.getDia();
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test283");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    java.lang.String var4 = var3.toString();
    var3.setMes(0);
    int var7 = var3.getAno();
    var3.setMes(2);
    int var10 = var3.getMes();
    int var11 = var3.getDia();
    var3.setMes(101);
    var3.setAno(104);
    var3.setMes(16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/01/0002"+ "'", var4.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test284");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    int var4 = var0.getMes();
    var0.setMes(1);
    var0.setMes(102);
    var0.setDia(110);
    int var11 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 110);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test285");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setDia((-1));
    int var9 = var3.getAno();
    var3.setMes(3);
    int var12 = var3.getDia();
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test286");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 5, 4);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "04/06/0004"+ "'", var4.equals("04/06/0004"));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test287");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setDia(10);
    var0.setMes(2);
    int var5 = var0.getAno();
    int var6 = var0.getMes();
    int var7 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test288");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    int var8 = var3.getAno();
    var3.setAno(11);
    var3.setMes(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test289");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(100);
    java.lang.String var11 = var3.toString();
    var3.setMes(14);
    int var14 = var3.getAno();
    var3.setMes(105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00/100/0000"+ "'", var11.equals("00/100/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test290");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 14, 108);
    int var4 = var3.getDia();
    var3.setAno(17);
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 8);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test291");


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
    var3.setAno(110);
    
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

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test292");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getMes();
    int var5 = var0.getDia();
    int var6 = var0.getDia();
    var0.setDia(102);
    java.lang.String var9 = var0.toString();
    int var10 = var0.getAno();
    int var11 = var0.getMes();
    int var12 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "102/00/0000"+ "'", var9.equals("102/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test293");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 102, 1);
    var3.setAno(100);
    var3.setDia(10);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getAno();
    int var10 = var3.getAno();
    int var11 = var3.getDia();
    int var12 = var3.getAno();
    var3.setAno((-1));
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/103/0100"+ "'", var8.equals("10/103/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "10/103/-0001"+ "'", var15.equals("10/103/-0001"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test294");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 111, 10);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test295");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setAno((-1));
    int var9 = var3.getAno();
    var3.setMes(13);
    java.lang.String var12 = var3.toString();
    var3.setMes(14);
    int var15 = var3.getAno();
    int var16 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10/13/-0001"+ "'", var12.equals("10/13/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test296");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 101, 104);
    var3.setDia(11);
    java.lang.String var6 = var3.toString();
    var3.setMes(8);
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "11/102/0104"+ "'", var6.equals("11/102/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 104);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test297");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 10, 10);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test298");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 103, 17);
    var3.setAno(0);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test299");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 100, 100);
    var3.setMes((-1));
    var3.setAno(11);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getMes();
    var3.setDia(15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "101/-01/0011"+ "'", var8.equals("101/-01/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test300");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 103, (-1));
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getDia();
    int var7 = var3.getMes();
    java.lang.String var8 = var3.toString();
    var3.setAno(6);
    int var11 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "02/104/-0001"+ "'", var4.equals("02/104/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "02/104/-0001"+ "'", var5.equals("02/104/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "02/104/-0001"+ "'", var8.equals("02/104/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 104);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test301");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    var3.setMes(0);
    var3.setAno(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test302");


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
    int var18 = var3.getMes();
    var3.setAno(12);
    int var21 = var3.getMes();
    var3.setDia(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00/00/0001"+ "'", var17.equals("00/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test303");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 101, 0);
    int var4 = var3.getMes();
    var3.setMes(3);
    var3.setDia(14);
    int var9 = var3.getMes();
    java.lang.String var10 = var3.toString();
    var3.setDia(2);
    int var13 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "14/03/0000"+ "'", var10.equals("14/03/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test304");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(13, 12, 102);
    var3.setAno(4);
    var3.setDia(9);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test305");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setDia((-1));
    int var9 = var3.getDia();
    int var10 = var3.getMes();
    var3.setMes(2);
    int var13 = var3.getDia();
    java.lang.String var14 = var3.toString();
    var3.setDia(103);
    var3.setMes(11);
    var3.setAno(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "-01/02/0000"+ "'", var14.equals("-01/02/0000"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test306");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    var3.setDia(0);
    int var12 = var3.getAno();
    var3.setMes(10);
    int var15 = var3.getDia();
    
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
    assertTrue(var15 == 0);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test307");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setDia((-1));
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    java.lang.String var13 = var3.toString();
    java.lang.String var14 = var3.toString();
    int var15 = var3.getDia();
    int var16 = var3.getMes();
    var3.setAno(102);
    
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
    assertTrue("'" + var14 + "' != '" + "-01/10/0001"+ "'", var14.equals("-01/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test308");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setDia(10);
    int var8 = var3.getDia();
    var3.setDia(1);
    var3.setMes(0);
    var3.setDia(13);
    var3.setMes(17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test309");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, 104, 104);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test310");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 101, 101);
    int var4 = var3.getAno();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test311");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    java.lang.String var4 = var3.toString();
    var3.setMes(11);
    var3.setDia(2);
    int var9 = var3.getAno();
    var3.setDia(0);
    var3.setDia(2);
    var3.setDia(103);
    var3.setMes(5);
    int var18 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/01/0002"+ "'", var4.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 5);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test312");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 100, 104);
    var3.setDia(103);
    var3.setDia(18);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test313");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 1, 11);
    var3.setDia(14);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "14/02/0011"+ "'", var6.equals("14/02/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test314");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(1);
    var0.setMes(101);
    var0.setDia(103);
    var0.setAno(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test315");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(106, 1, 3);
    var3.setAno(1);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test316");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 101, 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setDia(101);
    var3.setAno(104);
    int var11 = var3.getMes();
    java.lang.String var12 = var3.toString();
    int var13 = var3.getMes();
    int var14 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "101/102/0104"+ "'", var12.equals("101/102/0104"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 102);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test317");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getAno();
    int var13 = var3.getMes();
    var3.setMes(105);
    var3.setDia(8);
    
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
    assertTrue(var13 == 0);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test318");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 3, 102);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test319");


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
    int var19 = var3.getDia();
    int var20 = var3.getDia();
    var3.setMes(8);
    
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
    assertTrue(var19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test320");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 1, 10);
    var3.setDia(2);
    var3.setDia(101);
    java.lang.String var8 = var3.toString();
    var3.setAno(4);
    int var11 = var3.getDia();
    int var12 = var3.getMes();
    var3.setDia(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "101/02/0010"+ "'", var8.equals("101/02/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test321");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    int var6 = var0.getMes();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    int var9 = var0.getDia();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getAno();
    var0.setDia(4);
    int var14 = var0.getMes();
    var0.setAno(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/-01/0001"+ "'", var7.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/-01/0001"+ "'", var8.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00/-01/0001"+ "'", var10.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test322");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getDia();
    int var3 = var0.getDia();
    int var4 = var0.getDia();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getDia();
    var0.setDia(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00/00/0000"+ "'", var5.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test323");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setDia(0);
    int var9 = var3.getAno();
    java.lang.String var10 = var3.toString();
    var3.setAno(13);
    var3.setDia(15);
    int var15 = var3.getMes();
    var3.setMes(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "00/10/0002"+ "'", var10.equals("00/10/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test324");


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
    int var16 = var3.getMes();
    
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
    assertTrue(var16 == 0);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test325");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(9, 16, 6);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test326");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 1, 3);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test327");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 11, 106);
    int var4 = var3.getDia();
    var3.setAno(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 4);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test328");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    java.lang.String var4 = var3.toString();
    var3.setAno(11);
    var3.setAno(100);
    var3.setMes(1);
    var3.setMes(106);
    int var13 = var3.getAno();
    int var14 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01/01/0000"+ "'", var4.equals("01/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 106);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test329");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 1, 100);
    var3.setMes(3);
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/03/0100"+ "'", var8.equals("100/03/0100"));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test330");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getMes();
    int var5 = var0.getDia();
    java.lang.String var6 = var0.toString();
    var0.setDia(2);
    java.lang.String var9 = var0.toString();
    var0.setMes(104);
    int var12 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100/00/0000"+ "'", var6.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "02/00/0000"+ "'", var9.equals("02/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test331");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getDia();
    int var11 = var3.getMes();
    var3.setDia(103);
    int var14 = var3.getAno();
    var3.setDia(105);
    
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
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test332");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 1, 12);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "03/02/0012"+ "'", var4.equals("03/02/0012"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test333");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 5, 1);
    var3.setDia(16);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "16/06/0001"+ "'", var6.equals("16/06/0001"));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test334");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(1);
    var0.setMes(101);
    int var7 = var0.getDia();
    var0.setMes(12);
    var0.setDia(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test335");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 101, 101);
    var3.setDia(1);
    int var6 = var3.getMes();
    var3.setDia(2);
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test336");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 106, 1);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test337");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    int var10 = var3.getAno();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getDia();
    int var13 = var3.getMes();
    java.lang.String var14 = var3.toString();
    int var15 = var3.getMes();
    var3.setMes(18);
    var3.setDia(6);
    
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
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/00/0000"+ "'", var14.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test338");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 2, 10);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    var3.setMes(2);
    var3.setAno(1);
    int var10 = var3.getAno();
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    int var13 = var3.getAno();
    var3.setDia(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/03/0010"+ "'", var4.equals("00/03/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00/03/0010"+ "'", var5.equals("00/03/0010"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test339");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(0);
    var3.setDia(100);
    int var13 = var3.getDia();
    int var14 = var3.getDia();
    int var15 = var3.getAno();
    int var16 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test340");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getAno();
    int var11 = var3.getAno();
    int var12 = var3.getDia();
    int var13 = var3.getDia();
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
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test341");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 1, (-1));
    var3.setAno(101);
    var3.setDia(101);
    var3.setAno(1);
    var3.setDia(109);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test342");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 102, 101);
    int var4 = var3.getDia();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test343");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 15, 100);
    var3.setMes(6);
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 11);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test344");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    var3.setDia(102);
    var3.setDia(101);
    int var11 = var3.getMes();
    var3.setMes(107);
    var3.setMes(11);
    int var16 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 101);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test345");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 18, 102);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test346");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(109, 108, 106);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "109/109/0106"+ "'", var4.equals("109/109/0106"));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test347");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 100, 0);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getAno();
    var3.setMes(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "05/101/0000"+ "'", var4.equals("05/101/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test348");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 106, (-1));
    var3.setMes(5);
    var3.setDia(0);
    int var8 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test349");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 104, 11);
    java.lang.String var4 = var3.toString();
    var3.setAno(1);
    var3.setAno(5);
    var3.setDia(11);
    int var11 = var3.getMes();
    int var12 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "12/105/0011"+ "'", var4.equals("12/105/0011"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test350");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 0, 105);
    var3.setMes(103);
    int var6 = var3.getMes();
    java.lang.String var7 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "10/103/0105"+ "'", var7.equals("10/103/0105"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test351");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 0, 0);
    int var4 = var3.getDia();
    var3.setAno(0);
    int var7 = var3.getAno();
    var3.setMes(100);
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test352");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 10, 10);
    var3.setAno(11);
    var3.setAno(102);
    int var8 = var3.getDia();
    int var9 = var3.getAno();
    var3.setMes(110);
    var3.setMes((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test353");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 10, 0);
    int var4 = var3.getMes();
    int var5 = var3.getAno();
    var3.setDia(1);
    var3.setMes(6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test354");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 0, 100);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test355");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes((-1));
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getMes();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getAno();
    var3.setMes(105);
    int var15 = var3.getDia();
    int var16 = var3.getDia();
    int var17 = var3.getAno();
    int var18 = var3.getAno();
    int var19 = var3.getDia();
    
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
    assertTrue("'" + var11 + "' != '" + "100/-01/0000"+ "'", var11.equals("100/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test356");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 4, 102);
    java.lang.String var4 = var3.toString();
    var3.setDia(5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "102/05/0102"+ "'", var4.equals("102/05/0102"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test357");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 100, (-1));
    java.lang.String var4 = var3.toString();
    var3.setDia(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "103/101/-0001"+ "'", var4.equals("103/101/-0001"));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test358");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getAno();
    int var10 = var3.getAno();
    int var11 = var3.getDia();
    var3.setAno(2);
    var3.setMes(13);
    var3.setAno(0);
    var3.setAno(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test359");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(10);
    var3.setMes(10);
    var3.setMes(11);
    java.lang.String var12 = var3.toString();
    var3.setDia(107);
    int var15 = var3.getAno();
    var3.setDia(19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10/11/0001"+ "'", var12.equals("10/11/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test360");


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
    var3.setAno(1);
    java.lang.String var20 = var3.toString();
    var3.setAno(10);
    int var23 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "10/00/0000"+ "'", var17.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "10/00/0001"+ "'", var20.equals("10/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test361");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 2, 2);
    var3.setAno(14);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test362");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(18, 1, 110);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test363");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 2);
    var3.setDia(3);
    java.lang.String var6 = var3.toString();
    var3.setAno(15);
    var3.setMes(105);
    var3.setMes(16);
    var3.setDia(16);
    var3.setAno(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "03/02/0002"+ "'", var6.equals("03/02/0002"));

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test364");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 2, 106);
    var3.setAno(15);
    int var6 = var3.getAno();
    var3.setAno(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 15);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test365");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 2, 104);
    java.lang.String var4 = var3.toString();
    var3.setAno(13);
    var3.setMes(106);
    var3.setAno(104);
    var3.setMes(5);
    var3.setMes(108);
    var3.setMes(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/03/0104"+ "'", var4.equals("10/03/0104"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test366");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 10, 11);
    var3.setMes(2);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test367");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(1);
    var0.setDia(100);
    var0.setAno(10);
    var0.setMes(101);
    int var11 = var0.getAno();
    int var12 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test368");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 10, 18);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "-01/11/0018"+ "'", var4.equals("-01/11/0018"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test369");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    var3.setMes(1);
    var3.setMes(102);
    var3.setAno(101);
    var3.setAno(5);
    java.lang.String var17 = var3.toString();
    var3.setDia(105);
    var3.setMes(105);
    
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
    assertTrue("'" + var17 + "' != '" + "100/102/0005"+ "'", var17.equals("100/102/0005"));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test370");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(20, 108, 101);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test371");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 102, 1);
    var3.setDia(101);
    int var6 = var3.getDia();
    var3.setMes(100);
    var3.setMes(10);
    var3.setMes(103);
    int var13 = var3.getAno();
    var3.setMes(101);
    var3.setDia(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test372");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 101, 0);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    int var6 = var3.getDia();
    var3.setMes(102);
    var3.setDia(13);
    var3.setMes(105);
    int var13 = var3.getDia();
    var3.setMes(105);
    int var16 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01/102/0000"+ "'", var4.equals("01/102/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 13);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test373");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 100, 2);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    java.lang.String var6 = var3.toString();
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "-01/101/0002"+ "'", var6.equals("-01/101/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test374");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 13, 7);
    var3.setAno((-1));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test375");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getMes();
    int var5 = var0.getAno();
    var0.setAno(100);
    int var8 = var0.getDia();
    var0.setMes(11);
    var0.setAno(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test376");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    int var7 = var3.getAno();
    java.lang.String var8 = var3.toString();
    var3.setMes(103);
    var3.setAno(0);
    var3.setDia(104);
    var3.setAno(11);
    var3.setMes(3);
    var3.setMes(104);
    int var21 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "10/10/0001"+ "'", var8.equals("10/10/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 104);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test377");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    var3.setDia(0);
    var3.setAno(100);
    var3.setMes(0);
    var3.setMes(101);
    int var19 = var3.getDia();
    
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
    assertTrue(var19 == 0);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test378");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    int var11 = var3.getDia();
    int var12 = var3.getMes();
    
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
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test379");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setDia(0);
    var3.setDia(11);
    int var13 = var3.getDia();
    int var14 = var3.getMes();
    int var15 = var3.getAno();
    var3.setAno(10);
    java.lang.String var18 = var3.toString();
    var3.setDia(4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "11/01/0010"+ "'", var18.equals("11/01/0010"));

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test380");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 16, 9);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test381");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 1, 10);
    var3.setDia(2);
    var3.setDia(101);
    java.lang.String var8 = var3.toString();
    var3.setMes(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "101/02/0010"+ "'", var8.equals("101/02/0010"));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test382");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    java.lang.String var4 = var3.toString();
    var3.setMes(100);
    var3.setAno(101);
    int var9 = var3.getAno();
    int var10 = var3.getAno();
    int var11 = var3.getAno();
    int var12 = var3.getDia();
    java.lang.String var13 = var3.toString();
    int var14 = var3.getDia();
    var3.setAno(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01/01/0000"+ "'", var4.equals("01/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "01/100/0101"+ "'", var13.equals("01/100/0101"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test383");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getMes();
    var3.setAno(100);
    java.lang.String var7 = var3.toString();
    var3.setMes(105);
    var3.setMes(101);
    var3.setAno(2);
    int var14 = var3.getDia();
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "02/102/0100"+ "'", var7.equals("02/102/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "02/101/0002"+ "'", var15.equals("02/101/0002"));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test384");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    var3.setDia(100);
    var3.setDia(0);
    var3.setMes((-1));
    int var15 = var3.getMes();
    var3.setDia(1);
    var3.setDia(3);
    var3.setDia(1);
    int var22 = var3.getMes();
    
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
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test385");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 16, 0);
    int var4 = var3.getMes();
    var3.setMes(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 17);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test386");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 100, 101);
    var3.setDia(103);
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test387");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 11, 11);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test388");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 14, 104);
    var3.setMes((-1));

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test389");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 1, 2);
    int var4 = var3.getDia();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "00/02/0002"+ "'", var5.equals("00/02/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test390");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 0, 102);
    var3.setAno((-1));
    var3.setAno(106);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/01/0106"+ "'", var8.equals("100/01/0106"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test391");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    java.lang.String var4 = var3.toString();
    var3.setAno(11);
    var3.setDia(0);
    var3.setDia((-1));
    int var11 = var3.getAno();
    int var12 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "01/01/0000"+ "'", var4.equals("01/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 11);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test392");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 16, 4);
    int var4 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 17);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test393");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 0);
    var3.setDia(101);
    var3.setDia(0);
    int var8 = var3.getDia();
    int var9 = var3.getAno();
    var3.setMes(2);
    java.lang.String var12 = var3.toString();
    var3.setAno(16);
    int var15 = var3.getMes();
    var3.setAno(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00/02/0000"+ "'", var12.equals("00/02/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test394");


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
    var3.setAno(103);
    int var17 = var3.getAno();
    var3.setDia(104);
    java.lang.String var20 = var3.toString();
    var3.setAno(108);
    var3.setAno(6);
    
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
    assertTrue(var17 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "104/102/0103"+ "'", var20.equals("104/102/0103"));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test395");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 4, 103);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 6);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test396");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(0);
    var3.setAno(10);
    int var13 = var3.getDia();
    var3.setMes(101);
    var3.setDia(101);
    java.lang.String var18 = var3.toString();
    var3.setDia(105);
    var3.setAno(9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "101/101/0010"+ "'", var18.equals("101/101/0010"));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test397");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 5);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test398");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setAno(1);
    java.lang.String var7 = var3.toString();
    var3.setMes(103);
    var3.setDia(101);
    var3.setDia(104);
    var3.setMes(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test399");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getAno();
    var0.setDia(10);
    var0.setDia(5);
    var0.setMes(13);
    int var9 = var0.getAno();
    int var10 = var0.getDia();
    int var11 = var0.getMes();
    int var12 = var0.getDia();
    var0.setDia(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 5);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test400");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 0, 102);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    var3.setMes(104);
    int var8 = var3.getMes();
    var3.setAno(101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "-01/01/0102"+ "'", var5.equals("-01/01/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 104);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test401");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getMes();
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    var3.setMes(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "00/00/0000"+ "'", var8.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "00/00/0000"+ "'", var9.equals("00/00/0000"));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test402");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getDia();
    int var9 = var3.getDia();
    int var10 = var3.getAno();
    int var11 = var3.getMes();
    var3.setDia(101);
    int var14 = var3.getMes();
    int var15 = var3.getAno();
    var3.setDia(5);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test403");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 3, 17);
    int var4 = var3.getAno();
    var3.setMes(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 17);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test404");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 1, 15);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "15/02/0015"+ "'", var4.equals("15/02/0015"));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test405");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getDia();
    var0.setAno((-1));
    var0.setDia(103);
    var0.setDia(11);
    var0.setDia((-1));
    int var11 = var0.getDia();
    int var12 = var0.getAno();
    int var13 = var0.getMes();
    var0.setMes(17);
    var0.setDia(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test406");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    var3.setMes((-1));
    var3.setAno(10);
    int var11 = var3.getAno();
    int var12 = var3.getMes();
    var3.setAno(102);
    int var15 = var3.getDia();
    
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
    assertTrue(var15 == 100);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test407");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getDia();
    var0.setMes((-1));
    var0.setAno(101);
    var0.setMes(10);
    int var9 = var0.getAno();
    int var10 = var0.getMes();
    int var11 = var0.getAno();
    var0.setDia(11);
    int var14 = var0.getMes();
    int var15 = var0.getDia();
    int var16 = var0.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 101);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test408");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 18, 14);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 14);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test409");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 0, 2);
    java.lang.String var4 = var3.toString();
    var3.setMes(11);
    int var7 = var3.getMes();
    var3.setMes(100);
    var3.setDia(104);
    int var12 = var3.getDia();
    int var13 = var3.getDia();
    var3.setAno(2);
    java.lang.String var16 = var3.toString();
    var3.setMes(4);
    int var19 = var3.getDia();
    var3.setDia(108);
    var3.setAno(15);
    var3.setDia(107);
    var3.setMes(18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/01/0002"+ "'", var4.equals("00/01/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "104/100/0002"+ "'", var16.equals("104/100/0002"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 104);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test410");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    var3.setDia(100);
    int var12 = var3.getDia();
    java.lang.String var13 = var3.toString();
    var3.setAno(105);
    int var16 = var3.getDia();
    java.lang.String var17 = var3.toString();
    int var18 = var3.getMes();
    
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
    assertTrue("'" + var13 + "' != '" + "100/00/0000"+ "'", var13.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "100/00/0105"+ "'", var17.equals("100/00/0105"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test411");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    int var2 = var0.getDia();
    int var3 = var0.getDia();
    int var4 = var0.getDia();
    var0.setMes(5);
    java.lang.String var7 = var0.toString();
    int var8 = var0.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "00/05/0000"+ "'", var7.equals("00/05/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 5);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test412");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, 0);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    var3.setDia(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/101/0000"+ "'", var4.equals("100/101/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/101/0000"+ "'", var5.equals("100/101/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test413");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 2, 100);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test414");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 106, 104);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "104/107/0104"+ "'", var4.equals("104/107/0104"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test415");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    var3.setDia(100);
    int var12 = var3.getAno();
    var3.setDia((-1));
    var3.setDia(1);
    var3.setMes(11);
    var3.setMes(101);
    
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
    assertTrue(var12 == 0);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test416");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setMes((-1));
    int var3 = var0.getMes();
    var0.setAno(1);
    java.lang.String var6 = var0.toString();
    var0.setAno(102);
    int var9 = var0.getDia();
    int var10 = var0.getMes();
    var0.setDia(101);
    var0.setAno(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00/-01/0001"+ "'", var6.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test417");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    var0.setMes(105);
    var0.setDia(101);
    java.lang.String var8 = var0.toString();
    var0.setDia(12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "101/105/0000"+ "'", var8.equals("101/105/0000"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test418");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(102, 102, 100);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    var3.setDia(104);
    var3.setMes(102);
    java.lang.String var10 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "104/102/0100"+ "'", var10.equals("104/102/0100"));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test419");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    var3.setDia((-1));
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    int var10 = var3.getMes();
    int var11 = var3.getDia();
    int var12 = var3.getMes();
    var3.setMes(4);
    int var15 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test420");


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
    int var19 = var3.getMes();
    int var20 = var3.getMes();
    
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
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test421");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(102);
    var3.setDia(102);
    int var8 = var3.getMes();
    var3.setMes(12);
    var3.setMes(14);
    var3.setDia(108);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 102);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test422");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 101, 1);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getMes();
    var3.setDia(2);
    java.lang.String var8 = var3.toString();
    int var9 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "00/102/0001"+ "'", var4.equals("00/102/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "02/102/0001"+ "'", var8.equals("02/102/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 102);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test423");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 100, (-1));
    int var4 = var3.getMes();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    int var7 = var3.getMes();
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/101/-0001"+ "'", var5.equals("100/101/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "100/101/-0001"+ "'", var6.equals("100/101/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test424");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 3, 2);
    var3.setMes(10);
    var3.setAno(111);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test425");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 2, 10);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getDia();
    var3.setDia(107);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 100);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test426");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    java.lang.String var10 = var3.toString();
    var3.setAno(0);
    int var13 = var3.getAno();
    var3.setMes(109);
    int var16 = var3.getAno();
    int var17 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/-01/0000"+ "'", var10.equals("100/-01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test427");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, (-1), 102);
    var3.setMes(0);
    java.lang.String var6 = var3.toString();
    int var7 = var3.getMes();
    var3.setMes(1);
    java.lang.String var10 = var3.toString();
    int var11 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "10/00/0102"+ "'", var6.equals("10/00/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "10/01/0102"+ "'", var10.equals("10/01/0102"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test428");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 2, 100);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setMes(104);
    var3.setMes(17);
    var3.setMes(105);
    int var12 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 105);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test429");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(0);
    var3.setDia(100);
    var3.setAno(0);
    int var15 = var3.getAno();
    int var16 = var3.getDia();
    int var17 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test430");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(5, 106, 11);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 11);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test431");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(7, 16, 13);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test432");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    var3.setDia((-1));
    int var9 = var3.getDia();
    int var10 = var3.getMes();
    var3.setDia(100);
    var3.setDia(2);
    int var15 = var3.getDia();
    java.lang.String var16 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "02/00/0000"+ "'", var16.equals("02/00/0000"));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test433");


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
    int var17 = var3.getMes();
    int var18 = var3.getDia();
    
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
    assertTrue(var17 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test434");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 14, 100);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test435");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 102, 11);
    var3.setAno((-1));
    var3.setDia(0);
    var3.setMes(9);
    var3.setAno(2);
    int var12 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test436");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setMes(1);
    var3.setDia(103);
    int var13 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test437");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    var3.setAno((-1));
    var3.setAno((-1));
    int var11 = var3.getAno();
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    var3.setDia(1);
    var3.setMes(6);
    var3.setAno(107);
    var3.setDia(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "10/10/-0001"+ "'", var12.equals("10/10/-0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "10/10/-0001"+ "'", var13.equals("10/10/-0001"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test438");


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
    var3.setMes((-1));
    int var21 = var3.getDia();
    int var22 = var3.getAno();
    var3.setDia(18);
    int var25 = var3.getAno();
    var3.setAno(18);
    
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
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test439");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(8, 110, 106);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test440");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 1, 0);
    var3.setMes(102);
    int var6 = var3.getAno();
    int var7 = var3.getMes();
    int var8 = var3.getAno();
    var3.setAno(104);
    var3.setDia(100);
    var3.setAno(1);
    java.lang.String var15 = var3.toString();
    var3.setAno(17);
    java.lang.String var18 = var3.toString();
    int var19 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "100/102/0001"+ "'", var15.equals("100/102/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "100/102/0017"+ "'", var18.equals("100/102/0017"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test441");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 106, 3);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test442");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    int var10 = var3.getMes();
    java.lang.String var11 = var3.toString();
    int var12 = var3.getDia();
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
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "100/00/0000"+ "'", var11.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test443");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(104, 102, 102);
    int var4 = var3.getAno();
    var3.setMes(14);
    var3.setAno(16);
    int var9 = var3.getDia();
    int var10 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 104);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test444");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes(1);
    var3.setDia(0);
    java.lang.String var11 = var3.toString();
    var3.setMes(2);
    int var14 = var3.getMes();
    java.lang.String var15 = var3.toString();
    int var16 = var3.getDia();
    int var17 = var3.getMes();
    int var18 = var3.getDia();
    int var19 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "00/01/0000"+ "'", var11.equals("00/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "00/02/0000"+ "'", var15.equals("00/02/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test445");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    var3.setAno(1);
    int var11 = var3.getDia();
    int var12 = var3.getDia();
    var3.setDia(101);
    int var15 = var3.getDia();
    int var16 = var3.getAno();
    var3.setMes(106);
    
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
    assertTrue(var11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test446");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(6, 100, 0);
    var3.setMes(17);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test447");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, (-1), 12);
    int var4 = var3.getAno();
    java.lang.String var5 = var3.toString();
    var3.setMes(104);
    java.lang.String var8 = var3.toString();
    var3.setDia(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "01/00/0012"+ "'", var5.equals("01/00/0012"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "01/104/0012"+ "'", var8.equals("01/104/0012"));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test448");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 4, 103);
    var3.setDia(9);
    var3.setDia(111);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test449");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getMes();
    java.lang.String var2 = var0.toString();
    var0.setAno(100);
    var0.setDia(100);
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.toString();
    var0.setMes(3);
    int var11 = var0.getDia();
    var0.setAno(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "00/00/0000"+ "'", var2.equals("00/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0100"+ "'", var7.equals("100/00/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "100/00/0100"+ "'", var8.equals("100/00/0100"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test450");


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
    var3.setDia(104);
    
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

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test451");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 102, 11);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getDia();
    int var7 = var3.getAno();
    var3.setMes(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 105);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 11);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test452");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    int var4 = var3.getMes();
    var3.setAno(0);
    int var7 = var3.getMes();
    int var8 = var3.getDia();
    java.lang.String var9 = var3.toString();
    int var10 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "10/101/0000"+ "'", var9.equals("10/101/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 101);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test453");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 0, 101);
    var3.setMes(106);
    var3.setMes(105);
    int var8 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test454");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getAno();
    int var10 = var3.getAno();
    int var11 = var3.getDia();
    var3.setAno(2);
    var3.setMes(100);
    var3.setAno(101);
    var3.setMes((-1));
    var3.setMes(17);
    java.lang.String var22 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "10/17/0101"+ "'", var22.equals("10/17/0101"));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test455");


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
    var3.setDia(2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00/00/0001"+ "'", var17.equals("00/00/0001"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test456");


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
    var3.setMes(3);
    int var21 = var3.getDia();
    java.lang.String var22 = var3.toString();
    var3.setAno(102);
    var3.setMes(103);
    int var27 = var3.getAno();
    int var28 = var3.getDia();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "10/03/0000"+ "'", var22.equals("10/03/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 102);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test457");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(101, 0, 100);
    int var4 = var3.getAno();
    var3.setAno(3);
    int var7 = var3.getDia();
    var3.setDia(2);
    var3.setDia(15);
    java.lang.String var12 = var3.toString();
    var3.setMes(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "15/01/0003"+ "'", var12.equals("15/01/0003"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test458");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 100, 105);
    java.lang.String var4 = var3.toString();
    int var5 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "12/101/0105"+ "'", var4.equals("12/101/0105"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 12);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test459");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    var3.setMes((-1));
    int var10 = var3.getMes();
    var3.setMes(104);
    var3.setDia(104);
    var3.setDia(5);
    var3.setAno(104);
    var3.setAno(19);
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
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 19);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test460");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 1, 1);
    var3.setMes((-1));
    java.lang.String var6 = var3.toString();
    var3.setMes(1);
    int var9 = var3.getMes();
    var3.setMes(13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "00/-01/0001"+ "'", var6.equals("00/-01/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test461");


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
    var3.setAno(104);
    int var19 = var3.getDia();
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
    assertTrue(var10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 104);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test462");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 10, 100);
    var3.setMes(104);
    var3.setMes(10);
    var3.setDia(0);
    int var10 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test463");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    var3.setAno(10);
    var3.setDia(100);
    var3.setDia(12);
    int var12 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "100/00/0000"+ "'", var4.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "100/00/0000"+ "'", var5.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 10);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test464");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(17, 107, 11);
    int var4 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 17);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test465");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(1, 0, 0);
    var3.setDia(2);
    var3.setAno(0);
    java.lang.String var8 = var3.toString();
    var3.setDia(2);
    var3.setDia(12);
    int var13 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "02/01/0000"+ "'", var8.equals("02/01/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 12);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test466");


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
    var3.setMes(100);
    
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

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test467");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(15, 5, 16);
    var3.setDia(106);
    java.lang.String var6 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "106/06/0016"+ "'", var6.equals("106/06/0016"));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test468");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(107, 1, 109);
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 109);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test469");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 11, 2);
    var3.setDia(101);
    int var6 = var3.getMes();
    var3.setDia(10);
    var3.setDia(104);
    int var11 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 104);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test470");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    var3.setDia(110);
    
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

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test471");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 11, 9);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test472");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 106, 104);
    var3.setMes(11);
    var3.setMes(3);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test473");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    var0.setDia(10);
    int var3 = var0.getMes();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    int var6 = var0.getAno();
    var0.setAno(100);
    var0.setMes(9);
    var0.setMes(104);
    int var13 = var0.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "10/00/0000"+ "'", var4.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "10/00/0000"+ "'", var5.equals("10/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test474");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(0, 12, 2);
    var3.setDia(3);
    int var6 = var3.getMes();
    int var7 = var3.getMes();
    var3.setMes(0);
    var3.setMes(10);
    var3.setDia(16);
    var3.setMes(102);
    int var16 = var3.getMes();
    var3.setAno(20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 102);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test475");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getDia();
    var3.setMes(102);
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    java.lang.String var14 = var3.toString();
    var3.setMes(8);
    var3.setDia(101);
    var3.setAno(110);
    var3.setMes(8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "00/102/0000"+ "'", var12.equals("00/102/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "00/102/0000"+ "'", var13.equals("00/102/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "00/102/0000"+ "'", var14.equals("00/102/0000"));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test476");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(105, 11, 7);
    var3.setDia(15);
    var3.setDia(16);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test477");


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
    var3.setAno(0);
    int var17 = var3.getMes();
    var3.setDia(13);
    int var20 = var3.getAno();
    var3.setMes(10);
    java.lang.String var23 = var3.toString();
    var3.setMes(104);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "13/10/0000"+ "'", var23.equals("13/10/0000"));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test478");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 100, (-1));
    int var4 = var3.getDia();
    var3.setMes(18);
    var3.setAno(11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test479");


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
    var3.setAno(100);
    var3.setDia(101);
    int var22 = var3.getAno();
    int var23 = var3.getAno();
    var3.setDia(0);
    int var26 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "100/00/0001"+ "'", var7.equals("100/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "00/00/0001"+ "'", var17.equals("00/00/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test480");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    var3.setDia(0);
    int var7 = var3.getDia();
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    var3.setDia(2);
    var3.setAno(102);
    var3.setMes(111);
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
    assertTrue(var16 == 102);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test481");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 1, 13);
    int var4 = var3.getDia();
    var3.setAno(107);
    var3.setAno(5);
    int var9 = var3.getDia();
    var3.setDia(106);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test482");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(10);
    int var6 = var3.getDia();
    var3.setMes(0);
    int var9 = var3.getDia();
    var3.setDia(11);
    var3.setDia((-1));
    var3.setDia(0);
    var3.setAno(13);
    var3.setDia(11);
    int var20 = var3.getDia();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 11);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test483");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(2, 101, 2);
    int var4 = var3.getAno();
    int var5 = var3.getAno();
    int var6 = var3.getMes();
    var3.setDia(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 102);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test484");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(108, 111, 15);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test485");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 7, (-1));
    int var4 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test486");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(3, 0, 12);
    int var4 = var3.getDia();
    var3.setAno(6);
    var3.setDia(7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 3);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test487");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, (-1));
    int var4 = var3.getAno();
    var3.setAno(0);
    int var7 = var3.getAno();
    int var8 = var3.getDia();
    var3.setDia(15);
    int var11 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test488");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(4, 106, 16);
    java.lang.String var4 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "04/107/0016"+ "'", var4.equals("04/107/0016"));

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test489");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getDia();
    int var6 = var3.getAno();
    var3.setMes((-1));
    var3.setDia(101);
    int var11 = var3.getDia();
    int var12 = var3.getAno();
    var3.setAno(104);
    int var15 = var3.getMes();
    var3.setDia(100);
    var3.setDia(14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test490");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 15, 1);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test491");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(103, 103, 11);
    int var4 = var3.getAno();
    int var5 = var3.getMes();
    var3.setAno(12);
    java.lang.String var8 = var3.toString();
    var3.setDia(111);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "103/104/0012"+ "'", var8.equals("103/104/0012"));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test492");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(18, 102, 14);
    int var4 = var3.getDia();
    int var5 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 14);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test493");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, 9, 103);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test494");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(11, 4, (-1));
    var3.setAno(18);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test495");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(12, 106, 13);
    var3.setDia(110);
    int var6 = var3.getAno();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 13);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test496");


    com.application.ciadobusao.util.DataDoEncontro var0 = new com.application.ciadobusao.util.DataDoEncontro();
    int var1 = var0.getAno();
    var0.setDia(100);
    int var4 = var0.getMes();
    int var5 = var0.getDia();
    var0.setAno(10);
    int var8 = var0.getDia();
    int var9 = var0.getAno();
    java.lang.String var10 = var0.toString();
    var0.setAno((-1));
    var0.setDia(104);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/00/0010"+ "'", var10.equals("100/00/0010"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test497");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro((-1), 102, 101);
    int var4 = var3.getDia();
    int var5 = var3.getAno();
    int var6 = var3.getAno();
    int var7 = var3.getAno();
    int var8 = var3.getMes();
    int var9 = var3.getAno();
    var3.setDia(100);
    int var12 = var3.getMes();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 103);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test498");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    int var6 = var3.getMes();
    int var7 = var3.getDia();
    java.lang.String var8 = var3.toString();
    int var9 = var3.getDia();
    java.lang.String var10 = var3.toString();
    int var11 = var3.getMes();
    int var12 = var3.getAno();
    int var13 = var3.getDia();
    var3.setDia(103);
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
    assertTrue("'" + var8 + "' != '" + "100/00/0000"+ "'", var8.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "100/00/0000"+ "'", var10.equals("100/00/0000"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test499");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(10, 100, 1);
    var3.setMes(100);
    var3.setDia((-1));
    int var8 = var3.getAno();
    int var9 = var3.getMes();
    java.lang.String var10 = var3.toString();
    int var11 = var3.getDia();
    java.lang.String var12 = var3.toString();
    java.lang.String var13 = var3.toString();
    var3.setAno(103);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "-01/100/0001"+ "'", var10.equals("-01/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "-01/100/0001"+ "'", var12.equals("-01/100/0001"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "-01/100/0001"+ "'", var13.equals("-01/100/0001"));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nDataDoEncontro61.test500");


    com.application.ciadobusao.util.DataDoEncontro var3 = new com.application.ciadobusao.util.DataDoEncontro(100, (-1), 0);
    int var4 = var3.getMes();
    int var5 = var3.getMes();
    var3.setDia(10);
    int var8 = var3.getDia();
    var3.setDia(1);
    var3.setMes(0);
    int var13 = var3.getDia();
    int var14 = var3.getAno();
    java.lang.String var15 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "01/00/0000"+ "'", var15.equals("01/00/0000"));

  }

}