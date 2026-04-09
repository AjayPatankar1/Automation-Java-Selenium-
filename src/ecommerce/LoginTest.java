// Scenario: Flipkart Search with Popup Handling
// Demonstrates: Explicit Wait, Dynamic Popup Handling, Element Interaction

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchTest {

    public static void main(String[] args) {

        // Step 1: Start browser
        WebDriver driver = new ChromeDriver();

        // Step 2: Create explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 3: Open website
        driver.get("https://www.flipkart.com");

        // Step 4: Handle login popup (if present)
        handlePopupIfPresent(driver, wait);

        // Step 5: Wait for search box and perform search
        By searchBox = By.name("q");
        wait.until(d -> driver.findElement(searchBox).isDisplayed());
        driver.findElement(searchBox).sendKeys("Laptop" + Keys.ENTER);

        System.out.println("Search performed successfully");

        // Step 6: Close browser
        driver.quit();
    }

    // Reusable method to handle popup
    public static void handlePopupIfPresent(WebDriver driver, WebDriverWait wait) {

        By closeBtn = By.xpath("//button[contains(text(),'✕')]");

        try {
            wait.until(d -> driver.findElement(closeBtn).isDisplayed());
            driver.findElement(closeBtn).click();
            System.out.println("Popup closed");
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }
    }
}
