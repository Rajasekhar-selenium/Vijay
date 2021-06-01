package sel_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassConcept 
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\Dump\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.get("http://demo.guru99.com/test/newtours/register.php");
		
	    WebElement	ele = d.findElement(By.name("country"));
	    
	    Select ss = new Select(ele); 
	    
	    ss.selectByVisibleText("SWITZERLAND");
	    
	    Thread.sleep(3000);
	    
	    ss.selectByIndex(10);
	    
	    Thread.sleep(3000);
	    
	    ss.selectByValue("INDIA");
	    
	    Thread.sleep(3000);
	    
	    d.close();
	    
	    
	
	
		
		
	}

}
