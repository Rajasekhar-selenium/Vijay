package sel_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesHandling 
{
	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\Dump\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver d = new ChromeDriver();
			
			d.manage().window().maximize();
			
			d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			d.get("http://google.com");
			
			d.manage().deleteAllCookies();
	}

}
