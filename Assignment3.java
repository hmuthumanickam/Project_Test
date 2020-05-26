package week1.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

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
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("12",Keys.ENTER);
		Thread.sleep(1000);
		String leadId=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]").getText();
		System.out.println(leadId);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'])[1]").click();
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		  driver.findElementByXPath("//a[text()='Find Leads']").click();
		  driver.findElementByXPath("//div[@class='x-form-item x-tab-item']/div/input[@name='id']").
		  sendKeys(leadId,Keys.ENTER);
		  Thread.sleep(1000);
		String deleted=driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(deleted.equals("No records to display"))
				System.out.println("No records to display." + leadId + " is deleted from the record." );
		 
		 
		 
	}

}
