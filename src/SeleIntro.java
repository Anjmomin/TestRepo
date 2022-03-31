import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class SeleIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chrome Launch
		//ChromeDriver driver= new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/QA/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		System.out.println("Title is: "+ driver.getTitle());
		System.out.println("Current URL is: "+ driver.getCurrentUrl());
		//driver.close();
		driver.quit();

		//Firefox Launch
		System.setProperty("webdriver.gecko.driver", "C:/Users/admin/Downloads/QA/Drivers/geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://www.amazon.in/");
		System.out.println("Title is: "+ driver1.getTitle());
		System.out.println("Current URL is: "+ driver1.getCurrentUrl());
		//driver1.close();
		driver1.quit();

		//MicrosoftEdge Launch
		System.setProperty("webdriver.edge.driver", "C:/Users/admin/Downloads/QA/Drivers/msedgedriver.exe");
		WebDriver driver2= new EdgeDriver();
		driver2.get("https://www.netflix.com/in/");
		System.out.println("Title is: "+ driver2.getTitle());
		System.out.println("Current URL is: "+ driver2.getCurrentUrl());
		driver2.close();
	}

}
