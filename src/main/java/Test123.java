import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Test123 extends BasePage {
        String name;

        @BeforeTest
        public void setup() {
                System.setProperty("webdriver.chrome.driver", "src\\test\\java\\WebDriver\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();

        }

        @Test
        public void set() throws InterruptedException {
                driver.get("https://my.cloudelements.io");
                Utils.clickElement(By.xpath("//a[@id = 'hs-eu-confirmation-button']"));
                Utils.clickElement(By.id("my-signin2"));
                Utils.enterText(By.id("identifierId"), "nikshahparekh@gmail.com");
                Utils.clickElement(By.className("CwaK9"));
                Thread.sleep(1000);
                Utils.enterText(By.name("password"), "niketa");
                Thread.sleep(500);
                Utils.clickElement(By.xpath("//span[@class='RveJvd snByac']"));
                Utils.waitForElementToGetInvisible(By.xpath("//input[@name= 'jobTitle']"), 300);
                Utils.enterText(By.xpath("//input[@name= 'jobTitle']"), "Software Test Engineer");


        }

                @Test
                public void sliderPractice() {
                driver.get("https://www.training-support.net/selenium/sliders");
                WebElement ele = driver.findElement(By.cssSelector("#slider"));
                Actions actions = new Actions(driver);
                actions.dragAndDropBy(ele, 444, 343).release().build().perform();//slide volume to 49%
                ele.click();
        }
                @Test
                public void tabOpenerPractice() {
                driver.get("https://www.training-support.net/selenium");
                driver.findElement(By.xpath("//button[@class='ui inverted huge blue button']")).click();//click on get started
                        driver.findElement(By.xpath("//div[@class='ui stackable grid']/div[@class='four wide column'][2]")).click();//click on Tab Opener

                }


        //@AfterTest
        //public void tearDown() {
                //driver.quit();

        }


