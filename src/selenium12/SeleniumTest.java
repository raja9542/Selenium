package selenium12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main ( String[] args ) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("email")).sendKeys("heetesh42070@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9542725866");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
	}

}
