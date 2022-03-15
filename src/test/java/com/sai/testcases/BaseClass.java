package com.sai.testcases;

import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sai.testutils.Read_Config;

public class BaseClass {
	Read_Config rc=new Read_Config();
	
	public  static WebDriver driver;
	public  String BaseURL=rc.geturl();
	public  String Username=rc.gerUname();
	public  String Password=rc.gerpassword();
	public static Logger logger;
	
	
	
	@BeforeClass
	public void StartTest() throws InterruptedException
	{
		logger=Logger.getLogger("Inetbnking");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver",rc.getchropath());
		driver=new ChromeDriver();
		driver.get(BaseURL);
        logger.info("url entered");
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
	
	public void getScreenCapture(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File tar=new File(System.getProperty("user.dir")+ "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(src, tar);
	}
	
	
	public static String getrandom()
	{
		String random=RandomStringUtils.randomAlphanumeric(8);
		return random;
	}

}
