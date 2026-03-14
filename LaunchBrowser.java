 # Launch Broswer.java

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 
public class launchbrowser {
		
	public static void main(String [] args) { 
			// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 
	 System.out.println("Browser launched");
		driver.quit();
		
	}

}
