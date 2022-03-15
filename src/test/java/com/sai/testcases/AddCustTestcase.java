package com.sai.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sai.pageobjects.Loginpageobjects;
import com.sai.pageobjects.NewCustpageobjects;

public class AddCustTestcase extends BaseClass {

	@Test
	public void AddCust() throws InterruptedException, IOException
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
		
		NewCustpageobjects cp=new NewCustpageobjects(driver);
		cp.clickcustname();
		Thread.sleep(5000);
		cp.setcustname("pavan");
		Thread.sleep(5000);
		cp.setcustdobd("24");
		Thread.sleep(5000);
		cp.setcustdobm("08");
		Thread.sleep(5000);
		cp.setcustdoby("1986");
		Thread.sleep(5000);
		cp.setcustaddr("VNK");
		Thread.sleep(5000);
		cp.setcustcity("MRKP");
		Thread.sleep(5000);
		cp.setcuststate("AP");
		Thread.sleep(5000);
		cp.setcustpin("522647");
		Thread.sleep(5000);
		cp.setcusttelno("8328610690");
		Thread.sleep(5000);
		cp.setcustemail(getrandom()+"@gmail.com");
		Thread.sleep(5000);
		cp.setcustpwd("test");
		Thread.sleep(5000);
		cp.setcustsub();
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Customer Registered Successfully!!!"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			getScreenCapture(driver,"AddCust");
			Assert.assertTrue(false);
			
		}
	}
}
