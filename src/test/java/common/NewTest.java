package common;
import org.testng.Assert;
import org.testng.annotations.Test;

import atm.mete.Validate;

public class NewTest {

  @Test
  public void email() {
	  Assert.assertEquals(Validate.isEmailValid("mete@gmail.com"),true);
	  
  }
}
