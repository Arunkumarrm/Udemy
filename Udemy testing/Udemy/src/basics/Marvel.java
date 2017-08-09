package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marvel {
	public static void addepartement() {
        //This line code is to set the system property where the chrome driver is there.
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe" );
		//This line of code is to create the webdriver code.
		WebDriver driver=new ChromeDriver();
		//This line of code is to giving command the command to the chrome browser navigate to the particular site.
		driver.navigate().to("http://localhost/LMS/Department.aspx");
		//This line of code is to find the element and send the characters to the text field.
		driver.findElement(By.id("txt_Add")).sendKeys("MSC IT");
		//This line of the code is to find the button and click on it.
		driver.findElement(By.id("btnAdd_depart")).click();
		//This line of code is creating the new string object to get the current URL for Assertion purpose.
		String g =driver.getCurrentUrl();
		//This line of code is creating the if condition for assertion purpose.
	    if(g.equals("http://localhost/LMS/Department.aspx")){
	    	//This line of code is to print the output.
	    	  System.out.println("The test for ADD_Depatement is passed");
	    }
	    else
	    {
	    	  System.out.println("The test case is failed to add_departement");
	    }
		
		
	}

	public static void main(String[] args)
	{
	Marvel.addepartement();
	}

}
