package ineuronpratice;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class capturescreenshot {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.com");
		
	
		utility.captureScreenshot(driver);
	
		
		driver.close();
	}

}

