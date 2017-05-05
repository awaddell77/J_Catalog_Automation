package automationPackage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Gecko_Driver {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://www.fsf.org");
		Thread.sleep(5000);
		driver.get("http://magic.wizards.com/en/articles/archive/feature/tokens-amonkhet-2017-04-13");
		
 
		Thread.sleep(5000);
		driver.quit();
	}

}
