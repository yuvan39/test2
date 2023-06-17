package Assignment7;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class task4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

Thread.sleep(1000);

WebElement user=driver.findElement(By.name("username"));

user.sendKeys("admin");

WebElement pwd1=driver.findElement(By.name("password"));

pwd1.sendKeys("admin123");
		
driver.findElement(By.xpath("//button[@type='submit']")).click();

System.out.println(driver.getCurrentUrl());

Thread.sleep(1000);

WebElement dash=driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));

System.out.println(dash.getText());


driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();


driver.findElement(By.xpath("//a[text()='Logout']")).click();

System.out.println("loggedout-successfully");






	}

}
