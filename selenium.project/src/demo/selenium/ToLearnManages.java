package demo.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManages {
	public static void main(String [] args) 
	{
		ChromeDriver driver=new ChromeDriver();// creating the object 
		driver.manage().window().maximize();/// calling the method since it doesnt have any return type  no need to stoore just call it 
		driver.get("https://demoapps.qspiders.com/");// navigating to url 
		driver.manage().window().minimize();// calling the meto\
		driver.manage().window().fullscreen();
	}
}
