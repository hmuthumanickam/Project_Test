public class DriverIntialisation
{

import org.openqa.selenium.firefox.FirefoxDriver;

public static void main(String[] args)
{

	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver_32bit.exe");
	FirefoxDriver driver =  new FirefoxDriver();

	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();

	System.out.println("Chrome driver intialised sucessfully and launched leaft tap");

}