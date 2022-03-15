package com.sai.testutils;

import java.io.FileInputStream;

import java.util.Properties;

public class Read_Config {
	public Properties pro;
	
	public Read_Config() 
	{
		try {
			FileInputStream fis=new FileInputStream("/SELAUTMAR12/Properties/Config.Properties");
			pro=new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public String geturl()
	{
		String url=pro.getProperty("BaseURL");
		return url;
	}
	
	
	public String gerUname()
	{
		String usname=pro.getProperty("Username");
		return usname;
	}
	
	public String gerpassword()
	{
		String passwrd=pro.getProperty("Password");
		return passwrd;
	}
	
	public String getchropath()
	{
		String chpath=pro.getProperty("Chropath");
		return chpath;
	}

}
