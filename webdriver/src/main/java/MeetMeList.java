import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MeetMeList {
    public void writeInFile(WebDriver driver){
        try {
            List<WebElement> refList = driver.findElements(By.tagName("a"));

            try {
                for (WebElement we : refList) {

                    try {
                        String weburl = we.getAttribute("href");
                        if (weburl != null && weburl.contains("https://beta.meetme.com/#meet/member/")) {
                            String rooturl = weburl;
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
    }

    private static void writeUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("/Users/pankaj/BufferedWriter.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine=data+System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
