package test2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxClass {

	@Test
	public void ff1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
		driver.quit();
	}
	@Test	
public void ff2() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
	driver.quit();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
