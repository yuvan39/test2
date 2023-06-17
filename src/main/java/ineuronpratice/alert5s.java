package ineuronpratice;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert5s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demoqa.com/alerts");
		
	
		
		
		driver.findElement(By.id("timerAlertButton")).click();

		
		
		   try {
	            driver.findElement(By.id("timerAlertButton")).click();
	            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.alertIsPresent());
	            Alert simpleAlert = driver.switchTo().alert();
	            simpleAlert.accept();
	            System.out.println("Unexpected alert accepted");
	        } catch (Exception e) {
	            System.out.println("unexpected alert not present");
	        }
		
		
		
	}

}
