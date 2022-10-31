package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.SimpleDateFormat;

public class FirstClass {
    //imported inbuilt class through object
    protected static WebDriver driver;
        //main method
    public static void main(String[] args) {
        // set the system property for Chrome driver
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe" );
        // Create driver object for CHROME browser
        driver = new ChromeDriver();
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);
        //opens and mange and maximize the window
        driver.manage().window().maximize();
        // get the current URL of the page
        driver.get("https://demo.nopcommerce.com/");
        // finding a location of register button by classname to click on register button
        driver.findElement(By.className("ico-register")).click();
        //finding a location of  first name text box by id to Click on the first name text box and send value
        driver.findElement(By.id("FirstName")).sendKeys("Dipika");
        //finding a location of last name text box by id to Click on the last name text box and send value
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        // finding a location of email text box  by id to  Click on the email text box and send value
        driver.findElement(By.id("Email")).sendKeys("pdipika0713" +timeStamp+"@gmail.com");
        // finding a location of password text box by id to Click on the password text box and send value
        driver.findElement(By.id("Password")).sendKeys("Dipika123");
        //finding a location of confirmPassword text box by id to Click on the confirmPassword text box and send value
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Dipika123");
        //finding a location of register button by id to Click on the register button
        driver.findElement(By.id("register-button")).click();
        //finding a location of string by classname to returns Text of the element
        String regMsg = driver.findElement(By.className("result")).getText();
        System.out.println(regMsg);
        // closing the opened url window
        driver.quit();
}
}
