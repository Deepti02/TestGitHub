package myFirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstClass {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\saaik\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saaik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
				try{		
		WebElement uName = driver.findElement(By.name("userName"));
		uName.sendKeys("Hello");
		
		boolean yEnb = driver.findElement(By.name("password")).isEnabled();
		System.out.println(yEnb);		
		System.out.println("Completed");
		}catch (Exception e){	
			
			System.out.println(e);
		
		}
		
	}
}
