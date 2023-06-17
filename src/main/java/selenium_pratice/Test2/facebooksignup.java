package selenium_pratice.Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class facebooksignup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	ChromeOptions	opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
WebDriver driver=new ChromeDriver(opt);
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
       driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='Create new account']")).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Yuvan");
        
        
     
        driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("sai");
        
       driver.findElement(By.xpath("//input[@type='text' and @name='reg_email__']")).sendKeys("7896123456");
        
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sony");
        
        Select daydropdown= new Select( driver.findElement(By.xpath("//*[@id='day']")));
        
        
        daydropdown.selectByValue("29");
        
        System.out.println("day value is selected");
        
        
        
 Select monthdropdown= new Select( driver.findElement(By.xpath("//*[@id='month']")));
        
        
        monthdropdown.selectByIndex(9);
        
        
 Select yeardropdown= new Select( driver.findElement(By.xpath("//*[@id='year']")));
        
        
        yeardropdown.selectByVisibleText("2004");
        
        
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//*[text()='Male']")).click();
       System.out.println("radio button selected");
       
       
       driver.findElement(By.xpath("//*[@name='websubmit']")).click();
       
        driver.close();
       
       
        
        
        
        
}}
