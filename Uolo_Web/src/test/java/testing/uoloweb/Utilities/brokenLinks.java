package testing.uoloweb.Utilities;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.*;


public class brokenLinks
{
	public static void broken_links(ChromeDriver driver, String path) throws MalformedURLException, IOException
	{
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		writefile wf = new writefile(path);
		
		System.out.println("Total number of link in the page = "+links.size());
	
		wf.textfile("Total number of link in the page = "+links.size());
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		//&& (! links.get(i).getAttribute("herf").contains("javascript")) && (! links.get(i).getAttribute("herf") != " " )
		for(int i = 0; i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
			
			if(links.get(i).getAttribute("href") == null)
			{
				wf.textfile("null");
			}
			else
			{
			wf.textfile(links.get(i).getAttribute("href"));
			}
			
			if(links.get(i).getAttribute("href")!= null && (! links.get(i).getAttribute("href").contains("javascript")) && (links.get(i).getAttribute("href") != "") && (!links.get(i).getAttribute("href").contains("mailto:support@theuolo.com") ))
			{
				
				activelinks.add(links.get(i));
				
			}
		}
		
		System.out.println("Total Number of Active Links and Images " + activelinks.size());
		
		wf.textfile("Total Number of Active Links and Images " + activelinks.size());
		
		
		for(int j=0; j<activelinks.size();j++)
		{
			HttpURLConnection connection =	(HttpURLConnection)	new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
		    String res =	connection.getResponseMessage();
		    int re2 = connection.getResponseCode();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href") + " " + res + " " + re2 );
		
			wf.textfile(activelinks.get(j).getAttribute("href") + " " + res + " " + re2);
			

		}
		    wf.bw.close();// write file
		
		
		
	}


}
