package com.inetbanking.testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL= readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password = readconfig.getPassword();
	public static WebDriver driver;
	
	//todo sup readConfig
	/*
	 * public String baseURL= "http://demo.guru99.com/v4/"; public String
	 * username="mngr477074"; public String password = "zUtAmab"; public static
	 * WebDriver driver;
	 */
	// #les properties files acceptent seulement les anti slash et les classes java les slash
	//chromepath="./Driver\\chromedriver.exe"iepath="./Driver\\iedriver.exe"firefoxpath="./Driver\\firfoxdriver.exe"
	
	//importer le bon package Logger à partir de org.apache.log4j sinon il yaura une erreur
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver=new ChromeDriver();
		
		 logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
		
		
	}
}
