package projectTheInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABTestVariation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saaik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		String baseUrl ="http://the-internet.herokuapp.com";
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/abtest']")).click();
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
