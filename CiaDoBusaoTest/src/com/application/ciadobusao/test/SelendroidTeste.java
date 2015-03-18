package com.application.ciadobusao.test;

import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.common.device.DeviceTargetPlatform;
import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;
import io.selendroid.SelendroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
 
public class SelendroidTeste {
 
	public WebDriver driver;
 
	@BeforeSuite
	public void setUp() throws Exception {
        
		//Start selendroid-standalone during test
		SelendroidConfiguration config = new SelendroidConfiguration();
		
		// Add the selendroid-test-app to the standalone server
        config.addSupportedApp("CiaDoBusao.apk");
        
        //start the standalone server
        SelendroidLauncher selendroidServer = new SelendroidLauncher(config);
        selendroidServer.launchSelendroid();
            
        // Create the selendroid capabilities
		SelendroidCapabilities capa = new SelendroidCapabilities();
		
		// Specify to use selendroid's test app
		capa.setAut("com.application.ciadobusao:1.0");
		
		// Specify to use the Android device API 19
		capa.setPlatformVersion(DeviceTargetPlatform.ANDROID19);
		
		// Don't request simulator, use real device
        capa.setEmulator(false);
        
     // Create instance of Selendroid Driver
        driver = new SelendroidDriver(capa);
	}
 
	 @Test
     public void selendroidTest() throws Exception {
                              
         // Print the log 
         System.out.print("Start executing test");
          
         
      // Clicar no botao de criar o encontro
         WebElement button = driver.findElement(By.id("criaEncontro"));
                     button.click();
       
      // Find the input text field on screen
      // The id of this text field was get from step 9
      WebElement inputField = driver.findElement(By.id("nomeEdit"));
      
                     
      // Verifique se o campo de texto ativado assim que o usuário insere o texto
      Assert.assertEquals("true", inputField.getAttribute("enabled"));
       
  
}
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}