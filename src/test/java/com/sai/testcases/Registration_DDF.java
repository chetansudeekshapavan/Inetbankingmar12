package com.sai.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sai.pageobjects.Loginpageobjects;
import com.sai.pageobjects.NewCustpageobjects;
import com.sai.testutils.XLUtils;

public class Registration_DDF extends BaseClass {
	
	
	@Test(dataProvider="RegistrationTest")
	public void getRegdata(String cname,String dob,String add,String cty,String stat,String pin,String mno,String email,String passwd) throws InterruptedException
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
		cp.setcustname(cname);
		Thread.sleep(5000);
		cp.setcustdob(dob);
		Thread.sleep(5000);
		cp.setcustaddr(add);
		Thread.sleep(5000);
		cp.setcustcity(cty);
		Thread.sleep(5000);
		cp.setcuststate(stat);
		Thread.sleep(5000);
		cp.setcustpin(pin);
		Thread.sleep(5000);
		cp.setcusttelno(mno);
		Thread.sleep(5000);
		cp.setcustemail(email);
		Thread.sleep(5000);
		cp.setcustpwd(passwd);
		Thread.sleep(5000);
		cp.setcustsub();
		Thread.sleep(5000);
	}
	
	
	@DataProvider(name="RegistrationTest")
	public String [][] getRegisterdata() throws IOException
	{
		String path="/SELAUTMAR12/src/test/java/com/sai/testdata/LoginDataTest.xlsx";
		int rowcount=XLUtils.getRowCount(path, "Sheet2");
		int colcount=XLUtils.getCellCount(path, "Sheet2", 1);
		
		 String regdata [][]=new String [rowcount][colcount];
		 
		 for(int i=1;i<=rowcount;i++)
		 {
			 for(int j=0;j<colcount;j++)
			 {
				 regdata [i-1][j]=XLUtils.getCellData(path, "Sheet2", i, j);
			 }
		 }
		return regdata;
	}
	
	

}
