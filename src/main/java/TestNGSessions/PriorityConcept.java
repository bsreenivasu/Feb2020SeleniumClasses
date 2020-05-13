package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {

	@Test(priority = 1)
	public void atest() {
		System.out.println("A test");
	}

	@Test(priority = 2)
	public void btest() {
		System.out.println("B test");
	}

	@Test(priority = 4)
	public void ctest() {
		System.out.println("C test");
	}

	@Test(priority = 3)
	public void dtest() {
		System.out.println("D test");
	}

	@Test()
	public void etest() {
		System.out.println("E test");
	}

	@Test()
	public void ftest() {
		System.out.println("F test");
	}

}
