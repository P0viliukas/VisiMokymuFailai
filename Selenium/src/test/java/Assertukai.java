import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Assertukai {
    Faker faker = new Faker();
    Integer age = new Random().nextInt(62) +18;
    String note = faker.lorem().paragraph();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();


    WebDriver driver = new ChromeDriver();
//    @BeforeEach
//    void pries(){
//
//
//    }
//    @Test
//    void testas4() {
//        driver.get("https://eviltester.github.io/simpletodolist/todolists.html");
//        driver.findElement(By.cssSelector(".new-todo-list")).sendKeys("Labas vakaras!" + Keys.ENTER);
//        boolean isItemDisplayed = driver.findElement(By.cssSelector("li[data-id='DONE']")).isDisplayed();
//        assertTrue(isItemDisplayed);
//        boolean isItemDisplayed2 = driver.findElement(By.xpath("//label[contains(text(), 'DONE')]")).isDisplayed();
//        assertTrue(isItemDisplayed2);
//
//        String itemText = "DONE!!!"; //can be random
//        driver.findElement(By.cssSelector(".new-todo-list")).sendKeys(itemText + Keys.ENTER);
//
//        boolean isItemDisplayed = driver.findElement(By.cssSelector("li[data-id='" + itemText + "']")).isDisplayed();
//        assertTrue(isItemDisplayed);
//
//        boolean isItemDisplayed2 = driver.findElement(By.xpath("//label[contains(text(), '" + itemText + "')]")).isDisplayed();
//        assertTrue(isItemDisplayed2);
//
//
//    }

    @Test
    void testas1() {



        driver.get("https://testpages.herokuapp.com/styled/validation/input-validation.html");

        WebElement inputname = driver.findElement(By.cssSelector("#firstname"));
        inputname.sendKeys(firstName);
        WebElement inputsurname = driver.findElement(By.cssSelector("#surname"));
        inputsurname.sendKeys("Ponas/Ponia "+lastName);
        WebElement inputage = driver.findElement(By.id("age"));
        inputage.sendKeys(""+age);
        Select drpCountry = new Select(driver.findElement(By.id("country")));
        drpCountry.selectByVisibleText("Lithuania");
        WebElement notai = driver.findElement(By.id("notes"));
        notai.sendKeys(note);
        WebElement button = driver.findElement((By.xpath("//input[@type='submit']")));
        button.click();

//        Thread.sleep(1000);
        String vardas = driver.findElement(By.id("firstname-value")).getText();
        String pavarde = driver.findElement(By.id("surname-value")).getText();
        String metai = driver.findElement(By.id("age-value")).getText();
        String salis = driver.findElement(By.id("country-value")).getText();
        String zinute = driver.findElement(By.id("notes-value")).getText();

        assertEquals(firstName ,vardas);
        assertEquals("Ponas/Ponia "+lastName, pavarde);
        assertEquals(""+age,metai);
        assertEquals("Lithuania",salis);
        assertEquals(note, zinute);


    }
    @Test
    void testas2sudetis(){
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        Select function = new Select(driver.findElement(By.id("function")));
        function.selectByValue("plus");

        WebElement inputnumber1 = driver.findElement(By.id("number1"));
        inputnumber1.sendKeys("5");
        WebElement inputnumber2 = driver.findElement(By.id("number2"));
        inputnumber2.sendKeys("8");

        driver.findElement(By.id("calculate")).click();

        String answer = driver.findElement(By.id("answer")).getText();

        assertEquals("13",answer);

    }
    @Test
    void testas2atimtis(){
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        Select function = new Select(driver.findElement(By.id("function")));
        function.selectByValue("minus");

        WebElement inputnumber1 = driver.findElement(By.id("number1"));
        inputnumber1.sendKeys("5");
        WebElement inputnumber2 = driver.findElement(By.id("number2"));
        inputnumber2.sendKeys("8");

        driver.findElement(By.id("calculate")).click();

        String answer = driver.findElement(By.id("answer")).getText();

        assertEquals("-3",answer);

    }
    @Test
    void testas2daugyba(){
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        Select function = new Select(driver.findElement(By.id("function")));
        function.selectByValue("times");

        WebElement inputnumber1 = driver.findElement(By.id("number1"));
        inputnumber1.sendKeys("5");
        WebElement inputnumber2 = driver.findElement(By.id("number2"));
        inputnumber2.sendKeys("8");

        driver.findElement(By.id("calculate")).click();

        String answer = driver.findElement(By.id("answer")).getText();

        assertEquals("40",answer);

    } @Test
    void testas2dalyba(){
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        Select function = new Select(driver.findElement(By.id("function")));
        function.selectByValue("divide");

        WebElement inputnumber1 = driver.findElement(By.id("number1"));
        inputnumber1.sendKeys("10");
        WebElement inputnumber2 = driver.findElement(By.id("number2"));
        inputnumber2.sendKeys("5");

        driver.findElement(By.id("calculate")).click();

        String answer = driver.findElement(By.id("answer")).getText();

        assertEquals("2",answer);

    }



}
