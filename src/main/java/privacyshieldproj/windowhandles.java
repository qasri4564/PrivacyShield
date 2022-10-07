package privacyshieldproj;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sr35096.IND\\eclipse-workspace\\privacyshieldproj\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String m= driver.getWindowHandle();
		String l = driver.getTitle();
		System.out.println(l);
		driver.findElement(By.id("nav-belt"));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bedsheets");
		driver.findElement(By.id("nav-search-submit-text")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div[2]/div/h2/a/span")).click();
		
		Set<String> ws= driver.getWindowHandles();
		System.out.println(ws.size());
		
		for(String h: ws)
		{
			driver.switchTo().window(h);
			String s = driver.getTitle();
			System.out.println(s);
		}
		
		driver.switchTo().window(m);
		
		driver.quit();
		
		
		
	}

}
