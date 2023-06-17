package selenium_pratice.Test2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class godaddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://godaddy.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Domains']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Domain Name Search']")).click();
String text=driver.getTitle();
System.out.println(text);
Assert.assertEquals(text, "GoDaddy Domain Search - Buy and Register Available Domain Names");
System.out.println("title is same");


WebElement status=driver.findElement(By.xpath("//input[@type='text']"));


System.out.println("search text presence"+status.isDisplayed());

WebElement status1=driver.findElement(By.xpath("//button[@aria-label='Buy It']"));

System.out.println("buyit button presence "+status1.isDisplayed());

status.sendKeys("mydomain");
status1.click();





WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Add mydomain.shop to cart']]")));
		
		
WebElement cart=driver.findElement(By.xpath("//button[@aria-label='Add mydomain.shop to cart']]"));

System.out.println(cart.isDisplayed());


		
		WebElement price=driver.findElement(By.xpath("//span[@class='text-nowrap m-b-0 d-inline-block ms3']"));
		System.out.println(price.isDisplayed());
		
	}

}
