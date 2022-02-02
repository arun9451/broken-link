package testing.uoloweb.Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testing.uoloweb.Base.Base;

public class TC4_Group_Manage extends Base
{
	@Test
	public void Groups() throws InterruptedException
	{
		Actions ac = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Admin = driver.findElement(By.xpath("//span[contains(text(),'Admin')]"));
		ac.moveToElement(Admin).build().perform();
		Thread.sleep(5000);
		WebElement ManageGroups = driver.findElement(By.xpath("//*[contains(text(),'Manage Groups')]"));
		
		ac.click(ManageGroups).build().perform();
		int j=1, i=0, pagination=0;
		while(j==1)
		{
		List<WebElement> grp = driver.findElements(By.xpath("//*[@id='progressReportbox']/div/div/div[1]"));
	    while(i<grp.size())
		{
	    System.out.println(grp.get(i).getText());
	        
	    if(grp.get(i).getText().equalsIgnoreCase("Class 5"))
	    {
	   
	     grp.get(i).click();
	     j=0;
	     pagination=1;
	     break;
		}
	    
	    i++;
	    	
		}
	    if(pagination == 0)
	    {
	    WebElement el = driver.findElementByXPath("(//ul[@class='pagination']/li/a)[8]");
    	js.executeScript("arguments[0].scrollIntoView();", el);
    	el.click();
    	Thread.sleep(5000);
    	i=0;
	    }
	}
//(//*[@id="progressReportbox"]/div/div/div[5]/ul/li/a)
}
}
