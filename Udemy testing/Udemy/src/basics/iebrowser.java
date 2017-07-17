package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iebrowser {

	public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","E:\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.navigate().to("http://lms.qspl.co.in/login.aspx");
        
        //Finding the user name text field and placing the user name in the appropriate field.
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtusername")).sendKeys("admin");
        
        //Finding the password text field and placing the password in that password text field.
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPassword")).sendKeys("pass@1234");
        
        //Finding the Login button and putting click action on Login button.
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnlogin")).click();
  
        //Finding the Book Lend icon and click.
        driver.findElement(By.id("NavSetting")).click();
        
        //Finding the Borrow Book and click on it.
        driver.findElement(By.xpath(".//*[@id='NavSetting']/ul/li[1]/a")).click();
        
        //Finding the Student regestration number text field.
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_Textrollno")).sendKeys("123wdrfdxbtf");
        
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtissuedate")).sendKeys("7/14/2017");
        driver.findElement(By.className("LMS_DropDown_InnerCss")).click();   
	    //in order to assert the title by using .getTitle(); we can catch the title and assert it using if condition.
        String s =driver.getCurrentUrl();
	       
        if(s.equals("http://lms.qspl.co.in/BookIssue.aspx"))
        {
	    	  System.out.println("By Asserting The 'URL' Book issue Testcase is PASSED");
	    }
        else
        {
	    	  System.out.println("The test is failed");
	    }
        
	    
	
	}
	

	}


