package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdownExample {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVITHRA\\OneDrive\\Desktop\\Pavithra Learnings\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//	WebDriver driver=new ChromeDriver();

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVITHRA\\OneDrive\\Desktop\\Pavithra Learnings\\Selenium\\chrome-win64\\chrome-win64\\chrome.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		WebElement product= driver.findElement(By.className("col-lg-3"));	

		Select select = new Select(product);
		select.selectByIndex(2);

		select.selectByVisibleText("Yahoo");
		Thread.sleep(4000);

		select.selectByVisibleText("Google");
		Thread.sleep(4000);

		select.selectByValue("Microsoft");
		Thread.sleep(4000);

		Point pro= product.getLocation();
		int x= pro.getX();
		int y= pro.getY();

		System.out.println(x+""+y);

		String css= product.getCssValue("margin-bottom");
		System.out.println("Margin-Bottom is" +css);

		String access=  product.getAccessibleName();
		System.out.println("Access" +access);

		String tagname=  product.getTagName();
		System.out.println("Tag name of dropdown" +tagname);

		String text=product.getText();
		System.out.println("Text of dropdown is" +text);



		List<WebElement> list=select.getOptions();
		int dropdowncount=list.size();
		System.out.println("Number of elements" +dropdowncount);

		WebElement animalsDrop=driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div[2]/p[1]/select[2]"));
		animalsDrop.sendKeys("Big Baby Cat");

		WebElement multiselect= driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/p/select"));
		Select multiselectbox=new Select(multiselect);
		multiselectbox.selectByIndex(1);
		multiselectbox.selectByValue("burger");
		multiselectbox.selectByVisibleText("Bonda");
		multiselectbox.selectByIndex(0);

		String multiText=multiselect.getText();
		System.out.println("List of multi options" +multiText);

		List<WebElement> multicount= multiselectbox.getOptions();
		int multisize=multicount.size();
		System.out.println("Multiselect dropdown count is" +multisize);








	}

}
