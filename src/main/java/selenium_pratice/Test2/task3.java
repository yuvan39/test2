package selenium_pratice.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Contact Sales')]")).click();
        
      

	}

}
