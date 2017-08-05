package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Exercise_01 {
	

	public static void main(String[] args) {
		  
				//This line of code is calling the calling the chrome driver.
				System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe");
				
				//This line of code is creating an object for the webdriver.
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("http://demoqa.com/");
				driver.findElement(By.id("menu-item-374")).click();

	}

}
