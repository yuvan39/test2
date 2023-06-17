package selenium_pratice.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebooktext {
	
	public static void main( String[] args )
    {
      WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
  WebElement text=    driver.findElement
       (By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));

 String text1= text.getText();
 {
 if(text1=="Facebook helps you connect and share with the people in your life.");
	 System.out.println("text is matched");
	 System.out.println(text1);
 }
  driver.close();
  
}
}


