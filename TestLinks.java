package week1.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input").sendKeys("demosalesmanager");
		driver.findElementByXPath("(//input)[2]").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//div[@id='label']/a").click();
		List<WebElement> allElements =driver.findElements(By.xpath("//a"));
		int cnt=allElements.size();
		System.out.println(cnt);
		for (WebElement webElement : allElements) {
	    driver.get(webElement.getAttribute("href"));
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
			
			
		}
			
		}
				}


