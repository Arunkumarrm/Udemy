package basics;

import org.testng.annotations.Test;

public class Different_Website_Triggering {

	/*@Test (priority=1) 
	public void test1(){
		Facebooklogin.loggin();		
		}*/
	@Test (priority=2)
    public void test2()
    {
		Helloworld.Library_Version1_login();
    }
	
	@Test (priority=3)
	public void test3()
	{
		Marvel.addepartement();
	}
	
	@Test (priority=4)
	public void test4()
	{
		Marvel_update.Update_department();
	}
	
	/*@Test (priority=5)
	public void test5()
	{
		New_Exercise_01.Add_cart();
	}*/
}
