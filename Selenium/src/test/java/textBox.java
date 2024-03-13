import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class textBox {
    Faker faker = new Faker();
    String name = faker.name().fullName();
    String email = faker.internet().emailAddress();
    String streetAddress = faker.address().streetAddress();
    WebDriver driver = new ChromeDriver();

    @BeforeEach
    void setup() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector(".fc-button")).click();
    }

    @Test
    void textBox()  {

        driver.findElement(By.id("userName")).sendKeys(name);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        driver.findElement(By.id("currentAddress")).sendKeys(streetAddress);
        driver.findElement(By.id("permanentAddress")).sendKeys(streetAddress);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        driver.findElement(By.cssSelector("button#submit")).click();

        Assertions.assertEquals(name, driver.findElement(By.id("name")).getText().trim().substring(5));
        Assertions.assertEquals("Email:"+email, driver.findElement(By.id("email")).getText());
        Assertions.assertEquals(streetAddress, driver.findElement(By.cssSelector("#currentAddress.mb-1")).getText().replace("Current Address :",""));
        Assertions.assertEquals("Permananet Address :"+streetAddress, driver.findElement(By.cssSelector("#permanentAddress.mb-1")).getText());

    }




}
