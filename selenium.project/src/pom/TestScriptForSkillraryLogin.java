package pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.collections4.Get;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptForSkillraryLogin 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
    FileInputStream fis=new FileInputStream("./testdata/Exceltestdata.xlsx");
   Workbook workbook = WorkbookFactory.create(fis);
  String url = workbook.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
             String email = workbook.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
            String password = workbook.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
  
  driver.get(url);
  WelcomePage wp=new WelcomePage(driver);
  wp.getLoginLink().click();
  LoginPage lp=new LoginPage(driver);
  lp.getEmailTextField().sendKeys(email);
  lp.getPasswordTextField().sendKeys(password);
  lp.getLoginButton().click();
  
}
}
