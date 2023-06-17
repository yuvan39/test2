package ineuronpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ineurondelete {
	
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

driver.findElement(By.xpath("//table[@class='courses-table table table-borderless']/tbody/tr")).click();

driver.findElement(By.xpath("//button[@class='action-btn delete-btn']")).click();
System.out.println("course-deleted");


driver.findElement(By.xpath("//*[text()='Sign out']")).click();
System.out.println("signoutsuccessful");


	}
}
