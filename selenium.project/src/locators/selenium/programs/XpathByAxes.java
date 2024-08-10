package locators.selenium.programs;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes
{
public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 
//	 driver.get("file:///C:/Users/aadit/OneDrive/Desktop/webtable.html");
	 
//	String imbd = driver.findElement(By.xpath("//td[contains(text(),' pushpa')]/following-sibling::td[2]")).getText();
//	System.out.println("imbd of pushpa : "+imbd);
	
	
//	  String collection = driver.findElement(By.xpath("//td[contains(text(),'kgf')]/preceding-sibling::td[1]")).getText();
//	 System.out.println(collection+" of kgf");
//	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
//	Thread.sleep(5000);
//   String discount = driver.findElement(By.xpath("//th[contains(text(),'Levis Shirt')]/following-sibling::td[3]")).getText();
   
//	 System.out.println(discount);
	 
	   driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable");
	   Thread.sleep(7000);
//	   driver.findElement(By.xpath("//th[text()='HP Envy']/following-sibling::td//a")).click();
//	   	driver.findElement(By.xpath("//button[text()='Yes']")).click();	
	   
	   driver.findElement(By.xpath("//th[text()='HP Envy']/following-sibling::td/div")).click();
}
}