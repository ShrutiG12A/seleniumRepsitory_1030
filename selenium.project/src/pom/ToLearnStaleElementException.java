package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnStaleElementException {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		FileInputStream fis = new FileInputStream("./testdata/Exceltestdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String url = workbook.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		driver.get(url);

		WebElement searchtextfield = driver.findElement(By.id("navbar-search-input"));
		searchtextfield.sendKeys("selenium", Keys.ENTER);
		searchtextfield.sendKeys("testng");
	}
	

}
