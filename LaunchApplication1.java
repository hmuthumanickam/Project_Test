package week1.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input").sendKeys("demosalesmanager");
		driver.findElementByXPath("(//input)[2]").sendKeys("crmsfa");
		driver.findElementByXPath("(//input)[3]").click();
		driver.findElementByXPath("(//a)[2]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Hari Company");
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Hari Company");
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hari");
		driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Prakash");
		driver.findElementByXPath("(//select)[1]").sendKeys("Employee");
		driver.findElementByXPath("(//select)[4]").sendKeys("Corporation");
		driver.findElementByXPath("(//select)[7]").sendKeys("Pay Per Click Advertising");
		driver.findElementByXPath("(//select)[7]").sendKeys("India");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();

	}

}
