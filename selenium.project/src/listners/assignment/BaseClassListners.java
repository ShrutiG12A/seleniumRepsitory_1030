package listners.assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.google.j2objc.annotations.Property;

import pom.HomePageForDemoWebshop;
import pom.LoginPageForDemoWebshopTricentis;
import pom.WelcomePageForDemowebshopTricentis;

public class BaseClassListners {
	public WebDriver driver;
	public static WebDriver listDriver;
// getting the data from property file 
	public FileInputStream fis;
	public Properties prop;
//getting data from pom page
	public WelcomePageForDemowebshopTricentis wp;
	public LoginPageForDemoWebshopTricentis lp;
	public HomePageForDemoWebshop hp;

	@Parameters("browser")
	// for launching the browser
	@BeforeClass()
	public void openBrowser(@Optional("chrome") String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browserName.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else if (browserName.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		listDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		fis = new FileInputStream("./testdata/demowebshop.properties");
		prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("URL");

		driver.get(url);
	}

// we ARE WRITING THE CODE FOR LOGIN
	@BeforeMethod
	public void login() {

		lp = new LoginPageForDemoWebshopTricentis(driver);
		wp = new WelcomePageForDemowebshopTricentis(driver);
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		wp.getLoginlink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "login page is not displayed");
		Reporter.log("login page is displayed ", true);

		lp.getEmailTextField().sendKeys(email);
		lp.getPasswordTextField().sendKeys(password);
		lp.getLoginbutton().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "home page is not displayed");
		Reporter.log("home page is displayed ", true);
	}

// code for logout
	@AfterMethod
	public void logout() {
		hp = new HomePageForDemoWebshop(driver);
		hp.getLogoutlink().click();
	}

// for closing the browser
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
