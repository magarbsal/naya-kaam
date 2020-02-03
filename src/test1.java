import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "//Users//bishal//eclipse-workspaceNew//Introduction//chromedriver");
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	
	}

}
