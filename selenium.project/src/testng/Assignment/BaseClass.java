package testng.Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pom.HomePageForDemoWebshop;
import pom.LoginPageForDemoWebshopTricentis;
import pom.WelcomePageForDemowebshopTricentis;

public class BaseClass {
//	 lauching the browser 
	public WebDriver driver;
//	 property files 
	public FileInputStream fis;
	public Properties prop;
//	pom page declaration 
	public HomePageForDemoWebshop hp;
	public LoginPageForDemoWebshopTricentis lp;
	public WelcomePageForDemowebshopTricentis wp;
	
	@Parameters("browser")
	

	@BeforeClass // for opening the browser we are using the befor class
	public void openBrowser(@Optional("chrome") String browserName) throws IOException {
		if(browserName.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if (browserName.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		else if(browserName.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();	
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fis = new FileInputStream("./testdata/demowebshop.properties");
		prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("URL");
		driver.get(url);
	}

	@BeforeMethod // login
	public void login() throws IOException {

		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		 wp = new WelcomePageForDemowebshopTricentis(driver);
		wp.getLoginlink().click();
		 lp = new LoginPageForDemoWebshopTricentis(driver);
		lp.getEmailTextField().sendKeys(email);
		lp.getPasswordTextField().sendKeys(password);
		lp.getLoginbutton().click();
	}

	@AfterMethod
	public void logout() {
		hp = new HomePageForDemoWebshop(driver);
		hp.getLogoutlink().click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
