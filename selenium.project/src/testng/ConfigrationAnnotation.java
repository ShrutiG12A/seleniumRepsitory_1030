package testng;

import org.apache.poi.ooxml.POIXMLProperties.CoreProperties;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigrationAnnotation 
{
@BeforeSuite
public  void beforeSuite()
{
	Reporter.log("@BeforeSuite",true);
}
@BeforeTest
public void beforeTest()
{
   Reporter.log("@beforTest",true);
}
@BeforeClass
public void beforeClass()
{
	Reporter.log("@beforeClass",true );
}
@BeforeMethod
public void beforeMethod()
{
	Reporter.log("@beforemethod",true);
}
@Test
public void demo()
{
	Reporter.log("@test(demo) executed",true );
}
@AfterMethod
public void afterMethod()
{
	Reporter.log("@aftermethod",true);
}
@Test
public void sample()
{
	Reporter.log("@sample",true);
}
@AfterClass
public void afterClass()
{
	Reporter.log("@Afterclass",true );
}
@AfterTest
public void afterTest()  
{
	Reporter.log("@afterTest",true );
}
@AfterSuite
public void afterSuite()
{
Reporter.log("@AfterSuite",true);
}
}
