// Test Case: TC01 - Open Flipkart and verify page title

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open Flipkart website
        driver.get("https://www.flipkart.com");

        // Verify title
        String title = driver.getTitle();

        if(title.contains("Flipkart"))
        {
            System.out.println("Test Passed - Homepage loaded");
        }
        else
        {
            System.out.println("Test Failed");
        }

        driver.quit();
    }
}
