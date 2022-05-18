package com.softserve.edu22sel;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
    private static final String BASE_URL = "http://taqc-opencart.epizy.com/";
    private static final Long IMPLICITLY_WAIT_SECONDS = 10L;
    private static final Long ONE_SECOND_DELAY = 1000L;
    private static WebDriver driver;

    private static void presentationSleep() {
        presentationSleep(1);
    }

    private static void presentationSleep(int seconds) {
        try {
            Thread.sleep(seconds * ONE_SECOND_DELAY); // For Presentation ONLY
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @BeforeAll
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_SECONDS, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT_SECONDS)); // 0 by default
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void afterClass() {
        presentationSleep(); // For Presentation ONLY
        // driver.close();
        driver.quit();
    }

    @BeforeEach
    public void beforeMethod() {
        driver.get(BASE_URL);
        presentationSleep(); // For Presentation ONLY
    }

    @Test
    public void testSearch() {
        //
        // Choose Curency
        driver.findElement(By.cssSelector("button.btn.btn-link.dropdown-toggle")).click();
        presentationSleep(); // For Presentation ONLY
        //driver.findElement(By.cssSelector("button[name='USD']")).click();
        driver.findElement(By.name("USD")).click();
        presentationSleep(); // For Presentation ONLY
        //
        // Steps
        //driver.findElement(By.cssSelector("#search > input")).click();
        //driver.findElement(By.cssSelector("#search > input")).clear();
        //driver.findElement(By.cssSelector("#search > input")).sendKeys("mac");
        WebElement search = driver.findElement(By.name("search"));
        search.click();
        search.clear();
        search.sendKeys("mac");
        presentationSleep(); // For Presentation ONLY
        //
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
        presentationSleep(); // For Presentation ONLY
        //
        // Check
        WebElement price = driver.findElement(By
                .xpath("//a[text()='MacBook']/../following-sibling::p[@class='price']"));
        presentationSleep(); // For Presentation ONLY
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", price);
        presentationSleep(); // For Presentation ONLY
        Assertions.assertTrue(price.getText().contains("$602.00"));
        System.out.println("***contains: " + price.getText());
        presentationSleep(); // For Presentation ONLY
        ((JavascriptExecutor) driver).executeScript("alert('DONE')");
        presentationSleep(4); // For Presentation ONLY
        driver.switchTo().alert().accept();
        //
    }
}
