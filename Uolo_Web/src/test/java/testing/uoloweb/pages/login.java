package testing.uoloweb.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login 
{
	ChromeDriver driver;
	Properties pr;
	public login(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void signin(String username, String password) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("username"))).sendKeys(username);
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("login_button"))).click();
	}

}
