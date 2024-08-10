package listners.assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.poi.poifs.crypt.dsig.services.TSPTimeStampService;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplement extends BaseClassListners implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String failedMethodName = result.getName();
	Reporter.log("test script failed",true);
	String time = LocalDateTime.now().toString().replace(":", "-");
	TakesScreenshot ts=(TakesScreenshot) listDriver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/"+failedMethodName+time+".png");
	try 
	{
	  FileHandler.copy(temp, dest);

	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
	}


}
