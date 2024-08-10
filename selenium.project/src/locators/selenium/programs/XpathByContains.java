package locators.selenium.programs;

import org.asynchttpclient.netty.request.NettyRequestSender;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
//	driver.get("https://demowebshop.tricentis.com/login");
//	driver.findElement(By.xpath("//input[contains(@id,'searchterms')]")).sendKeys("COMPUTERS");

	
	driver.get("https://www.instagram.com/");
	driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("shru****@");
	//driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading ')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),' Instagram from Meta')]")).click();
}
}
