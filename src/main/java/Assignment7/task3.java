package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task3 {

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

pwd1.sendKeys("mukesh");

driver.findElement(By.xpath("//button[@type='submit']")).click();

Thread.sleep(500);

WebElement inv=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));

String message=inv.getText();

if(message.contains("invalid"))
	
	
{
	System.out.println("message value is"+message);

}
		
		//driver.close();
		
	}

}
