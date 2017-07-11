package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helloworld {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.navigate().to("http://lms.qspl.co.in/login.aspx");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtusername")).sendKeys("admin");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPassword")).sendKeys("pass@1234");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnlogin")).click();
	}
	

}
