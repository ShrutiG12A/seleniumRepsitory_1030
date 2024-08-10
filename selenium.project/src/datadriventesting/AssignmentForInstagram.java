package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentForInstagram 
{
public static void main(String[] args) throws IOException 
{
	//fileinputstream object creation and passing the  path of the file from which we need to fetch
	// the data and perform actions on it 
FileInputStream fis=new FileInputStream("./testdata/testdata01.properties");
Properties  prop=new Properties();
prop.load(fis);
    String instaurl = prop.getProperty("instaurl");
   String iemail = prop.getProperty("iemail");
    String ipassword = prop.getProperty("ipassword");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get(instaurl);
    
   
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(iemail);
    driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(ipassword);
    driver.findElement(By.xpath("//div[text()='Log in']")).click();
    

}
}
