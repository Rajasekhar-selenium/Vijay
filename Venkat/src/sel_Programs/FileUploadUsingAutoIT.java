package sel_Programs;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoIT 
{
	public static void main(String[] args) throws IOException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\Dump\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver d = new ChromeDriver();
			
			d.manage().window().maximize();
			
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			d.get("https://smallpdf.com/pdf-to-word");
			
			d.findElement(By.xpath("//*[text()='Choose Files']")).click();
			
			Runtime.getRuntime().exec("C:\\Users\\sharath kumar\\Desktop\\autoits\\fileupload.exe");
		
	}

}
