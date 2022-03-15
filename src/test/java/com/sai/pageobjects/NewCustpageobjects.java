package com.sai.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewCustpageobjects {
	
	public WebDriver driver;
	
	public NewCustpageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='New Customer']")
	WebElement newcustomer;
	@FindBy(how=How.NAME,using="name")
	WebElement custname;
	@FindBy(how=How.NAME,using="dob")
	WebElement custdob;
	@FindBy(how=How.NAME,using="addr")
	WebElement custaddr;
	@FindBy(how=How.NAME,using="city")
	WebElement custcity;
	@FindBy(how=How.NAME,using="state")
	WebElement custstate;
	@FindBy(how=How.NAME,using="pinno")
	WebElement custpinno;
	@FindBy(how=How.NAME,using="telephoneno")
	WebElement custtelephoneno;
	@FindBy(how=How.NAME,using="emailid")
	WebElement custemailid;
	@FindBy(how=How.NAME,using="password")
	WebElement custpassword;
	@FindBy(how=How.NAME,using="sub")
	WebElement custsub;
	
	public void clickcustname()
	{
		newcustomer.click();
	}
	public void setcustname(String cname)
	{
		custname.sendKeys(cname);
	}
	public void setcustdobd(String cday)
	{
		custdob.sendKeys(cday);
	}
	public void setcustdobm(String cmon)
	{
		custdob.sendKeys(cmon);
	}
	public void setcustdoby(String cyear)
	{
		custdob.sendKeys(cyear);
	}
	public void setcustaddr(String caddr)
	{
		custaddr.sendKeys(caddr);
	}
	public void setcustcity(String ccity)
	{
		custcity.sendKeys(ccity);
	}
	public void setcuststate(String cstat)
	{
		custstate.sendKeys(cstat);
	}
	public void setcustpin(String cpin)
	{
		custpinno.sendKeys(cpin);
	}
	public void setcusttelno(String ctelno)
	{
		custtelephoneno.sendKeys(ctelno);
	}
	public void setcustemail(String cemail)
	{
		custemailid.sendKeys(cemail);
	}
	public void setcustpwd(String cpwd)
	{
		custpassword.sendKeys(cpwd);
	}
	public void setcustsub()
	{
		custsub.click();
	}
	
	
	
	
	

}
