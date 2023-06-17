package ineuronpratice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

public class utility 
{

public static void WaitForSeconds(int seconds)
	
	{
		
		try{
			
			Thread.sleep(seconds*1000);
		}
		catch(InterruptedException e)
		
		{
			
		}
	}

	public static void captureScreenshot(WebDriver driver)
	{
		
	
		
		try {
			
			
			File scrFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(scrFile,new File("./Screenshots_Screen_"+getCurrentTime()+".png"));
		} catch (Exception e) {
			
			System.out.println(e);
			e.getMessage();
		}
		
		
	}

	public static String getCurrentTime()
	
	{

		String 	date=new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy").format(new Date());
	
	return date;
	
	}
	
	
		

	




}