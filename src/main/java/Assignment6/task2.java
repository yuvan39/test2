package Assignment6;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		
		
		WebElement add=	driver.findElement(By.xpath("//div[@class='orangehrm-header-container']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", add);
		
		//driver.findElement(By.xpath("//div[normalize-space()='Add']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("A");;

List<WebElement> list=driver.findElements(By.xpath("//div[@role='option']"));
System.out.println("size"+list.size());

 for(WebElement ele:list)
 {
	 
	 if(ele.getText().equalsIgnoreCase("Odis  Adalwin"))
	 {
		 
		ele.click();
		break;
	 }
		 
		driver.findElement(By.xpath("//div[text()='Enabled']")).click();
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @type='text']")).sendKeys("Yuvan");
		
	List<WebElement> link=	driver.findElements(By.xpath("//input[@type='password']"));
		
		
		link.get(0).sendKeys("Yuvan345");
		link.get(1).sendKeys("Yuvan345");
		 
 }
	
	


	}

}
