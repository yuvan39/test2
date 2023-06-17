package selenium_pratice.Test2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class footercount {
	WebDriver driver=new ChromeDriver();

	
	@SuppressWarnings("deprecation")
	@Test(priority=4)

	public void footer() throws Exception
	{
		
	driver.get("https://ineuron-courses.vercel.app/login");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	JavascriptExecutor js = (JavascriptExecutor)driver;  
    js.executeScript("scrollBy(0, 4500)");  
	List <WebElement> footertext=driver.findElements(By.xpath("//div[@class='social-btns']/a"));
		
	int count=footertext.size();
	System.out.println(count);
	}
}
