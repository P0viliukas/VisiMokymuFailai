import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class wait {
    WebDriver driver;

    public static void until(ExpectedCondition<WebElement> webElementExpectedCondition) {
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.findElement(By.cssSelector(".fc-button")).click();
    }

    @AfterEach
    void close() {
//        driver.quit();
    }

    @Test
    void test() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        System.out.println(driver.findElement(By.cssSelector("#colorChange")).getCssValue("color"));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("#enableAfter"))));
        driver.findElement(By.cssSelector("#enableAfter")).click();

        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.cssSelector("#colorChange")),"class","text-danger"));
        System.out.println(driver.findElement(By.cssSelector("#colorChange")).getCssValue("color"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#visibleAfter")));
        driver.findElement(By.cssSelector("#visibleAfter")).isDisplayed();



    }


}

//
// wait.until(ExpectedConditions.attributeContains(driver.findElement(By.cssSelector("#progressbar0")), "value", "100"));
//        wait.until(ExpectedConditions.textToBePresentInElementValue(By.cssSelector("#progressbar1"), "100"));
//        wait.until(ExpectedConditions.attributeToBe(By.cssSelector("#progressbar2"), "value", "100"));
//        wait.until(ExpectedConditions.invisibilityOfElementWithText(By.cssSelector("#status"), "Running"));