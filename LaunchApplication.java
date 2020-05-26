package week1.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication {

	private static final String Select = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click(); 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Hari Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prakash");
		Select src=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		src.selectByIndex(4);
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Pay Per Click Advertising");
		Select owner=new  Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		owner.selectByValue("OWN_CCORP");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.className("smallSubmit")).click();	
		String s1=driver.getTitle();
		System.out.println(s1);
		
		

		
		}

}
