package basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marvelupdate {
	
	public static void Updatedepartement()
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://localhost/LMS/Department.aspx");
		driver.findElement(By.xpath(".//*[@id='tableData']/tbody/tr[77]/td[2]/a")).click();
		
		
	}
    	

}
