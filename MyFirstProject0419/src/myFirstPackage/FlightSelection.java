package myFirstPackage;

//import java.util.List;
import org.openqa.selenium.By; // contains the class to use the By function
//import.org.openqa.selenium.support.ui.Select; // contains class to use the dropdown options
import org.openqa.selenium.WebDriver; //contains the WebDriver class needed to instantiate a new browser loaded with a specific driver
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select; // contains class to use Select from drop down
public class FlightSelection {

	public static void main(String[] args) {
		
		// This is just a test comment

		// Declaration and instantiation of objects/variables
		WebDriver driver;
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\saaik\\Downloads\\geckodriver-v0.15.0-win64\\geckodriver.exe"); //not working due to gecko driver isue
		System.setProperty("webdriver.chrome.driver","C:\\Users\\saaik\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Instantiation of objects/variables
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		String baseUrl = "http://newtours.demoaut.com/mercurysignon.php";

		// Launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		// Maximize the screen..
		driver.manage().window().maximize();

		// Enter userid/pwd
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");

		// Click the login button
		driver.findElement(By.name("login")).click();

		// On next screen select RoundTrip
		// driver.findElement(By.cssSelector("input[value='Round Trip']")).click();
		// driver.switchTo().alert().dismiss();
		//driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//name[@name='tripType' and @value='roundtrip'")).click();

		// Select how many Passengers
		Select drpPss = new Select(driver.findElement(By.name("passCount")));
		drpPss.selectByVisibleText("2");

		// Select Departing from
		Select departFrom = new Select(driver.findElement(By.name("fromPort")));
		departFrom.selectByVisibleText("Frankfurt");

		// Select On date
		Select startOnmonth = new Select(driver.findElement(By.name("fromMonth")));
		startOnmonth.selectByVisibleText("March");
		Select startOnDate = new Select(driver.findElement(By.name("fromDay")));
		startOnDate.selectByVisibleText("12");

		// Selecte Arriving in
		Select arriveIn = new Select(driver.findElement(By.name("toPort")));
		arriveIn.selectByValue("Sydney");

		// Select Return Date
		Select returnOnmonth = new Select(driver.findElement(By.name("toMonth")));
		returnOnmonth.selectByValue("3");
		Select returnOnDate = new Select(driver.findElement(By.name("toDay")));
		returnOnDate.selectByVisibleText("20");

		// Select Service Class
		// driver.findElement(By.cssSelector("input[value='Business']")).click();
		/*List <WebElement> serClass = driver.findElements(By.xpath("//input[@name='servClass' and @type ='radio']"));
		
		int lst = serClass.size();
		for(int i=0; i<lst;i++)
		{
			WebElement eachSerClass = serClass.get(i);
			String strEachSerClass = eachSerClass.getAttribute("value");
			System.out.println(strEachSerClass);
		}*/

		driver.findElement(By.xpath("//input[@name='servClass' and @value ='Business']")).click();
		
		// Select Airline Preference
		Select perf = new Select(driver.findElement(By.name("airline")));
		perf.selectByVisibleText("Pangea Airlines");

		// Click Continue
		driver.findElement(By.name("findFlights")).click();

		// Close the driver
		//driver.close();

	}
}