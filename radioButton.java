package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='yes' and @value=1]").click();
		if(driver.findElementByXPath("//input[@name='news' and @value=0]").isSelected())
			System.out.println(driver.findElementByXPath("//label[text()='Find default selected radio button']/following-sibling::label[0]").getText());
		else
			System.out.println(driver.findElementByXPath("//label[text()='Find default selected radio button']/following-sibling::label[1]").getText());
		
		if(driver.findElementByXPath("//input[@name='age' and @value='1']").isSelected()!=true)
			driver.findElementByXPath("//input[@name='age' and @value='1']").click();
		
	}

}
