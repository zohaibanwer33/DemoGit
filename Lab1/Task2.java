package Lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4419\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Getting URL
		driver.get("https://www.way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");
		
		// Go to frame(0)
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(".//a[contains(text(),'New Browser Tab')]")).click();
		Thread.sleep(2000);
		windowsSwitching(driver);
		String actualTitle1 = driver.getTitle();
		String expectedTitle1 = "jQuery UI Datepicker - Default functionality";
		if (actualTitle1.contains(expectedTitle1))
			{
				System.out.println("Test Frame(0) opened Successfully");
		
			}
		else
			{
				System.out.println("Test Frame(0) not opened Successfully");
			}
		driver.close();
		windowsSwitching(driver);
		
		
		//Go to frame(1)
		driver.findElement(By.xpath(".//a[contains(text(),'Open Seprate New Window')]")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath(".//a[contains(text(),'Open New Seprate Window')]")).click();
		Thread.sleep(2000);
		windowsSwitching(driver);
		String actualTitle2 = driver.getTitle();
		String expectedTitle2 = "Open New Seprate Window";
		if (actualTitle2.contains(expectedTitle2))
			{
				System.out.println("Test Frame(1) opened Successfully");
		
			}
		else
			{
				System.out.println("Test Frame(1) not opened Successfully");
			}
		driver.close();
		windowsSwitching(driver);
		
		// Go to frame(2)
		driver.findElement(By.xpath(".//a[contains(text(),'Frameset')]")).click();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath(".//a[contains(text(),'Open Frameset Window')]")).click();
		Thread.sleep(2000);
		windowsSwitching(driver);
		String actualTitle3 = driver.getTitle();
		String expectedTitle3 = "HTML Frames";
		if (actualTitle3.contains(expectedTitle3))
			{
				System.out.println("Test Frame(2) opened Successfully");
		
			}
		else
			{
				System.out.println("Test Frame(2) not opened Successfully");
			}
		driver.close();
		windowsSwitching(driver);
		
		// Go to frame(3)
		driver.findElement(By.xpath(".//a[contains(text(),'Open Multiple Windows')]")).click();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath(".//a[contains(text(),'Open multiple pages')]")).click();
		Thread.sleep(2000);
		windowsSwitching(driver);
		String actualTitle4 = driver.getTitle();
		String expectedTitle4 = "jQuery UI Datepicker - Default functionality";
		if (actualTitle4.contains(expectedTitle4))
			{
				System.out.println("Test Frame(4) opened Successfully");
		
			}
		else
			{
				System.out.println("Test Frame(4) not opened Successfully");
			}

		driver.close();
		windowsSwitching(driver);
		
		driver.quit();
		
		 }
	
	public static void windowsSwitching (WebDriver driver) {
		for(String myHandler : driver.getWindowHandles())
		{
			driver.switchTo().window(myHandler);
		}
	}	
	
	
}
