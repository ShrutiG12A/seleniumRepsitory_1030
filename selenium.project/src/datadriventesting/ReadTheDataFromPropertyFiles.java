package datadriventesting;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTheDataFromPropertyFiles {
	public static void main(String[] args) throws IOException {
		// step 1= create fileinputstream object
		FileInputStream fis = new FileInputStream("./testdata/testdata01.properties");

		// step2: create respective file type object
		Properties prop = new Properties();

		// step 3: call the read methods

		prop.load(fis);// we are loading all the keys from file input stream
		String baseurl = prop.getProperty("url");
		System.out.println(baseurl);

		String email = prop.getProperty("email");
		System.out.println(email);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(baseurl);
//		driver.close();
		driver.quit();

	}
}
