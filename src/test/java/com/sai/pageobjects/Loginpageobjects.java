package com.sai.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpageobjects {
	
	public WebDriver driver;
	public Loginpageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.NAME,using="uid")
	WebElement custname;
	@FindBy(how=How.NAME,using="password")
	WebElement custpass;
	@FindBy(how=How.NAME,using="btnLogin")
	WebElement custlogin;
	
	public void setUsername(String uname)
	{
		custname.sendKeys(uname);
	}
	
	public void setpwd(String pwd)
	{
		custpass.sendKeys(pwd);
	}
	
	public void setlogin()
	{
		custlogin.click();
	}

}
