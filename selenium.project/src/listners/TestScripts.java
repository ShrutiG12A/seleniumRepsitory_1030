package listners;

import org.checkerframework.framework.qual.DefaultQualifier.List;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;

@Listeners(ListenersImplementation.class)
public class TestScripts extends BaseClassList {
@Test
public void login()
{
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","login page is not displayed ");
Reporter.log("login page is displayed ",true );

driver.findElement(By.id("Email")).sendKeys("ganwanishruti@gmail.com");
driver.findElement(By.id("Password")).sendKeys("shru0i!");
driver.findElement(By.xpath("//input[@value='Log in']") ).click();

Assert.assertEquals(driver.getTitle(),"Demo Web Shop","home page is not displayed ");
Reporter.log("home page is displayed ",true  );
}
}
