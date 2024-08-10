package takescreendshot.programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentFlipKartScreenshot
{
public static void main(String[] args) throws InterruptedException, IOException {
	//creating the  chromedriver object into web driver i.e converting child into parent object 
	//upcasting 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	// here we are overriding the get method into chrome driver i.e. in child object
	// method overloading examples are to(String Url) and to(URL Url) i.e.. same  method name but different formal argument
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	
	// downcasting one parent into another parent 
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	// we are calling the getScreenshotAs method using  obj reference an storing the value  in a variable
	// it will take outputtype as argument and return type is file 
	    File temp = ts.getScreenshotAs(OutputType.FILE);
	    
	    // creating the file object and storing the locating where we want to copy the output
	    // . is an access operator to access the particular folder
	    
	    File dest=new File("./screenshots/filpkartHome.png");
	    
	    // filehandler is class and copy is a static method in it so we need call the method using the class name 
	    // copy method take two argument i.e... from location, to location
	    
	    FileHandler.copy(temp, dest);
	    
	
	
	
}
}
