package randoop;

import junit.framework.*;

public class Usuario1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test1");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test2");


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
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getIdFace();
    
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

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test3");


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
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getIdFace();
    
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
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test4");


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
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test5");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var16 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test6");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getId_gcm();
    var0.setFoto("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test7");


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
    var0.setNome("");
    java.lang.String var18 = var0.getNome();
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
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test8");


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
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test9");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getIdFace();
    var0.setNome("");
    var0.setFoto("");
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getFoto();
    var0.setNome("");
    
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
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test10");


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
    var0.setId_gcm("");
    var0.setIdFace("");
    
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

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test11");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var11 = var0.getNome();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test12");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test13");


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
    var0.setId_gcm("");
    
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

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test14");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getIdFace();
    var0.setNome("");
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test15");


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
    java.lang.String var16 = var0.getFoto();
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test16");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getId_gcm();
    var0.setId_gcm("");
    
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

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test17");


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
    java.lang.String var23 = var0.getNome();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test18");


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
    var0.setFoto("");
    java.lang.String var18 = var0.getId_gcm();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test19");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var9 = var0.getNome();
    var0.setNome("hi!");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test20");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setIdFace("");
    var0.setFoto("hi!");
    java.lang.String var13 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var16 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test21");


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
    var0.setFoto("");
    java.lang.String var16 = var0.getId_gcm();
    
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

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test22");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    var0.setNome("");
    java.lang.String var17 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var20 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test23");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    var0.setIdFace("hi!");
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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test24");


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
    var0.setFoto("hi!");
    java.lang.String var22 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test25");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test26");


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
    java.lang.String var23 = var0.getNome();
    java.lang.String var24 = var0.getFoto();
    var0.setNome("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test27");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test28");


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
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var20 = var0.getId_gcm();
    var0.setNome("");
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
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test29");


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
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test30");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test31");


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
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test32");


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
    java.lang.String var17 = var0.getFoto();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test33");


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
    java.lang.String var27 = var0.getId_gcm();
    var0.setId_gcm("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test34");


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
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var21 = var0.getId_gcm();
    
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
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test35");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getFoto();
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
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test36");


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
    java.lang.String var26 = var0.getNome();
    
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
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test37");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var13 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test38");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test39");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var13 = var0.getNome();
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
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test40");


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
    var0.setFoto("hi!");
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

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test41");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test42");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setId_gcm("");
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test43");


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
    var0.setId_gcm("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test44");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test45");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setIdFace("");
    var0.setIdFace("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getId_gcm();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test46");


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

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test47");


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
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getFoto();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test48");


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
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test49");


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
    var0.setIdFace("hi!");
    java.lang.String var21 = var0.getId_gcm();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test50");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test51");


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
    java.lang.String var18 = var0.getIdFace();
    
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

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test52");


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
    var0.setIdFace("hi!");
    java.lang.String var24 = var0.getIdFace();
    
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
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test53");


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
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test54");


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
    var0.setNome("");
    java.lang.String var19 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var22 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test55");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var16 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getNome();
    java.lang.String var21 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test56");


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
    java.lang.String var16 = var0.getFoto();
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test57");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getIdFace();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test58");


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
    var0.setNome("");
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
    assertNull(var21);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test59");


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
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getIdFace();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test60");


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
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setNome("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test61");


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
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setNome("");
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
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test62");


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
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test63");


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
    var0.setIdFace("");
    java.lang.String var25 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test64");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var10 = var0.getId_gcm();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var15 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test65");


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
    var0.setIdFace("hi!");
    
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

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test66");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var15 = var0.getId_gcm();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test67");


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
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test68");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test69");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var15 = var0.getNome();
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
    assertNull(var15);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test70");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var18 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test71");


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
    var0.setIdFace("hi!");
    java.lang.String var21 = var0.getNome();
    
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
    assertNull(var21);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test72");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getNome();
    
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

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test73");


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
    var0.setNome("hi!");
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getFoto();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test74");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test75");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var20 = var0.getFoto();
    java.lang.String var21 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    
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
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test76");


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
    java.lang.String var15 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test77");


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
    java.lang.String var24 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test78");


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
    var0.setId_gcm("hi!");
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var26 = var0.getFoto();
    
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

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test79");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test80");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getFoto();
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getIdFace();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test81");


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
    java.lang.String var19 = var0.getId_gcm();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test82");


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
    var0.setFoto("hi!");
    var0.setNome("hi!");
    java.lang.String var20 = var0.getIdFace();
    
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
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test83");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test84");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var8 = var0.getNome();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test85");


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
    var0.setNome("");
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test86");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test87");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getFoto();
    var0.setNome("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test88");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getIdFace();
    java.lang.String var8 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test89");


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
    java.lang.String var17 = var0.getNome();
    
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

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test90");


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
    var0.setIdFace("hi!");
    var0.setIdFace("");
    java.lang.String var28 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test91");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getIdFace();
    var0.setIdFace("");
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test92");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test93");


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
    var0.setNome("");
    
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

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test94");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setFoto("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test95");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    java.lang.String var4 = var0.getNome();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test96");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test97");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test98");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getNome();
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
    assertNull(var11);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test99");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var13 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getId_gcm();
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test100");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getId_gcm();
    
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
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test101");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    java.lang.String var3 = var0.getFoto();
    java.lang.String var4 = var0.getNome();
    var0.setIdFace("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test102");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test103");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setIdFace("");
    java.lang.String var9 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test104");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("hi!");

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test105");


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
    assertNull(var17);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test106");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var8 = var0.getNome();
    var0.setFoto("");
    java.lang.String var11 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var14 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test107");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test108");


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
    java.lang.String var14 = var0.getIdFace();
    
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
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test109");


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
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test110");


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
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getNome();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test111");


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
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test112");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getFoto();
    var0.setFoto("hi!");
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test113");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test114");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var12 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test115");


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
    java.lang.String var20 = var0.getNome();
    java.lang.String var21 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test116");


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
    java.lang.String var17 = var0.getId_gcm();
    java.lang.String var18 = var0.getNome();
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var23 = var0.getIdFace();
    
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
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test117");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test118");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    var0.setFoto("");
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var17 = var0.getIdFace();
    var0.setNome("");
    var0.setIdFace("");
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test119");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getId_gcm();
    
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
    assertNull(var11);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test120");


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
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var21 = var0.getIdFace();
    var0.setFoto("");
    
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
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test121");


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
    java.lang.String var17 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test122");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getId_gcm();
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
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test123");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test124");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var14 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test125");


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
    var0.setFoto("");
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getNome();
    java.lang.String var26 = var0.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "hi!"+ "'", var26.equals("hi!"));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test126");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var6 = var0.getId_gcm();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test127");


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
    var0.setFoto("");
    java.lang.String var24 = var0.getNome();
    java.lang.String var25 = var0.getId_gcm();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test128");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test129");


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
    var0.setIdFace("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test130");


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
    java.lang.String var14 = var0.getFoto();
    
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

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test131");


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
    java.lang.String var15 = var0.getFoto();
    var0.setFoto("hi!");
    
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

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test132");


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
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getFoto();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test133");


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
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getNome();
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test134");


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
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var20 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test135");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test136");


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
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getNome();
    
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
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test137");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test138");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    java.lang.String var3 = var0.getFoto();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getId_gcm();
    java.lang.String var6 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test139");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getNome();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test140");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getNome();
    var0.setNome("");
    var0.setNome("");
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test141");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var6 = var0.getId_gcm();
    java.lang.String var7 = var0.getId_gcm();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test142");


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
    var0.setFoto("hi!");
    var0.setIdFace("");
    java.lang.String var22 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var25 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test143");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    var0.setNome("");
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test144");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getFoto();
    var0.setNome("");
    var0.setIdFace("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test145");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var12 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test146");


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
    java.lang.String var27 = var0.getFoto();
    var0.setFoto("hi!");
    
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
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test147");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getFoto();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test148");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test149");


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
    java.lang.String var17 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var22 = var0.getIdFace();
    java.lang.String var23 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test150");


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
    java.lang.String var14 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var19 = var0.getId_gcm();
    java.lang.String var20 = var0.getFoto();
    
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
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test151");


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
    var0.setNome("hi!");
    java.lang.String var19 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test152");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var5 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test153");


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
    java.lang.String var20 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test154");


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
    var0.setIdFace("hi!");
    java.lang.String var23 = var0.getId_gcm();
    java.lang.String var24 = var0.getNome();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test155");


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
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test156");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test157");


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
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getId_gcm();
    java.lang.String var18 = var0.getFoto();
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test158");


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
    java.lang.String var18 = var0.getFoto();
    
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

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test159");


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
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test160");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getFoto();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test161");


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
    var0.setNome("hi!");
    java.lang.String var27 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test162");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test163");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test164");


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
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var18 = var0.getFoto();
    
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
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test165");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test166");


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
    var0.setId_gcm("");
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getId_gcm();
    
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
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test167");


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
    java.lang.String var18 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test168");


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
    java.lang.String var23 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var26 = var0.getId_gcm();
    
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
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test169");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setIdFace("");
    var0.setIdFace("hi!");
    java.lang.String var15 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var18 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test170");


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
    var0.setIdFace("hi!");
    java.lang.String var23 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var26 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var26);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test171");


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
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getIdFace();
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test172");


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
    java.lang.String var14 = var0.getNome();
    var0.setNome("");
    var0.setNome("hi!");
    
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
    assertNull(var14);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test173");


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
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test174");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var16 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test175");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test176");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test177");


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
    java.lang.String var20 = var0.getNome();
    var0.setNome("");
    java.lang.String var23 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test178");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getFoto();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test179");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var6 = var0.getId_gcm();
    java.lang.String var7 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test180");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getFoto();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test181");


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
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test182");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getId_gcm();
    java.lang.String var18 = var0.getId_gcm();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test183");


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
    java.lang.String var27 = var0.getNome();
    java.lang.String var28 = var0.getNome();
    java.lang.String var29 = var0.getNome();
    java.lang.String var30 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + ""+ "'", var30.equals(""));

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test184");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getNome();
    var0.setFoto("hi!");
    
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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test185");


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
    java.lang.String var15 = var0.getFoto();
    var0.setNome("");
    java.lang.String var18 = var0.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test186");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    java.lang.String var3 = var0.getFoto();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getId_gcm();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getNome();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test187");


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
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test188");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test189");


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
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var23 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var26 = var0.getFoto();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test190");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test191");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getIdFace();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setNome("");
    java.lang.String var18 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test192");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test193");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var14 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test194");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getFoto();
    var0.setNome("hi!");
    var0.setFoto("hi!");
    var0.setNome("");
    
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

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test195");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test196");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test197");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("");
    java.lang.String var12 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test198");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getId_gcm();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test199");


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
    java.lang.String var18 = var0.getNome();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test200");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test201");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test202");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test203");


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
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getId_gcm();
    java.lang.String var18 = var0.getId_gcm();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test204");


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
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getFoto();
    var0.setId_gcm("");
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test205");


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
    java.lang.String var19 = var0.getId_gcm();
    java.lang.String var20 = var0.getFoto();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var25 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test206");


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
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var21 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test207");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    java.lang.String var7 = var0.getIdFace();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test208");


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
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test209");


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
    var0.setNome("hi!");
    java.lang.String var21 = var0.getNome();
    var0.setFoto("");
    java.lang.String var24 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test210");


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
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getId_gcm();
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
    assertNull(var17);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test211");


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
    java.lang.String var14 = var0.getIdFace();
    var0.setId_gcm("");
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test212");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    var0.setFoto("hi!");
    var0.setId_gcm("");
    java.lang.String var10 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getId_gcm();
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test213");


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
    var0.setIdFace("hi!");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test214");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getNome();
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

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test215");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setNome("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test216");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var6 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test217");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test218");


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
    java.lang.String var22 = var0.getId_gcm();
    java.lang.String var23 = var0.getIdFace();
    java.lang.String var24 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test219");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var13 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test220");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test221");


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
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test222");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var12 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setIdFace("");
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test223");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getFoto();
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test224");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getIdFace();
    var0.setIdFace("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test225");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var10 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var15 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var18 = var0.getIdFace();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test226");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test227");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getNome();
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test228");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getNome();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getFoto();
    var0.setIdFace("hi!");
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test229");


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
    java.lang.String var21 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test230");


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
    java.lang.String var18 = var0.getNome();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test231");


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
    var0.setFoto("");
    
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

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test232");


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
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var26 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var29 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test233");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test234");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setIdFace("");
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var18 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test235");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var18 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test236");


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
    java.lang.String var20 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test237");


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
    java.lang.String var19 = var0.getFoto();
    java.lang.String var20 = var0.getId_gcm();
    java.lang.String var21 = var0.getFoto();
    
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
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test238");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test239");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test240");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getIdFace();
    var0.setNome("");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test241");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test242");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    java.lang.String var8 = var0.getNome();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test243");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getNome();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
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

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test244");


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
    var0.setNome("hi!");
    java.lang.String var23 = var0.getNome();
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getNome();
    
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
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test245");


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
    var0.setId_gcm("hi!");
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test246");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var12 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var15 = var0.getFoto();
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getNome();
    var0.setNome("hi!");
    var0.setNome("hi!");
    java.lang.String var22 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test247");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test248");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    java.lang.String var6 = var0.getId_gcm();
    java.lang.String var7 = var0.getIdFace();
    var0.setNome("");
    var0.setIdFace("hi!");
    java.lang.String var12 = var0.getFoto();
    
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
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test249");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var12 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test250");


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
    var0.setIdFace("hi!");
    java.lang.String var23 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test251");


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
    var0.setNome("hi!");
    java.lang.String var16 = var0.getId_gcm();
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test252");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var7 = var0.getFoto();
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test253");


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
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test254");


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
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test255");


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
    java.lang.String var22 = var0.getIdFace();
    var0.setIdFace("hi!");
    
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
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test256");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setNome("");
    java.lang.String var6 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var9 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var12 = var0.getIdFace();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test257");


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
    java.lang.String var20 = var0.getNome();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test258");


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
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var21 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test259");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getIdFace();
    var0.setNome("");
    var0.setFoto("");
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getNome();
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test260");


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
    var0.setId_gcm("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test261");


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
    java.lang.String var23 = var0.getIdFace();
    java.lang.String var24 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var27 = var0.getNome();
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
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test262");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    java.lang.String var4 = var0.getNome();
    var0.setFoto("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test263");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test264");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var10 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test265");


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
    var0.setNome("hi!");
    java.lang.String var31 = var0.getIdFace();
    
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
    assertTrue("'" + var31 + "' != '" + ""+ "'", var31.equals(""));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test266");


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
    var0.setId_gcm("");
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

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test267");


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
    var0.setNome("hi!");
    java.lang.String var27 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test268");


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
    java.lang.String var22 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test269");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var13 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getId_gcm();
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test270");


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
    var0.setIdFace("");
    var0.setFoto("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test271");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    var0.setId_gcm("");
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test272");


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
    java.lang.String var18 = var0.getFoto();
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var23 = var0.getNome();
    java.lang.String var24 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test273");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var5 = var0.getFoto();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test274");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test275");


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
    var0.setNome("");
    var0.setIdFace("");
    java.lang.String var21 = var0.getFoto();
    java.lang.String var22 = var0.getId_gcm();
    java.lang.String var23 = var0.getIdFace();
    var0.setFoto("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test276");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var12 = var0.getFoto();
    
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
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test277");


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
    var0.setId_gcm("");
    var0.setIdFace("");
    java.lang.String var35 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "hi!"+ "'", var30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test278");


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
    java.lang.String var22 = var0.getNome();
    var0.setId_gcm("hi!");
    var0.setNome("");
    
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

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test279");


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
    var0.setId_gcm("hi!");
    java.lang.String var20 = var0.getId_gcm();
    
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
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test280");


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
    java.lang.String var27 = var0.getNome();
    java.lang.String var28 = var0.getNome();
    java.lang.String var29 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "hi!"+ "'", var27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + ""+ "'", var29.equals(""));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test281");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getId_gcm();
    java.lang.String var7 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test282");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    java.lang.String var7 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getIdFace();
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test283");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getNome();
    var0.setFoto("");
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test284");


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
    java.lang.String var23 = var0.getNome();
    java.lang.String var24 = var0.getId_gcm();
    java.lang.String var25 = var0.getIdFace();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test285");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    java.lang.String var5 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var8 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test286");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    var0.setIdFace("");
    java.lang.String var8 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test287");


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
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    java.lang.String var19 = var0.getIdFace();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test288");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test289");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test290");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getIdFace();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test291");


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
    java.lang.String var21 = var0.getIdFace();
    java.lang.String var22 = var0.getIdFace();
    
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
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test292");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    var0.setIdFace("");
    var0.setNome("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test293");


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
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getIdFace();
    
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
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test294");


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
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test295");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getNome();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    
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
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test296");


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
    java.lang.String var15 = var0.getId_gcm();
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
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test297");


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
    var0.setIdFace("hi!");
    
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

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test298");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("hi!");
    var0.setFoto("");
    java.lang.String var14 = var0.getFoto();
    var0.setId_gcm("");
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var22 = var0.getIdFace();
    java.lang.String var23 = var0.getNome();
    
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
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test299");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getFoto();
    var0.setNome("hi!");
    var0.setFoto("");
    java.lang.String var14 = var0.getId_gcm();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test300");


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
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getId_gcm();
    java.lang.String var18 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test301");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getId_gcm();
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var15 = var0.getIdFace();
    
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test302");


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
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test303");


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
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setIdFace("");
    
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

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test304");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setId_gcm("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getNome();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test305");


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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test306");


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
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getNome();
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getIdFace();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test307");


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
    java.lang.String var20 = var0.getIdFace();
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
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test308");


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
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getNome();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test309");


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
    java.lang.String var15 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test310");


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
    var0.setIdFace("");
    java.lang.String var21 = var0.getFoto();
    java.lang.String var22 = var0.getNome();
    
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
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test311");


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
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getIdFace();
    
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

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test312");


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
    java.lang.String var15 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test313");


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
    var0.setFoto("hi!");
    
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

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test314");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var13 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test315");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var11 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var14 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var17 = var0.getFoto();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test316");


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
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getIdFace();
    java.lang.String var19 = var0.getNome();
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test317");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getFoto();
    
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test318");


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
    var0.setIdFace("hi!");
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
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test319");


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
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var21 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var24 = var0.getIdFace();
    java.lang.String var25 = var0.getIdFace();
    
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
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test320");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getIdFace();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test321");


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
    java.lang.String var27 = var0.getId_gcm();
    var0.setNome("hi!");
    
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

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test322");


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
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    
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

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test323");


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
    java.lang.String var28 = var0.getIdFace();
    java.lang.String var29 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "hi!"+ "'", var29.equals("hi!"));

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test324");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test325");


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
    var0.setIdFace("");
    java.lang.String var21 = var0.getIdFace();
    
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
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test326");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getIdFace();
    var0.setNome("hi!");
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test327");


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
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test328");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test329");


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
    var0.setId_gcm("hi!");
    java.lang.String var17 = var0.getFoto();
    var0.setId_gcm("");
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
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test330");


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
    var0.setNome("hi!");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    java.lang.String var25 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "hi!"+ "'", var25.equals("hi!"));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test331");


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
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var20 = var0.getFoto();
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test332");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var12 = var0.getNome();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test333");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    java.lang.String var8 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    java.lang.String var13 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test334");


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
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var27 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test335");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var8 = var0.getNome();
    var0.setNome("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test336");


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
    java.lang.String var18 = var0.getNome();
    java.lang.String var19 = var0.getIdFace();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test337");


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
    var0.setNome("hi!");
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test338");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    var0.setNome("hi!");
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getNome();
    
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
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test339");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setIdFace("hi!");
    java.lang.String var14 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test340");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getId_gcm();
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test341");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var18 = var0.getIdFace();
    var0.setNome("");
    var0.setNome("");
    
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
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test342");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test343");


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
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getNome();
    
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test344");


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
    var0.setFoto("hi!");
    var0.setNome("hi!");
    var0.setNome("");
    java.lang.String var22 = var0.getNome();
    
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
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test345");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    java.lang.String var13 = var0.getIdFace();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test346");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var9 = var0.getFoto();
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getId_gcm();
    
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
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test347");


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
    var0.setNome("");
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test348");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    var0.setNome("");
    var0.setIdFace("");
    var0.setId_gcm("");
    java.lang.String var13 = var0.getId_gcm();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test349");


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
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test350");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test351");


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
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getIdFace();
    
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
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test352");


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
    java.lang.String var18 = var0.getId_gcm();
    var0.setNome("");
    var0.setNome("hi!");
    
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
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test353");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test354");


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
    java.lang.String var18 = var0.getFoto();
    java.lang.String var19 = var0.getIdFace();
    
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
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test355");


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
    java.lang.String var15 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var18 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test356");


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
    var0.setId_gcm("hi!");
    java.lang.String var17 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test357");


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
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test358");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getNome();
    var0.setFoto("hi!");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test359");


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
    java.lang.String var19 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test360");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    var0.setIdFace("");
    var0.setIdFace("hi!");
    java.lang.String var15 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test361");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "hi!"+ "'", var5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test362");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var7 = var0.getId_gcm();
    var0.setNome("");
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getNome();
    var0.setNome("");
    var0.setFoto("");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test363");


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
    var0.setFoto("");
    java.lang.String var22 = var0.getId_gcm();
    
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
    assertNull(var22);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test364");


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
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getNome();
    java.lang.String var21 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test365");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getFoto();
    java.lang.String var12 = var0.getFoto();
    var0.setId_gcm("");
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test366");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setId_gcm("hi!");
    var0.setFoto("");
    java.lang.String var14 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test367");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var14 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test368");


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
    var0.setId_gcm("hi!");
    java.lang.String var20 = var0.getFoto();
    var0.setNome("");
    java.lang.String var23 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test369");


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
    java.lang.String var18 = var0.getNome();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test370");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test371");


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
    java.lang.String var23 = var0.getIdFace();
    java.lang.String var24 = var0.getFoto();
    java.lang.String var25 = var0.getFoto();
    
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
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test372");


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
    java.lang.String var16 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test373");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    var0.setIdFace("");
    var0.setNome("hi!");
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test374");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    var0.setId_gcm("");
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test375");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("hi!");
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var12 = var0.getNome();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test376");


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
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test377");


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
    java.lang.String var21 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test378");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test379");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    java.lang.String var6 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test380");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getIdFace();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test381");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setFoto("");
    java.lang.String var6 = var0.getId_gcm();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var12 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test382");


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
    java.lang.String var12 = var0.getIdFace();
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getFoto();
    java.lang.String var15 = var0.getId_gcm();
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
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test383");


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
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test384");


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
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getId_gcm();
    java.lang.String var20 = var0.getId_gcm();
    
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
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test385");


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
    var0.setFoto("hi!");
    java.lang.String var19 = var0.getIdFace();
    
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test386");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getIdFace();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getId_gcm();
    var0.setNome("hi!");
    var0.setIdFace("");
    java.lang.String var14 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test387");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setIdFace("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test388");


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
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getNome();
    var0.setFoto("");
    java.lang.String var21 = var0.getFoto();
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test389");


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
    java.lang.String var23 = var0.getFoto();
    var0.setNome("hi!");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test390");


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
    var0.setId_gcm("");
    
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

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test391");


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
    var0.setId_gcm("hi!");
    var0.setIdFace("");
    java.lang.String var20 = var0.getIdFace();
    
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
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test392");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    java.lang.String var9 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("hi!");
    java.lang.String var15 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test393");


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
    var0.setIdFace("");
    var0.setIdFace("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test394");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var16 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setNome("");
    java.lang.String var21 = var0.getFoto();
    var0.setNome("");
    java.lang.String var24 = var0.getId_gcm();
    
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
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test395");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("");
    
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
    assertNull(var12);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test396");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test397");


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
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test398");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test399");


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
    var0.setIdFace("");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getIdFace();
    
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
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test400");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setNome("hi!");
    var0.setFoto("hi!");
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test401");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var12 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getIdFace();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test402");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getNome();
    
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

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test403");


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
    java.lang.String var14 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setNome("hi!");
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
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test404");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getNome();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test405");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    var0.setNome("");
    var0.setIdFace("");
    java.lang.String var14 = var0.getFoto();
    
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
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test406");


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
    java.lang.String var20 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test407");


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
    var0.setFoto("hi!");
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
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test408");


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
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test409");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setId_gcm("");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test410");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test411");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setFoto("");
    java.lang.String var5 = var0.getId_gcm();
    java.lang.String var6 = var0.getIdFace();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test412");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test413");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    var0.setFoto("");
    var0.setNome("hi!");
    java.lang.String var14 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setNome("hi!");
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getNome();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test414");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getIdFace();
    var0.setNome("");
    
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

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test415");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test416");


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
    java.lang.String var13 = var0.getFoto();
    java.lang.String var14 = var0.getIdFace();
    java.lang.String var15 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var18 = var0.getNome();
    
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
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test417");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test418");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setNome("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test419");


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
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test420");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setNome("hi!");
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var18 = var0.getIdFace();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test421");


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
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test422");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setIdFace("");
    var0.setNome("");
    java.lang.String var14 = var0.getId_gcm();
    java.lang.String var15 = var0.getId_gcm();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test423");


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
    var0.setFoto("");
    java.lang.String var17 = var0.getIdFace();
    java.lang.String var18 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test424");


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
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNome();
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
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test425");


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
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getId_gcm();
    java.lang.String var17 = var0.getNome();
    var0.setIdFace("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test426");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test427");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getIdFace();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test428");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    var0.setId_gcm("");
    java.lang.String var14 = var0.getNome();
    var0.setNome("");
    java.lang.String var17 = var0.getNome();
    java.lang.String var18 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test429");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getIdFace();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getFoto();
    var0.setNome("");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test430");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getIdFace();
    
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

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test431");


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
    var0.setIdFace("hi!");
    java.lang.String var21 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test432");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    java.lang.String var2 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var5 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var8 = var0.getNome();
    var0.setFoto("");
    var0.setNome("");
    java.lang.String var13 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test433");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setIdFace("");
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getIdFace();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test434");


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
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getNome();
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
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test435");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    var0.setNome("hi!");
    var0.setIdFace("hi!");
    java.lang.String var11 = var0.getId_gcm();
    java.lang.String var12 = var0.getFoto();
    java.lang.String var13 = var0.getId_gcm();
    java.lang.String var14 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test436");


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
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var23 = var0.getFoto();
    java.lang.String var24 = var0.getId_gcm();
    
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test437");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getId_gcm();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var20 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var23 = var0.getId_gcm();
    java.lang.String var24 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test438");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setNome("hi!");
    java.lang.String var10 = var0.getId_gcm();
    java.lang.String var11 = var0.getFoto();
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test439");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setId_gcm("");
    var0.setNome("hi!");
    java.lang.String var5 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getFoto();
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test440");


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
    java.lang.String var23 = var0.getId_gcm();
    java.lang.String var24 = var0.getIdFace();
    var0.setFoto("hi!");
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
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test441");


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
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    
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

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test442");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setFoto("hi!");
    java.lang.String var10 = var0.getIdFace();
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getIdFace();
    java.lang.String var14 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test443");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getNome();
    java.lang.String var10 = var0.getIdFace();
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setNome("hi!");
    java.lang.String var17 = var0.getFoto();
    var0.setId_gcm("hi!");
    var0.setFoto("");
    java.lang.String var22 = var0.getNome();
    java.lang.String var23 = var0.getFoto();
    java.lang.String var24 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test444");


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
    java.lang.String var22 = var0.getFoto();
    java.lang.String var23 = var0.getNome();
    java.lang.String var24 = var0.getNome();
    java.lang.String var25 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + ""+ "'", var22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "hi!"+ "'", var23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + ""+ "'", var25.equals(""));

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test445");


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
    java.lang.String var24 = var0.getId_gcm();
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
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + ""+ "'", var24.equals(""));

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test446");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var8 = var0.getNome();
    var0.setFoto("");
    var0.setNome("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test447");


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
    java.lang.String var13 = var0.getId_gcm();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test448");


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
    var0.setId_gcm("hi!");
    
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

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test449");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    java.lang.String var10 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test450");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    var0.setIdFace("hi!");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test451");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test452");


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
    var0.setIdFace("");
    java.lang.String var19 = var0.getFoto();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test453");


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
    java.lang.String var15 = var0.getIdFace();
    java.lang.String var16 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getNome();
    var0.setNome("hi!");
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
    assertTrue("'" + var15 + "' != '" + ""+ "'", var15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test454");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    java.lang.String var5 = var0.getNome();
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getId_gcm();
    var0.setIdFace("hi!");
    java.lang.String var10 = var0.getFoto();
    java.lang.String var11 = var0.getIdFace();
    java.lang.String var12 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test455");


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

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test456");


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
    var0.setNome("hi!");
    var0.setFoto("hi!");
    var0.setFoto("");
    var0.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test457");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getNome();
    java.lang.String var5 = var0.getFoto();
    java.lang.String var6 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var14 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + ""+ "'", var5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test458");


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
    java.lang.String var21 = var0.getFoto();
    
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

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test459");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setIdFace("");
    java.lang.String var7 = var0.getNome();
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    java.lang.String var13 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test460");


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
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    java.lang.String var19 = var0.getNome();
    java.lang.String var20 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test461");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getIdFace();
    java.lang.String var9 = var0.getIdFace();
    java.lang.String var10 = var0.getNome();
    var0.setNome("");
    java.lang.String var13 = var0.getFoto();
    
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
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test462");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setNome("hi!");
    java.lang.String var9 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test463");


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
    java.lang.String var21 = var0.getId_gcm();
    java.lang.String var22 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "hi!"+ "'", var21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test464");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    java.lang.String var9 = var0.getId_gcm();
    var0.setIdFace("");
    var0.setId_gcm("");
    var0.setNome("");
    var0.setFoto("hi!");
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + ""+ "'", var18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test465");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    java.lang.String var7 = var0.getFoto();
    var0.setIdFace("hi!");
    var0.setNome("");
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var16 = var0.getNome();
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test466");


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
    java.lang.String var16 = var0.getFoto();
    var0.setFoto("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test467");


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
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test468");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setFoto("");
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getFoto();
    var0.setIdFace("");
    var0.setIdFace("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "hi!"+ "'", var7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "hi!"+ "'", var8.equals("hi!"));

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test469");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    var0.setNome("");
    var0.setFoto("");
    var0.setIdFace("hi!");
    java.lang.String var13 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + ""+ "'", var4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "hi!"+ "'", var13.equals("hi!"));

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test470");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setNome("");
    var0.setIdFace("");
    var0.setNome("");
    var0.setFoto("hi!");
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    var0.setId_gcm("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test471");


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
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test472");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var12 = var0.getId_gcm();
    java.lang.String var13 = var0.getNome();
    java.lang.String var14 = var0.getId_gcm();
    var0.setIdFace("");
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test473");


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
    var0.setId_gcm("");
    java.lang.String var19 = var0.getNome();
    var0.setIdFace("hi!");
    
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
    assertNull(var19);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test474");


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
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getNome();
    java.lang.String var21 = var0.getNome();
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
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test475");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var6 = var0.getIdFace();
    var0.setNome("");
    var0.setId_gcm("");
    java.lang.String var11 = var0.getFoto();
    var0.setFoto("");
    java.lang.String var14 = var0.getNome();
    var0.setNome("hi!");
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + ""+ "'", var11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + ""+ "'", var14.equals(""));

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test476");


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
    java.lang.String var16 = var0.getIdFace();
    java.lang.String var17 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test477");


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
    var0.setNome("");
    java.lang.String var25 = var0.getNome();
    java.lang.String var26 = var0.getNome();
    
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
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test478");


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
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + ""+ "'", var10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test479");


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
    var0.setIdFace("");
    var0.setIdFace("");
    var0.setId_gcm("hi!");
    java.lang.String var23 = var0.getIdFace();
    
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
    assertTrue("'" + var23 + "' != '" + ""+ "'", var23.equals(""));

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test480");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test481");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setNome("");
    java.lang.String var6 = var0.getIdFace();
    java.lang.String var7 = var0.getId_gcm();
    java.lang.String var8 = var0.getIdFace();
    var0.setId_gcm("");
    java.lang.String var11 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + ""+ "'", var7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test482");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    java.lang.String var1 = var0.getId_gcm();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setId_gcm("hi!");
    var0.setFoto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test483");


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
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getId_gcm();
    var0.setId_gcm("hi!");
    var0.setId_gcm("");
    var0.setId_gcm("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test484");


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
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("hi!");
    java.lang.String var25 = var0.getNome();
    java.lang.String var26 = var0.getFoto();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "hi!"+ "'", var20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test485");


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
    var0.setIdFace("");
    java.lang.String var21 = var0.getIdFace();
    var0.setNome("hi!");
    
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
    assertTrue("'" + var21 + "' != '" + ""+ "'", var21.equals(""));

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test486");


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
    var0.setId_gcm("");
    java.lang.String var19 = var0.getIdFace();
    java.lang.String var20 = var0.getIdFace();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + ""+ "'", var20.equals(""));

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test487");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("");
    java.lang.String var6 = var0.getFoto();
    var0.setId_gcm("hi!");
    java.lang.String var9 = var0.getNome();
    var0.setId_gcm("");
    java.lang.String var12 = var0.getId_gcm();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    java.lang.String var17 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test488");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    var0.setNome("hi!");
    var0.setIdFace("");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test489");


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
    java.lang.String var28 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + ""+ "'", var28.equals(""));

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test490");


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
    java.lang.String var15 = var0.getId_gcm();
    java.lang.String var16 = var0.getFoto();
    java.lang.String var17 = var0.getFoto();
    java.lang.String var18 = var0.getId_gcm();
    java.lang.String var19 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + ""+ "'", var16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + ""+ "'", var17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test491");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    var0.setId_gcm("hi!");
    java.lang.String var5 = var0.getIdFace();
    java.lang.String var6 = var0.getNome();
    var0.setNome("hi!");
    var0.setNome("");
    var0.setId_gcm("hi!");
    java.lang.String var13 = var0.getIdFace();
    var0.setIdFace("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test492");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var10 = var0.getNome();
    java.lang.String var11 = var0.getNome();
    java.lang.String var12 = var0.getNome();
    var0.setId_gcm("hi!");
    java.lang.String var15 = var0.getIdFace();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "hi!"+ "'", var10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "hi!"+ "'", var11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test493");


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
    java.lang.String var15 = var0.getNome();
    java.lang.String var16 = var0.getNome();
    var0.setIdFace("hi!");
    java.lang.String var19 = var0.getFoto();
    var0.setNome("");
    java.lang.String var22 = var0.getId_gcm();
    java.lang.String var23 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "hi!"+ "'", var19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test494");


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
    var0.setFoto("hi!");
    
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

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test495");


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
    java.lang.String var19 = var0.getIdFace();
    var0.setId_gcm("hi!");
    var0.setNome("hi!");
    var0.setNome("");
    java.lang.String var26 = var0.getIdFace();
    java.lang.String var27 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + ""+ "'", var6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + ""+ "'", var9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "hi!"+ "'", var18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + ""+ "'", var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + ""+ "'", var26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + ""+ "'", var27.equals(""));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test496");


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
    var0.setNome("");
    
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

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test497");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    java.lang.String var4 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var7 = var0.getFoto();
    java.lang.String var8 = var0.getNome();
    java.lang.String var9 = var0.getId_gcm();
    java.lang.String var10 = var0.getNome();
    
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
    assertNull(var10);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test498");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setFoto("");
    java.lang.String var8 = var0.getFoto();
    var0.setFoto("hi!");
    java.lang.String var11 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setNome("hi!");
    java.lang.String var16 = var0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + ""+ "'", var8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test499");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getNome();
    var0.setIdFace("hi!");
    var0.setIdFace("");
    var0.setFoto("");
    var0.setIdFace("");
    java.lang.String var12 = var0.getNome();
    java.lang.String var13 = var0.getFoto();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + ""+ "'", var13.equals(""));

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nUsuario1.test500");


    com.application.ciadobusao.util.Usuario var0 = new com.application.ciadobusao.util.Usuario();
    var0.setFoto("");
    java.lang.String var3 = var0.getIdFace();
    var0.setId_gcm("");
    var0.setIdFace("");
    var0.setFoto("");
    var0.setId_gcm("");
    java.lang.String var12 = var0.getId_gcm();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + ""+ "'", var12.equals(""));

  }

}
