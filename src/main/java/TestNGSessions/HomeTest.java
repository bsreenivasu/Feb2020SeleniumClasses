package TestNGSessions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//@Listeners(TestNGSessions.MyListenerTest.class)
public class HomeTest extends BaseTest{

	@Test
	public void header() {
		System.out.println("header test");
	}

}
