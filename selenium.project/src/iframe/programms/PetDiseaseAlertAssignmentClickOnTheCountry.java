package iframe.programms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PetDiseaseAlertAssignmentClickOnTheCountry 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://petdiseasealerts.org/forecast-map/#/");
     WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
            driver.switchTo().frame(iframe);
            
            driver.findElement(By.id("region-27")).click();
            

}
}
