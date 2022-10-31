package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments {
    //imported inbuilt class through object
    protected static WebDriver driver;
        //main method
    public static void main(String[] args) {
        // set the driver property for Chrome driver
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        // Create driver object for CHROME browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // get the current URL of the page
        driver.get("https://demo.nopcommerce.com/");
        //finding a location of news button by xpath click on the news button
        driver.findElement(By.xpath("//div[@class=\"news-items\"]/div[2]/div[3]/a")).click();
        //finding a location of Title Text box by id to Click on Title Text box and send value
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("New products");
        //finding a location of Add new comments Text box by id Click on Add new comments Text box and send value
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("New Produts will be added soon");
        //finding a location of Add new comments button by classname Click on Add new comments
        driver.findElement(By.className("buttons")).click();
        //finding a location of string by classname to returns Text of the element
        String newsMsg = driver.findElement(By.className("result")).getText();
        System.out.println(newsMsg);
        // closing the opened url window
        driver.quit();
    }
}
