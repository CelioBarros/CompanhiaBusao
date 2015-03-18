package randoop;

import junit.framework.*;

public class Encontro27 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test1");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    java.lang.String var3 = var0.toString();
    var0.setLongitude(10.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var3.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test2");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLongitude((-1.0d));
    java.lang.String var12 = var0.getPonto();
    java.lang.String var13 = var0.toString();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test3");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setNome("hi!");
    java.lang.String var10 = var0.getNome();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getIdDono();
    java.lang.String var14 = var0.getPonto();
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setLongitude((-1.0d));
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    int var20 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test4");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getLinha();
    java.lang.String var7 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var8 = var0.getData();
    java.lang.String var9 = var0.getIdDono();
    java.lang.String var10 = var0.toString();
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test5");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    double var16 = var0.getLatitude();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var21 = var0.getLinha();
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getIdDono();
    java.util.List var24 = var0.getPerfisConfirmados();
    java.lang.String var25 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test6");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    double var10 = var0.getLatitude();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setLongitude(100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test7");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getIdDono();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test8");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setLongitude(1.0d);
    java.lang.String var17 = var0.getLinha();
    int var18 = var0.getId();
    double var19 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var22 = var0.getPerfisConfirmados();
    java.lang.String var23 = var0.getLinha();
    double var24 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test9");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getLinha();
    java.lang.String var9 = var0.getPonto();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test10");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    var0.setLongitude(100.0d);
    var0.setPonto("");
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var17 = var0.getPerfisConfirmados();
    int var18 = var0.getId();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test11");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var7 = var0.getNomeDono();
    java.lang.String var8 = var0.toString();
    var0.setLatitude(0.0d);
    var0.setLatitude(10.0d);
    var0.setIdDono("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test12");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.getPonto();
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setId((-1));
    double var13 = var0.getLongitude();
    java.util.List var14 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test13");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.toString();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("");
    java.lang.String var16 = var0.getNome();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    double var20 = var0.getLongitude();
    com.application.ciadobusao.util.DataDoEncontro var21 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test14");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.util.List var4 = var0.getPerfisConfirmados();
    double var5 = var0.getLongitude();
    var0.setId(100);
    var0.setLatitude(0.0d);
    var0.setLatitude(0.0d);
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    int var14 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var17 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test15");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    double var12 = var0.getLongitude();
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var15 = var0.getPerfisChegaram();
    double var16 = var0.getLatitude();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(10.0d);
    java.util.List var21 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test16");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.util.List var9 = var0.getPerfisChegaram();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test17");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    java.util.List var13 = var0.getPerfisConfirmados();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    double var18 = var0.getLongitude();
    var0.setId((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1.0d));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test18");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test19");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    double var7 = var0.getLatitude();
    var0.setLongitude((-1.0d));
    java.lang.String var10 = var0.getLinha();
    var0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test20");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    int var8 = var0.getId();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test21");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getNome();
    var0.setPonto("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    java.lang.String var17 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var17.equals("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test22");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.getNomeDono();
    java.util.List var12 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    java.util.List var19 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test23");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    var0.setLongitude(10.0d);
    var0.setLinha("");
    java.lang.String var17 = var0.toString();
    int var18 = var0.getId();
    var0.setNomeDono("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var21 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var22 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=null, linha=, ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test24");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(1);
    java.util.List var15 = var0.getPerfisChegaram();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var18 = var0.getPerfisConfirmados();
    double var19 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test25");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.setPonto("");
    java.util.List var10 = var0.getPerfisChegaram();
    java.lang.String var11 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    int var14 = var0.getId();
    java.util.List var15 = var0.getPerfisChegaram();
    var0.setId(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test26");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getNome();
    java.util.List var7 = var0.getPerfisChegaram();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    double var11 = var0.getLongitude();
    java.lang.String var12 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var15 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test27");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("hi!");
    var0.setLatitude(0.0d);
    var0.setLongitude((-1.0d));
    java.util.List var20 = var0.getPerfisChegaram();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    int var23 = var0.getId();
    double var24 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test28");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setId(100);
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var20 = var0.getIdDono();
    double var21 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var26 = var0.getHorario();
    java.lang.String var27 = var0.toString();
    int var28 = var0.getId();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var27.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 100);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test29");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    java.util.List var15 = var0.getPerfisConfirmados();
    java.lang.String var16 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    java.util.List var23 = var0.getPerfisChegaram();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    java.lang.String var32 = var0.getLinha();
    double var33 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]"+ "'", var32.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0.0d);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test30");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.toString();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId(10);
    java.lang.String var20 = var0.getNomeDono();
    java.lang.String var21 = var0.getNomeDono();
    java.lang.String var22 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test31");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getPonto();
    var0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test32");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.setLongitude(0.0d);
    java.lang.String var14 = var0.getPonto();
    java.lang.String var15 = var0.getIdDono();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=hi!, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test33");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    int var16 = var0.getId();
    var0.setLatitude(1.0d);
    double var19 = var0.getLongitude();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var22 = var0.getLatitude();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1.0d);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test34");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    int var10 = var0.getId();
    var0.setLongitude(0.0d);
    double var13 = var0.getLatitude();
    java.lang.String var14 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test35");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test36");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.getIdDono();
    var0.setNome("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var17 = var0.getPerfisChegaram();
    int var18 = var0.getId();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var21 = var0.getNome();
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test37");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    var0.addPerfisConfirmados("");
    java.util.List var9 = var0.getPerfisConfirmados();
    java.lang.String var10 = var0.toString();
    var0.setLinha("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test38");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var8 = var0.getData();
    var0.setNome("");
    java.util.List var11 = var0.getPerfisConfirmados();
    int var12 = var0.getId();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test39");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    java.util.List var9 = var0.getPerfisConfirmados();
    var0.setId(100);
    java.util.List var12 = var0.getPerfisConfirmados();
    java.util.List var13 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    var0.setLatitude(0.0d);
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test40");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var6 = var0.getHorario();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var9 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test41");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getPonto();
    var0.setPonto("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    double var10 = var0.getLatitude();
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    var0.setLongitude(0.0d);
    double var14 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test42");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getPonto();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    java.lang.String var12 = var0.getNomeDono();
    var0.setLongitude((-1.0d));
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test43");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    double var12 = var0.getLongitude();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.lang.String var14 = var0.getIdDono();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var17 = var0.getLinha();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test44");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("hi!");
    var0.setLongitude(0.0d);
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var23 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test45");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getPonto();
    java.util.List var8 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setNomeDono("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test46");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(1.0d);
    var0.setLatitude((-1.0d));
    var0.setLongitude((-1.0d));
    java.lang.String var15 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test47");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.toString();
    java.util.List var11 = var0.getPerfisChegaram();
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setLatitude(10.0d);
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude((-1.0d));
    java.lang.String var20 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test48");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getPonto();
    java.util.List var14 = var0.getPerfisConfirmados();
    int var15 = var0.getId();
    java.util.List var16 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test49");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.toString();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNomeDono();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test50");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("");
    var0.setLatitude(100.0d);
    int var21 = var0.getId();
    var0.setNome("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var24 = var0.toString();
    java.util.List var25 = var0.getPerfisChegaram();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Encontro [nome=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var24.equals("Encontro [nome=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test51");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    java.util.List var8 = var0.getPerfisConfirmados();
    var0.setId(10);
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=hi!, horario=null, data=null]");
    java.util.List var16 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test52");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    var0.setNome("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test53");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNome();
    var0.setId(1);
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getNome();
    double var17 = var0.getLongitude();
    java.lang.String var18 = var0.getLinha();
    java.lang.String var19 = var0.toString();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var22 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test54");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    var0.setNome("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.lang.String var16 = var0.getNomeDono();
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test55");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.getIdDono();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test56");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var6 = var0.getHorario();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var9 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test57");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("hi!");
    var0.setLongitude(0.0d);
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getNomeDono();
    java.lang.String var21 = var0.getLinha();
    java.lang.String var22 = var0.getIdDono();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test58");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    int var5 = var0.getId();
    var0.setId(10);
    com.application.ciadobusao.util.DataDoEncontro var8 = var0.getData();
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test59");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    java.lang.String var3 = var0.toString();
    var0.setLongitude(10.0d);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var8 = var0.toString();
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var3.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test60");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    var0.setLongitude(10.0d);
    var0.setLinha("");
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.getPonto();
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test61");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setLongitude(0.0d);
    java.util.List var8 = var0.getPerfisChegaram();
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    java.lang.String var16 = var0.getPonto();
    var0.setPonto("Encontro [nome=, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test62");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNomeDono();
    java.lang.String var15 = var0.getPonto();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.util.List var18 = var0.getPerfisChegaram();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test63");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getLinha();
    java.lang.String var15 = var0.getLinha();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var20 = var0.getData();
    java.util.List var21 = var0.getPerfisConfirmados();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test64");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setId(100);
    var0.setId(1);
    java.lang.String var17 = var0.getLinha();
    com.application.ciadobusao.util.DataDoEncontro var18 = var0.getData();
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setId((-1));
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test65");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.addPerfisConfirmados("hi!");
    var0.setPonto("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.setId(1);
    java.lang.String var20 = var0.getLinha();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLatitude(1.0d);
    java.lang.String var25 = var0.getNome();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test66");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getPonto();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.setPonto("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test67");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getLinha();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    int var13 = var0.getId();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test68");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setId(100);
    var0.setId(1);
    java.lang.String var17 = var0.getLinha();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    int var22 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test69");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.toString();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId(10);
    java.lang.String var20 = var0.getNomeDono();
    java.lang.String var21 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test70");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("hi!");
    var0.setLongitude(0.0d);
    var0.setLongitude(100.0d);
    var0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test71");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.getIdDono();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var13 = var0.getNome();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    var0.setNomeDono("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]");
    java.lang.String var17 = var0.toString();
    int var18 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test72");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var15 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    double var18 = var0.getLatitude();
    java.util.List var19 = var0.getPerfisChegaram();
    java.lang.String var20 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test73");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getIdDono();
    var0.setLatitude(0.0d);
    java.lang.String var12 = var0.getNomeDono();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getNome();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var18 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test74");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    java.util.List var10 = var0.getPerfisChegaram();
    double var11 = var0.getLatitude();
    java.lang.String var12 = var0.getLinha();
    java.lang.String var13 = var0.getNome();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test75");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.getLinha();
    java.util.List var17 = var0.getPerfisConfirmados();
    var0.setId(100);
    java.util.List var20 = var0.getPerfisConfirmados();
    java.lang.String var21 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test76");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("hi!");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.DataDoEncontro var22 = var0.getData();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test77");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var22 = var0.getPonto();
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var22.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]"+ "'", var23.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test78");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    java.lang.String var10 = var0.getPonto();
    double var11 = var0.getLatitude();
    java.lang.String var12 = var0.getIdDono();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.util.List var14 = var0.getPerfisConfirmados();
    java.lang.String var15 = var0.getPonto();
    double var16 = var0.getLatitude();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test79");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getNome();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var11 = var0.getPerfisConfirmados();
    var0.setId(1);
    java.lang.String var14 = var0.getLinha();
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test80");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.setPonto("");
    java.util.List var10 = var0.getPerfisChegaram();
    java.lang.String var11 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    int var14 = var0.getId();
    java.util.List var15 = var0.getPerfisChegaram();
    double var16 = var0.getLatitude();
    var0.setLongitude(100.0d);
    java.lang.String var19 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test81");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setId(100);
    var0.setId(1);
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test82");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getNomeDono();
    double var14 = var0.getLongitude();
    var0.setIdDono("");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    int var19 = var0.getId();
    double var20 = var0.getLongitude();
    com.application.ciadobusao.util.HorarioDoEncontro var21 = var0.getHorario();
    com.application.ciadobusao.util.DataDoEncontro var22 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test83");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    double var9 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var21 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test84");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setLatitude(100.0d);
    java.lang.String var22 = var0.getPonto();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test85");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    double var10 = var0.getLatitude();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var17 = var0.getLatitude();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test86");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    int var16 = var0.getId();
    java.lang.String var17 = var0.toString();
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test87");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    java.lang.String var10 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    int var13 = var0.getId();
    java.lang.String var14 = var0.getLinha();
    java.util.List var15 = var0.getPerfisConfirmados();
    java.util.List var16 = var0.getPerfisChegaram();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var21 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test88");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    java.util.List var15 = var0.getPerfisConfirmados();
    java.util.List var16 = var0.getPerfisChegaram();
    java.lang.String var17 = var0.getNome();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var20 = var0.getLatitude();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test89");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.getPonto();
    java.lang.String var12 = var0.getNome();
    var0.setIdDono("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.lang.String var15 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]"+ "'", var15.equals("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test90");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.getNomeDono();
    double var11 = var0.getLatitude();
    int var12 = var0.getId();
    java.lang.String var13 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var18 = var0.getIdDono();
    java.lang.String var19 = var0.getNomeDono();
    java.util.List var20 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var21 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test91");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    int var17 = var0.getId();
    java.util.List var18 = var0.getPerfisConfirmados();
    var0.setLatitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.lang.String var23 = var0.getIdDono();
    var0.setNomeDono("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test92");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setNomeDono("hi!");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.toString();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var11 = var0.getLinha();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test93");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNomeDono();
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setId(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test94");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getIdDono();
    double var14 = var0.getLatitude();
    java.lang.String var15 = var0.getNomeDono();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdDono();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=hi!, linha=hi!, ponto=, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test95");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var20 = var0.getData();
    java.lang.String var21 = var0.getIdDono();
    java.lang.String var22 = var0.getNome();
    com.application.ciadobusao.util.DataDoEncontro var23 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var22.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test96");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    int var3 = var0.getId();
    com.application.ciadobusao.util.DataDoEncontro var4 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var9 = var0.getPonto();
    double var10 = var0.getLongitude();
    var0.setIdDono("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test97");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.toString();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getNomeDono();
    var0.setLongitude(100.0d);
    java.lang.String var9 = var0.getLinha();
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"+ "'", var2.equals("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"+ "'", var5.equals("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test98");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    double var11 = var0.getLatitude();
    java.lang.String var12 = var0.getPonto();
    java.util.List var13 = var0.getPerfisConfirmados();
    java.lang.String var14 = var0.getPonto();
    java.util.List var15 = var0.getPerfisChegaram();
    double var16 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test99");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getNome();
    var0.setId(10);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(0.0d);
    java.util.List var14 = var0.getPerfisChegaram();
    double var15 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test100");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.setId(10);
    java.util.List var14 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test101");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    var0.setId(100);
    var0.setNomeDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var8 = var0.getPonto();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test102");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var12 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getPonto();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test103");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.util.List var5 = var0.getPerfisChegaram();
    int var6 = var0.getId();
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setNome("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    java.util.List var13 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test104");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    double var6 = var0.getLongitude();
    int var7 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test105");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    double var10 = var0.getLatitude();
    double var11 = var0.getLatitude();
    java.lang.String var12 = var0.getNome();
    var0.setNomeDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test106");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    double var11 = var0.getLatitude();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    var0.addPerfisChegados("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.lang.String var15 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test107");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getIdDono();
    var0.setId(100);
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLatitude(100.0d);
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test108");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    java.util.List var15 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test109");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLatitude((-1.0d));
    var0.setIdDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test110");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    double var11 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test111");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getNome();
    var0.setId(10);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisChegaram();
    java.util.List var13 = var0.getPerfisChegaram();
    double var14 = var0.getLatitude();
    var0.setLatitude(10.0d);
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test112");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.lang.String var4 = var0.getNome();
    com.application.ciadobusao.util.DataDoEncontro var5 = var0.getData();
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test113");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setLongitude(0.0d);
    java.util.List var8 = var0.getPerfisChegaram();
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    java.lang.String var16 = var0.getPonto();
    var0.setPonto("Encontro [nome=, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test114");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(0);
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.getNomeDono();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getPonto();
    java.lang.String var20 = var0.toString();
    var0.setNomeDono("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var20.equals("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test115");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setId(100);
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var20 = var0.getIdDono();
    java.lang.String var21 = var0.getNomeDono();
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test116");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    java.util.List var10 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setId(10);
    java.lang.String var16 = var0.getIdDono();
    java.lang.String var17 = var0.getLinha();
    java.lang.String var18 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test117");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.getNomeDono();
    java.lang.String var11 = var0.getNome();
    var0.setId(0);
    java.lang.String var14 = var0.getPonto();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLatitude(10.0d);
    java.lang.String var21 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test118");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test119");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test120");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setNome("hi!");
    java.lang.String var10 = var0.getNome();
    java.util.List var11 = var0.getPerfisChegaram();
    java.lang.String var12 = var0.getLinha();
    var0.setId(0);
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var17 = var0.getIdDono();
    java.util.List var18 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test121");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    double var11 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test122");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    var0.setLatitude(1.0d);
    var0.setLatitude(10.0d);
    double var21 = var0.getLatitude();
    var0.setId(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10.0d);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test123");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    java.lang.String var13 = var0.getLinha();
    java.lang.String var14 = var0.getNomeDono();
    java.lang.String var15 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test124");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    var0.setLongitude(100.0d);
    java.util.List var20 = var0.getPerfisChegaram();
    double var21 = var0.getLatitude();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test125");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    java.lang.String var15 = var0.toString();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude((-1.0d));
    com.application.ciadobusao.util.HorarioDoEncontro var20 = var0.getHorario();
    double var21 = var0.getLatitude();
    int var22 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test126");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setId(10);
    double var12 = var0.getLongitude();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test127");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    java.lang.String var18 = var0.getPonto();
    var0.setNome("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    int var21 = var0.getId();
    int var22 = var0.getId();
    com.application.ciadobusao.util.DataDoEncontro var23 = var0.getData();
    double var24 = var0.getLatitude();
    int var25 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test128");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.setPonto("");
    java.util.List var10 = var0.getPerfisChegaram();
    java.lang.String var11 = var0.getNome();
    double var12 = var0.getLongitude();
    var0.addPerfisConfirmados("hi!");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLongitude(1.0d);
    var0.setNomeDono("hi!");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    double var23 = var0.getLatitude();
    var0.setId(10);
    var0.setNome("Encontro [nome=, linha=Encontro [nome=null, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test129");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getPonto();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    java.util.List var15 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test130");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    int var11 = var0.getId();
    double var12 = var0.getLatitude();
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var15 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    java.lang.String var17 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var15.equals("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test131");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.util.List var4 = var0.getPerfisConfirmados();
    int var5 = var0.getId();
    java.lang.String var6 = var0.getNome();
    java.util.List var7 = var0.getPerfisConfirmados();
    java.util.List var8 = var0.getPerfisConfirmados();
    double var9 = var0.getLongitude();
    var0.setLatitude(10.0d);
    java.lang.String var12 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test132");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.getLinha();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var18 = var0.toString();
    double var19 = var0.getLongitude();
    java.lang.String var20 = var0.getPonto();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test133");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    double var10 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var21 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test134");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    var0.setLatitude(0.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var13 = var0.getNome();
    var0.setLongitude(0.0d);
    java.lang.String var16 = var0.getNome();
    double var17 = var0.getLongitude();
    java.lang.String var18 = var0.getIdDono();
    java.lang.String var19 = var0.getPonto();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test135");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setId(100);
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test136");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var7 = var0.getNomeDono();
    java.lang.String var8 = var0.toString();
    var0.setLatitude(0.0d);
    java.lang.String var11 = var0.getLinha();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test137");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setId(100);
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    java.lang.String var15 = var0.getIdDono();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test138");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    java.lang.String var10 = var0.toString();
    int var11 = var0.getId();
    var0.setNome("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getLinha();
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test139");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.getIdDono();
    var0.setPonto("");
    double var12 = var0.getLongitude();
    var0.setId((-1));
    var0.addPerfisConfirmados("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    int var19 = var0.getId();
    java.lang.String var20 = var0.getNomeDono();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test140");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    int var11 = var0.getId();
    double var12 = var0.getLatitude();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    double var15 = var0.getLongitude();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var20 = var0.getNomeDono();
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test141");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.getNomeDono();
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var16 = var0.toString();
    var0.setLongitude((-1.0d));
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=, ponto=, horario=null, data=null]");
    var0.setLongitude((-1.0d));
    int var23 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test142");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.addPerfisChegados("hi!");
    var0.setId(10);
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    int var18 = var0.getId();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 10);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test143");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test144");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getNome();
    var0.setNomeDono("hi!");
    java.lang.String var16 = var0.getPonto();
    var0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test145");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getNome();
    var0.setLatitude((-1.0d));
    var0.setLatitude(10.0d);
    java.lang.String var17 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test146");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude((-1.0d));
    double var13 = var0.getLongitude();
    java.lang.String var14 = var0.getNomeDono();
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test147");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getIdDono();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    double var15 = var0.getLatitude();
    double var16 = var0.getLatitude();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test148");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test149");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    java.lang.String var10 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    java.util.List var16 = var0.getPerfisConfirmados();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test150");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    int var8 = var0.getId();
    var0.setIdDono("Encontro [nome=, linha=null, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test151");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getPonto();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var21 = var0.getNomeDono();
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    java.lang.String var23 = var0.getNome();
    var0.setLongitude(100.0d);
    java.util.List var26 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test152");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getLinha();
    java.util.List var14 = var0.getPerfisConfirmados();
    java.lang.String var15 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test153");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    java.lang.String var12 = var0.getNome();
    java.util.List var13 = var0.getPerfisChegaram();
    int var14 = var0.getId();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    int var17 = var0.getId();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    double var20 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test154");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.toString();
    double var10 = var0.getLatitude();
    var0.setPonto("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    java.util.List var15 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test155");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisConfirmados();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test156");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    int var11 = var0.getId();
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getNome();
    java.util.List var14 = var0.getPerfisChegaram();
    java.lang.String var15 = var0.getIdDono();
    java.lang.String var16 = var0.getPonto();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test157");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    double var11 = var0.getLatitude();
    double var12 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var15 = var0.getLongitude();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1.0d));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test158");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    double var14 = var0.getLatitude();
    var0.setId(100);
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var19 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test159");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    var0.setPonto("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    double var11 = var0.getLatitude();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var14 = var0.toString();
    var0.setIdDono("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var17 = var0.getPonto();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test160");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    java.lang.String var10 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    int var13 = var0.getId();
    java.lang.String var14 = var0.getLinha();
    java.util.List var15 = var0.getPerfisConfirmados();
    java.lang.String var16 = var0.getIdDono();
    java.lang.String var17 = var0.getLinha();
    java.lang.String var18 = var0.getLinha();
    var0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test161");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNomeDono();
    java.lang.String var15 = var0.getPonto();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    double var22 = var0.getLongitude();
    java.util.List var23 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test162");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test163");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getIdDono();
    java.util.List var14 = var0.getPerfisChegaram();
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var17 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test164");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    double var11 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    var0.setLongitude(1.0d);
    var0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test165");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.toString();
    double var10 = var0.getLatitude();
    int var11 = var0.getId();
    var0.setPonto("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.toString();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test166");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setLongitude((-1.0d));
    double var14 = var0.getLatitude();
    var0.setLatitude(0.0d);
    var0.setNome("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.toString();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test167");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    var0.setLongitude(100.0d);
    double var20 = var0.getLongitude();
    int var21 = var0.getId();
    java.lang.String var22 = var0.getNomeDono();
    int var23 = var0.getId();
    java.lang.String var24 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test168");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setId((-1));
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var26 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var26.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test169");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(1.0d);
    var0.setLatitude((-1.0d));
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId((-1));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test170");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setLongitude((-1.0d));
    java.util.List var14 = var0.getPerfisConfirmados();
    java.util.List var15 = var0.getPerfisConfirmados();
    int var16 = var0.getId();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var19 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test171");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getLinha();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test172");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    var0.setLongitude(100.0d);
    double var20 = var0.getLongitude();
    int var21 = var0.getId();
    var0.setId(0);
    double var24 = var0.getLatitude();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test173");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.setLatitude(100.0d);
    java.lang.String var10 = var0.getNomeDono();
    var0.setId(0);
    var0.setId(10);
    var0.setId(1);
    java.lang.String var17 = var0.getPonto();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test174");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    double var10 = var0.getLatitude();
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    java.lang.String var16 = var0.getNome();
    int var17 = var0.getId();
    java.lang.String var18 = var0.getNomeDono();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test175");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    java.lang.String var3 = var0.toString();
    var0.setLongitude(10.0d);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var8 = var0.toString();
    var0.setId(100);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var3.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test176");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.getNomeDono();
    double var11 = var0.getLatitude();
    int var12 = var0.getId();
    java.lang.String var13 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var18 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var21 = var0.getData();
    java.lang.String var22 = var0.getPonto();
    java.lang.String var23 = var0.getPonto();
    int var24 = var0.getId();
    var0.setNome("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test177");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getPonto();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var20 = var0.getNomeDono();
    java.lang.String var21 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var21.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test178");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.toString();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("");
    java.lang.String var16 = var0.getPonto();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getNomeDono();
    com.application.ciadobusao.util.HorarioDoEncontro var20 = var0.getHorario();
    double var21 = var0.getLatitude();
    var0.setId(1);
    double var24 = var0.getLatitude();
    var0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test179");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.util.List var14 = var0.getPerfisConfirmados();
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getPonto();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var21 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test180");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    java.util.List var15 = var0.getPerfisConfirmados();
    java.util.List var16 = var0.getPerfisChegaram();
    java.util.List var17 = var0.getPerfisChegaram();
    java.util.List var18 = var0.getPerfisConfirmados();
    java.lang.String var19 = var0.getNomeDono();
    double var20 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test181");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    double var13 = var0.getLatitude();
    var0.setLongitude(1.0d);
    var0.setLatitude(100.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test182");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var15 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    double var17 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test183");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getNome();
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getLinha();
    var0.setId(100);
    double var11 = var0.getLatitude();
    java.lang.String var12 = var0.getLinha();
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test184");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    double var10 = var0.getLongitude();
    var0.setPonto("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test185");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    var0.setLatitude(10.0d);
    java.lang.String var10 = var0.toString();
    java.util.List var11 = var0.getPerfisChegaram();
    java.lang.String var12 = var0.getNome();
    double var13 = var0.getLatitude();
    var0.addPerfisConfirmados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10.0d);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test186");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    double var11 = var0.getLatitude();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    var0.setLongitude(1.0d);
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var18 = var0.getNomeDono();
    java.lang.String var19 = var0.getNome();
    double var20 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test187");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    double var14 = var0.getLongitude();
    java.lang.String var15 = var0.getLinha();
    var0.setId(100);
    var0.setPonto("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var20 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test188");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    var0.setLongitude(100.0d);
    var0.setPonto("");
    java.lang.String var14 = var0.getNome();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test189");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNomeDono();
    java.lang.String var15 = var0.getIdDono();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.toString();
    double var18 = var0.getLongitude();
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100.0d);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test190");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    var0.setNome("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    java.lang.String var17 = var0.getNome();
    int var18 = var0.getId();
    java.lang.String var19 = var0.getPonto();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]"+ "'", var17.equals("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test191");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setId(100);
    var0.setId(1);
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test192");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.util.List var4 = var0.getPerfisConfirmados();
    int var5 = var0.getId();
    java.lang.String var6 = var0.getNome();
    java.util.List var7 = var0.getPerfisConfirmados();
    java.util.List var8 = var0.getPerfisConfirmados();
    double var9 = var0.getLongitude();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test193");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getNome();
    var0.setId(10);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setLatitude(1.0d);
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test194");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.setPonto("");
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setLongitude((-1.0d));
    var0.setIdDono("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    int var15 = var0.getId();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test195");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    double var10 = var0.getLatitude();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var13 = var0.getLatitude();
    var0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test196");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.getIdDono();
    var0.delPerfilConfirmado("");
    var0.setId(10);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test197");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setLongitude((-1.0d));
    var0.setPonto("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var20 = var0.getNomeDono();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    double var25 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test198");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisConfirmados();
    java.lang.String var13 = var0.getNome();
    int var14 = var0.getId();
    double var15 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1.0d));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test199");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    var0.setLongitude(100.0d);
    double var20 = var0.getLongitude();
    int var21 = var0.getId();
    var0.setPonto("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var24 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var27 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test200");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getNome();
    var0.setId(10);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getLinha();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNomeDono();
    var0.setId(1);
    int var19 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(0);
    java.util.List var24 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test201");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    java.lang.String var12 = var0.getNome();
    var0.setIdDono("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var17 = var0.getPonto();
    java.util.List var18 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test202");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    java.util.List var15 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getPonto();
    double var20 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test203");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.toString();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test204");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setId(10);
    java.lang.String var12 = var0.getNomeDono();
    java.util.List var13 = var0.getPerfisConfirmados();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.toString();
    double var16 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getPonto();
    java.util.List var20 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test205");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var18 = var0.getData();
    int var19 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    int var26 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test206");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.util.List var17 = var0.getPerfisConfirmados();
    java.lang.String var18 = var0.getPonto();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test207");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    var0.setId(1);
    java.util.List var13 = var0.getPerfisChegaram();
    var0.setLongitude(100.0d);
    double var16 = var0.getLatitude();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    int var19 = var0.getId();
    java.lang.String var20 = var0.getIdDono();
    com.application.ciadobusao.util.DataDoEncontro var21 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test208");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    var0.setLatitude((-1.0d));
    java.util.List var17 = var0.getPerfisChegaram();
    java.util.List var18 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var19 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var24 = var0.getPonto();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test209");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    var0.setLongitude(100.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test210");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setId(100);
    var0.setId(1);
    java.lang.String var17 = var0.getLinha();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude(1.0d);
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test211");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    double var9 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.util.List var14 = var0.getPerfisChegaram();
    java.lang.String var15 = var0.getNomeDono();
    var0.setLongitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test212");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    double var18 = var0.getLatitude();
    double var19 = var0.getLongitude();
    var0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1.0d));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test213");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLongitude(100.0d);
    var0.setNome("hi!");
    int var18 = var0.getId();
    java.lang.String var19 = var0.getPonto();
    var0.setLatitude(1.0d);
    double var22 = var0.getLongitude();
    double var23 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1.0d);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test214");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    int var12 = var0.getId();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.getNomeDono();
    double var15 = var0.getLongitude();
    var0.setNomeDono("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1.0d));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test215");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    var0.setLatitude(10.0d);
    java.lang.String var14 = var0.getNomeDono();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var17 = var0.getPonto();
    java.util.List var18 = var0.getPerfisChegaram();
    var0.setLongitude(100.0d);
    var0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test216");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    java.lang.String var3 = var0.toString();
    var0.setLongitude(10.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var3.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test217");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    double var7 = var0.getLatitude();
    double var8 = var0.getLatitude();
    java.lang.String var9 = var0.getLinha();
    java.lang.String var10 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test218");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    int var3 = var0.getId();
    java.lang.String var4 = var0.getLinha();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    int var11 = var0.getId();
    java.lang.String var12 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test219");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    var0.setId(10);
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var18 = var0.getLinha();
    java.lang.String var19 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test220");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    int var10 = var0.getId();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test221");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(0);
    double var18 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test222");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.getPonto();
    double var12 = var0.getLongitude();
    var0.setNome("Encontro [nome=null, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test223");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setId((-1));
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test224");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    double var12 = var0.getLongitude();
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getLinha();
    double var16 = var0.getLongitude();
    int var17 = var0.getId();
    java.lang.String var18 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test225");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getPonto();
    java.lang.String var11 = var0.getNome();
    double var12 = var0.getLongitude();
    var0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test226");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    double var16 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test227");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.getIdDono();
    var0.setPonto("");
    double var12 = var0.getLongitude();
    var0.setId((-1));
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    java.lang.String var16 = var0.getNomeDono();
    java.util.List var17 = var0.getPerfisChegaram();
    java.util.List var18 = var0.getPerfisChegaram();
    java.lang.String var19 = var0.getNome();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test228");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    java.lang.String var11 = var0.getPonto();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(1);
    java.lang.String var18 = var0.getNome();
    var0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test229");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.toString();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var20 = var0.getData();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test230");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    var0.setLatitude(10.0d);
    java.lang.String var14 = var0.getNomeDono();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var21 = var0.getData();
    java.util.List var22 = var0.getPerfisChegaram();
    java.lang.String var23 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var24 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test231");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.getIdDono();
    java.util.List var10 = var0.getPerfisChegaram();
    double var11 = var0.getLatitude();
    int var12 = var0.getId();
    var0.setLatitude(1.0d);
    double var15 = var0.getLongitude();
    java.lang.String var16 = var0.toString();
    var0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test232");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var12 = var0.getLongitude();
    var0.setPonto("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test233");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    java.lang.String var3 = var0.toString();
    var0.setLongitude(10.0d);
    double var6 = var0.getLongitude();
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    java.lang.String var10 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var3.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test234");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    java.lang.String var11 = var0.getPonto();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(100.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test235");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    int var13 = var0.getId();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.getNomeDono();
    var0.setId(0);
    java.lang.String var20 = var0.getLinha();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test236");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var13 = var0.getLatitude();
    java.lang.String var14 = var0.toString();
    java.util.List var15 = var0.getPerfisChegaram();
    java.lang.String var16 = var0.getNomeDono();
    java.lang.String var17 = var0.getLinha();
    java.util.List var18 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test237");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    java.lang.String var12 = var0.toString();
    double var13 = var0.getLongitude();
    java.lang.String var14 = var0.getNome();
    var0.setPonto("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test238");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    java.lang.String var18 = var0.getPonto();
    var0.setNome("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var21 = var0.getNome();
    java.lang.String var22 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var22.equals("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test239");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.getNomeDono();
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.getNome();
    double var18 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1.0d));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test240");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNomeDono();
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test241");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getLinha();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test242");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getPonto();
    var0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test243");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    double var6 = var0.getLongitude();
    int var7 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNomeDono();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    double var14 = var0.getLatitude();
    double var15 = var0.getLongitude();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test244");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    double var6 = var0.getLatitude();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var10 = var0.toString();
    double var11 = var0.getLongitude();
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    double var13 = var0.getLatitude();
    var0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test245");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.toString();
    java.util.List var3 = var0.getPerfisChegaram();
    int var4 = var0.getId();
    var0.setIdDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    int var9 = var0.getId();
    var0.setNome("Encontro [nome=, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"+ "'", var2.equals("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test246");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    java.lang.String var12 = var0.getIdDono();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var15 = var0.getLinha();
    java.util.List var16 = var0.getPerfisChegaram();
    var0.setPonto("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test247");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.lang.String var4 = var0.toString();
    var0.setLongitude(1.0d);
    int var7 = var0.getId();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setId(100);
    java.lang.String var14 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var4.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test248");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    int var3 = var0.getId();
    com.application.ciadobusao.util.DataDoEncontro var4 = var0.getData();
    java.lang.String var5 = var0.getIdDono();
    java.lang.String var6 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test249");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getIdDono();
    double var14 = var0.getLatitude();
    var0.setLatitude((-1.0d));
    java.lang.String var17 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var20 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test250");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    var0.setLongitude(100.0d);
    double var20 = var0.getLongitude();
    int var21 = var0.getId();
    java.lang.String var22 = var0.getIdDono();
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.getLinha();
    java.lang.String var25 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var30 = var0.getPerfisConfirmados();
    java.lang.String var31 = var0.getNomeDono();
    var0.setLinha("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var31.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test251");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    var0.setId(1);
    java.util.List var13 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var16 = var0.getPonto();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getNomeDono();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var22 = var0.getLatitude();
    int var23 = var0.getId();
    java.lang.String var24 = var0.getPonto();
    var0.setIdDono("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var27 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test252");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    double var14 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test253");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.lang.String var14 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test254");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    var0.setLongitude(10.0d);
    java.lang.String var15 = var0.getLinha();
    double var16 = var0.getLatitude();
    double var17 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10.0d);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test255");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("hi!");
    var0.setLongitude(0.0d);
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.getLinha();
    java.lang.String var20 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test256");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setLongitude(1.0d);
    double var17 = var0.getLatitude();
    java.lang.String var18 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(10.0d);
    java.util.List var25 = var0.getPerfisConfirmados();
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var26.equals("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test257");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    var0.setLongitude(100.0d);
    double var10 = var0.getLongitude();
    var0.addPerfisConfirmados("hi!");
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.lang.String var14 = var0.getIdDono();
    double var15 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test258");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    double var6 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setNomeDono("hi!");
    java.lang.String var13 = var0.getPonto();
    double var14 = var0.getLongitude();
    var0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test259");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.toString();
    java.util.List var11 = var0.getPerfisChegaram();
    java.util.List var12 = var0.getPerfisChegaram();
    java.lang.String var13 = var0.toString();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var16 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test260");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setId(100);
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    int var18 = var0.getId();
    double var19 = var0.getLatitude();
    var0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test261");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    var0.setLatitude(10.0d);
    java.lang.String var14 = var0.getNomeDono();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var17 = var0.getPerfisConfirmados();
    java.util.List var18 = var0.getPerfisConfirmados();
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var23 = var0.getPonto();
    double var24 = var0.getLongitude();
    int var25 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test262");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    double var12 = var0.getLongitude();
    java.util.List var13 = var0.getPerfisChegaram();
    var0.setPonto("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test263");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var11 = var0.getIdDono();
    java.util.List var12 = var0.getPerfisChegaram();
    java.lang.String var13 = var0.getIdDono();
    double var14 = var0.getLatitude();
    java.util.List var15 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test264");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setLongitude((-1.0d));
    double var14 = var0.getLatitude();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    java.util.List var16 = var0.getPerfisConfirmados();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(0.0d);
    java.util.List var24 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test265");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getPonto();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    var0.setPonto("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    double var17 = var0.getLatitude();
    java.lang.String var18 = var0.toString();
    var0.setId(100);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test266");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.getNomeDono();
    double var11 = var0.getLatitude();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var16 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test267");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    int var5 = var0.getId();
    var0.setId(10);
    java.lang.String var8 = var0.getNome();
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setNome("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(0);
    java.lang.String var14 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test268");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var21 = var0.getLatitude();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var24 = var0.getNomeDono();
    double var25 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var24.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test269");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.getNomeDono();
    java.util.List var12 = var0.getPerfisConfirmados();
    var0.setLongitude(1.0d);
    int var15 = var0.getId();
    var0.setLongitude(10.0d);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    int var20 = var0.getId();
    var0.setLatitude(0.0d);
    int var23 = var0.getId();
    var0.setId(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test270");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("");
    java.lang.String var19 = var0.getNomeDono();
    var0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test271");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getPonto();
    double var9 = var0.getLatitude();
    int var10 = var0.getId();
    java.lang.String var11 = var0.getLinha();
    var0.setLongitude(1.0d);
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    java.lang.String var19 = var0.getNome();
    var0.addPerfisConfirmados("Encontro [nome=, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test272");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(0);
    java.lang.String var18 = var0.getPonto();
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var22 = var0.getLinha();
    double var23 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test273");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    int var11 = var0.getId();
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test274");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    java.lang.String var7 = var0.getNomeDono();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test275");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getPonto();
    double var14 = var0.getLatitude();
    var0.addPerfisConfirmados("");
    java.lang.String var17 = var0.getLinha();
    double var18 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test276");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getNome();
    var0.setPonto("");
    java.lang.String var9 = var0.getLinha();
    var0.setId(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test277");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    var0.setPonto("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.getNome();
    java.util.List var11 = var0.getPerfisConfirmados();
    var0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test278");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    java.lang.String var12 = var0.getNome();
    java.util.List var13 = var0.getPerfisChegaram();
    int var14 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    java.util.List var16 = var0.getPerfisConfirmados();
    var0.setIdDono("");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    double var23 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test279");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getPonto();
    var0.setPonto("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("hi!");
    int var14 = var0.getId();
    double var15 = var0.getLongitude();
    java.lang.String var16 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test280");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    var0.setLatitude(1.0d);
    var0.setLatitude(10.0d);
    double var21 = var0.getLatitude();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 10.0d);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test281");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getPonto();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var21 = var0.getPonto();
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var24 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var24.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test282");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    double var15 = var0.getLatitude();
    java.lang.String var16 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId(1);
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test283");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setId(100);
    var0.setId(1);
    var0.setNome("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var19 = var0.getPerfisChegaram();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    double var22 = var0.getLatitude();
    java.lang.String var23 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test284");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getPonto();
    double var14 = var0.getLatitude();
    var0.setId(10);
    java.lang.String var17 = var0.getLinha();
    java.lang.String var18 = var0.getPonto();
    var0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test285");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    double var12 = var0.getLongitude();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.lang.String var14 = var0.toString();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var17 = var0.getNome();
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test286");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var17 = var0.getPerfisChegaram();
    java.lang.String var18 = var0.getPonto();
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    java.lang.String var20 = var0.getPonto();
    var0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test287");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    java.lang.String var7 = var0.toString();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var10 = var0.getLatitude();
    java.lang.String var11 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test288");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setId(100);
    var0.setId(1);
    java.lang.String var17 = var0.getLinha();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.lang.String var22 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test289");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getNome();
    var0.setPonto("");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var11 = var0.getPerfisChegaram();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setIdDono("");
    java.lang.String var16 = var0.getNomeDono();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test290");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    double var12 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    int var17 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test291");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getIdDono();
    var0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test292");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.toString();
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test293");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    var0.setLatitude(10.0d);
    java.lang.String var13 = var0.getLinha();
    var0.setNomeDono("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]");
    int var16 = var0.getId();
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getNomeDono();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]"));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test294");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test295");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    double var17 = var0.getLatitude();
    var0.setLongitude(1.0d);
    java.lang.String var20 = var0.getNome();
    java.lang.String var21 = var0.getIdDono();
    java.lang.String var22 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test296");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getIdDono();
    var0.setLatitude(10.0d);
    int var12 = var0.getId();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.lang.String var14 = var0.getLinha();
    java.lang.String var15 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test297");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    java.lang.String var18 = var0.getPonto();
    java.lang.String var19 = var0.getIdDono();
    java.lang.String var20 = var0.toString();
    double var21 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test298");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    var0.setId(0);
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    double var10 = var0.getLongitude();
    java.lang.String var11 = var0.getLinha();
    int var12 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test299");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.getIdDono();
    java.lang.String var13 = var0.getLinha();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test300");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getNome();
    double var14 = var0.getLatitude();
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getLinha();
    java.lang.String var17 = var0.getPonto();
    double var18 = var0.getLatitude();
    var0.setId(100);
    int var21 = var0.getId();
    java.lang.String var22 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test301");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    double var11 = var0.getLatitude();
    var0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test302");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getNomeDono();
    int var13 = var0.getId();
    double var14 = var0.getLongitude();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test303");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setId((-1));
    var0.setId(0);
    java.lang.String var10 = var0.getIdDono();
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test304");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    var0.setLongitude(0.0d);
    var0.addPerfisChegados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    java.lang.String var25 = var0.getPonto();
    java.util.List var26 = var0.getPerfisConfirmados();
    var0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test305");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNomeDono();
    java.lang.String var12 = var0.getLinha();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    var0.setId(1);
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test306");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    int var18 = var0.getId();
    double var19 = var0.getLongitude();
    java.util.List var20 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test307");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisConfirmados();
    var0.addPerfisChegados("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test308");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    var0.setLongitude(100.0d);
    double var20 = var0.getLatitude();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var23 = var0.getPerfisChegaram();
    double var24 = var0.getLongitude();
    java.lang.String var25 = var0.getNome();
    double var26 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test309");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.setLongitude(0.0d);
    java.lang.String var14 = var0.getIdDono();
    java.lang.String var15 = var0.getNomeDono();
    java.lang.String var16 = var0.getNomeDono();
    java.util.List var17 = var0.getPerfisChegaram();
    java.lang.String var18 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test310");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    int var13 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test311");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.getLinha();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.getNomeDono();
    java.lang.String var20 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test312");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getPonto();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    java.util.List var15 = var0.getPerfisConfirmados();
    int var16 = var0.getId();
    java.lang.String var17 = var0.toString();
    var0.setPonto("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    int var20 = var0.getId();
    java.util.List var21 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test313");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    var0.setId(1);
    java.util.List var13 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var16 = var0.toString();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.toString();
    var0.setId(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test314");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    var0.setLatitude(0.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var13 = var0.getNome();
    var0.setLongitude(0.0d);
    java.lang.String var16 = var0.getNome();
    var0.setLatitude(0.0d);
    java.lang.String var19 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test315");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    java.util.List var8 = var0.getPerfisConfirmados();
    int var9 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId(1);
    var0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test316");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getIdDono();
    var0.setLatitude(100.0d);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var13 = var0.getPerfisChegaram();
    java.lang.String var14 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test317");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    var0.setId(1);
    java.util.List var13 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var16 = var0.getPonto();
    var0.setNomeDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setId(1);
    java.util.List var21 = var0.getPerfisConfirmados();
    java.util.List var22 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test318");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var23 = var0.getNomeDono();
    var0.setLatitude(0.0d);
    java.lang.String var26 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test319");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.util.List var4 = var0.getPerfisConfirmados();
    double var5 = var0.getLongitude();
    java.util.List var6 = var0.getPerfisConfirmados();
    double var7 = var0.getLongitude();
    java.lang.String var8 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test320");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    java.util.List var9 = var0.getPerfisConfirmados();
    var0.setId(100);
    java.util.List var12 = var0.getPerfisConfirmados();
    java.lang.String var13 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var16 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test321");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setId(10);
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test322");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.setLatitude(100.0d);
    var0.setIdDono("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    double var16 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test323");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    java.lang.String var18 = var0.getPonto();
    java.lang.String var19 = var0.getLinha();
    com.application.ciadobusao.util.HorarioDoEncontro var20 = var0.getHorario();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test324");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    java.lang.String var8 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var13 = var0.getPerfisChegaram();
    var0.setLongitude((-1.0d));
    java.lang.String var16 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test325");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getIdDono();
    var0.setLatitude(10.0d);
    int var12 = var0.getId();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getPonto();
    var0.setPonto("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test326");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    java.lang.String var18 = var0.getPonto();
    var0.setId(100);
    var0.setId(1);
    java.util.List var23 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test327");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    java.lang.String var10 = var0.getNome();
    var0.setNomeDono("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.lang.String var13 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test328");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getNomeDono();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    java.lang.String var11 = var0.getPonto();
    var0.setLongitude((-1.0d));
    java.lang.String var14 = var0.getIdDono();
    var0.setLatitude(10.0d);
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setLatitude(10.0d);
    java.lang.String var21 = var0.getPonto();
    com.application.ciadobusao.util.DataDoEncontro var22 = var0.getData();
    var0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test329");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    var0.setLongitude((-1.0d));
    var0.setLongitude((-1.0d));
    java.util.List var18 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test330");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var20 = var0.getData();
    java.lang.String var21 = var0.getIdDono();
    java.lang.String var22 = var0.getNome();
    java.util.List var23 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    int var28 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var22.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test331");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    java.lang.String var15 = var0.getLinha();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var20 = var0.toString();
    var0.setNome("hi!");
    com.application.ciadobusao.util.DataDoEncontro var23 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test332");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getNome();
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setLatitude(1.0d);
    java.lang.String var10 = var0.getNome();
    var0.setPonto("Encontro [nome=, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test333");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    double var12 = var0.getLongitude();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    var0.setNome("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setLongitude((-1.0d));
    int var18 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test334");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setId((-1));
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    var0.setLatitude(10.0d);
    int var11 = var0.getId();
    java.util.List var12 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test335");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    var0.setLatitude(10.0d);
    java.lang.String var15 = var0.getLinha();
    double var16 = var0.getLatitude();
    java.util.List var17 = var0.getPerfisConfirmados();
    java.lang.String var18 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    java.util.List var21 = var0.getPerfisChegaram();
    var0.setNome("Encontro [nome=, linha=null, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], horario=null, data=null]");
    java.lang.String var24 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test336");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    double var11 = var0.getLatitude();
    java.lang.String var12 = var0.getPonto();
    var0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test337");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    var0.setId(100);
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(0.0d);
    double var10 = var0.getLongitude();
    int var11 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test338");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(0);
    java.lang.String var18 = var0.toString();
    var0.setLatitude(0.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var21 = var0.getHorario();
    com.application.ciadobusao.util.DataDoEncontro var22 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var27 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test339");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    var0.setLongitude((-1.0d));
    var0.setId(1);
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNomeDono();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var19 = var0.getLinha();
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test340");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.lang.String var4 = var0.toString();
    var0.setLinha("hi!");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var11 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var4.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test341");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.addPerfisChegados("hi!");
    java.lang.String var12 = var0.getLinha();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var17 = var0.getLongitude();
    java.lang.String var18 = var0.getNomeDono();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test342");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    double var6 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.getNomeDono();
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setLongitude(1.0d);
    java.lang.String var13 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test343");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getPonto();
    double var14 = var0.getLatitude();
    var0.addPerfisConfirmados("");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var19 = var0.getData();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test344");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.addPerfisChegados("hi!");
    java.lang.String var12 = var0.getLinha();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test345");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    int var12 = var0.getId();
    java.util.List var13 = var0.getPerfisConfirmados();
    var0.setNome("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    java.lang.String var17 = var0.getNomeDono();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test346");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    double var7 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test347");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("hi!");
    var0.setLatitude(0.0d);
    var0.setLongitude((-1.0d));
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test348");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    var0.setPonto("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    double var11 = var0.getLatitude();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getPonto();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test349");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    double var7 = var0.getLongitude();
    java.util.List var8 = var0.getPerfisChegaram();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test350");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test351");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var17 = var0.getIdDono();
    var0.setId(100);
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    java.lang.String var22 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test352");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.toString();
    java.util.List var11 = var0.getPerfisChegaram();
    double var12 = var0.getLongitude();
    java.lang.String var13 = var0.toString();
    var0.setLatitude(10.0d);
    double var16 = var0.getLatitude();
    java.lang.String var17 = var0.toString();
    java.lang.String var18 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test353");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getNome();
    var0.setId(10);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getLinha();
    java.lang.String var15 = var0.getNome();
    int var16 = var0.getId();
    int var17 = var0.getId();
    java.lang.String var18 = var0.getIdDono();
    int var19 = var0.getId();
    java.lang.String var20 = var0.getPonto();
    java.lang.String var21 = var0.getNomeDono();
    java.lang.String var22 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test354");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var12 = var0.getLinha();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test355");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setNomeDono("hi!");
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test356");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    var0.setId(10);
    int var13 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    double var17 = var0.getLatitude();
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test357");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    java.util.List var13 = var0.getPerfisConfirmados();
    java.lang.String var14 = var0.getIdDono();
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test358");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var21 = var0.getLatitude();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var24 = var0.getHorario();
    java.lang.String var25 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test359");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    java.lang.String var12 = var0.getLinha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test360");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    java.lang.String var12 = var0.getLinha();
    var0.setLatitude(0.0d);
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    double var17 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test361");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.getNome();
    double var10 = var0.getLatitude();
    java.lang.String var11 = var0.getNomeDono();
    var0.addPerfisChegados("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test362");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    var0.setLongitude(100.0d);
    double var10 = var0.getLongitude();
    var0.addPerfisConfirmados("hi!");
    java.lang.String var13 = var0.getNomeDono();
    double var14 = var0.getLatitude();
    java.lang.String var15 = var0.toString();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var18 = var0.getIdDono();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test363");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.getLinha();
    java.util.List var17 = var0.getPerfisConfirmados();
    var0.setId(100);
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test364");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.getLinha();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var18 = var0.getNome();
    var0.setNomeDono("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var25 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test365");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    java.lang.String var12 = var0.getNome();
    java.util.List var13 = var0.getPerfisChegaram();
    int var14 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    double var16 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test366");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    var0.setLongitude(100.0d);
    var0.setPonto("");
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setLongitude(0.0d);
    java.lang.String var18 = var0.getIdDono();
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setLatitude(10.0d);
    var0.setPonto("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test367");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getNomeDono();
    int var7 = var0.getId();
    java.lang.String var8 = var0.getPonto();
    java.lang.String var9 = var0.getNome();
    int var10 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    java.util.List var12 = var0.getPerfisConfirmados();
    int var13 = var0.getId();
    java.lang.String var14 = var0.getLinha();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test368");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    double var11 = var0.getLatitude();
    java.util.List var12 = var0.getPerfisConfirmados();
    java.util.List var13 = var0.getPerfisConfirmados();
    java.util.List var14 = var0.getPerfisConfirmados();
    var0.setLatitude(0.0d);
    double var17 = var0.getLatitude();
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test369");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getIdDono();
    var0.setId(100);
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    double var18 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100.0d);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test370");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setLongitude(0.0d);
    java.lang.String var8 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setLinha("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    var0.setLongitude(0.0d);
    java.lang.String var18 = var0.toString();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setId(100);
    java.lang.String var23 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test371");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(1);
    var0.setId(10);
    var0.setLongitude(10.0d);
    int var22 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test372");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    var0.setPonto("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    java.lang.String var18 = var0.getPonto();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    var0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test373");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    var0.setLatitude(0.0d);
    java.lang.String var11 = var0.getIdDono();
    var0.setLatitude(1.0d);
    java.util.List var14 = var0.getPerfisChegaram();
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var18 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test374");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    double var20 = var0.getLatitude();
    var0.setLatitude(10.0d);
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var25 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var25.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test375");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getPonto();
    java.lang.String var17 = var0.getLinha();
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test376");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getNomeDono();
    int var10 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.toString();
    var0.setLongitude(0.0d);
    java.lang.String var17 = var0.getNome();
    java.util.List var18 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test377");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.setPonto("");
    double var10 = var0.getLatitude();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    double var15 = var0.getLatitude();
    java.lang.String var16 = var0.getNome();
    var0.setLatitude(1.0d);
    java.lang.String var19 = var0.getIdDono();
    double var20 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test378");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getIdDono();
    var0.setLatitude(0.0d);
    java.lang.String var12 = var0.getNomeDono();
    var0.setLongitude(10.0d);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var17 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test379");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setId((-1));
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var11 = var0.toString();
    double var12 = var0.getLatitude();
    var0.setId(100);
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.getLinha();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test380");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getPonto();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getNome();
    double var20 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test381");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    var0.setLongitude(0.0d);
    var0.addPerfisChegados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(100.0d);
    var0.setLongitude(0.0d);
    var0.setId(1);
    var0.setLongitude((-1.0d));
    var0.setLatitude(0.0d);
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test382");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    var0.setLatitude(0.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getPonto();
    double var15 = var0.getLongitude();
    var0.setNomeDono("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0d);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test383");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setLongitude((-1.0d));
    var0.setId(10);
    java.lang.String var13 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test384");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    double var6 = var0.getLatitude();
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setNomeDono("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=, linha=, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test385");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getIdDono();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var17 = var0.getPerfisChegaram();
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var20 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test386");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNomeDono();
    java.lang.String var18 = var0.getPonto();
    var0.setNome("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    int var21 = var0.getId();
    int var22 = var0.getId();
    com.application.ciadobusao.util.DataDoEncontro var23 = var0.getData();
    double var24 = var0.getLatitude();
    java.lang.String var25 = var0.getPonto();
    double var26 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test387");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getIdDono();
    var0.setId(1);
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    int var17 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test388");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getNome();
    java.util.List var11 = var0.getPerfisChegaram();
    java.util.List var12 = var0.getPerfisConfirmados();
    double var13 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test389");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    int var9 = var0.getId();
    var0.setLatitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    java.lang.String var13 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test390");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    java.lang.String var10 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test391");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getNome();
    var0.setId(10);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getLinha();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNomeDono();
    var0.setId(1);
    java.lang.String var19 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test392");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getNome();
    var0.setId(10);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisChegaram();
    java.util.List var13 = var0.getPerfisChegaram();
    double var14 = var0.getLatitude();
    var0.setLatitude(10.0d);
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getNomeDono();
    double var20 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test393");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNome();
    var0.setId(1);
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getNome();
    double var17 = var0.getLongitude();
    java.lang.String var18 = var0.getLinha();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.getNome();
    var0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test394");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    var0.setId(100);
    java.lang.String var9 = var0.getIdDono();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test395");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getIdDono();
    double var14 = var0.getLatitude();
    java.lang.String var15 = var0.getNomeDono();
    java.lang.String var16 = var0.getNome();
    java.util.List var17 = var0.getPerfisConfirmados();
    int var18 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test396");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getPonto();
    java.lang.String var9 = var0.getNomeDono();
    java.util.List var10 = var0.getPerfisConfirmados();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getPonto();
    int var13 = var0.getId();
    var0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test397");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test398");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.getNome();
    var0.setLongitude(1.0d);
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setLatitude(10.0d);
    var0.setLatitude(1.0d);
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var25 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test399");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    var0.setLatitude(10.0d);
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test400");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.getNomeDono();
    java.util.List var12 = var0.getPerfisConfirmados();
    var0.setLongitude(1.0d);
    int var15 = var0.getId();
    var0.setLongitude(10.0d);
    var0.setLatitude(100.0d);
    double var20 = var0.getLatitude();
    java.lang.String var21 = var0.toString();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test401");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getNome();
    var0.setId(10);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getLinha();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNomeDono();
    java.util.List var17 = var0.getPerfisChegaram();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test402");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getIdDono();
    var0.setLatitude(0.0d);
    java.lang.String var12 = var0.getNomeDono();
    var0.setLongitude(10.0d);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test403");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    java.util.List var12 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test404");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    java.lang.String var7 = var0.getNomeDono();
    java.lang.String var8 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test405");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getNome();
    double var14 = var0.getLatitude();
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getLinha();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var23 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test406");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getNome();
    double var7 = var0.getLongitude();
    var0.setLongitude(100.0d);
    int var10 = var0.getId();
    double var11 = var0.getLatitude();
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test407");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getNome();
    var0.setLongitude((-1.0d));
    java.lang.String var11 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test408");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLongitude(100.0d);
    var0.setNome("hi!");
    int var18 = var0.getId();
    java.lang.String var19 = var0.getPonto();
    java.util.List var20 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var21 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    int var24 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test409");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(100);
    double var13 = var0.getLatitude();
    var0.setLongitude(100.0d);
    java.lang.String var16 = var0.getPonto();
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    var0.setLatitude(10.0d);
    var0.setId(10);
    java.util.List var22 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test410");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setId((-1));
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var11 = var0.toString();
    double var12 = var0.getLatitude();
    var0.setId(100);
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.getNome();
    var0.setLatitude(1.0d);
    java.util.List var19 = var0.getPerfisConfirmados();
    java.lang.String var20 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test411");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    var0.setLongitude(100.0d);
    double var10 = var0.getLongitude();
    var0.addPerfisConfirmados("hi!");
    var0.delPerfilConfirmado("hi!");
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test412");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getPonto();
    int var8 = var0.getId();
    java.lang.String var9 = var0.getPonto();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test413");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    double var6 = var0.getLongitude();
    int var7 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    var0.setId(100);
    int var13 = var0.getId();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setPonto("hi!");
    int var18 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test414");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    java.lang.String var15 = var0.toString();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var18 = var0.getData();
    java.util.List var19 = var0.getPerfisChegaram();
    java.lang.String var20 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test415");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    java.lang.String var15 = var0.toString();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude((-1.0d));
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setId(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test416");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getNomeDono();
    java.lang.String var11 = var0.getIdDono();
    var0.setLatitude(10.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test417");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    java.lang.String var10 = var0.getNome();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.util.List var14 = var0.getPerfisChegaram();
    java.lang.String var15 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test418");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    java.util.List var15 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.getPonto();
    java.util.List var21 = var0.getPerfisChegaram();
    java.lang.String var22 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test419");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    var0.setId(1);
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getLinha();
    java.util.List var14 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test420");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    java.lang.String var11 = var0.getPonto();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.setLatitude(10.0d);
    var0.setLatitude(100.0d);
    java.lang.String var20 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var21 = var0.getHorario();
    java.util.List var22 = var0.getPerfisChegaram();
    java.lang.String var23 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test421");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getLinha();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId(100);
    double var18 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test422");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setId(100);
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    java.lang.String var18 = var0.getPonto();
    double var19 = var0.getLatitude();
    com.application.ciadobusao.util.HorarioDoEncontro var20 = var0.getHorario();
    java.lang.String var21 = var0.getNome();
    java.lang.String var22 = var0.getNome();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test423");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.toString();
    java.util.List var11 = var0.getPerfisChegaram();
    double var12 = var0.getLongitude();
    var0.setLongitude(0.0d);
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var17 = var0.getNome();
    java.util.List var18 = var0.getPerfisConfirmados();
    int var19 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test424");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getNome();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test425");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.getNomeDono();
    var0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test426");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setNome("hi!");
    java.lang.String var10 = var0.getNome();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var13 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    java.util.List var16 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test427");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    double var10 = var0.getLatitude();
    java.lang.String var11 = var0.toString();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test428");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    var0.setPonto("hi!");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var11 = var0.getPerfisChegaram();
    var0.setId((-1));
    int var14 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test429");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    int var14 = var0.getId();
    var0.setLongitude(1.0d);
    java.lang.String var17 = var0.getLinha();
    int var18 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test430");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var5 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test431");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.getIdDono();
    java.util.List var10 = var0.getPerfisChegaram();
    double var11 = var0.getLongitude();
    var0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test432");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.setPonto("");
    java.util.List var10 = var0.getPerfisChegaram();
    java.lang.String var11 = var0.getNome();
    double var12 = var0.getLongitude();
    var0.addPerfisConfirmados("hi!");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLongitude(1.0d);
    int var19 = var0.getId();
    double var20 = var0.getLongitude();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1.0d);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test433");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setLinha("");
    var0.setId(100);
    java.lang.String var16 = var0.getLinha();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var21 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    java.lang.String var23 = var0.toString();
    double var24 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=null, linha=, ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0.0d);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test434");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    java.lang.String var12 = var0.getNome();
    java.util.List var13 = var0.getPerfisConfirmados();
    java.lang.String var14 = var0.getLinha();
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var18 = var0.getLongitude();
    java.lang.String var19 = var0.getLinha();
    java.lang.String var20 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var19.equals("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test435");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.getNome();
    var0.setPonto("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(0.0d);
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var23 = var0.getData();
    java.lang.String var24 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test436");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.getNome();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var11 = var0.toString();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test437");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.toString();
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    int var13 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test438");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    int var15 = var0.getId();
    java.lang.String var16 = var0.toString();
    java.lang.String var17 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test439");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    double var6 = var0.getLongitude();
    int var7 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var15 = var0.getLongitude();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test440");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getIdDono();
    java.util.List var14 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test441");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    java.util.List var13 = var0.getPerfisConfirmados();
    java.lang.String var14 = var0.getIdDono();
    var0.setId(100);
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var19 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test442");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    java.util.List var20 = var0.getPerfisChegaram();
    var0.setLongitude(1.0d);
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test443");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getNome();
    double var14 = var0.getLatitude();
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getLinha();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var22 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test444");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    var0.setLongitude((-1.0d));
    var0.setId(1);
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNomeDono();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.util.List var19 = var0.getPerfisChegaram();
    int var20 = var0.getId();
    java.lang.String var21 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    int var24 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test445");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    int var3 = var0.getId();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    double var8 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test446");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.toString();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    var0.setLatitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var21 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test447");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    double var6 = var0.getLatitude();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test448");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    java.lang.String var17 = var0.getLinha();
    java.util.List var18 = var0.getPerfisConfirmados();
    var0.setId(1);
    com.application.ciadobusao.util.HorarioDoEncontro var21 = var0.getHorario();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setId(10);
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]"+ "'", var26.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]"));

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test449");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.setLongitude(0.0d);
    java.lang.String var14 = var0.getPonto();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var19 = var0.getPerfisChegaram();
    var0.setId(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test450");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.toString();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("");
    java.lang.String var16 = var0.getPonto();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(0);
    var0.setLatitude(10.0d);
    var0.setPonto("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    double var27 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == (-1.0d));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test451");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var15 = var0.toString();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var20 = var0.getHorario();
    java.lang.String var21 = var0.getNomeDono();
    java.lang.String var22 = var0.getNomeDono();
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var22.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test452");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    double var10 = var0.getLatitude();
    java.lang.String var11 = var0.toString();
    java.util.List var12 = var0.getPerfisChegaram();
    java.lang.String var13 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test453");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getPonto();
    double var9 = var0.getLatitude();
    int var10 = var0.getId();
    java.lang.String var11 = var0.getLinha();
    var0.setLongitude(1.0d);
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test454");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getNomeDono();
    int var6 = var0.getId();
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    int var9 = var0.getId();
    java.lang.String var10 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test455");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setLatitude(100.0d);
    double var22 = var0.getLongitude();
    java.lang.String var23 = var0.toString();
    var0.setId(1);
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test456");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    var0.setLatitude(0.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var13 = var0.getNome();
    var0.setLongitude(0.0d);
    java.lang.String var16 = var0.getNomeDono();
    double var17 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test457");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    double var10 = var0.getLongitude();
    java.lang.String var11 = var0.getNomeDono();
    java.lang.String var12 = var0.toString();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test458");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setId((-1));
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    var0.setLatitude(100.0d);
    var0.setPonto("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getNomeDono();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test459");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    java.util.List var14 = var0.getPerfisChegaram();
    java.lang.String var15 = var0.toString();
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    java.lang.String var17 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test460");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.getNomeDono();
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var16 = var0.toString();
    var0.setLongitude((-1.0d));
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setId(1);
    java.util.List var22 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test461");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.addPerfisConfirmados("");
    var0.setNomeDono("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    java.util.List var13 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test462");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    var0.setPonto("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    double var11 = var0.getLatitude();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getPonto();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    java.lang.String var16 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test463");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getNomeDono();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getNomeDono();
    var0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test464");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getIdDono();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var16 = var0.getNomeDono();
    var0.setIdDono("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test465");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisConfirmados();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdDono();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test466");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.util.List var4 = var0.getPerfisConfirmados();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLatitude((-1.0d));
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test467");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    var0.setLatitude((-1.0d));
    java.util.List var17 = var0.getPerfisChegaram();
    java.util.List var18 = var0.getPerfisConfirmados();
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setId((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test468");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setLinha("");
    var0.setId(100);
    java.lang.String var16 = var0.getPonto();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    var0.setLongitude(0.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var21 = var0.getHorario();
    java.lang.String var22 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test469");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(1.0d);
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var18 = var0.getLongitude();
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var22 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var22.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test470");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    var0.setLatitude(0.0d);
    java.lang.String var15 = var0.getLinha();
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test471");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    int var3 = var0.getId();
    java.lang.String var4 = var0.getLinha();
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(100.0d);
    double var10 = var0.getLongitude();
    java.lang.String var11 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "hi!"+ "'", var4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test472");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setLongitude((-1.0d));
    java.util.List var14 = var0.getPerfisConfirmados();
    java.util.List var15 = var0.getPerfisConfirmados();
    int var16 = var0.getId();
    java.util.List var17 = var0.getPerfisConfirmados();
    java.lang.String var18 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test473");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    double var17 = var0.getLatitude();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test474");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    var0.setId(10);
    var0.setId(10);
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var15 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test475");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.getPonto();
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var11 = var0.getNomeDono();
    var0.setLongitude(100.0d);
    var0.setLongitude((-1.0d));
    var0.setNome("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test476");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.setIdDono("hi!");
    int var10 = var0.getId();
    var0.setLatitude((-1.0d));
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(10.0d);
    java.lang.String var17 = var0.getNomeDono();
    double var18 = var0.getLatitude();
    java.lang.String var19 = var0.getNome();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var22 = var0.getPonto();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var22.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test477");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getNomeDono();
    double var14 = var0.getLongitude();
    java.util.List var15 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test478");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getIdDono();
    java.util.List var14 = var0.getPerfisChegaram();
    java.lang.String var15 = var0.toString();
    double var16 = var0.getLatitude();
    java.util.List var17 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test479");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("hi!");
    var0.setLongitude(0.0d);
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getIdDono();
    java.lang.String var21 = var0.toString();
    java.util.List var22 = var0.getPerfisChegaram();
    java.util.List var23 = var0.getPerfisChegaram();
    var0.setPonto("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.lang.String var26 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test480");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.setIdDono("hi!");
    int var10 = var0.getId();
    var0.setLatitude((-1.0d));
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(10.0d);
    java.lang.String var17 = var0.getNomeDono();
    double var18 = var0.getLatitude();
    java.lang.String var19 = var0.getNome();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test481");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setLatitude(100.0d);
    double var22 = var0.getLongitude();
    java.lang.String var23 = var0.toString();
    var0.setId(1);
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var26.equals("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test482");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    var0.setNomeDono("hi!");
    java.lang.String var16 = var0.getNomeDono();
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    int var18 = var0.getId();
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var21 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test483");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNomeDono();
    var0.setLongitude((-1.0d));
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getNome();
    com.application.ciadobusao.util.DataDoEncontro var20 = var0.getData();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var23 = var0.getHorario();
    java.lang.String var24 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var24.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test484");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    double var6 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    double var13 = var0.getLatitude();
    java.lang.String var14 = var0.getNomeDono();
    var0.setId(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test485");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setNome("hi!");
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    var0.setNomeDono("hi!");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setId(10);
    java.lang.String var17 = var0.getNome();
    java.util.List var18 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test486");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    var0.setLatitude(10.0d);
    java.lang.String var14 = var0.getNomeDono();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var17 = var0.getPerfisConfirmados();
    java.util.List var18 = var0.getPerfisConfirmados();
    var0.setNome("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var25 = var0.getNomeDono();
    int var26 = var0.getId();
    java.lang.String var27 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var25.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var27.equals("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test487");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    java.lang.String var8 = var0.toString();
    double var9 = var0.getLongitude();
    java.lang.String var10 = var0.getLinha();
    java.util.List var11 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test488");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setId(100);
    var0.setId(1);
    var0.setNome("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var19 = var0.getLatitude();
    java.lang.String var20 = var0.getIdDono();
    java.lang.String var21 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test489");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.toString();
    double var14 = var0.getLatitude();
    var0.setLatitude(10.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test490");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    int var13 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test491");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.getNome();
    var0.setLongitude(1.0d);
    java.lang.String var15 = var0.getPonto();
    java.lang.String var16 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test492");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    java.lang.String var15 = var0.getNomeDono();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var22 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]"+ "'", var22.equals("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test493");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var17 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    int var20 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test494");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getNome();
    var0.setId(10);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getLinha();
    java.lang.String var15 = var0.getNome();
    var0.setLongitude(1.0d);
    var0.setLongitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test495");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.addPerfisChegados("hi!");
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    java.util.List var13 = var0.getPerfisChegaram();
    java.util.List var14 = var0.getPerfisChegaram();
    java.lang.String var15 = var0.getLinha();
    var0.setId((-1));
    var0.setLongitude(100.0d);
    java.lang.String var20 = var0.getPonto();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test496");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    double var11 = var0.getLongitude();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test497");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getNomeDono();
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.getNome();
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test498");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    java.lang.String var9 = var0.toString();
    var0.setId(100);
    var0.setNomeDono("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test499");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    var0.setLatitude(10.0d);
    java.lang.String var14 = var0.getNomeDono();
    double var15 = var0.getLatitude();
    double var16 = var0.getLatitude();
    var0.setLatitude(10.0d);
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10.0d);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nEncontro27.test500");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setNome("hi!");
    java.lang.String var10 = var0.getNome();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getIdDono();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    double var16 = var0.getLatitude();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var19 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

}
