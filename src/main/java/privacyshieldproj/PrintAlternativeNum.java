package privacyshieldproj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlternativeNum {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriver driver;
          
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\sr35096.IND\\eclipse-workspace\\eCommerce\\Drivers\\chromedriver.exe");
  		driver=new ChromeDriver();
  		driver.get("https://magento.softwaretestingboard.com/");
  		driver.manage().window().maximize();
  		
  		Thread.sleep(3000);
  		driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]")).click();
  		Thread.sleep(3000);
  		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[2]/li[1]/a")).click();
  		Thread.sleep(3000);
  		
         
  	WebElement w = 	driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[2]/div[3]/select"));          
		
		Select se = new Select(w);
		List<WebElement> ss =se.getOptions();
		System.out.println(ss.size());
	
		for(int i=0;i<ss.size();i=i+2)
		{
			String text=ss.get(i).getText();
			System.out.println(text);
		}
	}

}
