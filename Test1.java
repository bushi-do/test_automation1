package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test3 {
	 
	public static void main(String [] args) {

		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	

driver.get("http://github.com/login");
System.out.println(driver.getTitle());          // validates if the page title is correct
System.out.println(driver.getCurrentUrl());		/* validates if the test url is correct (safety checks if there are redirections, 
							also, in this particular case: checks whether the website forced to use HTTPS 							protocol instead of HTTP as typed by test url*/

driver.findElement(By.xpath("//*[@id=\'login_field\']")).sendKeys("@@k!mail.");
driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123");
driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys(Keys.ENTER);


//driver.close(); 

	}
}