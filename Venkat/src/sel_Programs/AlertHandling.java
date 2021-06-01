package sel_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\Dump\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver d = new ChromeDriver();
			
			d.manage().window().maximize();
			
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			d.get("https://www.selenium.dev/");
			
			JavascriptExecutor js = ((JavascriptExecutor)d);
			
			js.executeScript("window.alert('Welcome to selenium')");
			
			String text = d.switchTo().alert().getText();
			
			System.out.println(text);
			
			Thread.sleep(3000);
			
			//d.switchTo().alert().accept();
			
			d.switchTo().alert().dismiss();
			
			
			
		
	}

}
