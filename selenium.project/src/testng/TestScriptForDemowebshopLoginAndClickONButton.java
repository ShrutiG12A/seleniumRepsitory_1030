package testng;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScriptForDemowebshopLoginAndClickONButton extends BaseClass
{
@Test
public void clickOnButton()
{
	driver.findElement(By.partialLinkText("BOOKS")).click();
}
}
