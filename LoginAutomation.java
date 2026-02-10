import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {
    public static void main(String[] args) {
        // Set path to your chromedriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://test-retail-site.com/login");
        
        // Automated credential input
        driver.findElement(By.id("user_login")).sendKeys("admin_test");
        driver.findElement(By.id("user_pass")).sendKeys("secure_password123");
        
        driver.findElement(By.name("login_btn")).click();
        System.out.println("Login sequence completed.");
    }
}
