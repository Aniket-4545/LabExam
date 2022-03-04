package fi.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App{

WebDriver driver;
public void launchBrowser() 
{
	System.setProperty("webdriver.chrome.driver", 
	"C:\\chromedriver.exe");
	 driver = new ChromeDriver();

 	}
//
//public void navigate() throws InterruptedException
//{
//	driver.navigate().to("https://en.wikipedia.org/wiki/Selenium");
//	System.out.println("This is title of the website"+driver.getTitle());
//	Thread.sleep(2000);
//	driver.findElement(By.id("pt-createaccount")).click();
//	Thread.sleep(3000);
//	System.out.println("URL:- " +driver.getCurrentUrl());
//	driver.navigate().back();
//	driver.navigate().to("https://www.selenium.dev/downloads/");
//	System.out.println("URL:- " +driver.getCurrentUrl());
//	
//}


public class FlipkartLogin {

	ChromeDriver driver;
	String url = "http://www.flipkart.com";

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",



public void loginToFlipkart() {
	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("testuser@abc.com");
	
	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Test@1234");
	
	driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
}

public static void main(String[] args) throws InterruptedException 
{
	App ob = new App();
	ob.launchBrowser();

	ob.loginToFlipkart();
  
}
}
