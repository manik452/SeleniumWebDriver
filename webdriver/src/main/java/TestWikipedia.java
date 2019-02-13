import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;

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
        long useraccountId = 222003393;
        int count = 0;
        int td = 23;
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
                List<WebElement> elements = driver.findElements(By.xpath("//*[@data-trigger='manual']"));

                for (WebElement webElement : elements) {
                    try {
                        webElement.sendKeys("Hello I like you. If you are a women replay my message. I am interested talk chat with you.");
                        webElement.sendKeys(Keys.ENTER);
                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }

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


            /*System.out.println("Start");
            count=0;
            try {
                List<WebElement> refList = driver.findElements(By.tagName("a"));

                try {
                    for (WebElement we : refList) {

                        try {
                            String weburl = we.getAttribute("href");
                            if (weburl != null && weburl.contains("https://beta.meetme.com/#meet/member/")) {
                                count++;
                                if (count < td) continue;
                                String rooturl = weburl;
                                url = weburl;
                                driver.get(rooturl);
                                try {
                                    Thread.sleep(10000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                try {
                                    //userId = driver.findElement(By.xpath("//*[@data-trigger='manual']"));
                                    List<WebElement> elements = driver.findElements(By.xpath("//*[@data-trigger='manual']"));

                                    for (WebElement webElement : elements) {
                                        try {
                                            webElement.sendKeys("Hello I like you. If you love to talk reply my message.I am interested talk chat with you.");
                                            webElement.sendKeys(Keys.ENTER);
                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }

                                    }
                                } catch (Exception e) {
                                    System.out.println("TRACE IN ELEMENT SECTION");
                                    e.printStackTrace();
                                }

                                //driver.findElement(By.cssSelector("[class='btn-link']")).click();
                                //driver.findElement(By.cssSelector("[class='loginButton']")).click();
                            }
                        } catch (Exception e) {
                            System.out.println("TRACE IN URL SECTION");
                            e.printStackTrace();
                        }

                    }
                } catch (Exception e) {
                    System.out.println("TRACE IN LI SECTION" + e);
                } finally {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }catch (Exception e){
                System.out.println("GORAY GONDOGOL");
                e.printStackTrace();
            }


            System.out.println(count);
            td = count;*/

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

