package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marvel {
	public static void addepartement() {

		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://localhost/LMS/Department.aspx");
		driver.findElement(By.id("txt_Add")).sendKeys("MSC IT");
		driver.findElement(By.id("btnAdd_depart")).click();
		String g =driver.getCurrentUrl();
	    if(g.equals("http://localhost/LMS/Department.aspx")){
	    	  System.out.println("The test for ADD_Depatement is passed");
	    }
	    else
	    {
	    	  System.out.println("The test case is failed to add_departement");
	    }
		
		
	}

	public static void main(String[] args) {
	Marvel.addepartement();
	}

}
