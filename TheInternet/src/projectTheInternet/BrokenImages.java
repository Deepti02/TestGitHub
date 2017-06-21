package projectTheInternet;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImages {
	
	public void HandleBrokenImag(WebDriver driver) throws IOException {
	
		driver.findElement(By.xpath("//a[@href='/broken_images']")).click();
		System.out.println(driver.getCurrentUrl());		
		
		List<WebElement> listImages = driver.findElements(By.tagName("img"));
		System.out.println(listImages.size());
		
		// Print out the image links
		for (int i = 0; i<listImages.size();i++){
			if(!(listImages.get(i).getAttribute("src").equals("")) 
					&& !(listImages.get(i).getAttribute("src")== null))
					System.out.println(listImages.get(i).getAttribute("src"));
		}
	}

}
