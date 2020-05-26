package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafEdit {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("hmuthumanickam@gmail.com");
	driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys(" added");
	driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input")).sendKeys(Keys.TAB);	
	System.out.println(driver.findElement(By.xpath("//label[text()='Get default text entered']/following-sibling::input")).getAttribute("Value"));
	driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
	driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input"));
	}

}
