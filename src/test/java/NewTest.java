import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import atm.mete.Validate;

public class NewTest {

  @Test
  @Parameters({"email1"})
  public void email(final String email1) {
	  System.out.println("Checking correct email test");
	  Assert.assertEquals(Validate.isEmailValid("mete@gmail.com"),false, "Asserts if correct email test pass");
	  
  }
}
