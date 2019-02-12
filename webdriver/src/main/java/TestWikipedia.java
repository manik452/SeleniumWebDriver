import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Manik on 10/15/2017.
 */
public class TestWikipedia {
    public static void main(String[] args){

//    System.setProperty();


        System.setProperty("webdriver.gecko.driver", "/opt/reports/geckodriver");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);
        driver.get("http://172.16.229.233/login.html");
        /*WebElement link;
        driver.findElement(By.partialLinkText("English")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        WebElement userId;
        userId = driver.findElement(By.id("userName"));
        userId.sendKeys("selenium");
        WebElement password;
        password = driver.findElement(By.id("password"));
        password.sendKeys("123456Tt");

        driver.findElement(By.cssSelector("[class='loginButton']")).click();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*driver.findElement(By.partialLinkText("English")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


        /*Cards cardsOwnCreditCardPayment = new Cards(driver);
        cardsOwnCreditCardPayment.ownCreditCardPayment();*/
        //driver.close();


    }


}
