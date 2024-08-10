package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnPartialLinkText 
{
public static void main(String[] args) throws InterruptedException
{
ChromeDriver driver=new  ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.partialLinkText("Recently")).click();
driver.navigate().back();
Thread.sleep(7000);
// driver.findElement(By.partialLinkText("Compare")).click();
driver.findElement(By.partialLinkText("COMPUTERS")).click();

driver.navigate().back();
Thread.sleep(1000);
driver.findElement(By.partialLinkText("BOOKS")).click();
driver.findElement(By.partialLinkText("ELECTRONICS")).click();


}
}
