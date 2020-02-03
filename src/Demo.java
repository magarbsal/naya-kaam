import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code
//Create Driver Object for Chrome Browser
		
		//We will strictly implement methods of webdriver
	/* Class name=ChromeDriver,
	 		X driver=new X();
	 */
		//
	System.setProperty("webdriver.chrome.driver", "//Users/bishal//eclipse-workspaceNew//Introduction//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	
	}

}
