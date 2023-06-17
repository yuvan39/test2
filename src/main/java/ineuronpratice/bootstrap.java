package ineuronpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class bootstrap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-autocomplete-feature-in.html");
		
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("a");
		Thread.sleep(2000);
	WebElement ele=	driver.findElement(By.xpath("//ul[@id='ui-id-1']//li[7]"));
		ele.click();
		System.out.println(ele.getText());
	}

}
