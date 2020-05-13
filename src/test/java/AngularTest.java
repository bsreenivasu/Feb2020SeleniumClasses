import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import NGDriver.CalculatorPage;

public class AngularTest {
	CalculatorPage calPage;

	@BeforeTest
	public void setup() {
		calPage = new CalculatorPage();
	}

	@Test
	public void calSumTest() {

		AssertJUnit.assertEquals(calPage.doSum("10", "20"), "30");
	}

	@Test
	public void calSubTest() {
		AssertJUnit.assertEquals(calPage.doSub("10", "20"), "-10");

	}

	@Test
	public void calDivTest() {
		AssertJUnit.assertEquals(calPage.doDiv("10", "20"), "0.5");

	}

}
