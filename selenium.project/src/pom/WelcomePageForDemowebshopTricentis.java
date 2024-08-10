package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePageForDemowebshopTricentis 
{
// intialization of the element using the constructor inthe contructor we will pass web driver object 
	// using pagefactory class and init element method in the classs we pass driver reference and  this call for the current class 
public WelcomePageForDemowebshopTricentis(WebDriver driver ) 
	{
	PageFactory.initElements( driver,this );
	}

// declaration of the element
@FindBy(linkText = "Log in")
private WebElement loginlink;

public WebElement getLoginlink() {
	return loginlink;
}
}
