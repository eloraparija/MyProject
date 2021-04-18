package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	static WebDriver driver ;

	public static void main(String[] args) {
		
		//ctrl+shift+o
		//F6  - To go from one line to the other
		//F5  - To go inside a function
		//F8  - To resume or to move from one break point to the other break point
		
		driver = new FirefoxDriver();
		driver.get("http://google.com");
		verifyText();
		driver.quit();

	}
	
	public static void verifyText() {
		driver.findElement(By.name("q")).sendKeys("selenium");
	}

}
