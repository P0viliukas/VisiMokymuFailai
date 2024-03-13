import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Parametrizuoti {
    WebDriver driver = new ChromeDriver();
    @BeforeEach
    void priesTestus(){
        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/register");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Billy.Brown@g.com", "Gatvikas.Brownas@g.com"})
    void testas20(String te) {

        driver.findElement(By.cssSelector("#input-email")).sendKeys(te);

    }


//    int number = new Random().nextInt(100);
//    Faker faker = new Faker();
//
//    String name = faker.name().fullName();
//    String firstName = faker.name().firstName();
//    String lastName = faker.name().lastName();
//
//    String streetAddress = faker.address().streetAddress();
//    WebDriver driver = new ChromeDriver();
//
//    @BeforeEach
//    void priesTestus(){
//        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/register");
//    }
//    @AfterEach
//    void poTestu(){
//        System.out.println("Success");
//        driver.quit();
//
//    }
//
//    @Test
//    void testas20() throws InterruptedException {
//
//        driver.findElement(By.cssSelector("#input-firstname")).sendKeys(firstName);
//        driver.findElement(By.cssSelector("#input-lastname")).sendKeys(lastName);
//        driver.findElement(By.cssSelector("#input-email")).sendKeys(name+"+"+number+"@"+lastName+".lt");
//        driver.findElement(By.cssSelector("#input-telephone")).sendKeys("861121122");
//        driver.findElement(By.cssSelector("#input-fax")).sendKeys("861121123");
//        driver.findElement(By.cssSelector("#input-company")).sendKeys("Tedas & CO");
//        driver.findElement(By.cssSelector("#input-address-1")).sendKeys(streetAddress);
//        driver.findElement(By.cssSelector("#input-address-2")).sendKeys(streetAddress);
//        driver.findElement(By.cssSelector("#input-city")).sendKeys("Kaunas");
//        driver.findElement(By.cssSelector("#input-postcode")).sendKeys("44215");
//        Select drpCountry = new Select(driver.findElement(By.id("input-country")));
//        drpCountry.selectByVisibleText("Lithuania");
//        Thread.sleep(200);
//        Select region = new Select(driver.findElement(By.cssSelector("#input-zone")));
//        region.selectByVisibleText("Kaunas");
//        driver.findElement(By.cssSelector("#input-password")).sendKeys("pasword123");
//        driver.findElement(By.cssSelector("#input-confirm")).sendKeys("pasword123");
//        WebElement checkbox = driver.findElement((By.cssSelector("[name='agree']")));
//        checkbox.click();
//        Thread.sleep(100);
//        WebElement button = driver.findElement((By.cssSelector("input.btn.btn-primary")));
//        button.click();
//
//
//
//    }
//    @Test
//    void testas21() throws InterruptedException {
//
//        driver.findElement(By.xpath("//*[@id='input-firstname']")).sendKeys("Tedas");
//        driver.findElement(By.xpath("//*[@id='input-lastname']")).sendKeys("Bandis");
//        driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("Bandis"+number+"@Tedas.lt");
//        driver.findElement(By.xpath("//*[@id='input-telephone']")).sendKeys("861121122");
//        driver.findElement(By.xpath("//*[@id='input-fax']")).sendKeys("861121123");
//        driver.findElement(By.xpath("//*[@id='input-company']")).sendKeys("Tedas & CO");
//        driver.findElement(By.xpath("//*[@id='input-address-1']")).sendKeys("Sodu g. 1");
//        driver.findElement(By.xpath("//*[@id='input-address-2']")).sendKeys("Sodu g. 2");
//        driver.findElement(By.xpath("//*[@id='input-city']")).sendKeys("Kaunas");
//        driver.findElement(By.xpath("//*[@id='input-postcode']")).sendKeys("44215");
//        Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id='input-country']")));
//        drpCountry.selectByVisibleText("Lithuania");
//        Thread.sleep(100);
//        Select region = new Select(driver.findElement(By.xpath("//*[@id='input-zone']")));
//        region.selectByVisibleText("Kaunas");
//        driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys("pasword123");
//        driver.findElement(By.xpath("//*[@id='input-confirm']")).sendKeys("pasword123");
//        WebElement checkbox = driver.findElement((By.xpath("//input[@name='agree']")));
//        checkbox.click();
//        Thread.sleep(100);
//        WebElement button = driver.findElement((By.xpath("//input[@type='submit']")));
//        button.click();
//
//
//
//    }
//


}
