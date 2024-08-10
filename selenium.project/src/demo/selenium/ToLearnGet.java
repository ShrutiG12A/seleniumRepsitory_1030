package demo.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class ToLearnGet
{
public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.instagram.com/");
String t = driver.getTitle();
System.out.println(t);
if(t.equals("Instagram"))
{
	System.out.println("user navigated");
}
else
{
	System.out.println("user not nagivated");
}
}
}