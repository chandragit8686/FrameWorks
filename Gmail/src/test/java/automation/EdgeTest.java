package automation;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {

	public static void main(String[] args) {
 
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");

		driver.quit();
	}

}
