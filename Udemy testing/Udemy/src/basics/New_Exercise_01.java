package basics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Exercise_01 {
	

	public static void Add_cart()
	{
		  
				//This line of code is calling the calling the chrome driver.
				System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe");
				
				//This line of code is creating an object for the webdriver.
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("http://automationpractice.com/index.php");
				/*This part of the code is to scroll down so that webdriver can find the web element.
				JavascriptExecutor js = (JavascriptExecutor)driver;
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				js.executeScript("scroll(0, 250);");*/
				driver.findElement(By.id("search_query_top")).sendKeys("Faded Short Sleeve T-shirts");
				driver.findElement(By.name("submit_search")).click();
				driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")).click();
				driver.findElement(By.xpath(".//*[@id='add_to_cart']/button")).click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.cssSelector(".continue.btn.btn-default.button.exclusive-medium>span")).click();
				}
    public static void main(String[] args) {
    	New_Exercise_01.Add_cart();
    	
    }
}
