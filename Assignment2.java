package week1.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

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
		driver.findElementByXPath("//div[@id='x-form-el-ext-gen248']/input[@name='firstName']").sendKeys("Hari",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		String title=driver.getTitle();
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("New Company Name");
		driver.findElementByXPath("//form[@id='updateLeadForm']//input[@value='Update']").click();
		if(driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText().contains("New Company Name"))
			System.out.println("Title of the Page: " + title);
			System.out.println("Copany name updated :" + driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText());

		
		
		
		
		
		
		
		

	}

}
