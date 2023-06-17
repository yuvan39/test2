package ineuronpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calendarhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
WebElement	element=	driver.findElement(By.xpath("//a[text()='27']"));
element.click();

System.out.println(element.isDisplayed());


		
		
		
		

	}

}
