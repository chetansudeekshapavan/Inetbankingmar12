package com.sai.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sai.pageobjects.Loginpageobjects;

public class Logintest extends BaseClass {
	
	@Test
	public void Login() throws InterruptedException, IOException
	{
		Loginpageobjects lp=new Loginpageobjects(driver);
		lp.setUsername(Username);
		logger.info("Username entered");
		Thread.sleep(5000);
		lp.setpwd(Password);
		logger.info("password entered");
		Thread.sleep(5000);
		lp.setlogin();
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Welcome To Manager's Page of Guru99 Bank"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			getScreenCapture(driver,"Login");
			Assert.assertTrue(false);
			
		}
	}

}
