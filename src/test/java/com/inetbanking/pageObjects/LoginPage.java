package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(id="save")
	@CacheLookup
	WebElement accepter;
	
	public void setUserName(String uName) {
		
		txtUserName.sendKeys(uName);
		
	}
	
	public void setPassword(String pwd) {
		
		txtPassword.sendKeys(pwd);
	}
	
	public void Clicksubmit() {
		btnLogin.click();
	}
	
	public void toutAccepter() {
		accepter.click();
	}
}