package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomSkillraryTestScriptToHandleTheStaleElementException
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	FileInputStream fis=new FileInputStream("./testdata/Exceltestdata.xlsx");
	 Workbook workbook = WorkbookFactory.create(fis);
String url = workbook.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	driver.get(url);
	
	SkillRaryWelcomePage skp=new SkillRaryWelcomePage(driver);
	skp.getSearchTF().sendKeys("selenium",Keys.ENTER);
	//everytime the elements are getting intialized from findelementss thats why we are not getting any exception 
	
	skp.getSearchTF().sendKeys("testng",Keys.ENTER);
	
	
}
}
