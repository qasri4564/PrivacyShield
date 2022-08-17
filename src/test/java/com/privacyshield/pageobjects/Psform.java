package com.privacyshield.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Psform {

	
	WebDriver ldriver;
	
	public Psform(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="pt1:r1:0:it9::content")
	WebElement Organizationname;


	/*@FindBy(id="pt1:r1:0:it10::content")
	WebElement EIN;*/


	@FindBy(id="pt1:r1:0:it3::content")
	WebElement Address1;
	
	@FindBy(id="pt1:r1:0:it5::content")
	WebElement Address2;

	@FindBy(id="pt1:r1:0:it1::content")
	WebElement Address3;

	@FindBy(id="pt1:r1:0:it2::content")
	WebElement city;

	@FindBy(id="pt1:r1:0:soc1::content")
	WebElement st;
	
	
	@FindBy(id="pt1:r1:0:it7::content")
	WebElement zip;

	@FindBy(id="pt1:r1:0:it12::content")
	WebElement firstname;

	@FindBy(id="pt1:r1:0:it6::content")
	WebElement lastname;
	
	@FindBy(id="pt1:r1:0:it4::content")
	WebElement emailaddress;

	
	@FindBy(id="pt1:r1:0:it13::content")
	WebElement confirmemailaddress;
	

	@FindBy(id="pt1:r1:0:it8::content")
	WebElement phone;
	
	@FindBy(id="pt1:r1:0:t1:0:sbr2::content")
	WebElement selectpayment;
	
	@FindBy(id="pt1:r1:0:sbc2::content")
	WebElement checkbox;
	
	@FindBy(id="pt1:r1:0:cil1")
	WebElement paynowbutton;
	
	public void setOrganizationname(String Orgname)
	{
		Organizationname.sendKeys(Orgname);
	}
		
	/*public void setEin(String ein)
	{
		EIN.sendKeys(ein);
	}*/
	
	public void setaddr1(String addr1)
	{
		Address1.sendKeys(addr1);
	}
	
	public void setaddr2(String addr2)
	{
		Address2.sendKeys(addr2);
	}
	
	public void setaddr3(String addr3)
	{
		Address3.sendKeys(addr3);
	}
	
	public void setcityname(String cityname)
	{
		city.sendKeys(cityname);
	}	
	
	public void setstatename(String statename)
	{
		Select state = new Select(st);
		state.selectByVisibleText(statename);
	}
	
	public void setzipcode(String zipcode)
	{
		zip.sendKeys(zipcode);
	
	}
	public void setfname(String fname)
	{
		firstname.sendKeys(fname);
	
	}
	
	public void setlname(String lname)
	{
		lastname.sendKeys(lname);
	
	}
	
	public void setemailadd(String emailadd)
	{
		emailaddress.sendKeys(emailadd);
	
	}
	
	public void setconfirmemailadd(String confirmemailadd)
	{
		confirmemailaddress.sendKeys(confirmemailadd);
	
	}
	public void setphonenum(String phonenum)
	{
		phone.sendKeys(phonenum);
	
	}
	
	public void setselectpay()
	{
	   selectpayment.click();
	
	}
	public void setchkbox()
	{
	checkbox.click();
	
	}
	
	public void setpaynowbttn()
	{
	paynowbutton.click();
	
	}
	
	
	
}




