public class DriverIntialisation
{

import org.openqa.selenium.firefox.FirefoxDriver;

public static void main(String[] args)
{

	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_32bit.exe");
	FirefoxDriver driver =  new FirefoxDriver();

	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();

	System.out.println("Chrome driver intialised sucessfully and launched leaft tap");
        System.out.println("Chrome browser maximised");


}