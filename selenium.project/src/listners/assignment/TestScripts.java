package listners.assignment;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pom.HomePageForDemoWebshop;

// commented just because  we are implementing the listners  on the suit level
//@Listeners(ListnerImplement.class)


public class TestScripts extends BaseClassListners
{
@Test
public void clickOnBooks()
{
	hp=new HomePageForDemoWebshop(driver);
	hp.getBooksLink().click();
	Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Boks","books page is not displayed ");
	Reporter.log("books page displayed ",true);
}
}
