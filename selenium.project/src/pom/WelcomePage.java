package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
	// intialization === we are creating a constructory to load the elements inhem we are passing 
	// webdriver driver   which will come from the running test script and this call we are using for the 
	// current class
public WelcomePage(WebDriver driver) 
{
PageFactory.initElements(driver, this);			
}


 // 1.declaration of the variable 
 // first storing the locators value using findby(works same as find element)
 @FindBy(linkText = "LOGIN")
 private WebElement loginLink;


 // 3 in order to access the private data we are using getters
 //  getter method is to read the data 
 public WebElement getLoginLink() 
 {
	return loginLink;
 }
 
}
