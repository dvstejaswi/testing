package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Share\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.findElement(By.linkText("username")).sendKeys("dvstejaswi");
		Thread.sleep(3000);
		for (int i=1;i<=3;i++) 
			{
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(3000);	
			}
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		
			driver.close();
		
		
	}

}
