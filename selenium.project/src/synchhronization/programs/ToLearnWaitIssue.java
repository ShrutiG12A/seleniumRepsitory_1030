package synchhronization.programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWaitIssue
{
public static void main(String[] args) throws InterruptedException
{
WebDriver driver=new ChromeDriver() ;
driver.manage().window().maximize();

// calling the time out method and in timeout implicitly wait method is their that takes the  duration as arugument (duration is class and off seconds is methods )



driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//navigate to  website 
driver.get("https://www.shoppersstack.com/");
driver.navigate().refresh();

//driver.findElement(By.id("loginBtn")).click();

// using find elements to get the total add to cart button
    List<WebElement> alladdtocartbutton = driver.findElements(By.xpath("//button[@id='addToC']"));

// to access  the add to cart button of particular index we are using the get method of list class ther we will provide the index of the element we to access by performing click action 
//  alladdtocartbutton.get(1).click();

// for checking the size of the addtocartbutton
System.out.println(alladdtocartbutton.size());



}
}
