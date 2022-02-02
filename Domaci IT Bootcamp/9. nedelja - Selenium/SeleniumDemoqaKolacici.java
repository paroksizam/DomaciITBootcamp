package Selenium1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemoqaKolacici {
    public static void main(String[] args) {

        //Zadatak 3 - Ulogovati se na sajt https://demoqa.com/ preko kolacica,
        // izlogovati se i asertovati da je korisnik izlogovan

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/login");

        Cookie kolacicID = new Cookie("userID", "4bcfe90a-979d-42a6-8175-e7d1c62bbd17");
        Cookie kolacicUser = new Cookie("userName", "paroksizam");
        Cookie kolacicToken = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InBhcm9rc2l6YW0iLCJwYXNzd29yZCI6IlF3ZXJ0eTEyMyEiLCJpYXQiOjE2NDIyODQ2OTZ9.IQ3Rxny-TUn73_2Sy12w9PzGKgtNqqZLSh0tGppImrk");
        Cookie kolacicExpires = new Cookie("expires", "2022-01-22T22%3A11%3A36.506Z");

        driver.manage().addCookie(kolacicID);
        driver.navigate().refresh();

        driver.manage().addCookie(kolacicUser);
        driver.navigate().refresh();

        driver.manage().addCookie(kolacicToken);
        driver.navigate().refresh();

        driver.manage().addCookie(kolacicExpires);
        driver.navigate().refresh();

        WebElement logOutButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
        logOutButton.click();

        String expectedURL = "https://demoqa.com/login";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);

        WebElement logInButton = driver.findElement(By.id("login"));
        Assert.assertTrue(logInButton.isDisplayed());

        WebElement passwordTextbox = driver.findElement(By.id("password"));
        Assert.assertTrue(passwordTextbox.isDisplayed());

    }
}
