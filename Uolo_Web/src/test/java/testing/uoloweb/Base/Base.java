package testing.uoloweb.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import testing.uoloweb.pages.login;

public class Base 
{
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeMethod
	public void launch() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "../Uolo_Web/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://app-stage.uolo.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		File f = new File("../Uolo_Web/Object.properties");
		//properties file read
		FileReader fr = new FileReader(f);
		pr = new Properties();
		pr.load(fr);
       login lg =new login(driver,pr);
  	lg.signin("9411776961", "123456");

		
	}
	@AfterMethod
	public void signout()
	{
		
	}
	

}
