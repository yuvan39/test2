package ineuronpratice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demoqa.com/alerts");
		
	WebElement ele=	driver.findElement(By.xpath("//button[text()='Click me']"));
		ele.click();
		
		Thread.sleep(2000);
		Alert ale=driver.switchTo().alert();
		
		String ele1=ale.getText();
		
		System.out.println(ele1);
		
ale.accept();
		
Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		
Alert ale1=driver.switchTo().alert();
		
		String ele2=ale1.getText();
		
		System.out.println(ele2);
		
ale1.dismiss();

WebElement suc=driver.findElement(By.id("confirmResult"));

suc.click();
System.out.println(suc.getText());


Thread.sleep(3000);
WebElement prompt=driver.findElement(By.id("promtButton"));
JavascriptExecutor js=(JavascriptExecutor)driver;

js.executeScript("arguments[0].click()", prompt);

Alert ale2=driver.switchTo().alert();

String prom=ale2.getText();

System.out.println(prom);

ale2.sendKeys("Yuvan-good-boy");

ale2.accept();

		
		driver.close();
	}

}
