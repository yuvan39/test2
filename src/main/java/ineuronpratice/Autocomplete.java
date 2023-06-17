package ineuronpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autocomplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.id("menu1")).click();
		driver.findElement(By.xpath("//a[text()='CSS']")).click();
		
	}

}
