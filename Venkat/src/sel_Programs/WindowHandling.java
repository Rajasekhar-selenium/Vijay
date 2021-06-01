package sel_Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling 
{
	static String exp;
	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		//String exp;
       System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\Dump\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.get("https://www.selenium.dev/");
		
		WebElement ele = d.findElement(By.linkText("Downloads"));
		
		Actions a = new Actions(d);
		
		a.contextClick(ele).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(3000);
		
        r.keyPress(KeyEvent.VK_DOWN);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(3000);
		
        r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		Set<String> window = d.getWindowHandles();
		
		System.out.println("Windows count is: "+window.size());
		
		
		
		for(String win : window)
		{
			
		    exp = "SeleniumHQ Browser Automation";
			
			String actual = d.switchTo().window(win).getTitle();
			
			System.out.println(actual);
			
			if(actual.contains(exp))
			{
				System.out.println("Browser found");
			}
			else
			{
				d.close();
			}
			
			
		}
		
		Thread.sleep(3000);
		
	
		d.quit();
		
		
		
		
	}

}
