import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Manik on 10/15/2017.
 */
public class TestWikipedia {
    public static void main(String[] args) {

//    System.setProperty();


        System.setProperty("webdriver.gecko.driver", "/opt/reports/geckodriver");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        WebDriver driver = new FirefoxDriver(capabilities);
        driver.get("https://beta.meetme.com/#home");

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("marketing-header-login")).click();

        /*WebElement link;
        driver.findElement(By.partialLinkText("English")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        WebElement userId;
        userId = driver.findElement(By.id("site-login-modal-email"));
        userId.sendKeys("manik.chandra.bs23@gmail.com");
        WebElement password;
        password = driver.findElement(By.id("site-login-modal-password"));
        password.sendKeys("123456Mm");

        driver.findElement(By.id("site-login-modal-submit-group")).click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String url = "https://beta.meetme.com/#meet/member/";
        long useraccountId = 216301589;
        while (true) {
            String tempUrl = url + useraccountId + "/chat";
            driver.get(tempUrl);
            useraccountId++;

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                //userId = driver.findElement(By.className("input-lg"));
                userId = driver.findElement(By.xpath("//*[@data-trigger='manual']"));
                userId.sendKeys("Hello I like you");

                userId.sendKeys(Keys.ENTER);
                //driver.findElement(By.cssSelector("[class='btn-link']")).click();
                //driver.findElement(By.cssSelector("[class='loginButton']")).click();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }

        //driver.findElement(By.cssSelector("[class='btn-default']")).click();
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
