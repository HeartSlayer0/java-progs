package testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class Menuact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.findElementByLinkText("Courses").click();
		driver.findElementByLinkText("Selenium-Java").click();
		driver.findElementByLinkText("Sign out").click();		
		driver.quit();
	}

}
