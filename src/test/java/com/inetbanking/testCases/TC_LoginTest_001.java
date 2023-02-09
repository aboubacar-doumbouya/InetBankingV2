package com.inetbanking.testCases;

import java.sql.Driver;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws Exception {
		
	driver.get(baseURL);
	logger.info("URL is open");
	driver.manage().window().maximize();
	LoginPage lp=new LoginPage(driver);
	// Aller sur la fenêtre de consentiment
			driver.switchTo().frame("gdpr-consent-notice");

			Thread.sleep(1000);
			
			lp.toutAccepter();
			//Revenir sur la fenêtre parente
			driver.switchTo().defaultContent();
			lp.setUserName(username);
			logger.info("Entered username");
			Thread.sleep(2000);
			lp.setPassword(password);
			logger.info("Entered password");
			Thread.sleep(1000);

	logger.info("submit button wil be clicked in 5 seconds");
	Thread.sleep(5000);
	lp.Clicksubmit();
	
	if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
		AssertJUnit.assertTrue(true);
		logger.info("Loging test passed");
	} else {
		AssertJUnit.assertTrue(false);
		logger.info("test failed"); 
	}	
	}

}
