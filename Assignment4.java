package week1.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input").sendKeys("demosalesmanager");
		driver.findElementByXPath("(//input)[2]").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("//div[@id='label']/a").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("test",Keys.ENTER);
		Thread.sleep(1000);
		String fName=driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a)[1]").getText();
		driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a)[1]").click();
		driver.findElementByXPath("(//div[@class='frameSectionExtra']/a[@class='subMenuButton'])[1]").click();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		if(driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText().equals(fName))
			System.out.println(fName + "the first name is same for duplicated lead");
			}

}
