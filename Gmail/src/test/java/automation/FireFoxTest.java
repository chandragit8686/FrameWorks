package automation;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxTest {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.quit();
		
	}

}
