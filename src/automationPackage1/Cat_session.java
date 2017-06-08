package automationPackage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Cat_session {
	//port of basic Cat_session (no dbase connections)
	WebDriver session;
	private String username;
	private String password;
	
	public void startBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Documents\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		this.session = new ChromeDriver(capabilities);
		
	}
	public void startSession(){
		WebElement user_element = this.session.findElement(By.id("user_email"));
		WebElement pass_element = this.session.findElement(By.id("user_password"));
		user_element.sendKeys(this.username);
		pass_element.sendKeys(this.password);
		
		
		
	}
	public void prodGoTo(int x){
		String url = "https://catalog.crystalcommerce.com/products/" + x;
		this.session.get(url);
	}
	

}
