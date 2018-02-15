package JenkinsJobFeb16.HelloJenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SonarDemo {

	@Before
	public void login()
	{
		System.out.println("Login Window of Web");
	}
	
	@Test
	public void addTocart()
	{
		System.out.println("Add to shopping cart");
	}
	@After
	public void logout()
	{
		System.out.println("Logout window of the web");
	}
}
