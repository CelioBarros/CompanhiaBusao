package randoop;

import junit.framework.*;

public class Encontro16 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test1");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setId(100);
    double var11 = var0.getLongitude();
    java.lang.String var12 = var0.toString();
    var0.setLongitude((-1.0d));
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test2");


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
    java.lang.String var16 = var0.getIdDono();
    int var17 = var0.getId();
    var0.delPerfilConfirmado("");
    java.lang.String var20 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test3");


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
    java.lang.String var20 = var0.getPonto();
    java.lang.String var21 = var0.getIdDono();
    
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
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test4");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    java.lang.String var3 = var0.toString();
    var0.setLongitude(10.0d);
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var8 = var0.getPerfisConfirmados();
    double var9 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var3.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 10.0d);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test5");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setId((-1));
    java.lang.String var8 = var0.getNome();
    int var9 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test6");


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
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var17 = var0.getLinha();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test7");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.toString();
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    double var13 = var0.getLongitude();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test8");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    java.lang.String var12 = var0.getLinha();
    double var13 = var0.getLatitude();
    
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
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test9");


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
    java.lang.String var16 = var0.getLinha();
    var0.setPonto("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId((-1));
    java.lang.String var21 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    double var24 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1.0d);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test10");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    var0.setLongitude(100.0d);
    double var10 = var0.getLongitude();
    int var11 = var0.getId();
    java.lang.String var12 = var0.getPonto();
    java.lang.String var13 = var0.getPonto();
    int var14 = var0.getId();
    double var15 = var0.getLongitude();
    var0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100.0d);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test11");


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
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(100);
    
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

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test12");


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
    java.lang.String var19 = var0.toString();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test13");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    java.util.List var11 = var0.getPerfisConfirmados();
    var0.setId(10);
    java.util.List var14 = var0.getPerfisConfirmados();
    java.lang.String var15 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test14");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    var0.setId((-1));
    var0.setLatitude((-1.0d));
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test15");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test16");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setNomeDono("hi!");
    var0.setLinha("");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    var0.setNome("Encontro [nome=, linha=null, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test17");


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
    int var19 = var0.getId();
    int var20 = var0.getId();
    java.lang.String var21 = var0.getIdDono();
    java.lang.String var22 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test18");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    java.util.List var10 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude((-1.0d));
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    java.util.List var18 = var0.getPerfisChegaram();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test19");


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
    java.lang.String var27 = var0.getPonto();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test20");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getPonto();
    var0.setLatitude(0.0d);
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test21");


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
    var0.setLongitude((-1.0d));
    var0.setPonto("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var25 = var0.getData();
    java.lang.String var26 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test22");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    var0.setPonto("hi!");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setId(0);
    var0.setLongitude(1.0d);
    var0.setId(10);
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.toString();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"));

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test23");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    java.lang.String var3 = var0.toString();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var6 = var0.getPonto();
    var0.setLatitude(100.0d);
    java.lang.String var9 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var3.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test24");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLatitude(0.0d);
    double var3 = var0.getLatitude();
    var0.setPonto("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var6 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    int var10 = var0.getId();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var13 = var0.getLinha();
    double var14 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test25");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    double var7 = var0.getLatitude();
    var0.setLongitude((-1.0d));
    java.lang.String var10 = var0.getLinha();
    var0.setLongitude(10.0d);
    double var13 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test26");


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
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test27");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.getIdDono();
    double var13 = var0.getLongitude();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(0.0d);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setId(10);
    java.lang.String var22 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test28");


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
    java.lang.String var17 = var0.getNomeDono();
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var21 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test29");


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
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    java.lang.String var18 = var0.getIdDono();
    java.lang.String var19 = var0.getPonto();
    java.lang.String var20 = var0.getPonto();
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.getIdDono();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test30");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    double var11 = var0.getLatitude();
    java.util.List var12 = var0.getPerfisConfirmados();
    java.lang.String var13 = var0.toString();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.setId(100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test31");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setNome("hi!");
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test32");


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
    var0.setNome("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var16 = var0.getPerfisChegaram();
    java.lang.String var17 = var0.getIdDono();
    java.lang.String var18 = var0.toString();
    var0.setLinha("Encontro [nome=, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test33");


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
    java.lang.String var22 = var0.getLinha();
    java.lang.String var23 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var22.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test34");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(1);
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.lang.String var14 = var0.getIdDono();
    int var15 = var0.getId();
    var0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test35");


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
    java.lang.String var25 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]"+ "'", var25.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]"));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test36");


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
    java.util.List var21 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test37");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setNome("hi!");
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    var0.setNomeDono("hi!");
    int var13 = var0.getId();
    var0.setLatitude(0.0d);
    java.lang.String var16 = var0.getNomeDono();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test38");


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
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.getNomeDono();
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test39");


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
    java.lang.String var16 = var0.toString();
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
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
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test40");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getNome();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude((-1.0d));
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.toString();
    java.lang.String var15 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test41");


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
    int var15 = var0.getId();
    java.lang.String var16 = var0.getLinha();
    java.lang.String var17 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test42");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    java.lang.String var11 = var0.getIdDono();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setLatitude(0.0d);
    var0.setLatitude(1.0d);
    java.lang.String var20 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test43");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisConfirmados();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test44");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getLinha();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getIdDono();
    double var15 = var0.getLatitude();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    int var18 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test45");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(1);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test46");


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
    var0.setId(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test47");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    double var10 = var0.getLatitude();
    java.lang.String var11 = var0.toString();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.util.List var14 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test48");


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
    double var17 = var0.getLongitude();
    double var18 = var0.getLatitude();
    com.application.ciadobusao.util.DataDoEncontro var19 = var0.getData();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test49");


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
    var0.addPerfisConfirmados("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
    double var19 = var0.getLongitude();
    com.application.ciadobusao.util.HorarioDoEncontro var20 = var0.getHorario();
    java.lang.String var21 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test50");


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
    java.util.List var19 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test51");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.setIdDono("hi!");
    int var10 = var0.getId();
    var0.setLatitude((-1.0d));
    java.util.List var13 = var0.getPerfisChegaram();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test52");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getNomeDono();
    double var7 = var0.getLongitude();
    int var8 = var0.getId();
    var0.setIdDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test53");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getNomeDono();
    int var10 = var0.getId();
    var0.setLongitude(1.0d);
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var15 = var0.getPerfisChegaram();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var18 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test54");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    double var14 = var0.getLongitude();
    double var15 = var0.getLongitude();
    java.util.List var16 = var0.getPerfisConfirmados();
    java.lang.String var17 = var0.getIdDono();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test55");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.addPerfisChegados("hi!");
    java.lang.String var12 = var0.getLinha();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getLinha();
    int var17 = var0.getId();
    double var18 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test56");


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
    com.application.ciadobusao.util.DataDoEncontro var25 = var0.getData();
    double var26 = var0.getLatitude();
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
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test57");


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
    java.lang.String var17 = var0.toString();
    var0.setIdDono("hi!");
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test58");


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
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test59");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var12 = var0.getPonto();
    java.lang.String var13 = var0.getNomeDono();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test60");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var8 = var0.getLatitude();
    java.lang.String var9 = var0.getLinha();
    java.util.List var10 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test61");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    java.util.List var9 = var0.getPerfisConfirmados();
    var0.setId(100);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getNome();
    int var14 = var0.getId();
    var0.setId(100);
    int var17 = var0.getId();
    java.util.List var18 = var0.getPerfisChegaram();
    var0.setLongitude(1.0d);
    double var21 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1.0d);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test62");


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
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var19 = var0.getNomeDono();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test63");


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
    java.util.List var19 = var0.getPerfisConfirmados();
    
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
    assertNotNull(var19);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test64");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.getIdDono();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setPonto("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var14 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1.0d));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test65");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.getNomeDono();
    double var12 = var0.getLatitude();
    double var13 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test66");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getIdDono();
    var0.setId(100);
    java.lang.String var15 = var0.getPonto();
    java.lang.String var16 = var0.getLinha();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test67");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setNomeDono("hi!");
    var0.setLongitude(10.0d);
    java.lang.String var9 = var0.getNomeDono();
    var0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test68");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.setIdDono("hi!");
    java.lang.String var10 = var0.getNomeDono();
    double var11 = var0.getLongitude();
    double var12 = var0.getLatitude();
    var0.setId((-1));
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setId(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test69");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getIdDono();
    var0.setId(100);
    
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

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test70");


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
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var18 = var0.getPonto();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    
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
    assertNull(var18);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test71");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    int var10 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    int var13 = var0.getId();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test72");


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
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    java.lang.String var19 = var0.getLinha();
    java.lang.String var20 = var0.getNomeDono();
    var0.setLatitude(10.0d);
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test73");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setNome("hi!");
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    int var11 = var0.getId();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var14 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test74");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setLongitude(1.0d);
    double var9 = var0.getLatitude();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1.0d));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test75");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getIdDono();
    var0.setLatitude(0.0d);
    java.lang.String var12 = var0.getNomeDono();
    int var13 = var0.getId();
    java.util.List var14 = var0.getPerfisConfirmados();
    java.util.List var15 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    int var17 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test76");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    java.lang.String var7 = var0.getNomeDono();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var10 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test77");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLongitude(10.0d);
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    int var13 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test78");


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
    java.lang.String var18 = var0.getPonto();
    java.util.List var19 = var0.getPerfisConfirmados();
    double var20 = var0.getLongitude();
    double var21 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0.0d);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test79");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setId((-1));
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var10 = var0.toString();
    double var11 = var0.getLongitude();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    java.lang.String var13 = var0.getPonto();
    java.lang.String var14 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisConfirmados("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test80");


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
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    int var18 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
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
    assertTrue(var18 == 0);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test81");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    int var5 = var0.getId();
    var0.setId(10);
    java.lang.String var8 = var0.getNome();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test82");


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
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var26 = var0.getData();
    var0.setLatitude(10.0d);
    
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
    assertNull(var26);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test83");


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
    java.lang.String var20 = var0.getPonto();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    int var23 = var0.getId();
    java.lang.String var24 = var0.getNomeDono();
    
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
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test84");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getNomeDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getPonto();
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNomeDono();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=null, ponto=hi!, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test85");


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
    java.lang.String var18 = var0.getNomeDono();
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    
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
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test86");


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
    double var22 = var0.getLatitude();
    java.lang.String var23 = var0.getLinha();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var26 = var0.getLinha();
    java.util.List var27 = var0.getPerfisConfirmados();
    double var28 = var0.getLatitude();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 10.0d);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test87");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    var0.setLongitude(10.0d);
    java.lang.String var18 = var0.toString();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test88");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(0);
    java.lang.String var15 = var0.toString();
    var0.setLatitude(0.0d);
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var22 = var0.getLongitude();
    java.lang.String var23 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test89");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    java.lang.String var11 = var0.getNomeDono();
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getPonto();
    var0.setLongitude(10.0d);
    java.util.List var16 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test90");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setId(100);
    double var11 = var0.getLongitude();
    java.lang.String var12 = var0.toString();
    var0.setLongitude((-1.0d));
    java.util.List var15 = var0.getPerfisConfirmados();
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test91");


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
    var0.setLinha("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    var0.setId(100);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    
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
    assertNull(var22);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test92");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    double var10 = var0.getLatitude();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.setNome("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var17 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test93");


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
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test94");


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
    java.lang.String var14 = var0.getLinha();
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    
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
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test95");


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
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test96");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getLinha();
    java.lang.String var7 = var0.getNomeDono();
    var0.addPerfisChegados("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test97");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getNomeDono();
    int var7 = var0.getId();
    com.application.ciadobusao.util.DataDoEncontro var8 = var0.getData();
    var0.setLongitude(1.0d);
    var0.setLatitude(10.0d);
    java.util.List var13 = var0.getPerfisConfirmados();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test98");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    var0.setPonto("");
    java.lang.String var10 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test99");


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
    java.util.List var23 = var0.getPerfisConfirmados();
    int var24 = var0.getId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test100");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLatitude(0.0d);
    double var3 = var0.getLatitude();
    java.util.List var4 = var0.getPerfisChegaram();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test101");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var11 = var0.getIdDono();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test102");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude(1.0d);
    java.lang.String var7 = var0.getLinha();
    int var8 = var0.getId();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test103");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.getIdDono();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var12 = var0.getNomeDono();
    var0.setIdDono("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test104");


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
    var0.setLongitude((-1.0d));
    java.lang.String var23 = var0.getIdDono();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test105");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    java.lang.String var10 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    int var13 = var0.getId();
    java.lang.String var14 = var0.getNome();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    var0.setLongitude((-1.0d));
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test106");


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
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var21 = var0.getNome();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test107");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getLinha();
    java.lang.String var15 = var0.getPonto();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test108");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setLinha("hi!");
    java.util.List var11 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test109");


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
    com.application.ciadobusao.util.DataDoEncontro var19 = var0.getData();
    com.application.ciadobusao.util.DataDoEncontro var20 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var23 = var0.getLinha();
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test110");


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
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var20 = var0.getData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test111");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    double var13 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test112");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNomeDono();
    int var12 = var0.getId();
    var0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test113");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.util.List var4 = var0.getPerfisConfirmados();
    int var5 = var0.getId();
    int var6 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test114");


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
    java.lang.String var13 = var0.getNomeDono();
    java.lang.String var14 = var0.getIdDono();
    
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test115");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    var0.setLongitude(100.0d);
    java.lang.String var10 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test116");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    var0.setIdDono("");
    java.lang.String var12 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test117");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test118");


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
    var0.setLongitude((-1.0d));
    var0.setPonto("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getNome();
    java.util.List var20 = var0.getPerfisConfirmados();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test119");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    java.lang.String var9 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=, linha=Encontro [nome=null, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test120");


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
    var0.setNome("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLongitude(0.0d);
    java.lang.String var22 = var0.getNomeDono();
    
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
    assertNull(var22);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test121");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    double var15 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var18 = var0.getData();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test122");


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
    var0.setLongitude(10.0d);
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var20 = var0.getPerfisConfirmados();
    
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
    assertNotNull(var20);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test123");


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
    var0.setNome("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var20 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test124");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getLinha();
    java.lang.String var7 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var8 = var0.getData();
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test125");


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
    int var22 = var0.getId();
    double var23 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test126");


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
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var23 = var0.getHorario();
    java.lang.String var24 = var0.getPonto();
    java.lang.String var25 = var0.getPonto();
    var0.setNome("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var28 = var0.getLinha();
    
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
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test127");


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
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test128");


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
    java.lang.String var17 = var0.getPonto();
    double var18 = var0.getLongitude();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var25 = var0.getNomeDono();
    java.util.List var26 = var0.getPerfisConfirmados();
    var0.setId(100);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test129");


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
    var0.setIdDono("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var23 = var0.getIdDono();
    com.application.ciadobusao.util.DataDoEncontro var24 = var0.getData();
    
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
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var23.equals("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test130");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    var0.setLatitude((-1.0d));
    var0.setLatitude((-1.0d));
    java.lang.String var14 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var19 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1.0d));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test131");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    java.lang.String var8 = var0.toString();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    double var13 = var0.getLatitude();
    java.util.List var14 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test132");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var5 = var0.getIdDono();
    var0.setLatitude(10.0d);
    java.lang.String var8 = var0.getPonto();
    java.lang.String var9 = var0.getNomeDono();
    java.util.List var10 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test133");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    java.util.List var9 = var0.getPerfisConfirmados();
    var0.setId(100);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test134");


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
    java.lang.String var14 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    
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
    assertNull(var14);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test135");


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
    double var15 = var0.getLatitude();
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test136");


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
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var19 = var0.getNomeDono();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var22 = var0.getPonto();
    com.application.ciadobusao.util.DataDoEncontro var23 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var24 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
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
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test137");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.addPerfisChegados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    double var7 = var0.getLatitude();
    int var8 = var0.getId();
    var0.setLatitude(0.0d);
    var0.setNome("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    int var13 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test138");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var11 = var0.getIdDono();
    int var12 = var0.getId();
    java.lang.String var13 = var0.getPonto();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var16 = var0.getNome();
    int var17 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test139");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var8 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    int var12 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var15 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test140");


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
    var0.setLatitude(0.0d);
    
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

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test141");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getIdDono();
    var0.setId(100);
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLatitude((-1.0d));
    com.application.ciadobusao.util.DataDoEncontro var20 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test142");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getIdDono();
    var0.setId(100);
    java.lang.String var15 = var0.getNomeDono();
    var0.setId(0);
    double var18 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1.0d));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test143");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    java.lang.String var9 = var0.toString();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getNomeDono();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.util.List var15 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test144");


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
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    java.lang.String var18 = var0.getIdDono();
    var0.setId((-1));
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var23 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test145");


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
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    int var18 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test146");


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
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var22 = var0.toString();
    
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]"+ "'", var22.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]"));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test147");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    java.lang.String var8 = var0.toString();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var11 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test148");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    int var10 = var0.getId();
    var0.setLatitude(0.0d);
    java.util.List var13 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=hi!, linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test149");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNomeDono();
    int var12 = var0.getId();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test150");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getLinha();
    var0.addPerfisConfirmados("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getNomeDono();
    java.util.List var13 = var0.getPerfisConfirmados();
    double var14 = var0.getLatitude();
    java.lang.String var15 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test151");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.util.List var16 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test152");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    var0.setPonto("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    int var9 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test153");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    double var14 = var0.getLatitude();
    var0.setLinha("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test154");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getIdDono();
    var0.setLatitude(0.0d);
    java.lang.String var12 = var0.getNomeDono();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.util.List var17 = var0.getPerfisConfirmados();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(10.0d);
    double var22 = var0.getLatitude();
    double var23 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 10.0d);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test155");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getIdDono();
    var0.setId(100);
    java.lang.String var15 = var0.getPonto();
    double var16 = var0.getLatitude();
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLatitude(10.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var24 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test156");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.getNomeDono();
    java.util.List var12 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getNomeDono();
    java.lang.String var16 = var0.getNomeDono();
    java.lang.String var17 = var0.getLinha();
    var0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test157");


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
    var0.setLongitude(100.0d);
    double var24 = var0.getLongitude();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=, linha=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
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
    assertTrue(var24 == 100.0d);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test158");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    double var12 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    double var17 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test159");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.getIdDono();
    double var13 = var0.getLongitude();
    var0.addPerfisChegados("hi!");
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");
    var0.setId(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100.0d);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test160");


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
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var21 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test161");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    var0.setLatitude(10.0d);
    int var10 = var0.getId();
    double var11 = var0.getLatitude();
    var0.setPonto("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setId(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 10.0d);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test162");


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
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getLinha();
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    java.lang.String var18 = var0.getNomeDono();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.getNomeDono();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test163");


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
    com.application.ciadobusao.util.DataDoEncontro var21 = var0.getData();
    double var22 = var0.getLatitude();
    var0.setLatitude(10.0d);
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
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
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test164");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var16 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test165");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setLatitude(1.0d);
    double var15 = var0.getLatitude();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    java.lang.String var18 = var0.getIdDono();
    int var19 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test166");


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
    var0.setLatitude((-1.0d));
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test167");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.addPerfisChegados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    double var7 = var0.getLatitude();
    int var8 = var0.getId();
    var0.setLatitude(0.0d);
    var0.setId(10);
    java.lang.String var13 = var0.getIdDono();
    double var14 = var0.getLongitude();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLatitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test168");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    java.util.List var9 = var0.getPerfisConfirmados();
    var0.setId(100);
    java.util.List var12 = var0.getPerfisConfirmados();
    double var13 = var0.getLongitude();
    java.util.List var14 = var0.getPerfisConfirmados();
    java.lang.String var15 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test169");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    int var3 = var0.getId();
    com.application.ciadobusao.util.DataDoEncontro var4 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var7 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test170");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.util.List var4 = var0.getPerfisConfirmados();
    int var5 = var0.getId();
    double var6 = var0.getLongitude();
    int var7 = var0.getId();
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test171");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    java.lang.String var10 = var0.getNome();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test172");


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
    java.lang.String var21 = var0.getNome();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
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
    assertNull(var21);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test173");


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
    double var17 = var0.getLatitude();
    var0.setLongitude(1.0d);
    var0.addPerfisChegados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
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
    assertTrue(var17 == 10.0d);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test174");


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
    var0.setNome("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var24 = var0.toString();
    var0.setLinha("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
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
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Encontro [nome=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var24.equals("Encontro [nome=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test175");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    int var10 = var0.getId();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var13 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test176");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getNome();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var11 = var0.getPerfisConfirmados();
    double var12 = var0.getLongitude();
    java.lang.String var13 = var0.getIdDono();
    java.lang.String var14 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test177");


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
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(100);
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test178");


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
    java.lang.String var17 = var0.getNome();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
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
    assertNull(var17);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test179");


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
    java.lang.String var16 = var0.getNomeDono();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var25 = var0.getHorario();
    double var26 = var0.getLongitude();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 100.0d);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test180");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    java.lang.String var3 = var0.toString();
    var0.setLongitude(10.0d);
    com.application.ciadobusao.util.DataDoEncontro var6 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var3.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test181");


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
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var17 = var0.getPerfisChegaram();
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test182");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getIdDono();
    var0.setId(100);
    java.lang.String var15 = var0.getPonto();
    java.lang.String var16 = var0.getIdDono();
    double var17 = var0.getLongitude();
    java.lang.String var18 = var0.getNomeDono();
    double var19 = var0.getLatitude();
    java.lang.String var20 = var0.getNome();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test183");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setId(100);
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    double var13 = var0.getLongitude();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getLinha();
    java.util.List var16 = var0.getPerfisConfirmados();
    var0.setLatitude(0.0d);
    java.util.List var19 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test184");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.addPerfisChegados("hi!");
    java.lang.String var12 = var0.getLinha();
    var0.setId(1);
    int var15 = var0.getId();
    java.lang.String var16 = var0.getNome();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    double var20 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0.0d);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test185");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNomeDono();
    java.lang.String var15 = var0.toString();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var18 = var0.getIdDono();
    var0.setId(0);
    java.lang.String var21 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test186");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var12 = var0.getNomeDono();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test187");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getLinha();
    java.lang.String var7 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var8 = var0.getData();
    java.lang.String var9 = var0.getIdDono();
    double var10 = var0.getLongitude();
    java.lang.String var11 = var0.getPonto();
    var0.setLongitude(1.0d);
    java.util.List var14 = var0.getPerfisChegaram();
    java.util.List var15 = var0.getPerfisChegaram();
    java.util.List var16 = var0.getPerfisChegaram();
    
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
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test188");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var11 = var0.getPerfisConfirmados();
    var0.setLongitude(10.0d);
    java.lang.String var14 = var0.getIdDono();
    double var15 = var0.getLatitude();
    var0.setLongitude(10.0d);
    var0.setLatitude(0.0d);
    java.lang.String var20 = var0.getPonto();
    java.lang.String var21 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test189");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    int var10 = var0.getId();
    int var11 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    var0.setLatitude(10.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test190");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    var0.setLatitude((-1.0d));
    java.lang.String var12 = var0.getLinha();
    java.util.List var13 = var0.getPerfisConfirmados();
    java.lang.String var14 = var0.getLinha();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    var0.setLatitude((-1.0d));
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var20 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test191");


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
    double var26 = var0.getLongitude();
    
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
    assertTrue(var26 == 0.0d);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test192");


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
    var0.setLatitude((-1.0d));
    int var19 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var20 = var0.getHorario();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test193");


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
    java.util.List var19 = var0.getPerfisChegaram();
    var0.delPerfilConfirmado("");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
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
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test194");


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
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    
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

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test195");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getIdDono();
    var0.setId(100);
    java.lang.String var15 = var0.getPonto();
    java.lang.String var16 = var0.getIdDono();
    var0.setLongitude(1.0d);
    var0.setId(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test196");


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
    java.lang.String var18 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var19 = var0.getData();
    java.lang.String var20 = var0.getPonto();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(100.0d);
    double var25 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 100.0d);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test197");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    int var9 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var12 = var0.getLongitude();
    
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
    assertTrue(var12 == 0.0d);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test198");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setId(100);
    java.lang.String var11 = var0.getPonto();
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getNomeDono();
    java.lang.String var14 = var0.getNome();
    java.util.List var15 = var0.getPerfisConfirmados();
    java.lang.String var16 = var0.getNomeDono();
    java.lang.String var17 = var0.getNomeDono();
    var0.setLongitude((-1.0d));
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test199");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    var0.setLatitude((-1.0d));
    var0.setLatitude((-1.0d));
    java.lang.String var14 = var0.toString();
    java.util.List var15 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getIdDono();
    double var20 = var0.getLatitude();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1.0d));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test200");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    double var11 = var0.getLatitude();
    int var12 = var0.getId();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test201");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test202");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    double var10 = var0.getLatitude();
    java.lang.String var11 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdDono();
    double var15 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test203");


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
    java.lang.String var18 = var0.getPonto();
    java.lang.String var19 = var0.getPonto();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.setId(0);
    
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

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test204");


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
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    java.lang.String var17 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
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
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test205");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getIdDono();
    var0.setId(100);
    java.lang.String var15 = var0.getPonto();
    double var16 = var0.getLatitude();
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test206");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.addPerfisConfirmados("");
    int var10 = var0.getId();
    int var11 = var0.getId();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var16 = var0.getIdDono();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test207");


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
    com.application.ciadobusao.util.HorarioDoEncontro var20 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test208");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    java.lang.String var3 = var0.toString();
    var0.setLongitude(10.0d);
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var8 = var0.getIdDono();
    var0.delPerfilConfirmado("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var13 = var0.getPerfisConfirmados();
    java.lang.String var14 = var0.getPonto();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var3.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test209");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    var0.setPonto("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    double var11 = var0.getLatitude();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var18 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test210");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setNome("hi!");
    java.lang.String var10 = var0.getNome();
    java.util.List var11 = var0.getPerfisChegaram();
    var0.addPerfisChegados("hi!");
    var0.setId(1);
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    double var19 = var0.getLongitude();
    java.lang.String var20 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test211");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    double var12 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(0.0d);
    java.lang.String var17 = var0.getNomeDono();
    java.lang.String var18 = var0.getNome();
    var0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"));

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test212");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getPonto();
    var0.setLatitude(100.0d);
    double var16 = var0.getLatitude();
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getPonto();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test213");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setPonto("hi!");
    var0.setId((-1));
    int var5 = var0.getId();
    java.util.List var6 = var0.getPerfisConfirmados();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var9 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test214");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getNome();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var11 = var0.toString();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var14 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test215");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.getLinha();
    java.lang.String var10 = var0.getLinha();
    java.util.List var11 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test216");


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
    java.util.List var17 = var0.getPerfisChegaram();
    double var18 = var0.getLongitude();
    java.lang.String var19 = var0.getNome();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test217");


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
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    var0.setNomeDono("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var20 = var0.getHorario();
    java.lang.String var21 = var0.getPonto();
    java.lang.String var22 = var0.getPonto();
    com.application.ciadobusao.util.DataDoEncontro var23 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var22.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test218");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.getNomeDono();
    var0.setLongitude(1.0d);
    java.lang.String var14 = var0.getPonto();
    java.lang.String var15 = var0.getNome();
    var0.setLongitude(0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test219");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.getNomeDono();
    var0.addPerfisChegados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var16 = var0.getPerfisConfirmados();
    java.lang.String var17 = var0.getLinha();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test220");


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
    java.lang.String var15 = var0.getLinha();
    double var16 = var0.getLongitude();
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    double var18 = var0.getLongitude();
    double var19 = var0.getLongitude();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == (-1.0d));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test221");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    double var6 = var0.getLatitude();
    java.lang.String var7 = var0.getNomeDono();
    int var8 = var0.getId();
    int var9 = var0.getId();
    java.lang.String var10 = var0.toString();
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test222");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.toString();
    java.lang.String var13 = var0.getPonto();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    var0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test223");


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
    double var19 = var0.getLatitude();
    var0.setIdDono("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test224");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    double var7 = var0.getLatitude();
    var0.setPonto("hi!");
    java.lang.String var10 = var0.getLinha();
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test225");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    var0.setLatitude(0.0d);
    java.lang.String var11 = var0.getIdDono();
    var0.setLatitude(1.0d);
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var16 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1.0d);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test226");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getPonto();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getPonto();
    java.util.List var11 = var0.getPerfisConfirmados();
    java.lang.String var12 = var0.getLinha();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test227");


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
    var0.setPonto("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var20 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test228");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.util.List var9 = var0.getPerfisConfirmados();
    int var10 = var0.getId();
    java.util.List var11 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test229");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test230");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.getNome();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var11 = var0.getLinha();
    int var12 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test231");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var5 = var0.getIdDono();
    var0.setLatitude(10.0d);
    var0.setId(0);
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test232");


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
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
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

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test233");


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
    var0.setPonto("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    int var18 = var0.getId();
    
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
    assertTrue(var18 == 0);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test234");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    java.lang.String var12 = var0.getNome();
    var0.setLatitude(1.0d);
    int var15 = var0.getId();
    java.lang.String var16 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test235");


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
    java.lang.String var15 = var0.getNomeDono();
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test236");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.lang.String var4 = var0.toString();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var7 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.toString();
    java.util.List var11 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var4.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test237");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getPonto();
    var0.setPonto("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test238");


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
    java.lang.String var23 = var0.getNomeDono();
    java.lang.String var24 = var0.getLinha();
    var0.setId(0);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test239");


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
    java.util.List var19 = var0.getPerfisChegaram();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setId(0);
    int var24 = var0.getId();
    java.util.List var25 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=hi!, horario=null, data=null]");
    int var28 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test240");


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
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var25 = var0.getLongitude();
    var0.setPonto("Encontro [nome=, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0.0d);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test241");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.lang.String var4 = var0.toString();
    var0.setLongitude(1.0d);
    int var7 = var0.getId();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var16 = var0.getPerfisConfirmados();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var4.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test242");


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
    java.util.List var15 = var0.getPerfisChegaram();
    
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

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test243");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    double var6 = var0.getLongitude();
    int var7 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var10 = var0.getPerfisChegaram();
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.getNomeDono();
    var0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test244");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    double var7 = var0.getLatitude();
    var0.setPonto("hi!");
    java.lang.String var10 = var0.getLinha();
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    java.lang.String var12 = var0.getPonto();
    double var13 = var0.getLongitude();
    int var14 = var0.getId();
    var0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test245");


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
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var19 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test246");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    var0.setNomeDono("hi!");
    java.lang.String var17 = var0.getPonto();
    java.lang.String var18 = var0.toString();
    var0.addPerfisChegados("");
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var23 = var0.getLinha();
    com.application.ciadobusao.util.DataDoEncontro var24 = var0.getData();
    com.application.ciadobusao.util.DataDoEncontro var25 = var0.getData();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test247");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.getIdDono();
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var14 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test248");


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
    var0.setId(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test249");


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
    java.lang.String var20 = var0.getPonto();
    java.util.List var21 = var0.getPerfisConfirmados();
    var0.addPerfisChegados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var24 = var0.getPerfisChegaram();
    java.lang.String var25 = var0.toString();
    
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
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var25.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test250");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.getIdDono();
    var0.setPonto("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test251");


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
    var0.setPonto("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    
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

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test252");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getLinha();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var19 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test253");


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
    var0.setPonto("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var18 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test254");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    var0.setLatitude(10.0d);
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getNomeDono();
    java.lang.String var15 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test255");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setId((-1));
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setNome("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    double var16 = var0.getLatitude();
    java.util.List var17 = var0.getPerfisConfirmados();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test256");


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
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
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

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test257");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    var0.setLongitude(100.0d);
    int var10 = var0.getId();
    var0.setLatitude(100.0d);
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var15 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test258");


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
    java.util.List var15 = var0.getPerfisChegaram();
    java.util.List var16 = var0.getPerfisConfirmados();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test259");


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
    java.lang.String var22 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test260");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    var0.setLatitude((-1.0d));
    java.lang.String var12 = var0.getLinha();
    java.util.List var13 = var0.getPerfisConfirmados();
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test261");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.getNomeDono();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var13 = var0.getPonto();
    java.lang.String var14 = var0.getNomeDono();
    java.util.List var15 = var0.getPerfisChegaram();
    java.lang.String var16 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test262");


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
    var0.setLongitude(100.0d);
    var0.setLatitude(0.0d);
    int var22 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var25 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test263");


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
    java.util.List var21 = var0.getPerfisConfirmados();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test264");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var12 = var0.getIdDono();
    double var13 = var0.getLatitude();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    java.lang.String var15 = var0.getLinha();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var18 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test265");


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
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var17 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test266");


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
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    int var29 = var0.getId();
    
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
    assertTrue(var29 == 1);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test267");


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
    java.lang.String var17 = var0.getNome();
    var0.setNome("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var22 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test268");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getNomeDono();
    int var10 = var0.getId();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getNome();
    double var14 = var0.getLongitude();
    double var15 = var0.getLongitude();
    java.lang.String var16 = var0.getLinha();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test269");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    double var14 = var0.getLongitude();
    var0.setNomeDono("");
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var20 = var0.getNome();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    double var23 = var0.getLongitude();
    var0.addPerfisChegados("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 100.0d);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test270");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getNomeDono();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude(1.0d);
    double var11 = var0.getLongitude();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getIdDono();
    java.util.List var14 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test271");


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
    double var15 = var0.getLongitude();
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    java.lang.String var17 = var0.getNomeDono();
    java.lang.String var18 = var0.getIdDono();
    int var19 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test272");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    int var3 = var0.getId();
    java.lang.String var4 = var0.getPonto();
    java.lang.String var5 = var0.getIdDono();
    var0.addPerfisChegados("");
    var0.setLatitude(1.0d);
    var0.setLinha("");
    java.lang.String var12 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test273");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    double var14 = var0.getLatitude();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test274");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    java.lang.String var10 = var0.getIdDono();
    double var11 = var0.getLongitude();
    var0.setLatitude(100.0d);
    java.util.List var14 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    java.lang.String var16 = var0.getPonto();
    int var17 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test275");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getPonto();
    java.lang.String var8 = var0.getNome();
    var0.setId(10);
    java.lang.String var11 = var0.getNomeDono();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test276");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    var0.setLatitude(0.0d);
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    java.lang.String var12 = var0.getPonto();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], ponto=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test277");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    int var10 = var0.getId();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    int var13 = var0.getId();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var16 = var0.getData();
    java.lang.String var17 = var0.getPonto();
    double var18 = var0.getLongitude();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test278");


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
    java.lang.String var17 = var0.getNomeDono();
    java.lang.String var18 = var0.getIdDono();
    var0.setPonto("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    java.lang.String var23 = var0.getIdDono();
    java.util.List var24 = var0.getPerfisConfirmados();
    var0.setId(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test279");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    var0.setLatitude(0.0d);
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test280");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setId((-1));
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var10 = var0.toString();
    java.lang.String var11 = var0.getLinha();
    double var12 = var0.getLongitude();
    var0.setLongitude(100.0d);
    java.lang.String var15 = var0.toString();
    java.lang.String var16 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test281");


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
    java.lang.String var18 = var0.getNome();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test282");


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
    java.lang.String var20 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var23 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test283");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    java.lang.String var9 = var0.toString();
    double var10 = var0.getLatitude();
    java.lang.String var11 = var0.getPonto();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var16 = var0.getLatitude();
    java.lang.String var17 = var0.getNomeDono();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test284");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setId((-1));
    java.lang.String var8 = var0.getLinha();
    java.lang.String var9 = var0.getNomeDono();
    double var10 = var0.getLongitude();
    double var11 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test285");


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
    java.lang.String var19 = var0.getIdDono();
    int var20 = var0.getId();
    int var21 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test286");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    int var3 = var0.getId();
    java.lang.String var4 = var0.getPonto();
    java.lang.String var5 = var0.getIdDono();
    var0.addPerfisChegados("");
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    java.lang.String var9 = var0.getNome();
    var0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test287");


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
    var0.setNome("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var23 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test288");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setNomeDono("hi!");
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    int var9 = var0.getId();
    var0.setLongitude(1.0d);
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test289");


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
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var18 = var0.getLongitude();
    com.application.ciadobusao.util.DataDoEncontro var19 = var0.getData();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
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
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test290");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    var0.setLongitude(100.0d);
    double var10 = var0.getLongitude();
    int var11 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var14 = var0.getLinha();
    var0.setLatitude(10.0d);
    var0.setNomeDono("Encontro [nome=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test291");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var12 = var0.getNome();
    int var13 = var0.getId();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test292");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setNome("");
    var0.setId(0);
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    java.lang.String var8 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test293");


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
    double var18 = var0.getLongitude();
    java.lang.String var19 = var0.getIdDono();
    java.util.List var20 = var0.getPerfisChegaram();
    java.lang.String var21 = var0.getLinha();
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test294");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    java.lang.String var10 = var0.getNomeDono();
    int var11 = var0.getId();
    java.lang.String var12 = var0.toString();
    java.util.List var13 = var0.getPerfisConfirmados();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test295");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    var0.setLongitude(0.0d);
    java.lang.String var14 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test296");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setNome("");
    var0.setId(0);
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.getPonto();
    var0.setLongitude(100.0d);
    var0.setLatitude(10.0d);
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test297");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    java.lang.String var8 = var0.toString();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test298");


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
    java.util.List var18 = var0.getPerfisChegaram();
    var0.setId(100);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test299");


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
    var0.setLongitude(1.0d);
    java.util.List var19 = var0.getPerfisConfirmados();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test300");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var12 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var18 = var0.getPerfisConfirmados();
    double var19 = var0.getLongitude();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1.0d);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test301");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    double var12 = var0.getLongitude();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var19 = var0.getLinha();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var22 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test302");


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
    var0.setIdDono("Encontro [nome=, linha=null, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], horario=null, data=null]");
    
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

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test303");


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
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.util.List var24 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.HorarioDoEncontro var25 = var0.getHorario();
    java.util.List var26 = var0.getPerfisChegaram();
    java.lang.String var27 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var27.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test304");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getLinha();
    var0.setLongitude((-1.0d));
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test305");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    var0.setId(0);
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    java.lang.String var11 = var0.getNome();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.toString();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test306");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setId((-1));
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var11 = var0.toString();
    double var12 = var0.getLatitude();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test307");


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
    var0.setNome("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    
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

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test308");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var12 = var0.getNome();
    var0.setLongitude(10.0d);
    java.lang.String var15 = var0.getIdDono();
    var0.setId(10);
    var0.setId(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test309");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getNome();
    java.util.List var7 = var0.getPerfisChegaram();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    int var12 = var0.getId();
    var0.setNomeDono("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLongitude(10.0d);
    var0.addPerfisConfirmados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test310");


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
    java.lang.String var21 = var0.getIdDono();
    var0.setLongitude(1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test311");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    java.lang.String var6 = var0.getLinha();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.getLinha();
    java.lang.String var9 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var4.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var5.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test312");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.setId(0);
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test313");


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
    var0.setLatitude(0.0d);
    java.lang.String var16 = var0.toString();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude((-1.0d));
    double var21 = var0.getLongitude();
    
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
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == (-1.0d));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test314");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    var0.setLatitude(10.0d);
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var21 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test315");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    var0.setId((-1));
    var0.setLatitude((-1.0d));
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test316");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getNome();
    double var10 = var0.getLongitude();
    var0.setId(0);
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test317");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    var0.setIdDono("");
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setId(100);
    java.util.List var15 = var0.getPerfisChegaram();
    var0.setLongitude((-1.0d));
    java.util.List var18 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test318");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test319");


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
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=hi!, horario=null, data=null]");
    
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

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test320");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    var0.setPonto("hi!");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    java.lang.String var12 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]"));

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test321");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.util.List var15 = var0.getPerfisConfirmados();
    java.lang.String var16 = var0.getIdDono();
    java.util.List var17 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test322");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.setLatitude(100.0d);
    var0.setIdDono("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
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
    assertNull(var14);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test323");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    var0.setLongitude(100.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var15 = var0.getIdDono();
    java.lang.String var16 = var0.getNomeDono();
    java.lang.String var17 = var0.toString();
    double var18 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 100.0d);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test324");


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
    java.lang.String var22 = var0.getLinha();
    java.util.List var23 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var24 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test325");


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
    var0.setPonto("hi!");
    java.lang.String var19 = var0.getLinha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test326");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.getIdDono();
    java.util.List var10 = var0.getPerfisChegaram();
    double var11 = var0.getLatitude();
    int var12 = var0.getId();
    java.lang.String var13 = var0.getLinha();
    java.util.List var14 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test327");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.lang.String var4 = var0.toString();
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var4.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test328");


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
    com.application.ciadobusao.util.DataDoEncontro var19 = var0.getData();
    com.application.ciadobusao.util.DataDoEncontro var20 = var0.getData();
    com.application.ciadobusao.util.DataDoEncontro var21 = var0.getData();
    
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
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test329");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    java.util.List var13 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var17 = var0.getNomeDono();
    var0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test330");


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
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test331");


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
    java.lang.String var19 = var0.getNome();
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test332");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLongitude(100.0d);
    java.lang.String var16 = var0.toString();
    var0.setId((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test333");


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
    double var18 = var0.getLongitude();
    java.util.List var19 = var0.getPerfisChegaram();
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test334");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    var0.setId(0);
    int var9 = var0.getId();
    java.lang.String var10 = var0.getLinha();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test335");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    java.lang.String var7 = var0.toString();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var7.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test336");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNome();
    java.util.List var12 = var0.getPerfisChegaram();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test337");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    double var7 = var0.getLongitude();
    java.util.List var8 = var0.getPerfisChegaram();
    double var9 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test338");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    java.lang.String var10 = var0.getLinha();
    var0.setNomeDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    int var13 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test339");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    java.util.List var10 = var0.getPerfisChegaram();
    java.lang.String var11 = var0.getLinha();
    java.lang.String var12 = var0.getLinha();
    var0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test340");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    double var10 = var0.getLatitude();
    java.lang.String var11 = var0.toString();
    java.util.List var12 = var0.getPerfisConfirmados();
    java.lang.String var13 = var0.toString();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    java.lang.String var15 = var0.getIdDono();
    double var16 = var0.getLongitude();
    int var17 = var0.getId();
    java.lang.String var18 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test341");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.toString();
    java.util.List var3 = var0.getPerfisChegaram();
    int var4 = var0.getId();
    var0.setIdDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    int var9 = var0.getId();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
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

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test342");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getPonto();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    java.lang.String var15 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test343");


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
    java.lang.String var17 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=null, ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test344");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId(100);
    var0.setLongitude(100.0d);
    double var16 = var0.getLatitude();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test345");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setIdDono("");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    double var13 = var0.getLatitude();
    java.lang.String var14 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test346");


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
    var0.setLongitude(100.0d);
    int var23 = var0.getId();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    double var28 = var0.getLatitude();
    
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
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0.0d);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test347");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setNomeDono("hi!");
    var0.setLinha("");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    java.util.List var13 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test348");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    int var14 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test349");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.toString();
    java.util.List var13 = var0.getPerfisConfirmados();
    java.lang.String var14 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test350");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    double var12 = var0.getLatitude();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var15 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test351");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    var0.setLongitude(100.0d);
    var0.setNomeDono("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getPonto();
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test352");


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
    var0.setLatitude((-1.0d));
    var0.setNome("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var22 = var0.getIdDono();
    
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
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test353");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(0);
    java.lang.String var15 = var0.toString();
    var0.setLongitude(1.0d);
    java.lang.String var18 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test354");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getLinha();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test355");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setLongitude(0.0d);
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getPonto();
    int var10 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test356");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.setId(0);
    com.application.ciadobusao.util.DataDoEncontro var10 = var0.getData();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getLinha();
    java.lang.String var14 = var0.toString();
    int var15 = var0.getId();
    java.lang.String var16 = var0.getNome();
    java.util.List var17 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test357");


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
    var0.setLatitude(100.0d);
    java.lang.String var17 = var0.getPonto();
    double var18 = var0.getLongitude();
    
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
    assertTrue(var18 == 0.0d);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test358");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    var0.setId(10);
    int var13 = var0.getId();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getNome();
    int var16 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 10);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test359");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var8 = var0.getLatitude();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    java.lang.String var10 = var0.getNomeDono();
    java.lang.String var11 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test360");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setLongitude(0.0d);
    java.util.List var8 = var0.getPerfisConfirmados();
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test361");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    int var5 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setId(100);
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test362");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.getIdDono();
    var0.setNome("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    double var15 = var0.getLatitude();
    var0.addPerfisConfirmados("");
    var0.setIdDono("hi!");
    java.lang.String var20 = var0.getNome();
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    var0.setNome("Encontro [nome=, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId(10);
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test363");


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
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var21 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "Encontro [nome=hi!, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var21.equals("Encontro [nome=hi!, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test364");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setId((-1));
    java.lang.String var8 = var0.getNome();
    var0.setNomeDono("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var11 = var0.getLongitude();
    var0.setLatitude(100.0d);
    java.util.List var14 = var0.getPerfisConfirmados();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test365");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setNomeDono("hi!");
    var0.setLinha("");
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setId(100);
    java.lang.String var12 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test366");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getPonto();
    int var8 = var0.getId();
    java.lang.String var9 = var0.getIdDono();
    double var10 = var0.getLongitude();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test367");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var7 = var0.getNomeDono();
    java.lang.String var8 = var0.toString();
    java.util.List var9 = var0.getPerfisConfirmados();
    java.lang.String var10 = var0.getLinha();
    double var11 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var10.equals("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test368");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    java.lang.String var10 = var0.getIdDono();
    double var11 = var0.getLongitude();
    var0.setLatitude(100.0d);
    java.util.List var14 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    int var16 = var0.getId();
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test369");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    double var5 = var0.getLongitude();
    var0.setId((-1));
    java.lang.String var8 = var0.getNome();
    var0.setNomeDono("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var11 = var0.getLongitude();
    double var12 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test370");


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
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.getNomeDono();
    
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
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var23.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test371");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.util.List var4 = var0.getPerfisConfirmados();
    int var5 = var0.getId();
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var8 = var0.getNomeDono();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("hi!");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var8.equals("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test372");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.toString();
    double var13 = var0.getLongitude();
    int var14 = var0.getId();
    var0.setLinha("Encontro [nome=, linha=null, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test373");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getLinha();
    double var15 = var0.getLongitude();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1.0d));

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test374");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    var0.setLongitude(10.0d);
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test375");


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
    int var21 = var0.getId();
    var0.setLongitude((-1.0d));
    var0.setLatitude((-1.0d));
    
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
    assertTrue(var21 == 0);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test376");


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
    java.lang.String var18 = var0.getIdDono();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var21 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test377");


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
    var0.setId((-1));
    java.util.List var20 = var0.getPerfisConfirmados();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.util.List var23 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var24 = var0.getData();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test378");


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
    double var20 = var0.getLongitude();
    var0.setLatitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1.0d));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test379");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.toString();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var14 = var0.getPerfisConfirmados();
    java.lang.String var15 = var0.getLinha();
    java.lang.String var16 = var0.getPonto();
    java.util.List var17 = var0.getPerfisConfirmados();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test380");


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
    double var17 = var0.getLongitude();
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=, ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=, ponto=null, horario=null, data=null]"));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test381");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setId(100);
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    double var13 = var0.getLongitude();
    java.lang.String var14 = var0.getNome();
    var0.setLongitude(10.0d);
    java.lang.String var17 = var0.toString();
    double var18 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.0d);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test382");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    var0.setNomeDono("hi!");
    java.lang.String var17 = var0.getPonto();
    java.lang.String var18 = var0.toString();
    var0.addPerfisChegados("");
    java.lang.String var21 = var0.getLinha();
    double var22 = var0.getLongitude();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0.0d);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test383");


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
    var0.setLongitude(10.0d);
    com.application.ciadobusao.util.DataDoEncontro var19 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId(10);
    
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
    assertNull(var19);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test384");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.lang.String var4 = var0.toString();
    var0.setLongitude(1.0d);
    var0.setLatitude(1.0d);
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.util.List var11 = var0.getPerfisChegaram();
    java.util.List var12 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var4.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test385");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.util.List var12 = var0.getPerfisConfirmados();
    double var13 = var0.getLongitude();
    java.lang.String var14 = var0.getNome();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test386");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    java.lang.String var12 = var0.getIdDono();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    var0.setLongitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test387");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    java.util.List var10 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude((-1.0d));
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    java.lang.String var18 = var0.getLinha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test388");


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
    java.util.List var21 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test389");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLatitude(1.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setId(0);
    java.lang.String var15 = var0.toString();
    var0.setLatitude(0.0d);
    var0.addPerfisChegados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var22 = var0.toString();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var22.equals("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test390");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    var0.setId(10);
    int var13 = var0.getId();
    java.lang.String var14 = var0.getNome();
    var0.setId(10);
    com.application.ciadobusao.util.DataDoEncontro var17 = var0.getData();
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test391");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var10 = var0.getHorario();
    int var11 = var0.getId();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test392");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.addPerfisChegados("hi!");
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getLinha();
    com.application.ciadobusao.util.HorarioDoEncontro var15 = var0.getHorario();
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var18 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test393");


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
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
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

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test394");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getNomeDono();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setId(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test395");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.toString();
    java.util.List var3 = var0.getPerfisChegaram();
    com.application.ciadobusao.util.HorarioDoEncontro var4 = var0.getHorario();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var9 = var0.getPerfisChegaram();
    java.lang.String var10 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"+ "'", var2.equals("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test396");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLatitude(1.0d);
    java.lang.String var13 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test397");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getPonto();
    double var9 = var0.getLatitude();
    int var10 = var0.getId();
    var0.setId((-1));
    int var13 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test398");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.lang.String var6 = var0.getNome();
    var0.setIdDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    java.lang.String var10 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test399");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    int var7 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var8 = var0.getHorario();
    var0.setId(1);
    double var11 = var0.getLongitude();
    var0.setLinha("Encontro [nome=null, linha=, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var6.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test400");


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
    java.util.List var18 = var0.getPerfisChegaram();
    java.lang.String var19 = var0.getNomeDono();
    
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
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test401");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    var0.setLatitude((-1.0d));
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]"));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test402");


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
    java.lang.String var16 = var0.getIdDono();
    java.util.List var17 = var0.getPerfisConfirmados();
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test403");


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
    var0.setNome("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var16 = var0.getPerfisChegaram();
    java.lang.String var17 = var0.getIdDono();
    java.lang.String var18 = var0.getIdDono();
    java.lang.String var19 = var0.getLinha();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var22 = var0.getPerfisConfirmados();
    
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
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test404");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    var0.setId((-1));
    java.lang.String var12 = var0.getIdDono();
    
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
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test405");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    java.lang.String var10 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    double var13 = var0.getLatitude();
    java.lang.String var14 = var0.getPonto();
    java.lang.String var15 = var0.getLinha();
    double var16 = var0.getLatitude();
    java.lang.String var17 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test406");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getIdDono();
    double var9 = var0.getLatitude();
    java.util.List var10 = var0.getPerfisChegaram();
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setLongitude(1.0d);
    java.lang.String var15 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test407");


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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=, ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
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

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test408");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    java.lang.String var13 = var0.getNomeDono();
    java.lang.String var14 = var0.getNomeDono();
    java.lang.String var15 = var0.getIdDono();
    java.util.List var16 = var0.getPerfisConfirmados();
    java.lang.String var17 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test409");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getPonto();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    java.lang.String var15 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test410");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.toString();
    java.util.List var15 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test411");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("hi!");
    java.lang.String var10 = var0.getPonto();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var19 = var0.getPerfisConfirmados();
    java.util.List var20 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test412");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    double var7 = var0.getLatitude();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test413");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    double var6 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setNomeDono("hi!");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    double var15 = var0.getLatitude();
    var0.setLinha("Encontro [nome=, linha=Encontro [nome=null, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test414");


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
    var0.setLongitude((-1.0d));
    var0.setIdDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
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
    assertTrue(var21 == 0.0d);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test415");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNomeDono();
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test416");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    double var10 = var0.getLongitude();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getPonto();
    double var16 = var0.getLatitude();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null]");
    java.lang.String var19 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var15.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test417");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setId(100);
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getLinha();
    java.lang.String var15 = var0.getIdDono();
    var0.setLongitude(10.0d);
    var0.setLatitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test418");


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
    double var17 = var0.getLatitude();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLatitude((-1.0d));
    var0.setId(100);
    
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
    assertTrue(var17 == 0.0d);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test419");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.lang.String var14 = var0.getPonto();
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=, horario=null, data=null]");
    var0.setLinha("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test420");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var7 = var0.getNomeDono();
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var8.equals("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test421");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    var0.setLongitude(100.0d);
    double var10 = var0.getLongitude();
    int var11 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLinha("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
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
    assertTrue(var10 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test422");


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
    java.util.List var17 = var0.getPerfisConfirmados();
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude((-1.0d));
    java.lang.String var22 = var0.getNomeDono();
    
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
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test423");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    double var10 = var0.getLatitude();
    java.lang.String var11 = var0.getPonto();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test424");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    var0.setPonto("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.toString();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    double var12 = var0.getLatitude();
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.util.List var14 = var0.getPerfisConfirmados();
    double var15 = var0.getLatitude();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var18 = var0.getData();
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    var0.setId(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test425");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getLinha();
    var0.addPerfisConfirmados("hi!");
    java.lang.String var11 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test426");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.util.List var9 = var0.getPerfisChegaram();
    java.util.List var10 = var0.getPerfisConfirmados();
    var0.setIdDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var15 = var0.getLatitude();
    java.util.List var16 = var0.getPerfisConfirmados();
    java.lang.String var17 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test427");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setId(10);
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getPonto();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test428");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.getIdDono();
    java.util.List var12 = var0.getPerfisConfirmados();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var15 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test429");


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
    java.lang.String var15 = var0.getIdDono();
    var0.setNomeDono("Encontro [nome=, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
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
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test430");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var11 = var0.getIdDono();
    int var12 = var0.getId();
    java.lang.String var13 = var0.getPonto();
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var16 = var0.getNome();
    java.util.List var17 = var0.getPerfisChegaram();
    var0.setLatitude(100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test431");


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
    var0.setNomeDono("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var16.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test432");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.lang.String var7 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var10 = var0.getLinha();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=hi!, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test433");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test434");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.getPonto();
    var0.setPonto("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    java.util.List var12 = var0.getPerfisConfirmados();
    var0.setLongitude((-1.0d));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test435");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setPonto("");
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNome();
    java.util.List var15 = var0.getPerfisChegaram();
    java.lang.String var16 = var0.getNome();
    com.application.ciadobusao.util.HorarioDoEncontro var17 = var0.getHorario();
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test436");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var11 = var0.getHorario();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getPonto();
    var0.setLinha("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    java.util.List var18 = var0.getPerfisChegaram();
    double var19 = var0.getLatitude();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0.0d);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test437");


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
    var0.setLongitude(1.0d);
    var0.setPonto("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    int var24 = var0.getId();
    double var25 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0d);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test438");


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
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test439");


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
    java.lang.String var18 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var19 = var0.getData();
    java.lang.String var20 = var0.getPonto();
    var0.setLongitude((-1.0d));
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    int var25 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test440");


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
    var0.setLatitude(0.0d);
    com.application.ciadobusao.util.DataDoEncontro var22 = var0.getData();
    double var23 = var0.getLatitude();
    java.lang.String var24 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test441");


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
    var0.setNome("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var24 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
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
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "Encontro [nome=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var24.equals("Encontro [nome=Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test442");


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
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setLongitude(100.0d);
    var0.setLongitude(0.0d);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
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

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test443");


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
    com.application.ciadobusao.util.HorarioDoEncontro var19 = var0.getHorario();
    java.lang.String var20 = var0.toString();
    var0.setPonto("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var18.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var20.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var23.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test444");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    double var3 = var0.getLongitude();
    double var4 = var0.getLatitude();
    double var5 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0.0d);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test445");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    java.util.List var7 = var0.getPerfisChegaram();
    var0.setPonto("hi!");
    var0.addPerfisChegados("hi!");
    java.util.List var12 = var0.getPerfisConfirmados();
    var0.setId(10);
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test446");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.getNomeDono();
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLongitude(10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test447");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getIdDono();
    java.lang.String var10 = var0.getLinha();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    java.lang.String var13 = var0.getIdDono();
    java.util.List var14 = var0.getPerfisConfirmados();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test448");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    double var7 = var0.getLatitude();
    com.application.ciadobusao.util.DataDoEncontro var8 = var0.getData();
    java.lang.String var9 = var0.getPonto();
    int var10 = var0.getId();
    java.lang.String var11 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test449");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.getLinha();
    java.lang.String var8 = var0.getIdDono();
    var0.setLatitude(100.0d);
    var0.setLatitude(0.0d);
    var0.setId(1);
    double var15 = var0.getLatitude();
    java.lang.String var16 = var0.toString();
    
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
    assertTrue("'" + var16 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var16.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test450");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setPonto("hi!");
    var0.setId((-1));
    int var5 = var0.getId();
    java.lang.String var6 = var0.getNome();
    java.util.List var7 = var0.getPerfisConfirmados();
    var0.setLongitude(100.0d);
    double var10 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0.0d);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test451");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setNomeDono("hi!");
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    int var9 = var0.getId();
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null]");
    var0.setLatitude(1.0d);
    java.lang.String var14 = var0.getLinha();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test452");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    var0.setLatitude((-1.0d));
    var0.setNomeDono("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var9 = var0.getIdDono();
    var0.setPonto("");
    var0.addPerfisChegados("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test453");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var15 = var0.getNomeDono();
    java.util.List var16 = var0.getPerfisConfirmados();
    int var17 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test454");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getNomeDono();
    int var10 = var0.getId();
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test455");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var12 = var0.getNomeDono();
    var0.setNomeDono("");
    var0.setNomeDono("hi!");
    java.lang.String var17 = var0.getPonto();
    var0.setNome("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    int var20 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test456");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLatitude(0.0d);
    double var3 = var0.getLatitude();
    var0.setPonto("Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var6 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test457");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    double var9 = var0.getLatitude();
    java.lang.String var10 = var0.getIdDono();
    java.lang.String var11 = var0.getIdDono();
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var14 = var0.getNomeDono();
    double var15 = var0.getLatitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test458");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getLinha();
    var0.setLongitude(0.0d);
    var0.setLinha("");
    java.lang.String var14 = var0.getIdDono();
    com.application.ciadobusao.util.DataDoEncontro var15 = var0.getData();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test459");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    var0.setId(0);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.util.List var13 = var0.getPerfisConfirmados();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    java.lang.String var15 = var0.getIdDono();
    java.lang.String var16 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test460");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    java.lang.String var7 = var0.getNome();
    var0.setId(10);
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null]");
    double var12 = var0.getLatitude();
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0.0d);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test461");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdDono();
    java.util.List var9 = var0.getPerfisConfirmados();
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var12 = var0.getNomeDono();
    java.lang.String var13 = var0.getIdDono();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.setLatitude((-1.0d));
    var0.setLinha("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=, horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setNomeDono("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var23 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var23.equals("Encontro [nome=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]"));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test462");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var7 = var0.getHorario();
    double var8 = var0.getLatitude();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var11 = var0.getNome();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    double var16 = var0.getLongitude();
    var0.setNome("Encontro [nome=null, linha=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0.0d);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test463");


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
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    
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

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test464");


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
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    java.lang.String var19 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test465");


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
    java.lang.String var18 = var0.getIdDono();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test466");


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
    var0.setLongitude(10.0d);
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    java.lang.String var20 = var0.getIdDono();
    var0.setIdDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], ponto=null, horario=null, data=null]");
    
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
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test467");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    var0.setId(100);
    var0.setLinha("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var13 = var0.getHorario();
    java.lang.String var14 = var0.getLinha();
    java.lang.String var15 = var0.getIdDono();
    var0.setLongitude(10.0d);
    java.util.List var18 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"+ "'", var14.equals("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test468");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    var0.addPerfisConfirmados("");
    java.util.List var14 = var0.getPerfisChegaram();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test469");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    double var7 = var0.getLatitude();
    int var8 = var0.getId();
    java.lang.String var9 = var0.getNomeDono();
    var0.addPerfisConfirmados("Encontro [nome=, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], horario=null, data=null]");
    java.util.List var12 = var0.getPerfisChegaram();
    java.util.List var13 = var0.getPerfisChegaram();
    int var14 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test470");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setLongitude(0.0d);
    java.lang.String var8 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setLinha("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setId(1);
    int var16 = var0.getId();
    java.lang.String var17 = var0.toString();
    var0.setLatitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"+ "'", var17.equals("Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]"));

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test471");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setLongitude(10.0d);
    var0.setLongitude(100.0d);
    java.lang.String var12 = var0.getIdDono();
    double var13 = var0.getLongitude();
    java.lang.String var14 = var0.getNomeDono();
    java.lang.String var15 = var0.getPonto();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 100.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test472");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.setLongitude(1.0d);
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.addPerfisConfirmados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var14 = var0.getPerfisChegaram();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getLinha();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test473");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    var0.setPonto("hi!");
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]");
    var0.setNome("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    com.application.ciadobusao.util.DataDoEncontro var13 = var0.getData();
    java.util.List var14 = var0.getPerfisConfirmados();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.delPerfilConfirmado("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test474");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.util.List var7 = var0.getPerfisChegaram();
    java.lang.String var8 = var0.getNomeDono();
    java.lang.String var9 = var0.getNomeDono();
    int var10 = var0.getId();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.lang.String var13 = var0.getNome();
    com.application.ciadobusao.util.HorarioDoEncontro var14 = var0.getHorario();
    var0.addPerfisChegados("Encontro [nome=, linha=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.setLatitude(10.0d);
    java.lang.String var19 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test475");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    double var7 = var0.getLatitude();
    var0.setPonto("hi!");
    java.lang.String var10 = var0.getLinha();
    com.application.ciadobusao.util.DataDoEncontro var11 = var0.getData();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test476");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    var0.setId(1);
    java.util.List var13 = var0.getPerfisChegaram();
    var0.setLongitude(100.0d);
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], ponto=null, horario=null, data=null]");
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test477");


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
    var0.addPerfisConfirmados("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.util.List var20 = var0.getPerfisChegaram();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=Encontro [nome=null, linha=null, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setLongitude((-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test478");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.getIdDono();
    com.application.ciadobusao.util.DataDoEncontro var12 = var0.getData();
    double var13 = var0.getLongitude();
    int var14 = var0.getId();
    var0.setNomeDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test479");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.setLatitude(100.0d);
    var0.setPonto("");
    java.lang.String var12 = var0.toString();
    var0.setIdDono("Encontro [nome=Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], linha=null, ponto=null, horario=null, data=null]");
    var0.setId(0);
    var0.setNomeDono("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test480");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    var0.setId(100);
    var0.setNomeDono("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    java.lang.String var8 = var0.getPonto();
    var0.addPerfisConfirmados("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null]");
    var0.setNome("Encontro [nome=Encontro [nome=hi!, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    var0.setPonto("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test481");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    java.lang.String var9 = var0.getIdDono();
    var0.setLatitude(10.0d);
    int var12 = var0.getId();
    java.lang.String var13 = var0.getIdDono();
    java.lang.String var14 = var0.getIdDono();
    java.lang.String var15 = var0.getIdDono();
    java.util.List var16 = var0.getPerfisChegaram();
    java.lang.String var17 = var0.getPonto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test482");


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
    double var15 = var0.getLongitude();
    com.application.ciadobusao.util.HorarioDoEncontro var16 = var0.getHorario();
    java.lang.String var17 = var0.getPonto();
    com.application.ciadobusao.util.HorarioDoEncontro var18 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test483");


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
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNomeDono();
    java.lang.String var17 = var0.getNomeDono();
    java.util.List var18 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test484");


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
    java.util.List var17 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test485");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setId(0);
    var0.setLatitude(10.0d);
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test486");


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
    com.application.ciadobusao.util.HorarioDoEncontro var22 = var0.getHorario();
    var0.setPonto("Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=hi!, horario=null, data=null], ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null], horario=null, data=null], ponto=, horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test487");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    var0.addPerfisConfirmados("hi!");
    var0.addPerfisConfirmados("");
    java.lang.String var11 = var0.toString();
    java.lang.String var12 = var0.getPonto();
    java.lang.String var13 = var0.toString();
    java.lang.String var14 = var0.getIdDono();
    java.util.List var15 = var0.getPerfisConfirmados();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var11.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var13.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test488");


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
    var0.setNomeDono("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=Encontro [nome=null, linha=, ponto=null, horario=null, data=null], horario=null, data=null]");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test489");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getIdDono();
    var0.addPerfisConfirmados("");
    int var10 = var0.getId();
    int var11 = var0.getId();
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test490");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    var0.setLongitude(0.0d);
    java.lang.String var8 = var0.getNomeDono();
    com.application.ciadobusao.util.DataDoEncontro var9 = var0.getData();
    var0.setLinha("Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null]");
    var0.setLinha("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]");
    var0.setId(1);
    java.util.List var16 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test491");


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
    int var21 = var0.getId();
    var0.setLongitude((-1.0d));
    int var24 = var0.getId();
    
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
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test492");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setLongitude(100.0d);
    java.util.List var5 = var0.getPerfisChegaram();
    java.util.List var6 = var0.getPerfisConfirmados();
    var0.addPerfisChegados("Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=hi!, horario=null, data=null]");
    java.lang.String var9 = var0.toString();
    var0.setLongitude(0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"+ "'", var9.equals("Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null]"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test493");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    java.lang.String var3 = var0.getLinha();
    java.lang.String var4 = var0.toString();
    var0.setLongitude(1.0d);
    int var7 = var0.getId();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.addPerfisChegados("Encontro [nome=hi!, linha=hi!, ponto=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var12 = var0.getPonto();
    var0.setId(0);
    double var15 = var0.getLongitude();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"+ "'", var4.equals("Encontro [nome=, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]"+ "'", var12.equals("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1.0d);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test494");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setLongitude((-1.0d));
    java.lang.String var7 = var0.getNome();
    var0.setPonto("hi!");
    var0.setLongitude((-1.0d));
    java.lang.String var12 = var0.getPonto();
    int var13 = var0.getId();
    var0.setId(0);
    var0.setIdDono("Encontro [nome=Encontro [nome=null, linha=Encontro [nome=, linha=null, ponto=null, horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    int var18 = var0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test495");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    int var5 = var0.getId();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.getLinha();
    var0.addPerfisConfirmados("");
    java.lang.String var10 = var0.getLinha();
    java.lang.String var11 = var0.getNome();
    var0.setId(0);
    java.lang.String var14 = var0.getIdDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test496");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setNomeDono("hi!");
    var0.setIdDono("hi!");
    com.application.ciadobusao.util.HorarioDoEncontro var9 = var0.getHorario();
    var0.setNome("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]");
    com.application.ciadobusao.util.HorarioDoEncontro var12 = var0.getHorario();
    java.lang.String var13 = var0.getNomeDono();
    java.lang.String var14 = var0.getNomeDono();
    java.lang.String var15 = var0.getIdDono();
    java.util.List var16 = var0.getPerfisConfirmados();
    var0.setId(1);
    java.lang.String var19 = var0.getNome();
    var0.setNome("Encontro [nome=Encontro [nome=null, linha=hi!, ponto=, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    java.util.List var22 = var0.getPerfisChegaram();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"+ "'", var19.equals("Encontro [nome=null, linha=null, ponto=null, horario=null, data=null]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test497");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setLinha("hi!");
    var0.setIdDono("");
    var0.setPonto("");
    com.application.ciadobusao.util.DataDoEncontro var7 = var0.getData();
    java.util.List var8 = var0.getPerfisConfirmados();
    int var9 = var0.getId();
    var0.setId(10);
    java.lang.String var12 = var0.getPonto();
    java.lang.String var13 = var0.getIdDono();
    com.application.ciadobusao.util.DataDoEncontro var14 = var0.getData();
    var0.setId(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test498");


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
    var0.setLinha("Encontro [nome=Encontro [nome=Encontro [nome=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null], linha=Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null], ponto=null, horario=null, data=null], linha=hi!, ponto=null, horario=null, data=null]");
    
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

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test499");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    double var1 = var0.getLongitude();
    java.lang.String var2 = var0.getPonto();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    var0.setIdDono("Encontro [nome=null, linha=hi!, ponto=hi!, horario=null, data=null]");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getLinha();
    java.lang.String var9 = var0.getNomeDono();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nEncontro16.test500");


    com.application.ciadobusao.util.Encontro var0 = new com.application.ciadobusao.util.Encontro();
    var0.setNome("");
    var0.setId(1);
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getPonto();
    java.lang.String var7 = var0.toString();
    java.lang.String var8 = var0.getPonto();
    var0.setNome("Encontro [nome=, linha=null, ponto=Encontro [nome=null, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    java.lang.String var11 = var0.getLinha();
    var0.setPonto("Encontro [nome=null, linha=hi!, ponto=Encontro [nome=, linha=hi!, ponto=null, horario=null, data=null], horario=null, data=null]");
    
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

}
