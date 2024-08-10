package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssaignmentLoginUsingXpath 
{
public static void main(String[] args) throws InterruptedException 
{
ChromeDriver driver =new  ChromeDriver();
driver.manage().window().maximize();

driver .get("https://www.instagram.com/");
Thread.sleep(7000);
driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username')]")).sendKeys("********il.com");
driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("********");
driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
}
}
