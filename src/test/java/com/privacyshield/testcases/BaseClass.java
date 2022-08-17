package com.privacyshield.testcases;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
	public String baseURL = "https://uatapps.adr.org/PrivacyShieldFundApp/faces/PrivacyShieldFund.jsf";
	public String OrgnName = "Zensar";
	public String Einnum = "1234567898";
	public String Addr1 = "123 Street";
	public String Addr2 = "111 asd";
	public String Addr3 = "ddss";
	public String cityname = "hyderabad";
	public String statename = "California";
	public String zipnum = "22334";
	
	public String frstname = "sridhar";
	public String lsttname = "rangu";
	public String emailid = "sridhar.rangu@zensar.com";
	public String confrmemailid = "sridhar.rangu@zensar.com";
	public String phnnum = "1122334455";
	
	public String Fname="Sridhar";
	public String Lname="Rangu";
	public String emailid1="sridhar.rangu@zensar.com";
	public String phoneno="9876543212";
	public String companyname = "Zen";
	public String Address = "paris street";
	public String CityName = "hyd";
	public String StateName = "Alaska";
	public String CountryName = "United States Of America";
	public String Zipcode = "22394";
	public String CCcardnumber = "4111111111111111";
	public String CVV = "432";
	public String Expdatemonth = "Dec";
	public String Expdateyear = "2022";
	public String BankName = "abc";
	public String NameonAccount = "sri";
	public String Accountno = "4111111111111111";
	public String ABAroutingnum = "091000019";
	public String BankAccountType= "Personal Banking";
	
	
	
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		if(br.equals("chrome"))
			
		{		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sr35096.IND\\eclipse-workspace\\privacyshieldproj\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}
		
		else if(br.equals("edge"))
			
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\sr35096.IND\\eclipse-workspace\\privacyshieldproj\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		
			
		}
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	
	}
