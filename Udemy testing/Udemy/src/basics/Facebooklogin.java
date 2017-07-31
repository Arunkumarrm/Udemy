package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
	
	public static void loggin() {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("pass")).sendKeys("");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("loginbutton")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("userNavigationLabel")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='js_s']/div/div/ul/li[12]/a/span/span")).click();
        driver.close();
	}
public static void main(String[] args) {
	Facebooklogin.loggin();
	
}
}
