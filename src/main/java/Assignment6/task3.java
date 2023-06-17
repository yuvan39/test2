package Assignment6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task3 {

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
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4500)");
		
	List<WebElement>	checkbox=driver.findElements(By.xpath("//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']"));
	System.out.println(checkbox.size());
	for(WebElement box:checkbox)
	{
		String text=box.getText();
		if(text.equalsIgnoreCase("charitym"))
		
			box.click();
	}
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash oxd-button-icon']")).click();
		System.out.println("user-deleted");
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	

}
