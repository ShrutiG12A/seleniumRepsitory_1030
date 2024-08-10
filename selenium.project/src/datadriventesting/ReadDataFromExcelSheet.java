package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcelSheet
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	// create the fis object and pass the path in to it
	FileInputStream fis=new FileInputStream("./testdata/Exceltestdata.xlsx");
	
	// create respecive file type object ... call workbookfactory.create and return type of this is workbook
	
	 Workbook workbook = WorkbookFactory.create(fis);
	 
	 // using referance variable we can call methods of workbook interface 
	String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	
	System.out.println(url);
	
	 String email = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue()	;
	 System.out.println(email);
	 
	String password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	System.out.println(password);
	
     double price = workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
	System.out.println(price);
	
	 boolean status = workbook.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
	 System.out.println(status );
	 
	LocalDateTime time = workbook.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
     System.out.println(time);
  int day = time.getDayOfMonth();
       Month month = time.getMonth();
      int year = time.getYear();
      
      String lowercase = time.getMonth().toString().toLowerCase();
    String alphabet = lowercase.replace("d", "D");
     System.out.println(alphabet);
       double age = workbook.getSheet("Sheet1").getRow(1).getCell(6).getNumericCellValue();
         
	System.out.println(age);
		 
  
     
   
	  
    
 
  
  
    System.out.println(day+ "-"+alphabet+"-"+year);
	
	
	
	
	
	
	//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	
//	driver.get(url);
//	driver.findElement(By.linkText("Log in")).click();
//	driver.findElement(By.id("Email")).sendKeys(email);
//	driver.findElement(By.id("Password")).sendKeys(password);
//	driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
}
}
