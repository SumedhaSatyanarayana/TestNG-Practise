package New;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class FirstClass1stPackage2TCs {
	@Test(enabled = false)
	public void abc(){
		//driver.findElement(By.id("identifierId")).sendKeys("8762705557");
		//driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		System.out.println("Execute 2 TC");
	}
	@Test
	public void FirstTC() {
		System.out.println("Execute 1 TC");
	}
}
