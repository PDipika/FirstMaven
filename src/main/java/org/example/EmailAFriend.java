package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAFriend {
    //imported inbuilt class through object
    protected static WebDriver driver;
        //main method
    public static void main(String[] args) {
        // set the driver property for Chrome driver
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        // Create driver object for CHROME browser
        driver = new ChromeDriver();
        //opens and mange and maximize the window
        driver.manage().window().maximize();
        // get the current URL of the page
        driver.get("https://demo.nopcommerce.com/");
        //  finding the element by xpath of  Apple MacBook Pro picture to get it click on Apple MacBook Pro picture to open the product detail
        driver.findElement(By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]")).click();
       //  finding a location of email a friend button by classname to Clicks on the email a friend button
        driver.findElement(By.className("email-a-friend")).click();
        // finding a location of friend's email Text box by id to Click on the friend's email Text box and send value
        driver.findElement(By.id("FriendEmail")).sendKeys("dipikapatel44@yahoo.com");
        //finding a location of Your email Text by id to Click on  Your email Text box and send value
        driver.findElement(By.id("YourEmailAddress")).sendKeys("Pdipika123@gmail.com");
        // finding a location of  personal message Text box by id to Click on the personal message Text box and send value
        driver.findElement(By.id("PersonalMessage")).sendKeys("Please can you check this Product");
        // finding a location of send email button by class name to Clicks on the send email button
        driver.findElement(By.className("buttons")).click();
        // finding a location by xpath of the string value to returns Text of the element
        String errorMsg = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]//li")).getText();
        System.out.println(errorMsg);
        //closing the opened url window
        driver.quit();

    }
}

