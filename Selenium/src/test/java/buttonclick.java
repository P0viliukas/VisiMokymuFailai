import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class buttonclick {

    WebDriver driver = new ChromeDriver();


    @BeforeEach
    void setup() {
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        driver.findElement(By.cssSelector(".fc-button")).click();

    }
    @Test
    void doubleClick() {
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(ele).perform();
        WebElement answer = driver.findElement(By.id("doubleClickMessage"));
        Assertions.assertTrue(answer.isDisplayed());
        System.out.println(answer.getText());



    }
    @Test
    void rightClick() {
        Actions act = new Actions(driver);
        WebElement ele = driver.findElement(By.id("rightClickBtn"));
        act.contextClick(ele).perform();

        WebElement answer = driver.findElement(By.id("rightClickMessage"));
        Assertions.assertTrue(answer.isDisplayed());
        System.out.println(answer.getText());



    }
    @Test
    void click() {
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
        WebElement answer = driver.findElement(By.id("dynamicClickMessage"));
        Assertions.assertTrue(answer.isDisplayed());
        System.out.println(answer.getText());


    }

}
