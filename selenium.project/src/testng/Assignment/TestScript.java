package testng.Assignment;

import org.testng.annotations.Test;

import pom.HomePageForDemoWebshop;

public class TestScript extends BaseClass

{
@Test
public void clickOnBooks()
{
	 hp=new HomePageForDemoWebshop(driver);
	hp.getBooksLink().click();
	
}
}
