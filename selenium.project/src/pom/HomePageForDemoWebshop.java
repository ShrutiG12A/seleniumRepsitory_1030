package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageForDemoWebshop 
{
public HomePageForDemoWebshop(WebDriver driver ) 
{
PageFactory.initElements( driver,this);		
}
@FindBy(linkText = "Log out")
private WebElement logoutLink;

public WebElement getLogoutlink() {
	return logoutLink;
}
@FindBy(partialLinkText = "BOOKS")
private WebElement booksLink;

public WebElement getBooksLink() 
{
	return booksLink;
}


}
