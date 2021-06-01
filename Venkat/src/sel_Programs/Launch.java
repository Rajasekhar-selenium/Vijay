package sel_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\Dump\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		
//        d.get("https://www.facebook.com/");
//		
//		d.findElement(By.id("email")).sendKeys("testing");
		
		d.get("http://google.com");  //input[@placeholder='Email address or phone number']
		
		/*d.findElement(By.name("q")).sendKeys("software testing");
		
		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		List<WebElement> ele = d.findElements(By.tagName("a"));
		
		System.out.println(ele.size());*/
		
		// d.findElement(By.linkText("Gmail")).click();
		
		//d.findElement(By.partialLinkText("Gma")).click();
		
		
		d.get("https://facebook.com");  
		
		d.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("userid");
		
		d.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("password");
		
		d.findElement(By.xpath("//*[@name='login']")).click();
		
		
		
		
		
	}

}
