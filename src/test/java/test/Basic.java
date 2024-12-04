package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import java.util.Queue;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.asserts.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.function.Function;
public class Basic {


public static void method(int n) {




String s= String.valueOf(n);
StringBuilder sb= new StringBuilder();
for(int i=s.length()-1;i>=0;i--)
{

sb.append(s.charAt(i));
}

String res= sb.toString();
int result= Integer.parseInt(res);

System.out.println(result);
}

	

	public static void main(String[] args)
	{
		
		
		method(123343);
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Actions act= new Actions(driver);
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("amazon");
	act.sendKeys(Keys.ENTER);
	act.perform();
		driver.findElement(By.xpath("//div[@class='CCgQ5 vCa9Yd"
				+ " QfkTvb N8QANc Va3FIb EE3Upf']/span")).click();
		
		
		WebElement sell = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]"));
		WebElement bestsellers = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]"));
		WebElement todaydeal = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]"));
		WebElement mobiles= driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]"));
		
		WebElement ele= driver.findElement(By.id("nav-link-accountList"));
		act.moveToElement(ele).perform();
		
		WebDriverWait wt= new WebDriverWait(driver,Duration.ofSeconds(6));
		wt.until(ExpectedConditions.visibilityOf(ele));
		
		
		act.moveToElement(driver.findElement(By.xpath
				("//a[contains(text(),'Explore Showroom')]"))).click().perform(); */
		
	}
}