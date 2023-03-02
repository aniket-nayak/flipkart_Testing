package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DemoTest1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naan3001\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		System.out.println("My Title is : "+driver.getTitle());
		String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!" ;
		Assert.assertEquals(driver.getTitle(),expectedTitle,"Title Didnot match");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement searchBar=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		searchBar.sendKeys("iphone 14 pro");
		System.out.println("My Title is : "+driver.getTitle());
		Thread.sleep(300);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@data-id='MOBGHWFHYGAZRWFT']/div[@class='_2kHMtA']/a[@class='_1fQZEK']")).click();
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		String expectedTitle1 = "APPLE iPhone 14 Pro ( 128 GB Storage ) Online at Best Price On Flipkart.com";
		Assert.assertEquals(driver.getTitle(),expectedTitle1,"Title Didnot match");
		System.out.println("My Title is : "+driver.getTitle());
		Thread.sleep(300);
		
//		Validating Color
		System.out.println("Validating Color");
		System.out.println(driver.findElement(By.xpath("//li[@id='swatch-0-color']")).getText());
		System.out.println(driver.findElement(By.xpath("//li[@id='swatch-1-color']")).getText());
		System.out.println(driver.findElement(By.xpath("//li[@id='swatch-2-color']")).getText());
		System.out.println(driver.findElement(By.xpath("//li[@id='swatch-3-color']")).getText());
		Thread.sleep(300);
		driver.findElement(By.xpath("//li[@id='swatch-3-color']")).click();
		
//		Validating Storage
		System.out.println("Validating Storage");
		System.out.println(driver.findElement(By.xpath("//li[@id='swatch-0-storage']")).getText());
		System.out.println(driver.findElement(By.xpath("//li[@id='swatch-1-storage']")).getText());
		System.out.println(driver.findElement(By.xpath("//li[@id='swatch-2-storage']")).getText());
		System.out.println(driver.findElement(By.xpath("//li[@id='swatch-3-storage']")).getText());
		Thread.sleep(300);
		driver.findElement(By.xpath("//li[@id='swatch-0-storage']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(300);
		
//		Go to Cart
		System.out.println("My Title is : "+driver.getTitle());
		driver.findElement(By.xpath("//a[@class=\"_3SkBxJ\"]")).click();
//		Proceed TO CheckOut
		System.out.println("My Title is : "+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button/span")).click();
	
	
	
	
	}
}