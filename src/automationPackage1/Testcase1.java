
package automationPackage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Create a new instance of the Firefox driver
				WebDriver driver = new FirefoxDriver();
				
		        //Launch the Online Store Website
				driver.get("http://www.fsf.org");
		 
		        // Print a Log In message to the screen
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
				//Wait for 5 Sec
				Thread.sleep(5);
				
		        // Close the driver
		        driver.quit();

	}

}
