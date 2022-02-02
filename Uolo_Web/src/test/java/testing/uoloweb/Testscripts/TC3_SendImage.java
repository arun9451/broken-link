package testing.uoloweb.Testscripts;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testing.uoloweb.Base.Base;
import testing.uoloweb.pages.Search_Groups;

public class TC3_SendImage extends Base {
	
	@Test
	public void Image() throws InterruptedException
	{
	Search_Groups.search(driver, pr);
	File f = new File("img.jpg");
	System.out.println(f.getAbsolutePath());
	driver.findElement(By.xpath(pr.getProperty("file_attachment_Image"))).sendKeys(f.getAbsolutePath());
	driver.findElement(By.xpath(pr.getProperty("send_text_note"))).click();
	Thread.sleep(5000);
		
	}
	
}
