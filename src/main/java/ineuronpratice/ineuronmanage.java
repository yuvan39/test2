package ineuronpratice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ineuronmanage {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
driver.get("https://ineuron-courses.vercel.app/course/manage");


driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
driver.findElement(By.id("password1")).sendKeys("ineuron");
driver.findElement(By.xpath("//button[@type='submit']")).click();

driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);

driver.findElement(By.xpath("//span[text()='Manage']")).click();



driver.findElement(By.xpath("//span[text()='Manage Courses']")).click();
WebDriverWait wait=new WebDriverWait(driver,  Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Add New Course')]"))).click();

System.out.println("courseclicked");
Thread.sleep(2000);
WebElement path=driver.findElement(By.xpath("//input[@name='thumbnail']"));

path.sendKeys("C:\\Users\\Priya\\Desktop\\siu.jpg");

driver.findElement(By.id("name")).sendKeys("Selenium");
driver.findElement(By.cssSelector("#description")).sendKeys("AutomationTesting");

driver.findElement(By.name("instructorName")).sendKeys("Mukesh");

driver.findElement(By.name("price")).sendKeys("10000");

driver.findElement(By.name("startDate")).sendKeys("04/30/2023");



driver.findElement(By.name("endDate")).sendKeys("31/05/2023");

driver.findElement(By.xpath("//div[text()='Select Category']")).click();



driver.findElement(By.xpath("//button[text()='Testing']")).click();

driver.findElement(By.xpath("//button[text()='Save']")).click();






	}

}
