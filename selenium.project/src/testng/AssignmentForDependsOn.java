package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssignmentForDependsOn 
{
@Test 
public void addElement()
{
// WebDriver driver=new ChromeDriver();x
	Reporter.log("adding the element");
}
@Test(dependsOnMethods = {"addElement","editElement"})
public void deleteElement()
{
	Reporter.log("deleting the element");
}
@Test(dependsOnMethods = "addElement")
public void editElement()
{
	Reporter.log("editing the element");
}
}
