package randoop;

import junit.framework.*;

public class Usuario12 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test1");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    java.lang.String var23 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test2");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test3");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var23 = var0.getFoto();
    java.lang.String var24 = var0.getNome();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test4");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    java.lang.String var23 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test5");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var16 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setFoto("hi!");
    java.lang.String var27 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var32 = var0.getNome();
    java.lang.String var33 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + ""+ "'", var33.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test6");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getFoto();
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setFoto("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test7");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setNome("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var9 = var0.getIdFace();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test8");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var11 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var14 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test9");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getFoto();
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test10");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var21 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var24 = var0.getNome();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test11");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getFoto();
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var26 = var0.getFoto();
    java.lang.String var27 = var0.getId_gcm();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test12");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getNome();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test13");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    var0.setFoto("hi!");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test14");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test15");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var13 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test16");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test17");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var22 = var0.getNome();
    var0.setNome("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test18");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test19");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var19 = var0.getFoto();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test20");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getIdFace();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test21");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getNome();
    var0.setFoto("");
    var0.setFoto("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test22");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test23");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getNome();
    var0.setNome("");
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test24");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var23 = var0.getId_gcm();
    java.lang.String var24 = var0.getId_gcm();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test25");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getNome();
    var0.setIdFace("");
    var0.setId_gcm("");
    java.lang.String var19 = var0.getNome();
    var0.setNome("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test26");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getId_gcm();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test27");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test28");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getFoto();
    var0.setNome("");
    java.lang.String var17 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var24 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test29");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test30");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setFoto("");
    java.lang.String var16 = var0.getFoto();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test31");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var16 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var19 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    java.lang.String var22 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test32");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test33");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    java.lang.String var7 = var0.getIdFace();
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test34");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var12 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test35");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getId_gcm();
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getId_gcm();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test36");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test37");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("");
    java.lang.String var19 = var0.getNome();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test38");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    var0.setIdFace("hi!");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test39");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    java.lang.String var14 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test40");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test41");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getNome();
    var0.setFoto("");
    java.lang.String var16 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test42");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getFoto();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test43");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("");
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var21 = var0.getNome();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test44");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getFoto();
    java.lang.String var22 = var0.getId_gcm();
    java.lang.String var23 = var0.getId_gcm();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var28 = var0.getId_gcm();
    java.lang.String var29 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test45");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test46");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getNome();
    var0.setFoto("");
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getId_gcm();
    var0.setFoto("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test47");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getIdFace();
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test48");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    java.lang.String var5 = var0.getNome();
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test49");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var10 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test50");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setFoto("");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test51");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var17 = var0.getId_gcm();
    java.lang.String var18 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test52");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var9 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var12 = var0.getNome();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test53");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var27 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var30 = var0.getNome();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test54");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var12 = var0.getFoto();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test55");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var15 = var0.getId_gcm();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test56");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var27 = var0.getNome();
    java.lang.String var28 = var0.getFoto();
    java.lang.String var29 = var0.getFoto();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test57");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var18 = var0.getNome();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    java.lang.String var27 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test58");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test59");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test60");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var24 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var27 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test61");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test62");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getId_gcm();
    var0.setNome("");
    var0.setIdFace("hi!");
    java.lang.String var7 = var0.getIdFace();
    java.lang.String var8 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test63");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setNome("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test64");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getFoto();
    var0.setFoto("");
    var0.setIdFace("");
    java.lang.String var26 = var0.getIdFace();
    java.lang.String var27 = var0.getFoto();
    java.lang.String var28 = var0.getId_gcm();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test65");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getId_gcm();
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test66");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test67");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var18 = var0.getId_gcm();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test68");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var18 = var0.getNome();
    var0.setNome("hi!");
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setFoto("");
    java.lang.String var27 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test69");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setId_gcm("");
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getIdFace();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test70");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    var0.setIdFace("");
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test71");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    java.lang.String var12 = var0.getNome();
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var19 = var0.getId_gcm();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test72");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getFoto();
    java.lang.String var19 = var0.getId_gcm();
    java.lang.String var20 = var0.getIdFace();
    java.lang.String var21 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test73");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var21 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test74");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test75");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getFoto();
    var0.setNome("");
    java.lang.String var17 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setFoto("");
    var0.setIdFace("");
    java.lang.String var26 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test76");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setNome("");
    java.lang.String var19 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var22 = var0.getIdFace();
    java.lang.String var23 = var0.getId_gcm();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test77");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("");
    java.lang.String var16 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test78");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var22 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test79");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test80");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setId_gcm("");
    java.lang.String var19 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test81");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test82");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getNome();
    var0.setNome("");
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getFoto();
    java.lang.String var21 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test83");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test84");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    java.lang.String var8 = var0.getFoto();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test85");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getId_gcm();
    var0.setNome("");
    var0.setIdFace("");
    var0.setIdFace("");
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test86");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test87");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test88");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var22 = var0.getNome();
    var0.setNome("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test89");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    java.lang.String var10 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test90");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test91");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getId_gcm();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test92");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getIdFace();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test93");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getId_gcm();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test94");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNome();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test95");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test96");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("");
    var0.setIdFace("");
    var0.setIdFace("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test97");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test98");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getNome();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test99");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setFoto("");
    var0.setIdFace("");
    java.lang.String var16 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setId_gcm("");
    java.lang.String var21 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test100");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    java.lang.String var24 = var0.getNome();
    java.lang.String var25 = var0.getNome();
    java.lang.String var26 = var0.getFoto();
    java.lang.String var27 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test101");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test102");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setFoto("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test103");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var15 = var0.getIdFace();
    var0.setFoto("");
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var22 = var0.getId_gcm();
    java.lang.String var23 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test104");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setNome("");
    java.lang.String var16 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test105");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    java.lang.String var12 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getIdFace();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test106");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getFoto();
    var0.setNome("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test107");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getId_gcm();
    java.lang.String var24 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test108");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var17 = var0.getNome();
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setIdFace("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test109");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    var0.setFoto("hi!");
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getNome();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test110");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setNome("");
    java.lang.String var6 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getId_gcm();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test111");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var22 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    java.lang.String var27 = var0.getIdFace();
    java.lang.String var28 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var31 = var0.getNome();
    java.lang.String var32 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test112");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test113");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getFoto();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getIdFace();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test114");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var6 = var0.getId_gcm();
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test115");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test116");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setFoto("");
    java.lang.String var20 = var0.getNome();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test117");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    java.lang.String var3 = var0.getId_gcm();
    java.lang.String var4 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var7 = var0.getNome();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + ""+ "'", var3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test118");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var15 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test119");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test120");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    var0.setFoto("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test121");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getNome();
    java.lang.String var7 = var0.getIdFace();
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var25 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test122");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var21 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test123");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test124");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getNome();
    java.lang.String var21 = var0.getId_gcm();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test125");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getFoto();
    var0.setId_gcm("");
    var0.setFoto("");
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getId_gcm();
    java.lang.String var20 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test126");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    var0.setIdFace("hi!");
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test127");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test128");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    java.lang.String var6 = var0.getId_gcm();
    java.lang.String var7 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var10 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test129");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var20 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test130");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    java.lang.String var10 = var0.getIdFace();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test131");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getFoto();
    var0.setNome("");
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test132");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("");
    java.lang.String var24 = var0.getNome();
    java.lang.String var25 = var0.getIdFace();
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test133");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test134");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test135");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getId_gcm();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test136");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setNome("hi!");
    var0.setNome("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test137");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getIdFace();
    java.lang.String var21 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var24 = var0.getNome();
    java.lang.String var25 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var28 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test138");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setFoto("");
    var0.setIdFace("");
    java.lang.String var15 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test139");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getNome();
    java.lang.String var21 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var24 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test140");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getId_gcm();
    var0.setNome("");
    var0.setNome("");
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test141");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test142");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test143");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getNome();
    var0.setIdFace("");
    var0.setFoto("hi!");
    var0.setId_gcm("");
    java.lang.String var21 = var0.getFoto();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test144");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var12 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test145");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var22 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var25 = var0.getIdFace();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test146");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var13 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test147");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getIdFace();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test148");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getFoto();
    java.lang.String var19 = var0.getId_gcm();
    java.lang.String var20 = var0.getIdFace();
    java.lang.String var21 = var0.getNome();
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test149");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    java.lang.String var22 = var0.getFoto();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test150");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setFoto("");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getFoto();
    java.lang.String var21 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test151");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var22 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    java.lang.String var25 = var0.getFoto();
    java.lang.String var26 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setId_gcm("");
    java.lang.String var31 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test152");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    java.lang.String var18 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test153");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var22 = var0.getIdFace();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test154");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getNome();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test155");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getFoto();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var15 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test156");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var11 = var0.getNome();
    var0.setNome("");
    var0.setFoto("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test157");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getId_gcm();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test158");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var7 = var0.getId_gcm();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test159");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var14 = var0.getIdFace();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test160");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getFoto();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test161");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test162");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getNome();
    var0.setFoto("hi!");
    var0.setIdFace("");
    java.lang.String var24 = var0.getNome();
    var0.setId_gcm("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test163");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getFoto();
    var0.setNome("");
    java.lang.String var16 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test164");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test165");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var20 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test166");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test167");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test168");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var21 = var0.getId_gcm();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test169");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var25 = var0.getIdFace();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test170");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test171");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    java.lang.String var7 = var0.getFoto();
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test172");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getNome();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test173");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setNome("");
    var0.setNome("");
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test174");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setIdFace("");
    java.lang.String var18 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test175");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test176");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNome();
    var0.setIdFace("");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test177");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var22 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var25 = var0.getFoto();
    java.lang.String var26 = var0.getNome();
    java.lang.String var27 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test178");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var10 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setNome("");
    var0.setNome("");
    java.lang.String var17 = var0.getId_gcm();
    java.lang.String var18 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test179");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    java.lang.String var24 = var0.getNome();
    java.lang.String var25 = var0.getFoto();
    java.lang.String var26 = var0.getNome();
    var0.setFoto("");
    java.lang.String var29 = var0.getId_gcm();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var29);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test180");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var18 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var21 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test181");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var11 = var0.getNome();
    var0.setNome("");
    java.lang.String var14 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var17 = var0.getId_gcm();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test182");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    var0.setNome("hi!");
    var0.setNome("");
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test183");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var22 = var0.getFoto();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test184");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var17 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test185");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getFoto();
    java.lang.String var19 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test186");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    java.lang.String var8 = var0.getFoto();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var18 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    java.lang.String var21 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test187");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getNome();
    var0.setId_gcm("hi!");
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test188");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    var0.setNome("");
    java.lang.String var10 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test189");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var12 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test190");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getFoto();
    java.lang.String var21 = var0.getNome();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test191");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getNome();
    var0.setIdFace("");
    var0.setFoto("");
    java.lang.String var22 = var0.getNome();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test192");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var6 = var0.getId_gcm();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getNome();
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test193");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test194");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    java.lang.String var15 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test195");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var22 = var0.getFoto();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test196");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getNome();
    var0.setIdFace("");
    var0.setId_gcm("");
    java.lang.String var19 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var26 = var0.getNome();
    java.lang.String var27 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var30 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test197");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var12 = var0.getFoto();
    var0.setNome("");
    java.lang.String var15 = var0.getIdFace();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test198");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var14 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test199");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    java.lang.String var23 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test200");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test201");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var18 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test202");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setFoto("");
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getIdFace();
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getFoto();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test203");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var10 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test204");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var18 = var0.getNome();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    java.lang.String var27 = var0.getId_gcm();
    java.lang.String var28 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test205");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test206");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test207");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test208");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test209");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var30 = var0.getIdFace();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test210");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var8 = var0.getNome();
    var0.setNome("");
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test211");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("");
    var0.setNome("hi!");
    var0.setFoto("");
    java.lang.String var23 = var0.getIdFace();
    java.lang.String var24 = var0.getFoto();
    java.lang.String var25 = var0.getNome();
    var0.setId_gcm("");
    var0.setFoto("");
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var34 = var0.getId_gcm();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "hi!"+ "'", var34.equals("hi!"));

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test212");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test213");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test214");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test215");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test216");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var28 = var0.getIdFace();
    java.lang.String var29 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var32 = var0.getIdFace();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test217");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setFoto("hi!");
    java.lang.String var17 = var0.getId_gcm();
    var0.setIdFace("hi!");
    java.lang.String var20 = var0.getIdFace();
    java.lang.String var21 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test218");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var23 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test219");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getId_gcm();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test220");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getFoto();
    var0.setIdFace("");
    var0.setNome("");
    java.lang.String var14 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test221");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test222");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test223");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    java.lang.String var4 = var0.getNome();
    var0.setFoto("");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getFoto();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test224");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test225");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test226");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test227");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    java.lang.String var15 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test228");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setNome("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test229");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setNome("hi!");
    java.lang.String var18 = var0.getIdFace();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var25 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test230");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var13 = var0.getIdFace();
    var0.setFoto("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test231");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getFoto();
    var0.setNome("");
    java.lang.String var21 = var0.getFoto();
    java.lang.String var22 = var0.getNome();
    var0.setNome("");
    var0.setNome("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test232");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var18 = var0.getNome();
    var0.setIdFace("");
    var0.setId_gcm("");
    java.lang.String var23 = var0.getId_gcm();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test233");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test234");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setFoto("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test235");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var21 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var26 = var0.getNome();
    java.lang.String var27 = var0.getFoto();
    java.lang.String var28 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test236");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getFoto();
    java.lang.String var6 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getNome();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test237");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test238");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setNome("");
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var10 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test239");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test240");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test241");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getFoto();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test242");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getFoto();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test243");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var13 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test244");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test245");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var17 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test246");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setNome("");
    java.lang.String var17 = var0.getNome();
    var0.setNome("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test247");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getNome();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test248");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getNome();
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test249");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setNome("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test250");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getId_gcm();
    var0.setNome("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test251");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    var0.setNome("");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test252");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setId_gcm("");
    java.lang.String var17 = var0.getFoto();
    var0.setNome("");
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test253");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var17 = var0.getId_gcm();
    java.lang.String var18 = var0.getId_gcm();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test254");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getFoto();
    java.lang.String var22 = var0.getFoto();
    var0.setNome("");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var31 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var31);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test255");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var6 = var0.getFoto();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test256");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var14 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getId_gcm();
    java.lang.String var18 = var0.getNome();
    var0.setId_gcm("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test257");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setNome("hi!");
    var0.setId_gcm("");
    java.lang.String var16 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var19 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var22 = var0.getId_gcm();
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test258");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getIdFace();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test259");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test260");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var16 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setFoto("hi!");
    java.lang.String var27 = var0.getFoto();
    java.lang.String var28 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test261");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setIdFace("");
    var0.setFoto("hi!");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test262");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setNome("");
    var0.setNome("");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getFoto();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test263");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var17 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test264");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getNome();
    var0.setNome("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test265");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test266");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getNome();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test267");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setNome("hi!");
    var0.setNome("");
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test268");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var17 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var20 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var25 = var0.getNome();
    var0.setNome("");
    java.lang.String var28 = var0.getIdFace();
    java.lang.String var29 = var0.getNome();
    var0.setNome("hi!");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test269");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    var0.setNome("");
    var0.setFoto("");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getId_gcm();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test270");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var18 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var21 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test271");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test272");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var9 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var12 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var15 = var0.getIdFace();
    var0.setIdFace("");
    var0.setIdFace("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test273");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test274");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getFoto();
    java.lang.String var19 = var0.getId_gcm();
    var0.setNome("");
    var0.setNome("");
    java.lang.String var24 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test275");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test276");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var12 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test277");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var12 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var15 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var18 = var0.getId_gcm();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test278");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setNome("");
    var0.setNome("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test279");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setFoto("");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getFoto();
    java.lang.String var21 = var0.getNome();
    java.lang.String var22 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test280");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var20 = var0.getIdFace();
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getId_gcm();
    java.lang.String var23 = var0.getIdFace();
    java.lang.String var24 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test281");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var10 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setNome("");
    var0.setNome("");
    var0.setNome("");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getIdFace();
    java.lang.String var21 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test282");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test283");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var23 = var0.getIdFace();
    java.lang.String var24 = var0.getId_gcm();
    java.lang.String var25 = var0.getNome();
    java.lang.String var26 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test284");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test285");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var14 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test286");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var22 = var0.getId_gcm();
    java.lang.String var23 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test287");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getNome();
    var0.setNome("");
    java.lang.String var12 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test288");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test289");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getFoto();
    var0.setNome("");
    java.lang.String var18 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test290");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test291");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("");
    var0.setFoto("");
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getIdFace();
    var0.setFoto("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test292");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var9 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var12 = var0.getFoto();
    var0.setNome("");
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getId_gcm();
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test293");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getFoto();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test294");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getFoto();
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getNome();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    java.lang.String var27 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test295");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getNome();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test296");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test297");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var19 = var0.getNome();
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var24 = var0.getIdFace();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test298");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getId_gcm();
    var0.setIdFace("hi!");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test299");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var28 = var0.getIdFace();
    java.lang.String var29 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test300");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setNome("hi!");
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getNome();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test301");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var20 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setNome("");
    java.lang.String var25 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test302");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getNome();
    var0.setFoto("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test303");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var21 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test304");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test305");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getNome();
    java.lang.String var24 = var0.getNome();
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test306");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test307");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test308");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setIdFace("");
    var0.setNome("");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test309");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getNome();
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test310");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var21 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var24 = var0.getNome();
    java.lang.String var25 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test311");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test312");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getFoto();
    var0.setNome("");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var21 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test313");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var24 = var0.getFoto();
    var0.setNome("");
    java.lang.String var27 = var0.getId_gcm();
    java.lang.String var28 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test314");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var20 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test315");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var22 = var0.getIdFace();
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test316");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setNome("");
    java.lang.String var14 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test317");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var14 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getFoto();
    java.lang.String var21 = var0.getFoto();
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getIdFace();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test318");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test319");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var11 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test320");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test321");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var25 = var0.getId_gcm();
    java.lang.String var26 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test322");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var16 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test323");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setNome("");
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getIdFace();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test324");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    var0.setId_gcm("");
    var0.setFoto("hi!");
    var0.setIdFace("");
    java.lang.String var17 = var0.getNome();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test325");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test326");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setIdFace("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test327");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getFoto();
    java.lang.String var19 = var0.getId_gcm();
    java.lang.String var20 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test328");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    java.lang.String var8 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var15 = var0.getId_gcm();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test329");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test330");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setNome("");
    java.lang.String var17 = var0.getId_gcm();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test331");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var9 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test332");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var6 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var9 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test333");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var26 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test334");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    java.lang.String var29 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test335");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setIdFace("");
    var0.setNome("");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var19 = var0.getIdFace();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test336");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setFoto("hi!");
    java.lang.String var22 = var0.getIdFace();
    java.lang.String var23 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var26 = var0.getId_gcm();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test337");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var16 = var0.getId_gcm();
    var0.setNome("");
    var0.setNome("hi!");
    java.lang.String var21 = var0.getNome();
    java.lang.String var22 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test338");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test339");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    java.lang.String var13 = var0.getFoto();
    var0.setNome("");
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test340");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var17 = var0.getNome();
    var0.setNome("");
    java.lang.String var20 = var0.getNome();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test341");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var25 = var0.getFoto();
    java.lang.String var26 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test342");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getFoto();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test343");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getFoto();
    var0.setId_gcm("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test344");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("");
    java.lang.String var13 = var0.getNome();
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setId_gcm("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test345");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getFoto();
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test346");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test347");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var7 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setNome("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test348");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test349");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var21 = var0.getFoto();
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getFoto();
    var0.setNome("hi!");
    var0.setFoto("");
    java.lang.String var28 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test350");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getNome();
    var0.setId_gcm("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var21 = var0.getNome();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test351");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var17 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var20 = var0.getFoto();
    var0.setNome("");
    java.lang.String var23 = var0.getFoto();
    java.lang.String var24 = var0.getFoto();
    java.lang.String var25 = var0.getFoto();
    java.lang.String var26 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var29 = var0.getNome();
    java.lang.String var30 = var0.getId_gcm();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test352");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var17 = var0.getFoto();
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setNome("");
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var28 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test353");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getId_gcm();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var13 = var0.getNome();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test354");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("");
    java.lang.String var27 = var0.getIdFace();
    java.lang.String var28 = var0.getFoto();
    java.lang.String var29 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var32 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + ""+ "'", var32.equals(""));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test355");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var22 = var0.getIdFace();
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test356");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var13 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test357");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setId_gcm("");
    java.lang.String var19 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test358");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test359");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getId_gcm();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var15 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var18 = var0.getFoto();
    java.lang.String var19 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var22 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test360");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    java.lang.String var7 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setId_gcm("");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test361");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getId_gcm();
    java.lang.String var24 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test362");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var16 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var22 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test363");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var10 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var13 = var0.getId_gcm();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test364");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getNome();
    var0.setNome("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test365");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test366");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test367");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    var0.setNome("");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test368");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test369");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getIdFace();
    var0.setFoto("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test370");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test371");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setIdFace("");
    var0.setNome("");
    java.lang.String var10 = var0.getFoto();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test372");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test373");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setFoto("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test374");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var26 = var0.getFoto();
    java.lang.String var27 = var0.getIdFace();
    java.lang.String var28 = var0.getFoto();
    var0.setIdFace("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test375");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test376");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setNome("hi!");
    var0.setNome("");
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getFoto();
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test377");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    var0.setNome("");
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var18 = var0.getFoto();
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test378");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getFoto();
    java.lang.String var26 = var0.getIdFace();
    java.lang.String var27 = var0.getFoto();
    java.lang.String var28 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var31 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test379");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test380");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    java.lang.String var6 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test381");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var7 = var0.getId_gcm();
    var0.setNome("");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getFoto();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test382");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getId_gcm();
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getId_gcm();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
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

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test383");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("");
    var0.setFoto("");
    java.lang.String var19 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setFoto("hi!");
    java.lang.String var24 = var0.getId_gcm();
    java.lang.String var25 = var0.getId_gcm();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test384");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test385");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getNome();
    java.lang.String var7 = var0.getIdFace();
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var13 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test386");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    var0.setNome("");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test387");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setNome("");
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test388");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNome();
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test389");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var10 = var0.getNome();
    var0.setFoto("");
    java.lang.String var13 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var16 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test390");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var10 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var13 = var0.getFoto();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test391");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    java.lang.String var24 = var0.getNome();
    java.lang.String var25 = var0.getNome();
    java.lang.String var26 = var0.getId_gcm();
    var0.setFoto("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test392");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var13 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test393");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getFoto();
    var0.setNome("");
    java.lang.String var17 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setFoto("");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var28 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test394");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var18 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getFoto();
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setId_gcm("");
    java.lang.String var30 = var0.getNome();
    java.lang.String var31 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test395");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    java.lang.String var26 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var29 = var0.getIdFace();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test396");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var23 = var0.getFoto();
    java.lang.String var24 = var0.getNome();
    java.lang.String var25 = var0.getIdFace();
    java.lang.String var26 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test397");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("");
    java.lang.String var13 = var0.getNome();
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setIdFace("hi!");
    java.lang.String var24 = var0.getFoto();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test398");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    var0.setFoto("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test399");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var19 = var0.getFoto();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test400");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test401");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var14 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("");
    java.lang.String var21 = var0.getFoto();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test402");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var23 = var0.getFoto();
    var0.setNome("");
    java.lang.String var26 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test403");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var10 = var0.getNome();
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var15 = var0.getIdFace();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test404");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var12 = var0.getFoto();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test405");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getNome();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test406");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    java.lang.String var10 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test407");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var26 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var29 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test408");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setFoto("");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    java.lang.String var17 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var20 = var0.getNome();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test409");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getNome();
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setFoto("");
    java.lang.String var14 = var0.getIdFace();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test410");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    java.lang.String var20 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test411");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getNome();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test412");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test413");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getFoto();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test414");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var27 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var30 = var0.getNome();
    var0.setNome("");
    java.lang.String var33 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "hi!"+ "'", var33.equals("hi!"));

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test415");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var16 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test416");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var23 = var0.getId_gcm();
    java.lang.String var24 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test417");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    var0.setIdFace("");
    java.lang.String var10 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test418");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test419");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var19 = var0.getFoto();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test420");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getNome();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test421");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test422");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var16 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test423");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getIdFace();
    var0.setIdFace("");
    var0.setNome("");
    var0.setFoto("");
    var0.setNome("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test424");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var12 = var0.getId_gcm();
    var0.setIdFace("hi!");
    java.lang.String var15 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test425");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test426");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var24 = var0.getIdFace();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test427");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test428");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getFoto();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test429");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getFoto();
    java.lang.String var21 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var24 = var0.getNome();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test430");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("");
    var0.setFoto("");
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var23 = var0.getIdFace();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test431");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("");
    java.lang.String var27 = var0.getNome();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test432");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var13 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test433");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test434");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getIdFace();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test435");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var15 = var0.getIdFace();
    var0.setFoto("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test436");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getId_gcm();
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    java.lang.String var25 = var0.getNome();
    java.lang.String var26 = var0.getFoto();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test437");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var6 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test438");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getNome();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test439");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test440");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getFoto();
    var0.setNome("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test441");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var20 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test442");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var17 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var20 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setFoto("hi!");
    java.lang.String var25 = var0.getFoto();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test443");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test444");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getNome();
    java.lang.String var24 = var0.getIdFace();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test445");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setFoto("hi!");
    java.lang.String var26 = var0.getIdFace();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test446");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setId_gcm("");
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var22 = var0.getId_gcm();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test447");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test448");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getId_gcm();
    java.lang.String var24 = var0.getFoto();
    java.lang.String var25 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var28 = var0.getId_gcm();
    java.lang.String var29 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test449");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test450");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var7 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test451");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var15 = var0.getId_gcm();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test452");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getNome();
    var0.setFoto("");
    java.lang.String var18 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test453");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getNome();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test454");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getIdFace();
    java.lang.String var26 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var29 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test455");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    java.lang.String var20 = var0.getFoto();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test456");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test457");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getIdFace();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test458");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    var0.setId_gcm("");
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test459");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("");
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getId_gcm();
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var20 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test460");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test461");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getFoto();
    java.lang.String var26 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test462");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var10 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test463");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var11 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test464");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var12 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test465");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test466");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setIdFace("");
    var0.setNome("");
    java.lang.String var14 = var0.getNome();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test467");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test468");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test469");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var25 = var0.getFoto();
    java.lang.String var26 = var0.getFoto();
    var0.setIdFace("");
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test470");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setNome("");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test471");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var19 = var0.getIdFace();
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var26 = var0.getFoto();
    java.lang.String var27 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var30 = var0.getNome();
    java.lang.String var31 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "hi!"+ "'", var31.equals("hi!"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test472");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getNome();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test473");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var12 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var15 = var0.getNome();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test474");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getFoto();
    var0.setId_gcm("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test475");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getId_gcm();
    java.lang.String var20 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test476");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getFoto();
    var0.setNome("hi!");
    var0.setNome("");
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var23 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var26 = var0.getIdFace();
    java.lang.String var27 = var0.getNome();
    java.lang.String var28 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test477");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test478");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setFoto("hi!");
    java.lang.String var18 = var0.getFoto();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test479");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test480");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var25 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test481");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getNome();
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test482");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getFoto();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test483");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("");
    java.lang.String var13 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    java.lang.String var18 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var21 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test484");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getNome();
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test485");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var29 = var0.getFoto();
    var0.setNome("");
    java.lang.String var32 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var35 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + ""+ "'", var35.equals(""));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test486");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test487");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var13 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    java.lang.String var16 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test488");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setFoto("");
    java.lang.String var17 = var0.getNome();
    var0.setNome("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test489");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var9 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test490");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test491");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var15 = var0.getIdFace();
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setFoto("hi!");
    java.lang.String var22 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test492");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var27 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var30 = var0.getNome();
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test493");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getNome();
    var0.setId_gcm("");
    var0.setNome("");
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test494");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getId_gcm();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getIdFace();
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test495");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test496");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getId_gcm();
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test497");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var17 = var0.getNome();
    var0.setFoto("");
    java.lang.String var20 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test498");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getIdFace();
    var0.setIdFace("");
    var0.setFoto("");
    var0.setFoto("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test499");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    var0.setNome("");
    var0.setIdFace("");
    java.lang.String var11 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nUsuario12.test500");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var14 = var0.getId_gcm();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

}
