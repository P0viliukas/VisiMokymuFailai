import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

public class login {

    WebDriver driver = new ChromeDriver();


    @BeforeEach
    void before() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void loginHappyPath() throws InterruptedException {
        String user = driver.findElement(By.cssSelector("p.oxd-text:nth-child(1)")).getText().trim().substring(11);
        String password = driver.findElement(By.cssSelector("p.oxd-text:nth-child(2)")).getText().trim().substring(11);

//        String text = driver.findElement(By.cssSelector("p.oxd-text:nth-child(1)")).getText();
//        String[] trimmedText = text.split("Username : ");
//        for (String str : trimmedText) {
//            System.out.println(str);
//        }
//        String og = driver.findElement(By.cssSelector("p.oxd-text:nth-child(1)")).getText();
//        String newSt = og.replace("Username : ","");
//        System.out.println(newSt);

//        String useris = driver.findElement(By.cssSelector("p.oxd-text:nth-child(1)")).getText().replace("Username : ","");
//        System.out.println(useris);

        driver.findElement(By.cssSelector(".oxd-input")).sendKeys(user);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.cssSelector(".oxd-button")).click();

        String URL = driver.getCurrentUrl();
        String Title = driver.getTitle();


        assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", URL);
        assertFalse(Title.isBlank());
        assertTrue(driver.findElement(By.cssSelector(".oxd-text--h6")).isDisplayed());
        System.out.println("loginHappyPath Complete");


    }

    @Test
    void invalidUsername() throws InterruptedException {

        driver.findElement(By.cssSelector(".oxd-input")).sendKeys("asdmin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password123");
        driver.findElement(By.cssSelector(".oxd-button")).click();


        assertTrue(driver.findElement(By.cssSelector(".oxd-alert-content-text")).isDisplayed());
        assertEquals("Invalid credentials", driver.findElement(By.cssSelector(".oxd-alert-content-text")).getText());
        assertTrue(driver.findElement(By.cssSelector(".bi-exclamation-circle")).isDisplayed());
        System.out.println("invalidUsername Complete");
    }

    @AfterEach
    void aftertest() {
        driver.quit();
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("All tests complete");
    }

}
