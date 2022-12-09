package Lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4419\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		// Getting URL
		 driver.get("https://sso.teachable.com/secure/673/identity/login");
		 
		 
		 driver.findElement(By.linkText("Sign Up")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("user_name")).sendKeys("Zohaib Anwar");        // Username
		 driver.findElement(By.id("user_email")).sendKeys("zohaibanwer33@gmail.com");  //Email
		 driver.findElement(By.id("password")).sendKeys("professor786$");            // Password
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();       //Checkbox
		 driver.findElement(By.name("commit")).click();      // Hit Signup button
		 
		 
		// Validation
		 String actualTitle = driver.getTitle();
		 String expectedTitle = "Selenium Tutorial for beginners and professionals | Best way to learn";
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
