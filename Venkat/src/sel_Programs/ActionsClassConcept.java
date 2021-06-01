package sel_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassConcept 
{
public static void main(String[] args) throws InterruptedException {
	

    System.setProperty("webdriver.chrome.driver", "D:\\Sekhar_classes\\Dump\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.manage().window().maximize();
	
	d.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
	
	//d.switchTo().frame(0);
	
    WebElement src = d.findElement(By.xpath("(//span[text()='Thrillers'])[1]"));
	
	WebElement tar = d.findElement(By.xpath("(//span[text()='History'])[2]"));
	
	Actions a = new Actions(d);

	a.dragAndDrop(src, tar).build().perform();
	
	//Action dd = a.clickAndHold(src).moveToElement(tar).release(tar).build();
	
	//dd.perform();
	
	//d.switchTo().defaultContent();
	
	
	
}

}
