package testing.uoloweb.Testscripts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testing.uoloweb.Base.Base;
import testing.uoloweb.Utilities.brokenLinks;
import testing.uoloweb.pages.Search_Groups;

public class TC2_SendText extends Base
{
	@Test
	public void Send_TextNote() throws InterruptedException, MalformedURLException, IOException
	{
		
		
		brokenLinks.broken_links(driver,this.getClass().getSimpleName());
		
	  /*  Search_Groups.search(driver, pr);
		driver.findElement(By.xpath(pr.getProperty("set_title"))).sendKeys("This is title");
		driver.findElement(By.xpath(pr.getProperty("set_message"))).sendKeys("This text body");
		driver.findElement(By.xpath(pr.getProperty("send_text_note"))).click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(By.xpath(("(//p[@class='wordwrap'])[1]"))).getText(), "This text body");*/
	}

}
