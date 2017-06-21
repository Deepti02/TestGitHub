package projectTheInternet;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuth {
	
	public void HandleWindowPopUp(WebDriver driver) throws IOException {
	
		Runtime.getRuntime().exec("C:\\Users\\saaik\\Documents\\Deepti\\Study\\AutoITScript\\BasicAuth1.exe");
		
		driver.findElement(By.xpath("//a[@href='/basic_auth']")).click();
		System.out.println(driver.getCurrentUrl());		
	}

}
