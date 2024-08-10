package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{public LoginPage(WebDriver driver ) 
{
	PageFactory.initElements(driver,this);	
}
	

	// 1 declaration of the variable(we are finding the element and storing it in a variable ) 
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;
	

public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	
}
