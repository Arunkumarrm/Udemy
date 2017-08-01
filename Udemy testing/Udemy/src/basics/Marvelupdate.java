package basics;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Marvelupdate {
	
	public static void Updatedepartement()
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://localhost/LMS/Department.aspx");
		//this part of the code is to scroll down so that webdriver can find the web element.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js.executeScript("scroll(0, 250);");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[80]")).click();
		    
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		jse.executeScript("scroll(0,-250);");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("txt_Add")).clear();
		driver.findElement(By.id("txt_Add")).sendKeys("MSC Information Technology");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("btnupd")).click();
		
	}
    	
	public static void main(String[] args) {
		Marvelupdate.Updatedepartement();
	}
}
