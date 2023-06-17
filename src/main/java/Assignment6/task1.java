package Assignment6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}

}
