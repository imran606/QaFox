package basePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class This_baseClass {
	
	@SuppressWarnings("deprecation")
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://app-uat.lybl.com/login");
		
		WebElement root = driver.findElement(By.tagName("flt-glass-pane"));
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement shadowDown1=(WebElement) jse.executeScript("return arguments[0].shadowRoot", root);
		
		WebElement second1 = shadowDown1.findElement(By.tagName("flt-scene-host"));
		//WebElement third1 = second1.findElement(By.tagName("flt-scene"));
		//WebElement fourth1 = third1.findElement(By.tagName("flt-canvas-container"));
		second1.findElement(By.cssSelector("input#flt-text-editing transparentTextEditing")).sendKeys("imran kolkar");
		
	} 

}
