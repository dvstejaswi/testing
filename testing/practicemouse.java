package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practicemouse {

 

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Share\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in");
	//takepicture(driver, "img1");
	
	Actions action = new Actions(driver);
	
	WebElement Trains= driver.findElement(By.linkText("TRAINS"));
	action.moveToElement(Trains).build().perform();
	//Screenshot.takepicture(driver, "img2");
	
	Thread.sleep(3000);
	
	WebElement jsArithmatic = driver.findElement(By.linkText("JS Arithmetic"));
	action.moveToElement(jsArithmatic).build().perform();
	//Screenshot.takepicture(driver, "img3");
	 
//	Thread.sleep(3000);
	
//	Try it Yourself.click();
	//Screenshot.takepicture(driver, "img4");
	
	
	
	

}
	
	
	
	
}
