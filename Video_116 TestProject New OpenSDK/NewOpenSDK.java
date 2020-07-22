import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewOpenSDK {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver = new ChromeDriver
                ("XUdNaCdbDqvvKJNTv8M2TR1UwKLQTuqdH-5B8FWIg7c1",
                new ChromeOptions(),
                "New OpenSDK");
        driver.get("https://example.testproject.io/web/index.html");
        driver.report().step("Log Into TestProject", true, true);
        driver.findElement(By.id("name")).sendKeys("Joe Doe");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.id("login")).click();
        driver.quit();
    }
}
