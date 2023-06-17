package ineuronpratice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class multiplewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parenthandle=driver.getWindowHandle();
		System.out.println(parenthandle);
		
	driver.findElement(By.id("newWindowsBtn")).click();
		
	Set<String> allhandles=driver.getWindowHandles();
	
	for(String handle :allhandles)
		
	{
		
		driver.switchTo().window(handle);
		System.out.println(handle+driver.getTitle());
		if(handle.equalsIgnoreCase("Basic Controls"))
		driver.findElement(By.id("firstName")).sendKeys("yuvan");
	}
	
	driver.switchTo().window(parenthandle);
		
	driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("sucess");
	
	//driver.quit();
	}

	
}
