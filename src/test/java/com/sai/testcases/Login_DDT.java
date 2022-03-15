package com.sai.testcases;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sai.pageobjects.Loginpageobjects;
import com.sai.testutils.XLUtils;


public class Login_DDT extends BaseClass {
	
	
	
	
	@Test(dataProvider="logintest")
	public void LoginDDTest(String test3,String test4)
	{
		Loginpageobjects lp=new Loginpageobjects(driver);
		lp.setUsername(test3);
		lp.setpwd(test4);
		lp.setlogin();
	}
	
	
	@DataProvider(name="logintest")
	public String [][] getData() throws IOException
	{
		String path="/SELAUTMAR12/src/test/java/com/sai/testdata/LoginDataTest.xlsx";
		int rowcount=XLUtils.getRowCount(path,"Sheet1");
		System.out.println("rowcount  "+rowcount);
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		System.out.println("col count "+colcount);
		 
		String [][] data=new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				data [i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return data;
	}

}
