package salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecification {
	public ChromeDriver driver;
	@BeforeMethod
	public void precondition() throws InterruptedException
	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@2024");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
	}
	

