package synchhronization.programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSynchronization 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//span[text()='Appliances']")).click();
driver.findElement(By.xpath("//div[text()='Cools Even at 50°C']")).click();
driver.findElement(By.xpath("//div[contains(text(),'G AI Convertible 6-in-1 Cooling 2024 Model 1.5 Ton 3 Star Split ')]")).click();


 Set<String> allWindowids = driver.getWindowHandles();

    for(String id:allWindowids)
       {
   	String url = driver.switchTo().window(id).getCurrentUrl();
     if(url.contains("www.flipkart.com/lg-ai-convertible")) 
   		break;
       }
    driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
    
}
}
