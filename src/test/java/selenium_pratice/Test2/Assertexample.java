package selenium_pratice.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertexample {

	
	@Test
	
	public void test1assert()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
Assert.assertEquals("facebook","facebook");
		
	
		
		
	}
	

	
	@Test
	
	public void test2assert()
	{
		String msg="customerislazy";
Assert.assertFalse(msg.contains("is"));
		
	
		
		
	}
	
	
}
