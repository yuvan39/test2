package ineuronpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ineuronsignup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
driver.get("https://ineuron-courses.vercel.app/signup");
Thread.sleep(2000);
driver.manage().window().maximize();

driver.findElement(By.id("name")).sendKeys("soundarya");

driver.findElement(By.id("email")).sendKeys("sony@gmail.com");

driver.findElement(By.id("password")).sendKeys("yuvan$09");

driver.findElement(By.xpath("//label[text()='Selenium']")).click();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


JavascriptExecutor js = (JavascriptExecutor)driver;  


WebElement element= driver.findElement(By.xpath("//input[@value='Female']"));
js.executeScript("arguments[0].scrollIntoView(true);",element); 
element.click();
Select state=new Select(driver.findElement(By.id("state")));

state.selectByValue("Andhra Pradesh");



driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
WebElement element1=driver.findElement(By.xpath("//button[text()='Sign up']"));
element1.click();

	}

}
