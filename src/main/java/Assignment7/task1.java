package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

Thread.sleep(1000);

WebElement user=driver.findElement(By.name("username"));

String border=user.getCssValue("border");

System.out.println(border);

WebElement pwd1=driver.findElement(By.name("password"));

String border1=pwd1.getCssValue("border");

System.out.println(border1);

driver.findElement(By.xpath("//button[@type='submit']")).click();

WebElement pwd=driver.findElement(By.xpath("//span[text()='Required']"));

System.out.println("username&pwd"+"   "+pwd.getText());






		
	}

}
