package basics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Marvel_update {
	
	public static void Update_department()
	{   
		//This line of code is calling the calling the chrome driver.
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe");
		
		//This line of code is creating an object for the webdriver.
		WebDriver driver=new ChromeDriver();
		
		//This line of code is to navigate the browser to the to the below mentioned site.
		driver.navigate().to("http://localhost/LMS/Department.aspx");
		
		//This part of the code is to scroll down so that webdriver can find the web element.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		js.executeScript("scroll(0, 250);");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//This line of code is to find an web element using the Xpath.
		driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[80]")).click();
		
	    //This part of the code is to scroll up so that webdriver can find the web element.    
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		jse.executeScript("scroll(0,-250);");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	//This lines of code is to access the elements by its id property.
		driver.findElement(By.id("txt_Add")).clear();
		driver.findElement(By.id("txt_Add")).sendKeys("MSC Information");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("btnupd")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
	}
    	
	public static void main(String[] args) {
		Marvel_update.Update_department();
	}
}
