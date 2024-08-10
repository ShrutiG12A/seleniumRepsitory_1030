package edge.selenium.programs;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch 
{
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	
	driver.get("https://www.amazon.in/");
}
}
