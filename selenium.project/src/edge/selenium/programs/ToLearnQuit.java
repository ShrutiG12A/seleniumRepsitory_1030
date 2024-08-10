package edge.selenium.programs;

	
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnQuit 
{
public static void main(String[] args) throws InterruptedException 
{ 
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.shoppersstack.com/products_page/11");
Thread.sleep(2000);
//driver.close();
driver.findElement(By.id("compare")).click();
Thread.sleep(20000);
driver.quit();


}
}
