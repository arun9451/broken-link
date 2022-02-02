package testing.uoloweb.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Groups 
{
	public static void search(ChromeDriver driver, Properties pr) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(pr.getProperty("search_group"))).click();
		driver.findElement(By.xpath(pr.getProperty("select_group"))).click();
		List<WebElement> grp_sr=driver.findElements(By.xpath(pr.getProperty("groups_list")));
		for(WebElement el : grp_sr)
		{
		if(el.getText().trim().equalsIgnoreCase("class 4"))
		{
			el.click();
			break;
		}
		}
		driver.findElement(By.xpath(pr.getProperty("button_srch_grp"))).click();
	}

	

}
