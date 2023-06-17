package selenium_pratice.Test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class cssfacebooksignup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(opt);
	        
	        driver.get("https://www.facebook.com/");
	     
	       driver.manage().window().maximize();
driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Yuvan");
	        
	        
	        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("krishna");
	        
	        driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9908087654");
	        
	        
	        driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("45678");
	        
	        Select daydropdown= new Select( driver.findElement(By.cssSelector("select[name='birthday_day']")));
	        
	        
	        daydropdown.selectByValue("25");
	        
	        System.out.println("day value is selected");
	        
	        
	        
	 Select monthdropdown= new Select( driver.findElement(By.cssSelector("select[name='birthday_month']")));
	        
	        
	        monthdropdown.selectByIndex(8);
	        
	        
	 Select yeardropdown= new Select( driver.findElement(By.cssSelector("select[name='birthday_year']")));
	        
	        
	        yeardropdown.selectByVisibleText("2012");
	        
	        
	       driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	        
	        driver.findElement(By.cssSelector("._58mt")).click();
	       System.out.println("female-radio button selected");
	       
	       
	       driver.findElement(By.cssSelector("button[class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
	       
	        driver.close();
	       
	       
	        
	        
	        
	        


	}

}
