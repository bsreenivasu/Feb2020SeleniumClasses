package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	
	@Test(invocationCount=10)
	public void searchTest(){
		System.out.println("search test");
	}
	
	@Test(invocationCount=20)
	public void createUserTest(){
		System.out.println("create User API");
	}
	
	
	
	
	

}
