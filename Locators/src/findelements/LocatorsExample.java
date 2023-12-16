package findelements;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVITHRA\\OneDrive\\Desktop\\Pavithra Learnings\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
     //	WebDriver driver=new ChromeDriver();
     
     ChromeOptions options = new ChromeOptions();
 	 options.addArguments("--remote-allow-origins=*");
 	 WebDriver driver = new ChromeDriver(options);
 	 driver.manage().window().maximize();
	
		
 	 
//	 driver.get("https://mail.google.com");
//	 driver.findElement(By.cssSelector(".whsOnd .zHQkBf")).sendKeys("pavithravasudevanvp");
// 	 driver.findElement(By.id("identifierId")).sendKeys("pavithravasudevanvp");
// 	 driver.findElement(By.className("VfPpkd-J1Ukfc-LhBDec")).click();
 	 
//	 driver.close();
 	 
//	 driver.quit();
 	 
//   driver.findElement(By.className("VfPpkd-J1Ukfc-LhBDec")).click();

 	
 	 driver.get("https://magento.softwaretestingboard.com");
 	 driver.findElement(By.id("search")).sendKeys("tops"+Keys.ENTER);     // ID Search
 	
 	 driver.findElement(By.linkText("tops and tees women")).click();      // Link 
 	 
 	 driver.findElement(By.partialLinkText("t-shirtwomen")).click();
 	 
 	 driver.findElement(By.className("input-text")).clear();
 	 
 	 driver.findElement(By.linkText("Create an Account")).click();
 	 
 	 driver.findElement(By.id("firstname")).sendKeys("Ordering");
 	 
 //	 driver.findElement(By.cssSelector(".input-text .required-entry")).sendKeys("Customer");
 	 
 	 
		
	}

}
