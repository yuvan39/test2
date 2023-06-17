package ineuronpratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calendar2ndtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.id("datepicker")).click();
		
	List<WebElement> date=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
int ele=		date.size();
System.out.println(ele);
		
		for(WebElement cal:date)
			
		{
			
		String ca2= 	cal.getText();
		//System.out.println(ca2);
		
		if(ca2.equalsIgnoreCase("20"))
		{
			System.out.println("datefound");
			cal.click();
			break;
		}
		else{
			
			System.out.println("datenotfound");
		}
			
			
	}

}
}