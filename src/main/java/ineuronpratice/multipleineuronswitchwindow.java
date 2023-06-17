package ineuronpratice;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class multipleineuronswitchwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeOptions	opt=new ChromeOptions();
		//opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");
		String parenthandle=driver.getWindowHandle();
		System.out.println(parenthandle);
		
List<WebElement> links=		driver.findElements(By.xpath("//div[@class='social-btns']/a"));
 for(int i=0;i<links.size();i++)
 {
	 
 links.get(i).click();
 //String title=links.get(i).getText();
	System.out.println(driver.getTitle());
	driver.switchTo().window(parenthandle);
 }
	
	Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> itr=handles.iterator();
		
		while(itr.hasNext())
		{
			
			String child=itr.next();
			System.out.println("childwindowhandles"+child);
			
			if(child.equalsIgnoreCase("Youtube"))
				
			{
				
				driver.switchTo().window(child);
				System.out.println(driver.getCurrentUrl());
				
				
			}
		}
			
			driver.switchTo().window(parenthandle);
			System.out.println(driver.getCurrentUrl());
			driver.quit();
		}
		
			
			
		
	}


