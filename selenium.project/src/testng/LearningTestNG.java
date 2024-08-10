package testng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;
 

//testng is advanced version of the j meter which used by the developer to perform unit testing 
//test engineers are using the testNG for parallel execution , group execution, report generation, batch execution

public class LearningTestNG// testNG class which contain atleast one 	@test
{
@Test// test case are those which contain method annoted with @Test

public void sample() throws IOException
{// code written inside the test cases is called is test steps 
	Reporter.log("struti",true );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	String time = LocalDateTime.now().toString().replace(":", "-");
	driver.get("https://www.w3schools.com/js/js_popup.asp");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/w3cschool"+time+".png");
	FileHandler.copy(temp, dest);
}
}
