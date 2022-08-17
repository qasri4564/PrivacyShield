package com.privacyshield.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.privacyshield.pageobjects.Paymentpage;
import com.privacyshield.pageobjects.Psform;

public class TC_Psform_01 extends BaseClass


{
	
	@Test
	public void submitform() throws InterruptedException
	{
		
		driver.get(baseURL);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		Psform ps = new Psform(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		ps.setOrganizationname(OrgnName);
		//ps.setEin(Einnum);
		ps.setaddr1(Addr1);
		ps.setaddr2(Addr2);
		ps.setaddr3(Addr3);
		ps.setcityname(cityname);
		ps.setstatename(statename);
		ps.setzipcode(zipnum);
		ps.setfname(frstname);
		ps.setlname(lsttname);
		ps.setemailadd(emailid);
		ps.setconfirmemailadd(confrmemailid);
		ps.setphonenum(phnnum);
		
	ps.setselectpay();
	ps.setchkbox();
	
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));
	w.until(ExpectedConditions.presenceOfElementLocated(By.id("pt1:r1:0:cil1")));
	
	ps.setpaynowbttn();
	Thread.sleep(3000);
	
	Paymentpage pp = new Paymentpage(driver);
	
	//pp.setFirstName(Fname);
	//pp.setLastName(Lname);
	//pp.setemailid1(emailid1);
	//pp.setphoneno(phoneno);
	//pp.setCompanyName(companyname);
	pp.setAddress(Address);
	Thread.sleep(2000);
	pp.setCityName(CityName);
	Thread.sleep(2000);
	pp.setStateName(StateName);
	Thread.sleep(2000);
	//pp.setCountryName(CountryName);
	pp.setZipCode(Zipcode);
	Thread.sleep(2000);
	pp.setCCradiobtn();
	Thread.sleep(2000);
	pp.setCCcardnumber(CCcardnumber);
	Thread.sleep(2000);
	pp.setCVV(CVV);
	Thread.sleep(2000);
	pp.setExpdatemonth(Expdatemonth);
	Thread.sleep(2000);
	pp.setExpdateyear(Expdateyear);
	Thread.sleep(2000);
	pp.setSubmitbutton();
	

	
	if (driver.findElement(By.xpath("//div[@class=\"p_AFHoverTarget xws\"]//div[@class=\"bold\"]")).isDisplayed())
	
		
		{
			Assert.assertTrue(true);
		}
	
	
	else 
		
	{ 
	
	Assert.assertTrue(false);
	
	}
	
	}

}
