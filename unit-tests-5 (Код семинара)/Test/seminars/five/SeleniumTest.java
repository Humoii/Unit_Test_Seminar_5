package seminars.five;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;


public class SeleniumTest {

    @Test
    void seleniumTest() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/imghp?hl=ru&ogbl");
        WebElement webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("Валерия Виноградова");
        webElement.submit();
        WebElement webElementValeria = webDriver.findElement(By.tagName("h3"));

        assertThat(webElementValeria.getText()).isEqualTo(
                "Валерия Виноградова — Психолог");


        Thread.sleep(1000);
        webDriver.quit();
    }

    @Test
    void autorizationTest() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://saucedemo.com");
        WebElement nameElement = webDriver.findElement(By.id("user-name"));
        nameElement.sendKeys("standard_user");
        WebElement passElement = webDriver.findElement(By.id("password"));
        passElement.sendKeys("secret_sauce");
        passElement.submit();

        WebElement citeElement = webDriver.findElement(By.className("title"));

        assertThat(citeElement.getText()).isEqualTo("Products");

        Thread.sleep(5000);
        webDriver.quit();

    }

}
