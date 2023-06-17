package selenium_pratice.Test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        List <WebElement> links=driver.findElements
        		(By.xpath("//div[@id='pageFooterChildren']//li/a"));
        
 
   
      System.out.println(links.size());
      for (int i = 0; i < links.size(); i++) {
          
        System.out.println(links.get(i).getText());
        System.out.println(links.get(i).getAttribute("href"));
        
	}
      driver.findElement(By.xpath("//a[@title='Create a Page']")).click();
      System.out.println("pagecreated");
      
      driver.close();
	}
}
