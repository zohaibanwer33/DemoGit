package Lab1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import dev.failsafe.internal.util.Assert;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4419\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Getting the URL
		driver.get("https://www.way2automation.com/");
		System.out.println("My name is ZOHAIB");
		
		
		Actions actions = new Actions(driver);
		
		
		// Introduced Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Hovering mouse on All Courses
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'All Courses')]")));
		WebElement AllCourses = driver.findElement(By.xpath(".//span[contains(text(),'All Courses')]"));
		actions.moveToElement(AllCourses).perform();
		
		// Hovering mouse on Selenium
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'Selenium')]")));
		WebElement Selenium = driver.findElement(By.xpath(".//span[contains(text(),'Selenium')]"));
		actions.moveToElement(Selenium).perform();
		
		// Click on Selenium with JAVA 	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'Selenium with Java')]")));
		WebElement SeJAVA = driver.findElement(By.xpath(".//span[contains(text(),'Selenium with Java')]"));
		SeJAVA.click();
		
		// Validation
		String actualTitle = driver.getTitle();
		String expectedTitle = "Selenium Training Online | Selenium WebDriver Training Course";
		if (actualTitle.contentEquals(expectedTitle))
			{
				System.out.println("Test Passed");
		
			}
	else
			{
				System.out.println("Test Failed");
			}

		driver.quit();
		
	}
	
}
