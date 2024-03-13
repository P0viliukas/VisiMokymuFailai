import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Testukas {

    @BeforeEach
    void priestestas() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    void testas1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.quit();
    }

    @Test
    void testas20()  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/register");
        driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Tedas");
        driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Bandis");
        driver.findElement(By.cssSelector("#input-email")).sendKeys("Bandis@Tedas.lt");
        driver.findElement(By.cssSelector("#input-telephone")).sendKeys("861121122");
        driver.findElement(By.cssSelector("#input-fax")).sendKeys("861121123");
        driver.findElement(By.cssSelector("#input-company")).sendKeys("Tedas & CO");
        driver.findElement(By.cssSelector("#input-address-1")).sendKeys("Sodu g. 1");
        driver.findElement(By.cssSelector("#input-address-2")).sendKeys("Sodu g. 2");
        driver.findElement(By.cssSelector("#input-city")).sendKeys("Kaunas");
        driver.findElement(By.cssSelector("#input-postcode")).sendKeys("44215");
        Select drpCountry = new Select(driver.findElement(By.id("input-country")));
        drpCountry.selectByVisibleText("Lithuania");

        Select region = new Select(driver.findElement(By.cssSelector("#input-zone")));
        region.selectByVisibleText("Kaunas");
        driver.findElement(By.cssSelector("#input-password")).sendKeys("pasword123");
        driver.findElement(By.cssSelector("#input-confirm")).sendKeys("pasword123");
        WebElement checkbox = driver.findElement((By.cssSelector("[name='agree']")));
        checkbox.click();

        WebElement button = driver.findElement((By.cssSelector("input.btn.btn-primary")));
        button.click();
        driver.quit();


    }
    @Test
    void testas21() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart-extensions.co.uk/index.php?route=account/register");
        driver.findElement(By.xpath("//*[@id='input-firstname']")).sendKeys("Tedas");
        driver.findElement(By.xpath("//*[@id='input-lastname']")).sendKeys("Bandis");
        driver.findElement(By.xpath("//*[@id='input-email']")).sendKeys("Bandis@Tedas.lt");
        driver.findElement(By.xpath("//*[@id='input-telephone']")).sendKeys("861121122");
        driver.findElement(By.xpath("//*[@id='input-fax']")).sendKeys("861121123");
        driver.findElement(By.xpath("//*[@id='input-company']")).sendKeys("Tedas & CO");
        driver.findElement(By.xpath("//*[@id='input-address-1']")).sendKeys("Sodu g. 1");
        driver.findElement(By.xpath("//*[@id='input-address-2']")).sendKeys("Sodu g. 2");
        driver.findElement(By.xpath("//*[@id='input-city']")).sendKeys("Kaunas");
        driver.findElement(By.xpath("//*[@id='input-postcode']")).sendKeys("44215");
        Select drpCountry = new Select(driver.findElement(By.xpath("//*[@id='input-country']")));
        drpCountry.selectByVisibleText("Lithuania");

        Select region = new Select(driver.findElement(By.xpath("//*[@id='input-zone']")));
        region.selectByVisibleText("Kaunas");
        driver.findElement(By.xpath("//*[@id='input-password']")).sendKeys("pasword123");
        driver.findElement(By.xpath("//*[@id='input-confirm']")).sendKeys("pasword123");
        WebElement checkbox = driver.findElement((By.xpath("//input[@name='agree']")));
        checkbox.click();

        WebElement button = driver.findElement((By.xpath("//input[@type='submit']")));
        button.click();
        driver.quit();

    }

    @Test
    void testas3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        driver.findElement(By.cssSelector(".fc-primary-button")).click();
        driver.findElement(By.id("fullName")).sendKeys("Steve Bollie");
        driver.findElement(By.id("join")).sendKeys(" at running away from my problems");
        String e = driver.findElement(By.id("getMe")).getAttribute("value");
        System.out.println(e);
        driver.findElement(By.id("clearMe")).clear();
        boolean ck = driver.findElement(By.id("noEdit")).isEnabled();
        System.out.println("The field is active: "+ck);
        String read = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
        System.out.println("The field is read only: "+read);

    }
    @Test
    void testas4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/buttons");
        driver.findElement(By.cssSelector(".fc-primary-button")).click();
        driver.findElement(By.id("home")).click();
        driver.navigate().back();
        System.out.println("Coordinates of the button: "+driver.findElement(By.id("position")).getLocation());;
        System.out.println("The color is: "+driver.findElement(By.id("color")).getCssValue("background-color"));
        System.out.println("The size of the button: "+driver.findElement(By.id("property")).getSize());
        System.out.println("The button works: "+driver.findElement(By.id("isDisabled")).isEnabled());
        WebElement bob = driver.findElement(By.cssSelector("#isDisabled.is-primary"));
        new Actions(driver)
                .clickAndHold(bob)
                .perform();
    }
    @Test
    void testas5()  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        driver.findElement(By.cssSelector(".fc-primary-button")).click();
        Select drp = new Select(driver.findElement(By.id("fruits")));
        drp.selectByVisibleText("Mango");

        String e = driver.findElements(By.cssSelector(".subtitle")).get(0).getText();
        System.out.println(e);
        Select drop = new Select(driver.findElement(By.id("superheros")));
        drop.selectByValue("ta");
        String d = driver.findElements(By.cssSelector(".subtitle")).get(1).getText();
        System.out.println(d);
        Select drpas = new Select(driver.findElement(By.id("lang")));
        drpas.selectByValue("py");;
        System.out.println("Programming Languages: "+driver.findElement(By.id("lang")).getText());
        Select dropas = new Select(driver.findElement(By.id("country")));
        dropas.selectByVisibleText("India");
        System.out.println("Country: "+dropas.getFirstSelectedOption().getText());

    }
    @Test
    void testas6()  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
        driver.findElement(By.cssSelector(".fc-primary-button")).click();
        driver.findElement(By.id("accept")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();


        driver.findElement(By.id("confirm")).click();
        alert.dismiss();

        driver.findElement(By.id("prompt")).click();
        alert.sendKeys("Povilas");
        alert.accept();

        driver.findElement(By.id("modern")).click();
        String e = driver.findElements(By.cssSelector(".title")).get(1).getText();
        System.out.println(e);
        driver.findElements(By.cssSelector(".modal-close")).get(0).click();




    }
}
