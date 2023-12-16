package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class buttonsexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVITHRA\\OneDrive\\Desktop\\Pavithra Learnings\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		//	WebDriver driver=new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/?ref=hackernoon.com");

		WebElement userName =  driver.findElement(By.id("user-name"));
		userName.sendKeys("problem_user");

		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");

		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

		WebElement cart= driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		cart.click();

		WebElement container= driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		container.click();

		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();

		Thread.sleep(5000); 

		WebElement cancel = driver.findElement(By.xpath("//*[@id=\"cancel\"]"));
		cancel.click();

		WebElement checkoutPosition = driver.findElement(By.id("checkout"));

		Point coordinates=checkoutPosition.getLocation();    // Button Position
		int x= coordinates.getX();
		int y= coordinates.getY();

		System.out.println("X Value is" +x + "Y Value is" +y);

		System.out.println(x+ "\t" +y);  //Space between two outputs


		String colour = checkoutPosition.getCssValue("background-color");  //Button Color
		System.out.println("Button background color is"+colour);


		Dimension size= checkoutPosition.getSize();
		int buttonHeight=size.getHeight();
		System.out.println("Button Height is" +buttonHeight);
		int buttonWidth=size.getWidth();
		System.out.println("Button Width is" +buttonWidth);



	}

}
