package apr18th;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ValidateLoginUsingProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\009LiveTechWS\\JavaSeasons3\\config.properties");

		Properties pr1=new Properties();
		
		pr1.load(fis);
		
		String browserName=pr1.getProperty("browser");
		
		WebDriver driver=null;
		
		//WebDriver driver=new ChromeDriver();
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get(pr1.getProperty("url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(pr1.getProperty("implicitWaitTime"))));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(pr1.getProperty("username"));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pr1.getProperty("password"));
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
		driver.quit();

	}

}
