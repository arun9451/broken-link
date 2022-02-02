package testing.uoloweb.Testscripts;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testing.uoloweb.Base.Base;
import testing.uoloweb.pages.Search_Groups;

public class TC4_SendDoc_PDF extends Base
{
	@Test
	public void Send_PDF() throws InterruptedException
	{
	Search_Groups.search(driver, pr);
	File f = new File("PDF.pdf");
	driver.findElement(By.xpath(pr.getProperty("file_attachment_Multiple_Attachments"))).sendKeys("/Users/anirudhsharma/Documents/Automation Content/WorkSpace/Automation_Training/Selenium/Uolo_Web/Test Files/Pdf TXT/PDF.pdf"+"\n"+"/Users/anirudhsharma/Documents/Automation Content/WorkSpace/Automation_Training/Selenium/Uolo_Web/Test Files/Pdf TXT/PDF.pdf");
	driver.findElement(By.xpath(pr.getProperty("send_text_note"))).click();
	Thread.sleep(5000);
	}

}
