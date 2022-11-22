package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentNewNov {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//purchase an item without using coupon
		
		System.setProperty("webdriver.chrome.driver", "C://Users//18728//Downloads//chromedriver_win32 (4)//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Automation for registration
		driver.get("https://qatest.commentsoldrt.com/webstore-register?destination=/account");
		driver.manage().window().maximize();

		//driver.findElement(By.cssSelector("#customer-first-name")).sendKeys("Seema");
		//driver.findElement(By.id("customer-last-name")).sendKeys("Panta");
		driver.findElement(By.id("customer-email")).sendKeys("seemapantasharma@gmail.com");
		driver.findElement(By.name("customer[password]")).sendKeys("Seema123");
		driver.findElement(By.className("ws-v2-button-primary")).click();
		
		//Automation for login
		driver.get("https://qatest.commentsoldrt.com/webstore-login?destination=/account");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("seemapantasharma@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Seema123");
		driver.findElement(By.className("ws-v2-button-primary")).click();
		
		//to confirm
		//driver.findElement(By.id("pink-button")).click();
		
		//shop
		driver.findElement(By.xpath("//*[contains(text(),'Shop')]")).click();
		driver.findElement(By.xpath("//button[contains(@aria-label, 'close')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div/div/div[1]/div/nav/ul/li[2]/a")).click();
		//driver.findElement(By.cssSelector("#root > div > main > div > div.grid.grid-cols-5.gap-6 > div.col-span-1.hidden.md\\:block.mt-4 > div:nth-child(2) > button")).click();
		driver.findElement(By.cssSelector("[alt='Product\\: Velvet Duvet Cover']")).click();
		driver.findElement(By.cssSelector("[for='10-Size-Twin XL']")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.linkText("Checkout")).click();
	     
		//order
		//driver.findElement(By.cssSelector("[class=\"_pill-button\"]")).click();
	//	driver.findElement(By.cssSelector("[id=\"save-button\"]")).click();
		
		//shipping details 
	//	driver.findElement(By.id("one")).click();
	//	 driver.findElement(By.cssSelector("[autocomplete='address-line1']")).sendKeys("1234 w kenmore ave");
	//	 driver.findElement(By.cssSelector("[id=\"locality\"]")).sendKeys("chicago");
	//	 driver.findElement(By.cssSelector("[name=\"state\"]")).sendKeys("IL");
	//	 driver.findElement(By.cssSelector("[autocomplete=\"postal-code\"]")).sendKeys("60654");
	//	 driver.findElement(By.cssSelector("[id=\"save-button\"]")).click();
		 
		 //credit card
	//	 driver.findElement(By.cssSelector("[id=\"credit-card\"]")).click();
	//	 WebElement  e =driver.findElement(By.xpath("//iframe[contains(@title, 'Secure card payment input frame')]"));
	//		driver.switchTo().frame(e);
		//	driver.findElement(By.cssSelector("[name=\"cardnumber\"]")).sendKeys("4242424242424242");
		//	driver.findElement(By.cssSelector("[name=\"exp-date\"]")).sendKeys("10/25");
	    //  driver.findElement(By.name("cvc")).sendKeys("111");
		//	driver.findElement(By.name("postal")).sendKeys("60654");
		//	driver.switchTo().parentFrame();
		//	driver.findElement(By.id("stripe-button")).click();
		//    Thread.sleep(20000);
			
			//Add coupon code
		//driver.findElement(By.cssSelector("._right-column ._pill-button")).click();
		//driver.findElement(By.cssSelector("[placeholder=\"Enter Code\"]")).sendKeys("20%off");
		//driver.findElement(By.id("save-button")).click();
		
		//submit payment
		driver.findElement(By.className("_cta-button")).click();
		
		//close and continue
		Thread.sleep(3000);
		driver.findElement(By.className("webstore-checkout-btn")).click();
		
		// account
		driver.findElement(By.xpath("//a[contains(@aria-label, 'Account')]")).click();
		
		//logout
		driver.findElement(By.xpath("//*[@id=\"vue-app-account\"]/div/div[2]/section/div/div[2]/div[2]/div[6]/span")).click();
		
		driver.quit();

	}
}
