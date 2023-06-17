package ineuronpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class decpratcice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('persistent').click()");
	
	}

}
