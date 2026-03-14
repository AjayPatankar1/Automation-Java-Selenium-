// Scenario: User Login
// Tool: Selenium WebDriver

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com");

        System.out.println("Website opened");

        driver.quit();
    }
}
